package com.jackson0714.passjava.study.dao;

import com.jackson0714.passjava.study.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author Lee
 * @email lee@gmail.com
 * @date 2021-02-10 17:16:24
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
