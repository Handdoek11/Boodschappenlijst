package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* renamed from: com.google.android.gms.internal.ads.vo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4401vo0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f27354a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        String[] strArr = f27354a;
        for (int i8 = 0; i8 < 3; i8++) {
            Provider provider = Security.getProvider(strArr[i8]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
