package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dww
 * @email dww@atguigu.com
 * @date 2020-12-15 00:37:21
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
