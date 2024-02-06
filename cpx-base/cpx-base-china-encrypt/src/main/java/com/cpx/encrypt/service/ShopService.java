package com.cpx.encrypt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cpx.encrypt.domain.Shop;
    /**
 * @author:  pengxiang chen
 * @date:  2024/2/5 15:37
 * @description:  
 */

public interface ShopService extends IService<Shop> {

    int deleteByPrimaryKey(String shopNo);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(String shopNo);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

}
