package com.yjlmall.member.dao;

import com.yjlmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author muyi-jian
 * @email 2628168756@qq.com
 * @date 2023-04-21 20:25:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
