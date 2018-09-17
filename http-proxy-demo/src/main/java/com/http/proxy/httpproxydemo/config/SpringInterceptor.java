package com.http.proxy.httpproxydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import static com.sun.xml.internal.ws.api.message.Packet.State.ServerResponse;

@Configuration
public class SpringInterceptor extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        HandlerInterceptor handlerInterceptor = new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                boolean flag = checkUrl(request);
                if(flag) {
                    return true;
                }
                else {

                        //重置response
                        response.reset();
                        //设置编码格式
                        response.setCharacterEncoding("UTF-8");
                        response.setContentType("application/json;charset=UTF-8");

                        PrintWriter pw = response.getWriter();

                        pw.write("sfdsfdsfdsfdsf");


                        pw.flush();
                        pw.close();



                    return false;
                }

            }
        };
        registry.addInterceptor(handlerInterceptor).addPathPatterns("/**");
    }

    public boolean checkUrl(HttpServletRequest request) {
        String url = "";
        url = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort()
                + request.getServletPath();
        if (request.getQueryString() != null){
            url += "?" + request.getQueryString();
        }
        if (url.contains("/main/s")) {
            return true;
        }
        else {
            return false;
        }
    }

}