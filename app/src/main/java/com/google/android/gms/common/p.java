package com.google.android.gms.common;

/* loaded from: classes.dex */
public abstract class p {
    static int a(int i8) {
        int[] iArr = {1, 2, 3};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr[i9];
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            if (i11 == i8) {
                return i10;
            }
        }
        return 1;
    }
}
