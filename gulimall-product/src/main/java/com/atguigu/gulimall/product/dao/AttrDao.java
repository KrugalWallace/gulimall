package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author krugal
 * @email krugal@gmail.com
 * @date 2020-09-08 15:10:26
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
