package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.rj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3955rj0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j8, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j8, obj2, obj3)) {
            if (unsafe.getObject(obj, j8) != obj2) {
                return false;
            }
        }
        return true;
    }
}
