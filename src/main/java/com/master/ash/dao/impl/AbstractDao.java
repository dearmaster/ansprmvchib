package com.master.ash.dao.impl;

import com.master.ash.dao.BaseDao;
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

}