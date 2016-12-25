package com.master.ash.dao;

import com.master.ash.util.pagination.Pagination;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

    void save(T t);
    void delete(T t);
    void update(T t);
    T get(Serializable id);
    List<T> load();
    Pagination paginationLoad(int pageSize, int currentPageIndex);

}