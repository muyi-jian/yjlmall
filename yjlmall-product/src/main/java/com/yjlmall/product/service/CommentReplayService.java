package com.yjlmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yjlmall.common.utils.PageUtils;
import com.yjlmall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author muyi-jian
 * @email 2628168756@qq.com
 * @date 2023-04-21 20:27:32
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
