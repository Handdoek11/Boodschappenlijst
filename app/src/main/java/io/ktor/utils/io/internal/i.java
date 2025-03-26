package io.ktor.utils.io.internal;

import J6.r;

/* loaded from: classes2.dex */
public abstract class i {
    public static final int a(String str, int i8) {
        String str2;
        Integer k8;
        r.e(str, "name");
        try {
            str2 = System.getProperty("io.ktor.utils.io." + str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        return (str2 == null || (k8 = S6.h.k(str2)) == null) ? i8 : k8.intValue();
    }
}
