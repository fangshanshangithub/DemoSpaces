package com.java.demo.Static;

/**
 * 静态 属性的调用
 */
public class StaticAttribute {

    public static void main(String[] args) {
        String out_1 = AttrClass.public_name;
        //String out_2 = AttrClass.private_name; // static 修饰属性的时候;类名.属性名 获取属性值的时候 私有的属性(private)是不可以的

        AttrClass.getName();// 调用static 方法和调用static属性差不多,私用的(private)不可以类名.方法名调用()
        System.out.println("public 修饰的属性: " + out_1);


        AttrClass.count ++;
        System.out.println("AttrClass.count++ 之后的结果：" + AttrClass.count);


        AttrClass acls = new AttrClass();
        acls.count ++;
        System.out.println("AttrClass.count++ 之后的结果：" + AttrClass.count);

    }
}


class AttrClass {

    private static String private_name = "private_Str";

    public static String public_name = "public_Str";

    public static int count = 0;

    // private 定义的静态方法
   /* private static void getName() {
        System.out.println("AttrClass.getName(): " + private_name );
    }*/

    public static void getName() {
        System.out.println("AttrClass.getName(): " + private_name );
    }




}