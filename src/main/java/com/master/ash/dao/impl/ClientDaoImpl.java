package com.master.ash.dao.impl;

import com.master.ash.dao.ClientDao;
import com.master.ash.model.Client;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository("clientDao")
public class ClientDaoImpl extends AbstractDao<Client> implements ClientDao {

    @Override
    public Set<Client> load() {
        return super.load(Client.class);
    }

}