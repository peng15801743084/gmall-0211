package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author peng
 * @email peng@atguigu.com
 * @date 2020-07-21 00:30:14
 */
@Mapper
public interface CouponMapper extends BaseMapper<CouponEntity> {
	
}
