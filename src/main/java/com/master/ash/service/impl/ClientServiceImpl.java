package com.master.ash.service.impl;

import com.master.ash.dao.ClientDao;
import com.master.ash.model.Client;
import com.master.ash.service.ClientService;
import com.master.ash.util.pagination.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public List<Client> findByName(String name) {
        return clientDao.findByName(name);
    }

    @Override
    public List<Client> load() {
        return clientDao.load();
    }

    @Override
    public Pagination paginationLoad(int pageSize, int currentPageIndex) {
        return clientDao.paginationLoad(pageSize, currentPageIndex);
    }

}