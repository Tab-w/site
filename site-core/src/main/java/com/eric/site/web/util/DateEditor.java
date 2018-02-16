package com.eric.site.web.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author: WangXY
 * @Date: 2018-02-16
 */
public class DateEditor extends PropertiesEditor {

    private boolean isAllowEmpty;

    private String pattern;

    public DateEditor() {
        super();
        this.isAllowEmpty = true;
        this.pattern = "yyyy-MM-dd HH:mm:ss";
    }

    public DateEditor(String pattern, boolean isAllowEmpty) {
        super();
        this.isAllowEmpty = isAllowEmpty;
        this.pattern = pattern;
    }

    public boolean isAllowEmpty() {
        return isAllowEmpty;
    }

    public void setAllowEmpty(boolean isAllowEmpty) {
        this.isAllowEmpty = isAllowEmpty;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            if (StringUtils.isNotEmpty(text)) {
                SimpleDateFormat format = new SimpleDateFormat(pattern);
                setValue(format.parse(text));
            } else {
                if (isAllowEmpty) {
                    setValue(null);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}