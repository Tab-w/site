package com.eric.site.web.common;

import com.eric.site.web.utils.JacksonUtil;

import java.util.List;

/**
 * @Author: Eric
 */
public class Page<T> {

    private List<T> data;
    private long sEcho;
    private long iTotalDisplayRecords;
    private long iTotalRecords;

    public Page() {
        super();
    }

    /**
     * @param data                 数据集合
     * @param sEcho                当前页数
     * @param iTotalDisplayRecords 总记录数,用于计算总页数
     * @param iTotalRecords        总记录数,用于显示
     */
    public Page(List<T> data, long sEcho, long iTotalDisplayRecords, long iTotalRecords) {
        super();
        this.data = data;
        this.sEcho = sEcho;
        this.iTotalDisplayRecords = iTotalDisplayRecords;
        this.iTotalRecords = iTotalRecords;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getsEcho() {
        return sEcho;
    }

    public void setsEcho(long sEcho) {
        this.sEcho = sEcho;
    }

    public long getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(long iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public long getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(long iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public String toJson() {
        return JacksonUtil.toJson(this);
    }
}
