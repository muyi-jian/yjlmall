package com.yjlmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yjlmall.common.utils.PageUtils;
import com.yjlmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-08 09:56:16
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

