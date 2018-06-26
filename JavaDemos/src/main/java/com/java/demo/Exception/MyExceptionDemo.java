package com.java.demo.Exception;

/**
 * 异常测试类.
 * @Auther: FangSS
 * @Date: 2018/6/6 0006 10:44
 */
public class MyExceptionDemo {

    public static void main(String[] args) {
        for (int i = 3; i > -4; i--) {
            System.out.println("MyExceptionDemo.main:" + i);
            try {
                throwException_01(i);
            } catch (Exception e) {
                System.out.println("捕获到异常了，跳出循环");
              //  break;
            }


        }

    }


    /**
     *
     * @param i
     */
    public static void throwException(int i) throws Exception {
        try {
            int j = 10/i;
        } catch (Exception e) {
            throw new Exception("sssssss");
        }
    }

    public static void throwException_01(int i) throws Exception {
        if (i == 0) {
            throw new Exception("sssssss");
        }
        System.out.println("=============" + i);


    }

}

