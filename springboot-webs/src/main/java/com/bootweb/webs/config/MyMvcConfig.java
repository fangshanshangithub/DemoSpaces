package com.bootweb.webs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 自定义的 web 控制器
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurationSupport {

    /**
     * 解决静态资源无法访问的问题。
     * *** 注意 *** 修改WebMvcConfigurationSupport 一定要加下面这个方法，要不会出问题
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/META-INF/resources/")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/public/");
        super.addResourceHandlers(registry);
    }


    /**
     * 自定义的路径映射[默认主页面]
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    /**
     * 注册拦截器
     * @param registry
     */
    /*@Override
    public void addInterceptors(InterceptorRegistry registry){
    }*/
}