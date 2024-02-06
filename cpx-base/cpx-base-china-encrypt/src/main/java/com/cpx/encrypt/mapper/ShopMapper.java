package com.cpx.encrypt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cpx.encrypt.domain.Shop;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author:  pengxiang chen
 * @date:  2024/2/5 15:37
 * @description:  
 */

@Mapper
public interface ShopMapper  extends BaseMapper<Shop> {
    int deleteByPrimaryKey(String shopNo);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(String shopNo);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}