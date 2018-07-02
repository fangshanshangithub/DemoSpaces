package com.java.demo.sort;

/**
 * @Auther: FangSS
 * @Date: 2018/5/11 0011 11:39
 * @Description:
 */
public class SortMainTest {

    public static void main(String[] args) {
        Integer[] intArrary = {12,3,25,225,156,77,22,7,90,54};
        InsertSort.sort(intArrary);

        System.out.println("==================================");
        /*  冒泡排序测试  */
        DubbleSort.sort(intArrary);
        DubbleSort.sort_01(intArrary);

    }

}