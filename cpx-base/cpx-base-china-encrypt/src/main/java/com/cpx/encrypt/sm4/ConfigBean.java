package com.cpx.encrypt.sm4;

/**
 * @author: pengxiang chen
 * @date: 2024/2/5 17:25
 * @description:
 */
public class ConfigBean {

    /**
     * 秘钥空间大小
     */
    public static final int SM4_KEY_SIZE = 128;

    /**
     * 算法编号
     */
    public static final String ALGORITHM_NAME  = "SM4";

    /**
     * 首次加密初始向量  01030507090B0D0F11131517191B1D1F
     */
    public static final byte[] SM4_KEY_IV = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 };

    /**
     * ECB模式串
     */
    public static final String ALGORITHM_ECB_PADDING = "SM4/ECB/PKCS5Padding";
    /**
     * CBC模式串
     */
    public static final String ALGORITHM_CBC_PADDING = "SM4/CBC/PKCS5Padding";

}
