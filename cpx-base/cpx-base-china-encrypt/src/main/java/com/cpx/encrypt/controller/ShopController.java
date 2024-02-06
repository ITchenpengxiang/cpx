package com.cpx.encrypt.controller;
import com.cpx.encrypt.domain.Shop;
import com.cpx.encrypt.service.Impl.ShopServiceImpl;
import com.cpx.encrypt.sm4.SM4Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.security.NoSuchAlgorithmException;

/**
* 专卖店表(shop)表控制层
*
* @author xxxxx
*/
@Slf4j
@RestController
@RequestMapping("/shop")
public class ShopController {
/**
* 服务对象
*/
    @Autowired
    private ShopServiceImpl shopServiceImpl;

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("/selectOne")
    public Shop selectOne(String id) {
        log.info("id={}",id);
    return shopServiceImpl.selectByPrimaryKey(id);
    }

    @GetMapping("/encrypt")
    public void encrypt () throws Exception {
//        String key = SM4Utils.generateKey();
        String key = "MvQi-s`7jX-d9ndf";
        System.out.println("生成SM4秘钥：" + key);

        String plainText = "6226840220118602";
        String ECBText = SM4Utils.encrypt(plainText, key);
        System.out.println("ECB默认加密后密文：" + ECBText);
        System.out.println("ECB默认解密后明文：" + SM4Utils.decrypt(ECBText, key));

        String CBCText = SM4Utils.encryptCBC(plainText, key);
        System.out.println("CBC加密后密文：" + CBCText);
        System.out.println("CBC解密后明文：" + SM4Utils.decryptCBC(CBCText, key));

    }

}
