package com.example.sjy.myapplication.bean;

/**
 * 分页bean  返回json 来定义这个bean
 * Created by brokge on 16/8/11.
 */
public class PageBean {
    private int count;//一页3个
    private int start;//起始页0
    private int total;//总页数  10

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isHasNext() {
        int currentPage = start + 1;
        if (total / count > currentPage) {
            return true;
        } else {
            return false;
        }
    }

    public int getNextIndex() {
        return start + 1;
    }


}
