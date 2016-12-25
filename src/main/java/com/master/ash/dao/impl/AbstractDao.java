package com.master.ash.dao.impl;

import com.master.ash.dao.BaseDao;
import com.master.ash.util.pagination.Pagination;
import com.master.ash.util.pagination.PaginationUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractDao<T> implements BaseDao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    final public void save(T t) {
        Session session = getSession();
        session.save(t);
    }

    @Override
    final public void delete(T t) {
        Session session = getSession();
        session.delete(t);
    }

    @Override
    final public void update(T t) {
        Session session = getSession();
        session.update(t);
    }

    protected T get(Class<T> c, Serializable id) {
        Session session = getSession();
        return (T) session.get(c, id);
    }

    protected List<T> load(Class<T> c) {
        String hql = "from " + c.getSimpleName();
        Session session = getSession();
        List<T> list = session.createQuery(hql).list();
        return list;
    }

    final protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public Pagination paginationLoad(Class<T> c, int pageSize, int currentPageIndex) {
        String dataHql = "from " + c.getSimpleName();
        String countHql = "select count(*) from " + c.getSimpleName();
        Session session = getSession();
        Query query = session.createQuery(dataHql);

        int totalRecordsNumber = Integer.parseInt(session.createQuery(countHql).list().get(0).toString());

        int firstResult = PaginationUtil.getOffset(pageSize, currentPageIndex);
        query.setFirstResult(firstResult);
        query.setMaxResults(pageSize);

        List<T> list = query.list();
        return PaginationUtil.getPagination(list, totalRecordsNumber, pageSize, currentPageIndex);
    }

}