package com.jackson0714.passjava.question.dao;

import com.jackson0714.passjava.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author Lee
 * @email lee@gmail.com
 * @date 2021-01-26 23:01:52
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
