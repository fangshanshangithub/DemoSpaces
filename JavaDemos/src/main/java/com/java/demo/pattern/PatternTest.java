package com.java.demo.pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Auther: FangSS
 * @Date: 2018/5/10 0010 15:37
 * @Description:
 */
public class PatternTest {

    public static void main(String[] args) {


        String pattern = "(\\d*\\.?\\d*)";

        while(true){
            Scanner sc = new Scanner(System.in);
            String content = sc.nextLine();
            boolean isMatch = Pattern.matches(pattern, content);

            System.out.println(isMatch);
        }

    }

}
