package com.jay.gulimail.order.dao;

import com.jay.gulimail.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 16:15:14
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
