package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author dww
 * @email dww@atguigu.com
 * @date 2020-12-15 10:18:36
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

