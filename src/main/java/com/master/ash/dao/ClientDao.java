package com.master.ash.dao;

import com.master.ash.model.Client;

import java.util.Set;

public interface ClientDao extends BaseDao<Client> {

    Set<Client> findByName(String name);

}