package com.jay.gulimail.product.dao;

import com.jay.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 15:17:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
