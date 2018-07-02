package com.java.demo.sort;

/**
 * @Auther: FangSS
 * @Date: 2018/5/11 0011 11:39
 * @Description:
 */
public class SortMainTest {

    public static void main(String[] args) {
        Integer[] intArrary = {12,3,25,225,156,77,22,7,90,54};
        //InsertSort.sort(intArrary);

        System.out.println("==================================");
        // 冒泡排序
        //BubbleSort.sort(intArrary);

        System.out.println("==================================");
        // 选择排序[主要是从为排序的数据集中选择最大或最小的数据]
        InsertSort.sort(intArrary);

        System.out.println("==================================");

        System.out.println("==================================");

    }

}