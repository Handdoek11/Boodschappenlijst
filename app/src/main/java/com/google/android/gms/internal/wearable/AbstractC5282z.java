package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.wearable.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5282z {
    static /* bridge */ /* synthetic */ int a(long[] jArr, long j8, int i8, int i9) {
        while (i8 < i9) {
            if (jArr[i8] == j8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static List b(long... jArr) {
        int length = jArr.length;
        return length == 0 ? Collections.emptyList() : new C5280y(jArr, 0, length);
    }
}
