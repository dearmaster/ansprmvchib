package com.master.ash.util.pagination;

import java.util.List;

public class Pagination {

    private int pageSize;
    private int currentPageIndex; //当前页数
    private List<?> recordsInCurrentPage; //当前页记录
    private int totalRecordsNumber; //总记录数

    private int totalPages; //总页数
    private int currentRecordsNumber; //当前页记录数

    private Integer prevPageIndex;
    private Integer nextPageIndex;

    public Pagination() {}

    public Pagination(List<?> recordsInCurrentPage, int totalRecordsNumber, int pageSize, int currentPageIndex) {
        this.recordsInCurrentPage = recordsInCurrentPage;
        this.totalRecordsNumber = totalRecordsNumber;
        this.pageSize = pageSize;
        this.currentPageIndex = currentPageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<?> getRecordsInCurrentPage() {
        return recordsInCurrentPage;
    }

    public void setRecordsInCurrentPage(List<?> recordsInCurrentPage) {
        this.recordsInCurrentPage = recordsInCurrentPage;
    }

    public int getTotalRecordsNumber() {
        return totalRecordsNumber;
    }

    public void setTotalRecordsNumber(int totalRecordsNumber) {
        this.totalRecordsNumber = totalRecordsNumber;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPageIndex() {
        return currentPageIndex;
    }

    public void setCurrentPageIndex(int currentPageIndex) {
        this.currentPageIndex = currentPageIndex;
    }

    public int getCurrentRecordsNumber() {
        return currentRecordsNumber;
    }

    public void setCurrentRecordsNumber(int currentRecordsNumber) {
        this.currentRecordsNumber = currentRecordsNumber;
    }

    public Integer getPrevPageIndex() {
        return prevPageIndex;
    }

    public void setPrevPageIndex(Integer prevPageIndex) {
        this.prevPageIndex = prevPageIndex;
    }

    public Integer getNextPageIndex() {
        return nextPageIndex;
    }

    public void setNextPageIndex(Integer nextPageIndex) {
        this.nextPageIndex = nextPageIndex;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "pageSize=" + pageSize +
                ", currentPageIndex=" + currentPageIndex +
                ", recordsInCurrentPage=" + recordsInCurrentPage +
                ", totalRecordsNumber=" + totalRecordsNumber +
                ", totalPages=" + totalPages +
                ", currentRecordsNumber=" + currentRecordsNumber +
                ", prevPageIndex=" + prevPageIndex +
                ", nextPageIndex=" + nextPageIndex +
                '}';
    }

}