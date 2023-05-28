package com.yjlmall.product.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-01 21:08:49
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@NotNull(message = "修改必须指定品牌id",groups = {com.yjlmall.common.validator.UpdateGroup.class})
	@Null(message = "新增不能指定id",groups = {com.yjlmall.common.validator.AddGroup.class})
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名必须提交",groups = {com.yjlmall.common.validator.AddGroup.class, com.yjlmall.common.validator.UpdateGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotBlank(groups = {com.yjlmall.common.validator.AddGroup.class})
	@URL(message = "logo必须是一个合法的url地址",groups={com.yjlmall.common.validator.AddGroup.class, com.yjlmall.common.validator.UpdateGroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
//	@Pattern()
	@NotNull(groups = {com.yjlmall.common.validator.AddGroup.class, com.yjlmall.common.validator.UpdateStatusGroup.class})
  	@com.yjlmall.common.validator.ListValue(vals={0,1},groups = {com.yjlmall.common.validator.AddGroup.class, com.yjlmall.common.validator.UpdateStatusGroup.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@NotEmpty(groups={com.yjlmall.common.validator.AddGroup.class})
	@Pattern(regexp="^[a-zA-Z]$",message = "检索首字母必须是一个字母",groups={com.yjlmall.common.validator.AddGroup.class, com.yjlmall.common.validator.UpdateGroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull(groups={com.yjlmall.common.validator.AddGroup.class})
	@Min(value = 0,message = "排序必须大于等于0",groups={com.yjlmall.common.validator.AddGroup.class, com.yjlmall.common.validator.UpdateGroup.class})
	private Integer sort;

}
