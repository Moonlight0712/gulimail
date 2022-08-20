package com.jay.gulimail.order.dao;

import com.jay.gulimail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 16:15:14
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
