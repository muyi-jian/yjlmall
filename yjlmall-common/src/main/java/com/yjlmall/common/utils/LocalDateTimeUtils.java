package com.yjlmall.common.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: muyi-jian
 * @Date: 2023/04/25/16:44
 * @Description: 日期时间工具类
 */
public class LocalDateTimeUtils {

    /**
     * 返回当前时间
     * @return LocalDateTime
     */
    public LocalDateTime getNow(){
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        //声明需要格式化的格式(日期)
        DateTimeFormatter dfDate = java.time.format.DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        //声明需要格式化的格式(日期加时间)
        DateTimeFormatter dfDateTime = java.time.format.DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH mm ss");


        //将当前日期进行格式化
        System.out.println(dfDate.format(LocalDateTime.now()));
        //将当前日期加一年，进行格式化
        System.out.println(dfDate.format(LocalDateTime.now().plusYears(1)));
        //输出
        //020年07月18日
        //2021年07月18日

        //将日期字符串，根据指定的格式，格式为日期
        LocalDate parse = LocalDate.parse("2021年07月18日", dfDate);
        //将日期加一年，格式化
        System.out.println(dfDate.format(parse.plusYears(1)));


        //将日期时间字符串，根据指定的格式，格式为日期时间
        System.out.println(LocalDateTime.parse("2021年07月18日 12 25 30", dfDateTime));
        System.out.println(LocalDateTime.now());
    }


}
