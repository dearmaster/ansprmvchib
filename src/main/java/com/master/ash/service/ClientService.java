package com.master.ash.service;

import com.master.ash.model.Client;
import com.master.ash.util.pagination.Pagination;

import java.util.List;

public interface ClientService {

    void save(Client client);
    void delete(Client client);
    void update(Client client);
    List<Client> findByName(String name);
    List<Client> load();

    Pagination paginationLoad(int pageSize, int currentPageIndex);

}