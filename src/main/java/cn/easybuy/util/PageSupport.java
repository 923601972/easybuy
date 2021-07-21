package cn.easybuy.util;

public class PageSupport {
    private int pageSize;
    private int pageIndex;
    private int totalPageCount;
    private int total;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
        js(total);
    }

    private void js(int total){
        if(total % this.pageSize == 0){
            this.totalPageCount = total / this.pageSize;
        }else {
            this.totalPageCount = (total / this.pageSize) + 1;
        }
    }

}
