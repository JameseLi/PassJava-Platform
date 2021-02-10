package com.jackson0714.passjava.member.dao;

import com.jackson0714.passjava.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author Lee
 * @email lee@gmail.com
 * @date 2021-02-10 16:58:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
