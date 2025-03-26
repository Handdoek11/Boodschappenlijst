package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class Dn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f14553a = new Cn0();

    public static AlgorithmParameterSpec a(byte[] bArr, int i8, int i9) {
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        return new GCMParameterSpec(128, bArr, i8, 12);
    }

    public static Cipher b() {
        return (Cipher) f14553a.get();
    }

    public static SecretKey c(byte[] bArr) {
        Rt0.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
