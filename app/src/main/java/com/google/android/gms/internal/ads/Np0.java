package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class Np0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f17634a = new Mp0();

    static /* synthetic */ SecureRandom a() {
        SecureRandom c8 = c();
        c8.nextLong();
        return c8;
    }

    public static byte[] b(int i8) {
        byte[] bArr = new byte[i8];
        ((SecureRandom) f17634a.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom c() {
        Provider a8 = AbstractC4401vo0.a();
        if (a8 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", a8);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
