package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5078a0 {
    AbstractC5078a0() {
    }

    static int a(int i8, int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i9 <= i8) {
            return i8;
        }
        int i10 = i8 + (i8 >> 1) + 1;
        if (i10 < i9) {
            int highestOneBit = Integer.highestOneBit(i9 - 1);
            i10 = highestOneBit + highestOneBit;
        }
        if (i10 < 0) {
            return Integer.MAX_VALUE;
        }
        return i10;
    }
}
