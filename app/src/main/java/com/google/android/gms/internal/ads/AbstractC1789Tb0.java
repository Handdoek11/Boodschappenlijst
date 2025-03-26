package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Tb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1789Tb0 {
    public static void a() {
        if (!AbstractC1857Va0.b()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(String str, int i8, String str2) {
        if (str.length() > 256) {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
    }
}
