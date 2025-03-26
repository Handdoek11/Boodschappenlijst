package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ip0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2988ip0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C2988ip0 f23068b = new C2988ip0();

    /* renamed from: a, reason: collision with root package name */
    private final Map f23069a = new HashMap();

    C2988ip0() {
    }

    public static C2988ip0 b() {
        return f23068b;
    }

    public final synchronized AbstractC2763gl0 a(String str) {
        if (!this.f23069a.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (AbstractC2763gl0) this.f23069a.get("AES128_GCM");
    }

    public final synchronized void c(String str, AbstractC2763gl0 abstractC2763gl0) {
        try {
            if (!this.f23069a.containsKey(str)) {
                this.f23069a.put(str, abstractC2763gl0);
                return;
            }
            if (((AbstractC2763gl0) this.f23069a.get(str)).equals(abstractC2763gl0)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f23069a.get(str)) + "), cannot insert " + String.valueOf(abstractC2763gl0));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c((String) entry.getKey(), (AbstractC2763gl0) entry.getValue());
        }
    }
}
