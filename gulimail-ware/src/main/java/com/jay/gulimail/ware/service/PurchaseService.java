package com.jay.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.common.utils.PageUtils;
import com.jay.gulimail.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 16:19:15
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

