package com.eric.site.web.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.propertyeditors.PropertiesEditor;

/**
 * @Author: Eric
 */
public class DoubleEditor extends PropertiesEditor {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(Double.parseDouble(StringUtils.isEmpty(text) ? "0" : text));
    }

    @Override
    public String getAsText() {
        return getValue().toString();
    }
}