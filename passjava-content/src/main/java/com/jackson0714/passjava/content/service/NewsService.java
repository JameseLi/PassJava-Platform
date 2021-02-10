package com.jackson0714.passjava.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.passjava.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author Lee
 * @email lee@gmail.com
 * @date 2021-02-10 17:07:40
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

