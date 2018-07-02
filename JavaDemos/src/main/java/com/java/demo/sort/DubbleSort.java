package com.java.demo.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class DubbleSort {
    public static void sort(Integer[] args){
        System.out.println("冒泡排序：排序之前的参数args = {" + Arrays.toString(args) + "}");

        for(int i = 0; i < args.length -1; i++) {

            for(int j = 0; j < args.length- 1 - i; j++){
                Integer temp = null; // 中间变量
                if(args[j] < args[j+1]){
                    temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
        }

        System.out.println("冒泡排序：排序之后的结果args = {" + Arrays.toString(args) + "}");
    }


    public static void sort_01(Integer[] args){
        System.out.println("冒泡排序：排序之前的参数args = {" + Arrays.toString(args) + "}[sort_01]");

        for(int i = 1; i < args.length ; i++) {

            for(int j = 0; j < args.length- 2 - i; j++){
                Integer temp = null; // 中间变量
                if(args[j] < args[j+1]){
                    temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
        }

        System.out.println("冒泡排序：排序之后的结果args = {" + Arrays.toString(args) + "}[sort_01]");
    }

}
