package com.design.system.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper接口
 * @param <T>
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
