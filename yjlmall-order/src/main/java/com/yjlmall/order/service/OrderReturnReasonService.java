package com.yjlmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yjlmall.common.utils.PageUtils;
import com.yjlmall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author muyi-jian
 * @email 2628168756@qq.com
 * @date 2023-04-21 20:11:10
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
