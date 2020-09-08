package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author krugal
 * @email krugal@gmail.com
 * @date 2020-09-08 14:39:06
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
