package com.jay.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.common.utils.PageUtils;
import com.jay.gulimail.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 15:17:11
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

