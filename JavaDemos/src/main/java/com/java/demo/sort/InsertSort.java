package com.java.demo.sort;

import java.util.Arrays;

/**
 * 插入排序
 * @Auther: FangSS
 * @Date: 2018/5/11 0011 11:25
 * @Description:
 */
public class InsertSort {

    public static void sort(Integer[] array) {
        System.out.println("插入排序待排序的数据:" +  Arrays.toString(array)  );
        int i,j;
        int temp;
        int n = array.length;

        for(i = 1; i < n; i++) {
            temp = array[i];

            for(j = i; j>0 && temp < array[j-1]; j--) {
                    array[j] = array[j-1];
            }

            array[j] = temp;
        }
        System.out.println("插入排序之后的结果:" +  Arrays.toString(array));

    }

}
