package com.java.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 读取html内容相关的工具类.
 */
public class HtmlReaderUntil {

    /**
     * 从源码文件内容中按照指定的标签的属性获取对应的属性值
     * @param htmlContent 文件内容【网页源码】
     * @param element html标签名称
     * @param attribute 标签的属性名
     * @return List  所有的结果集
     */
    public static List<String> getAttrFromLab(String htmlContent, String element, String attribute){
        List<String> list = new ArrayList<String>();
        String reg = "<" + element + "[^<>]*?\\s" + attribute + "=['\"]?(.*?)['\"]";

        Pattern pattern = Pattern.compile(reg);
        Matcher mathcher = pattern.matcher(htmlContent);

        // 获取匹配的组数并取出对应的值
        while (mathcher.find()) {
            String r = mathcher.group(1);
            list.add(r);
        }

        return list;
    }

    /**
     * 删除指定标签中的内容.
     * @param htmlContent 网页内容源码
     * @return String 删除注释之后的源码内容
     */
    public static String deleteHtmlAnnotation(String htmlContent) {
        String reg = "<!--.[^-]*(?=-->)-->";

        Pattern pattern = Pattern.compile(reg);
        Matcher mathcher = pattern.matcher(htmlContent);

        // 获取匹配的组数并取出对应的值
        while (mathcher.find()) {
            String r = mathcher.group(1);
            System.out.println(r);
        }
        return "";
    }



}
