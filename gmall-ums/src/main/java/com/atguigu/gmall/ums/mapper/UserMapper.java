package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author dww
 * @email dww@atguigu.com
 * @date 2020-12-15 10:19:54
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
