package com.java.demo.linkedlist.single;

import java.io.Serializable;

/**
 * @Auther: FangSS
 * @Date: 2018/5/31 0031 17:16
 * @Description:
 */
public class LinkedListPojo  implements Serializable{

    private static final long serialVersionUID = 2633440901393674650L;

    private String value;

    private String next;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
