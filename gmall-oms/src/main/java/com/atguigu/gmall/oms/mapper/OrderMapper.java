package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dww
 * @email dww@atguigu.com
 * @date 2020-12-15 10:16:20
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
