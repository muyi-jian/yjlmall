package com.yjlmall.order.dao;

import com.yjlmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author muyi-jian
 * @email 2628168756@qq.com
 * @date 2023-04-21 20:11:10
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
