package com.eric.site.web.common;

/**
 * @author Eric
 */
public class DataTableParameter {

    /**
     * 偏移量
     */
    private int start;
    /**
     * 每页显示长度
     */
    private int length;
    /**
     * 当前页
     */
    private int draw;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}
