package com.master.ash.util.pagination;

import java.util.List;

public class PaginationUtil {

    public static int getOffset(int pageSize, int currentPageIndex) {
        if(pageSize <= 0 || currentPageIndex <= 0)
            throw new IllegalArgumentException();
        return (currentPageIndex -1) * pageSize;
    }

    public static Pagination getPagination(List recordsInCurrentPage, int totalRecordsNumber, int pageSize, int currentPageIndex) {
        Pagination pagination = new Pagination(recordsInCurrentPage, totalRecordsNumber, pageSize, currentPageIndex);
        int totalPages = totalRecordsNumber % pageSize == 0 ? totalRecordsNumber / pageSize : totalRecordsNumber / pageSize + 1;
        if(currentPageIndex > totalPages)
            throw new IllegalArgumentException("currentPageIndex shouldn't larger than totalPages");
        pagination.setTotalPages(totalPages);
        pagination.setCurrentRecordsNumber(recordsInCurrentPage.size());
        pagination.setPrevPageIndex(currentPageIndex == 1 ? null : currentPageIndex -1);
        pagination.setNextPageIndex(currentPageIndex == totalPages ? null : currentPageIndex +1);
        return pagination;
    }

}