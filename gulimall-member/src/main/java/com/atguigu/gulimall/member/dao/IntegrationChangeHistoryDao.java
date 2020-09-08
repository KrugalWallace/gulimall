package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author krugal
 * @email krugal@gmail.com
 * @date 2020-09-08 14:48:34
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
