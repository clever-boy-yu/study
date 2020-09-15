package com.itheima.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    //日期转换为字符串
    public static String date2String(Date date, String patt){

        SimpleDateFormat sf = new SimpleDateFormat(patt);
        String format = sf.format(date);
        return format;
    }

    //字符串转换为日期
    public static Date sting2Date(String str,String patt) throws ParseException {

        SimpleDateFormat sf = new SimpleDateFormat(patt);
        Date parse = sf.parse(str);
        return parse;
    }
}
