package com.master.ash.service.impl;

import com.master.ash.dao.ClientDao;
import com.master.ash.model.Client;
import com.master.ash.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service("clientService")
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public void save(Client client) {
        clientDao.save(client);
    }

    @Override
    public void delete(Client client) {
        clientDao.delete(client);
    }

    @Override
    public void update(Client client) {
        clientDao.update(client);
    }

    @Override
    public Set<Client> findByName(String name) {
        return clientDao.findByName(name);
    }

    @Override
    public Set<Client> load() {
        return clientDao.load();
    }

}