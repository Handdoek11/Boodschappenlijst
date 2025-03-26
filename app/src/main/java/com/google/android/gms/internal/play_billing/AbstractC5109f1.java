package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.AbstractC3955rj0;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5109f1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j8, Object obj2, Object obj3) {
        while (!AbstractC3955rj0.a(unsafe, obj, j8, obj2, obj3)) {
            if (unsafe.getObject(obj, j8) != obj2) {
                return false;
            }
        }
        return true;
    }
}
