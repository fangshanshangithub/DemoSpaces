package com.boot.demo1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: FangSS
 * @Date: 2018/5/18 0018 11:39
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "dts")
public class DataSourceProperties {
    private String url;

    private String driverClassName;

    private String userName;

    private String password;

    public void show() {
        System.out.println("dataSource-url:" + this.url);
        System.out.println("DataSourceProperties.show.driverClassName" + this.driverClassName);
        System.out.println("DataSourceProperties.show.userName" + this.userName);
        System.out.println("DataSourceProperties.show.password" + this.password);

    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
