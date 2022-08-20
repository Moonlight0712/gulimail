package com.jay.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.common.utils.PageUtils;
import com.jay.gulimail.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 16:04:08
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

