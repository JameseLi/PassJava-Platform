package com.jackson0714.passjava.content.dao;

import com.jackson0714.passjava.content.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author Lee
 * @email lee@gmail.com
 * @date 2021-02-10 17:07:40
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
