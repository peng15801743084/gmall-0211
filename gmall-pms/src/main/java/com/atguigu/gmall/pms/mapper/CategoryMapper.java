package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author peng
 * @email peng@atguigu.com
 * @date 2020-07-20 22:21:32
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
