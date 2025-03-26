package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3298lh0 {
    static int a(int i8) {
        return (int) (Integer.rotateLeft((int) (i8 * (-862048943)), 15) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
