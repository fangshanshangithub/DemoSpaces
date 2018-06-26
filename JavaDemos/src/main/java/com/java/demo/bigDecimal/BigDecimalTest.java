package com.java.demo.bigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Auther: FangSS
 * @Date: 2018/5/10 0010 16:17
 * @Description:
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.ZERO;


        while(true){
            Scanner sc = new Scanner(System.in);
            String content = sc.nextLine();
            BigDecimal b2 = new BigDecimal(content);

            int i = b2.compareTo(b1);
            if (i == 0) { // 值相等
                System.out.println(b2 + " = " + b1.toString());
            }
            if (i == 1) {
                System.out.println(b2 + " > " + b1.toString());
            }

            if (i == -1) {
                System.out.println(b2 + " < " + b1.toString());
            }
        }


    }

}