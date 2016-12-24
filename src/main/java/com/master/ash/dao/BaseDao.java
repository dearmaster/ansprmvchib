package com.master.ash.dao;

import java.io.Serializable;
import java.util.Set;

public interface BaseDao<T> {

    void save(T t);
    void delete(T t);
    void update(T t);
    T get(Class<T> c, Serializable id);
    Set<T> load();

}