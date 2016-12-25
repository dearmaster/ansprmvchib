package com.master.ash.dao;

import com.master.ash.model.Client;

import java.util.List;

public interface ClientDao extends BaseDao<Client> {

    List<Client> findByName(String name);

}