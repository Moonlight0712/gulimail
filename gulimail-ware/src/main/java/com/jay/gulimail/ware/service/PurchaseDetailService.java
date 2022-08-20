package com.jay.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.common.utils.PageUtils;
import com.jay.gulimail.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 16:19:15
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

