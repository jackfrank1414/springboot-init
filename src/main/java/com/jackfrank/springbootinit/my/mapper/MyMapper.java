package com.jackfrank.springbootinit.my.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/29 23:49
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
