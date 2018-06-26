package com.java.demo.generic.classdemo;

/**
 * @Auther: FangSS
 * @Date: 2018/6/21 0021 11:07
 */
public abstract class CAbstractClass {

    private String value;

    public CAbstractClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}