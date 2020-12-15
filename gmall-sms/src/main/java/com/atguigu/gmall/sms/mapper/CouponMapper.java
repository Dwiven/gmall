package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dww
 * @email dww@atguigu.com
 * @date 2020-12-15 10:18:36
 */
@Mapper
public interface CouponMapper extends BaseMapper<CouponEntity> {
	
}
