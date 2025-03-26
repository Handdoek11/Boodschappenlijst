package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.wearable.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5276w extends AbstractC5278x {
    static /* bridge */ /* synthetic */ int a(float[] fArr, float f8, int i8, int i9) {
        while (i8 < i9) {
            if (fArr[i8] == f8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static List b(float... fArr) {
        int length = fArr.length;
        return length == 0 ? Collections.emptyList() : new C5274v(fArr, 0, length);
    }
}
