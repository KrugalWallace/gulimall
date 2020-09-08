package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author krugal
 * @email krugal@gmail.com
 * @date 2020-09-08 14:39:06
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
