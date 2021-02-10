package com.jackson0714.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.passjava.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author Lee
 * @email lee@gmail.com
 * @date 2021-01-26 23:01:52
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

