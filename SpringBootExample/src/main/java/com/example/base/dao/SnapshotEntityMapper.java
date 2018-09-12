/**
 * @author FangSS(fangshanshan @ artron.net)
 *     <p>CreatAt: 2018/8/20 Time: 上午10:02
 *     <p>Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 *     <p>Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.example.base.dao;

import com.example.base.entity.SnapshotEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/** User映射类 Created by Administrator on 2017/11/24. */
@Mapper
@Component
public interface SnapshotEntityMapper {

  @Select(
      "SELECT `id`, `order_number`, `url`, `status_code`, `html_content`, `retry_count`, `create_at` FROM snapshot WHERE id = #{id}")
  @Results({
    @Result(property = "id", column = "id"),
    @Result(property = "orderNumber", column = "order_number"),
    @Result(property = "url", column = "url"),
    @Result(property = "statusCode", column = "status_code"),
    @Result(property = "htmlContent", column = "html_content"),
    @Result(property = "retryCount", column = "retry_count"),
    @Result(property = "createAt", column = "create_at"),
  })
  SnapshotEntity findSnapshotEntityById(@Param("id") Integer id);

  @Insert(
      "REPLACE INTO `snapshot`(`order_number`, `url`, `status_code`, `html_content`, `retry_count`, `create_at`) VALUES (#{order_number},#{url},#{status_code},#{html_content},#{retry_count},#{create_at})")
  Integer insertSnapshotEntity(
          @Param("order_number") String orderNum,
          @Param("url") String url,
          @Param("status_code") Integer statusCode,
          @Param("html_content") String htmlContent,
          @Param("retry_count") Integer retryCount,
          @Param("create_at") Date createAt);

  @Select(
      "SELECT `id`, `order_number`, `url`, `status_code`, `html_content`, `retry_count`, `create_at` FROM snapshot WHERE order_number = #{order_number}")
  @Results({
    @Result(property = "id", column = "id"),
    @Result(property = "orderNumber", column = "order_number"),
    @Result(property = "url", column = "url"),
    @Result(property = "statusCode", column = "status_code"),
    @Result(property = "htmlContent", column = "html_content"),
    @Result(property = "retryCount", column = "retry_count"),
    @Result(property = "createAt", column = "create_at"),
  })
  SnapshotEntity findSnapshotEntityByOrderNum(@Param("order_number") String orderNum);
}
