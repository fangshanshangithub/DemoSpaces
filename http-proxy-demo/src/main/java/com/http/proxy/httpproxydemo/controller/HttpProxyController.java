package com.http.proxy.httpproxydemo.controller;

import com.http.proxy.httpproxydemo.utils.HttpClientUtils;
import com.http.proxy.httpproxydemo.utils.HttpsUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HttpProxyController {


    @RequestMapping("/main")
    public void Test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String result =  HttpsUtils.get("https://wximg1.artimg.net/auction_manager/201809/0cb7cc47c34355576c170d2b4f17f87b1537547421.jpg", response);

        PrintWriter out = response.getWriter();
        out.write(result);
        out.flush();
        out.close();
    }

    @RequestMapping("get_test")
    public void getTest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, String> headerMap =  getHeadersInfo(request);
        response.reset();
        HttpResponse resultResponse = HttpClientUtils.doGet("https://www.qidian.com/","",headerMap, null);
        String srtResult = EntityUtils.toString(resultResponse.getEntity());//获得返回的结果
        Header[] headers = resultResponse.getAllHeaders();
        for(int i=0;i<headers.length;i++) {
            System.out.println(headers[i].getName()+" : "+ headers[i].getValue());
            response.setHeader(headers[i].getName(), headers[i].getValue());
        }

        PrintWriter out = response.getWriter();
        out.write(srtResult);
        out.flush();
        out.close();
    }

    @RequestMapping("/send")
    public void sendRquest(HttpServletRequest request, HttpServletResponse response) {
        String url = "https://blog.artron.net/image/newblog/css/common.css";


    }


    private Map<String, String> getHeadersInfo(HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }
        return map;
    }
}
