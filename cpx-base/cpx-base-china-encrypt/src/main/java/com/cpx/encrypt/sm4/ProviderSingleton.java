package com.cpx.encrypt.sm4;

/**
 * @author: pengxiang chen
 * @date: 2024/2/5 17:25
 * @description:
 */
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class ProviderSingleton {

    private static BouncyCastleProvider instance = null;

    private ProviderSingleton() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new BouncyCastleProvider();
        }
    }

    public static BouncyCastleProvider getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

}
