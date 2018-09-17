package com.http.proxy.httpproxydemo.controller;

import com.http.proxy.httpproxydemo.utils.HttpClientHelper;
import com.http.proxy.httpproxydemo.utils.HttpsUtils;
import org.apache.http.HttpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HttpProxyController {

    @Autowired
    private HttpClientHelper httpClientHelper;

    @RequestMapping("/**")
    public String proxy(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, String> info  = getHeadersInfo(request);
        String responStr = HttpsUtils.post("https://blog.csdn.net/past__time/article/details/81513535", new HashMap<>(),new HashMap<>(), null);
        PrintWriter pw = response.getWriter();
        pw.write(responStr);
        pw.flush();
        pw.close();
        return "redirect:http://www.baidu.com";
    }

    //get request headers
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
