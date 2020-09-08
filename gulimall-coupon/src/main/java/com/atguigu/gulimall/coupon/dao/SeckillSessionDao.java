package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author krugal
 * @email krugal@gmail.com
 * @date 2020-09-08 14:39:06
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
