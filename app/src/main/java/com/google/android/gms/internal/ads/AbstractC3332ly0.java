package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ly0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3332ly0 {
    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static Object b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void c(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
