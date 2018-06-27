package com.java.demo.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @Auther: FangSS
 * @Date: 2018/5/11 0011 16:58
 * @Description:
 */
public class SelectionSort {

    /**
     * p
     * @param array
     * @param maxMin
     */
    public static void sort(Integer[] array) {
        System.out.println("选择排序之前的数据： = " + Arrays.toString(array));

        int tempIndex; // 剩下未排序的数据中当前选中的数据的下标
        int temp; //中间变量
        for(int i = 0 ; i< array.length - 1; i++) { // 一共array.length 个数据，从第二个数据开始对比，所以比较length-1次
            tempIndex = i;

            for(int j = i+1; j<array.length; j++) {
                if(array[j] < array[tempIndex]) {
                    tempIndex = j;
                }
            }

            temp = array[i];
            array[i] = array[tempIndex];
            array[tempIndex] = temp;


        }

        System.out.println("选择排序之后的数据： = " + Arrays.toString(array));
    }

}
