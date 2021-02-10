package com.jackson0714.passjava.channel.dao;

import com.jackson0714.passjava.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author Lee
 * @email lee@gmail.com
 * @date 2021-02-10 11:13:23
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
