package com.peny.controller.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
/**
 * spring convert
 * @author acer
 *
 */
public class StringDateConvert implements Converter<String, Date> {

    // 日期转换格式
    private String pattern;
    // 构造函数
    public StringDateConvert(String pattern) {
        super();
        this.pattern = pattern;
    }

    public Date convert(String arg0) {  
        //  yyyy-MM-dd 
      //  SimpleDateFormat sd = new SimpleDateFormat(pattern);
    	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sd.parse(arg0);
        } catch (ParseException e) {
            //e.printStackTrace();
            throw new IllegalAccessError("日期转换出错！");
        }
    }
}
