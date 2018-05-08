package com.java.demo.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    /**
     *
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        SimpleDateFormat time =new SimpleDateFormat("HH:mm:ss");
        System.out.println(time.format(now));

        String ss = time.format(now);

        String DateStr1 = "10:20:16";
        String DateStr2 = "11:50:35";


        Date dateTime1 = time.parse(DateStr1);
        Date dateTime2 = time.parse(DateStr2);
        Date st = time.parse(ss);

        System.out.println(dateTime1.compareTo(dateTime2));

        System.out.println(st.compareTo(dateTime2));
        System.out.println(dateTime1.compareTo(st));
    }

}