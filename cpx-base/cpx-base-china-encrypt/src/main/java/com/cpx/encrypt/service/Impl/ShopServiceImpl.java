package com.cpx.encrypt.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cpx.encrypt.domain.Shop;
import com.cpx.encrypt.mapper.ShopMapper;
import com.cpx.encrypt.service.ShopService;
/**
 * @author:  pengxiang chen
 * @date:  2024/2/5 15:37
 * @description:  
 */

@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper,Shop> implements ShopService{

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public int deleteByPrimaryKey(String shopNo) {
        return shopMapper.deleteByPrimaryKey(shopNo);
    }

    @Override
    public int insert(Shop record) {
        return shopMapper.insert(record);
    }

    @Override
    public int insertSelective(Shop record) {
        return shopMapper.insertSelective(record);
    }

    @Override
    public Shop selectByPrimaryKey(String shopNo) {
//        return shopMapper.selectByPrimaryKey(shopNo);
        Shop shop = this.getOne(Wrappers.<Shop>lambdaQuery().eq(Shop::getShopNo, shopNo));
        return shop;
    }

    @Override
    public int updateByPrimaryKeySelective(Shop record) {
        return shopMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Shop record) {
        return shopMapper.updateByPrimaryKey(record);
    }

}
