package com.jay.gulimail.coupon.dao;

import com.jay.gulimail.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 15:44:47
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
