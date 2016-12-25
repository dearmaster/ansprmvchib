package com.master.ash.util.pagination;

import java.util.List;

public class Page<T> {

    private List<T> recordsInCurrentPage; //当前页记录
    private int totalRecordsNumber; //总记录数
    private int totalPages; //总页数
    private int currentIndex; //当前页数
    private int currentRecordsNumber; //当前页记录数


}