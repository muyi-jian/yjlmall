package com.yjlmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yjlmall.common.utils.PageUtils;
import com.yjlmall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-08 09:56:16
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

