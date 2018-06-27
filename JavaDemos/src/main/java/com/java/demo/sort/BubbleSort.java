package com.java.demo.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @Auther: FangSS
 * @Date: 2018/6/26 0026 18:02
 */
public class BubbleSort {

    /**
     * 1.1 算法描述
     *   比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     *   对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     *   针对所有的元素重复以上的步骤，除了最后一个；
     *   重复步骤1~3，直到排序完成。
     */
    public static void sort(Integer[] args) {
        System.out.println("冒泡排序之前的数据： = " + Arrays.toString(args));

        for (int i = 0; i < args.length - 1; i++) {
            int temp;
            for (int j = 0; j < args.length- 1 - i; j++) {
                if (args[j] > args[j+1]) {
                    temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
        }

        System.out.println("冒泡排序之后的数据： = " + Arrays.toString(args));
    }
}

