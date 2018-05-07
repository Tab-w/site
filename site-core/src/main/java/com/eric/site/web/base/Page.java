package com.eric.site.web.base;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @Author: Eric
 */
public class Page<T> {

    private List<T> data;
    private int sEcho;
    private int iTotalDisplayRecords;
    private int iTotalRecords;

    public Page() {
        super();
    }

    /**
     * @param data                 数据
     * @param sEcho                datatables传入的页数
     * @param iTotalDisplayRecords datatables传入的显示记录数
     * @param iTotalRecords        datatables传入的总记录数
     */
    public Page(List<T> data, int sEcho, int iTotalDisplayRecords, int iTotalRecords) {
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

    public int getsEcho() {
        return sEcho;
    }

    public void setsEcho(int sEcho) {
        this.sEcho = sEcho;
    }

    public int getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public int getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(int iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public String toJson()  {
        ObjectMapper objectMapper = new ObjectMapper();
        String dataStr = null;
        try {
            dataStr = objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return dataStr;
    }
}
