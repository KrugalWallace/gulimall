package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author krugal
 * @email krugal@gmail.com
 * @date 2020-09-08 14:58:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
