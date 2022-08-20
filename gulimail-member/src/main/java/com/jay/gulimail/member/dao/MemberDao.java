package com.jay.gulimail.member.dao;

import com.jay.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 16:04:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
