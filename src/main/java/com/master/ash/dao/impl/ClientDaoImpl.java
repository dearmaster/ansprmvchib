package com.master.ash.dao.impl;

import com.master.ash.dao.ClientDao;
import com.master.ash.model.Client;
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
    public Set<Client> load() {
        return super.load(Client.class);
    }

    @Override
    public Set<Client> findByName(String name) {
        Session session = super.getSession();
        List<Client> list = session.createQuery(HQL_CREDENTIAL_FIND_BY_USERNAME).setParameter("name", name).list();
        Set ret = new HashSet<Client>();
        if(list != null && list.size() > 0) {
            ret.addAll(list);
        }
        return ret;
    }
}