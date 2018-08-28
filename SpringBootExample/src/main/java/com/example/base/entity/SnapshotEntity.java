package com.example.base.entity;

import java.util.Date;

public class SnapshotEntity {

  // 主键
  private Integer id;
  // 订单号
  private String orderNumber;
  // 商品网址
  private String url;
  // 状态码
  private Integer statusCode;
  // 请求内容
  private String htmlContent;
  // 重试次数
  private Integer retryCount;
  // 创建时间
  private Date createAt;


  // --------------------------------------------------------
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  public SnapshotEntity() {
  }

  public Integer getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }

  public SnapshotEntity(Integer id, String orderNumber, String url, Integer statusCode,
                        String htmlContent, Integer retryCount, Date createAt) {
    this.id = id;
    this.orderNumber = orderNumber;
    this.url = url;
    this.statusCode = statusCode;
    this.htmlContent = htmlContent;
    this.retryCount = retryCount;
    this.createAt = createAt;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
