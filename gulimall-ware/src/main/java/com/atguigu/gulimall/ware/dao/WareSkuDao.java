package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author krugal
 * @email krugal@gmail.com
 * @date 2020-09-08 15:13:30
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
