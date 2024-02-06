package com.cpx.encrypt.sm4;

/**
 * @author: pengxiang chen
 * @date: 2024/2/5 17:26
 * @description:
 */
import org.apache.tomcat.util.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;

/**
 * SM4分组对称密码算法（对称算法）
 * SM4分组密码算法是我国自主设计的分组对称密码算法，用于实现数据的加密/解密运算，以保证数据和信息的机密性。
 * 要保证一个对称密码算法的安全性的基本条件是其具备足够的密钥长度，SM4算法与AES算法具有相同的密钥长度分组长度128比特，因此在安全性上高于3DES算法。
 */
public class SecretCommon {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    /**
     * 生成秘钥
     */
    public static String generateKey() throws NoSuchAlgorithmException {
        return ByteUtils.toHexString(generateKeyByte(ConfigBean.SM4_KEY_SIZE, ProviderSingleton.getInstance()));
    }

    /**
     * 生成秘钥
     */
    public static String generateKeyBC() throws NoSuchProviderException, NoSuchAlgorithmException {
        return ByteUtils.toHexString(generateKeyByte(ConfigBean.SM4_KEY_SIZE, BouncyCastleProvider.PROVIDER_NAME));
    }

    public static byte[] generateKeyByte(int keySize, String var) throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ConfigBean.ALGORITHM_NAME, var);
        keyGenerator.init(keySize, new SecureRandom());
        return keyGenerator.generateKey().getEncoded();
    }

    public static byte[] generateKeyByte(int keySize, BouncyCastleProvider var) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ConfigBean.ALGORITHM_NAME, var);
        keyGenerator.init(keySize, new SecureRandom());
        return keyGenerator.generateKey().getEncoded();
    }

    /**
     * ECB模式，加密
     * @param plainText 明文字符串
     * @param keyText 秘钥内容
     */
    public static String encryptECB(String plainText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return Base64.encodeBase64String(cipherECB(Cipher.ENCRYPT_MODE, plainText.getBytes(StandardCharsets.UTF_8), keyText.getBytes()));
    }

    /**
     * ECB模式，解密
     * @param cipherText 密文字符串
     * @param keyText 秘钥内容
     */
    public static String decryptECB(String cipherText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return new String(cipherECB(Cipher.DECRYPT_MODE, Base64.decodeBase64(cipherText), keyText.getBytes()));
    }

    /**
     * ECB模式，加解密算法基础方法
     * @param mode 加解密模式 Cipher.ENCRYPT_MODE 1：加密/ Cipher.DECRYPT_MODE 2：解密
     * @param plainByte 需加密明文内容/待解密密文内容
     * @param keyByte 秘钥内容
     */
    public static byte[] cipherECB(int mode, byte[] plainByte, byte[] keyByte) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance(ConfigBean.ALGORITHM_ECB_PADDING, ProviderSingleton.getInstance());
        cipher.init(mode, new SecretKeySpec(keyByte, ConfigBean.ALGORITHM_NAME));
        return cipher.doFinal(plainByte);
    }

    /**
     * CBC模式，加密
     * @param plainText 明文字符串
     * @param keyText 秘钥内容
     */
    public static String encryptCBC(String plainText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return Base64.encodeBase64String(cipherCBC(Cipher.ENCRYPT_MODE, plainText.getBytes(StandardCharsets.UTF_8), keyText.getBytes()));
    }

    /**
     * CBC模式，解密
     * @param cipherText 密文字符串
     * @param keyText 秘钥内容
     */
    public static String decryptCBC(String cipherText, String keyText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return new String(cipherCBC(Cipher.DECRYPT_MODE, Base64.decodeBase64(cipherText), keyText.getBytes()));
    }

    /**
     * CBC模式，加解密算法基础方法
     * @param mode 加解密模式 Cipher.ENCRYPT_MODE 1：加密/ Cipher.DECRYPT_MODE 2：解密
     * @param plainByte 需加密明文内容/待解密密文内容
     * @param keyByte 秘钥内容
     */
    public static byte[] cipherCBC(int mode, byte[] plainByte, byte[] keyByte) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance(ConfigBean.ALGORITHM_CBC_PADDING, ProviderSingleton.getInstance());
        cipher.init(mode, new SecretKeySpec(keyByte, ConfigBean.ALGORITHM_NAME), new IvParameterSpec(ConfigBean.SM4_KEY_IV));
        return cipher.doFinal(plainByte);
    }

}
