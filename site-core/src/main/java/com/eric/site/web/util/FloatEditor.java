package com.eric.site.web.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.propertyeditors.PropertiesEditor;

/**
 * @Author: WangXY
 * @Date: 2018-02-16
 */
public class FloatEditor extends PropertiesEditor {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(Float.parseFloat(StringUtils.isEmpty(text) ? "0" : text));
    }

    @Override
    public String getAsText() {
        return getValue().toString();
    }
}