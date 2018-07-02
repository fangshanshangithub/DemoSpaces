package com.java.demo.generic.classdemo;

/**
 * 泛型方法的例子
 *
 * @Auther: FangSS
 * @Date: 2018/6/1 0001 16:09
 * @Description:
 */
public class GenericClassTest {
    public static void main(String[] args) {
        // 使用时参数必须传个类型，注意inter,boolean等要使用包装类
        //GenericClass<E> generic_1 = new GenericClass<E>("sfdsfdsf");
        GenericClass<String> generic_1 = new GenericClass<String>("sfdsfdsf");
        System.out.println(generic_1.getKey());


        GenericClass<Integer> generic_2 = new GenericClass<Integer>(12313);
        System.out.println(generic_2.getKey());


        /* 如果是泛型放的是父类，子类可以可以传入，自动转换，Object 是Intger,Stirng 的父类 */
        GenericClass<Object> generic_3 = new GenericClass<Object>(12313);
        GenericClass<Object> generic_4 = new GenericClass<Object>("sfdsfsf");
        System.out.println(generic_3.getKey() + "====" + generic_4.getKey());

        /* 普通类没什么问题 */
        GenericClass<AClass> generic_5 = new GenericClass<>(new AClass(("tttttttt")));
        System.out.println("generic_5:" + generic_5.getKey().getValue());

        /*  泛型的参数 不能是接口 */

        /*  */


    }

}