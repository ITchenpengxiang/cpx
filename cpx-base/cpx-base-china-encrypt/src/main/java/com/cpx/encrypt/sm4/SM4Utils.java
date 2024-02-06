package com.cpx.encrypt.sm4;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;


/**
 * @author: pengxiang chen
 * @date: 2024/2/5 17:28
 * @description:
 */
public class SM4Utils {


    /**
     * 生成秘钥
     */
    public static String generateKey() throws NoSuchAlgorithmException {
        return SecretCommon.generateKey().substring(0, 16);
    }

    /**
     * 默认加密方法（ECB）
     */
    public static String encrypt(String plainText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return encryptECB(plainText, keyText);
    }

    /**
     * 默认解密方法（ECB）
     */
    public static String decrypt(String cipherText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return decryptECB(cipherText, keyText);
    }

    /**
     * ECB模式，加密
     *
     * @param plainText 明文字符串
     * @param keyText   秘钥内容
     */
    public static String encryptECB(String plainText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return SecretCommon.encryptECB(plainText, keyText);
    }

    /**
     * ECB模式，解密
     *
     * @param cipherText 密文字符串
     * @param keyText    秘钥内容
     */
    public static String decryptECB(String cipherText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return SecretCommon.decryptECB(cipherText, keyText);
    }

    /**
     * CBC模式，加密
     *
     * @param plainText 明文字符串
     * @param keyText   秘钥内容
     */
    public static String encryptCBC(String plainText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return SecretCommon.encryptCBC(plainText, keyText);
    }

    /**
     * CBC模式，解密
     *
     * @param cipherText 密文字符串
     * @param keyText    秘钥内容
     */
    public static String decryptCBC(String cipherText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return SecretCommon.decryptCBC(cipherText, keyText);
    }

}
