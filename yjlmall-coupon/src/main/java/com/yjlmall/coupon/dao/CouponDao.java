package com.yjlmall.coupon.dao;

import com.yjlmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author muyi-jian
 * @email 2628168756@qq.com
 * @date 2023-04-21 20:29:31
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}