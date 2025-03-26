package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.sj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4064sj0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j8, Object obj2, Object obj3) {
        while (!AbstractC3955rj0.a(unsafe, obj, j8, obj2, obj3)) {
            if (unsafe.getObject(obj, j8) != obj2) {
                return false;
            }
        }
        return true;
    }
}
