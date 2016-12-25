package com.master.ash.dao.impl;

import com.master.ash.dao.ClientDao;
import com.master.ash.model.Client;
import com.master.ash.util.pagination.Pagination;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository("clientDao")
public class ClientDaoImpl extends AbstractDao<Client> implements ClientDao {

    private static final String HQL_CREDENTIAL_FIND_BY_USERNAME = "from Client where name = :name";

    @Override
    public Client get(Serializable id) {
        return super.get(Client.class, id);
    }

    @Override
    public List<Client> load() {
        return super.load(Client.class);
    }

    @Override
    public List<Client> findByName(String name) {
        Session session = super.getSession();
        List<Client> list = session.createQuery(HQL_CREDENTIAL_FIND_BY_USERNAME).setParameter("name", name).list();
        return list;
    }

    @Override
    public Pagination paginationLoad(int pageSize, int currentPageIndex) {
        return super.paginationLoad(Client.class, pageSize, currentPageIndex);
    }


}