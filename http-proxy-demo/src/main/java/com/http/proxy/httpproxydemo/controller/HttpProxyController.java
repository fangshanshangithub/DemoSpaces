package com.http.proxy.httpproxydemo.controller;

import com.http.proxy.httpproxydemo.utils.HttpsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

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
}
