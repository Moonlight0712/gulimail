package com.jay.gulimail.order.dao;

import com.jay.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 16:15:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
