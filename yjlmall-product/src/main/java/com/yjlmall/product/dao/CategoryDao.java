package com.yjlmall.product.dao;

import com.yjlmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author muyi-jian
 * @email 2628168756@qq.com
 * @date 2023-04-21 20:27:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}