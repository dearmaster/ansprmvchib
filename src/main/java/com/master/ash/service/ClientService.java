package com.master.ash.service;

import com.master.ash.model.Client;

import java.util.Set;

public interface ClientService {

    void save(Client client);
    void delete(Client client);
    void update(Client client);
    Set<Client> findByName(String name);
    Set<Client> load();

}