package com.jay.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.common.utils.PageUtils;
import com.jay.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 16:15:14
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

