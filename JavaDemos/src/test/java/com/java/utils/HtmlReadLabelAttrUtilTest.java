/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/8/17 Time: 下午3:16
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.java.utils;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class HtmlReadLabelAttrUtilTest {
    public static void main(String[] args) {
        String path = "/Data/Html/index.html";
        String htmlContent = readFileContent(path);
       // System.out.println("文件内容" + htmlContent);

        List<String> list = HtmlReaderUntil.getAttrFromLab(htmlContent,"div", "id");
        for(String lt : list){
            System.out.println("##  ：" + lt);
        }
        System.out.println("=================");
        String stri = HtmlReaderUntil.deleteHtmlAnnotation(htmlContent);


    }

    private static String readFileContent(String path) {
        String returnStr = "";
        String line ="";
        //InputStream:是一个抽象类
        // \:是一个 转移符
        //表示磁盘路径的两种表示方式：1、\\   2、/
        try {
            //从文件地址中读取内容到程序中
            //1、建立连接
            InputStream is = new FileInputStream(path);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            while((line = bufferedReader.readLine())!=null) {
                returnStr += line;
            }
            //关闭流
            is.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            //系统强制解决的问题：文件没有找到
            e.printStackTrace();
        } catch (IOException e) {
            //文件读写异常
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return returnStr;
    }


}

