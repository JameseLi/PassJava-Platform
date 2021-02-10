package com.jackson0714.passjava.question.dao;

import com.jackson0714.passjava.question.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author Lee
 * @email lee@gmail.com
 * @date 2021-01-26 23:01:52
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
	
}
