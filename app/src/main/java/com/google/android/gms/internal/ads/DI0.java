package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class DI0 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f14472a;

    /* renamed from: b, reason: collision with root package name */
    private final JH0[] f14473b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f14474c;

    /* renamed from: d, reason: collision with root package name */
    private final int[][][] f14475d;

    /* renamed from: e, reason: collision with root package name */
    private final JH0 f14476e;

    DI0(String[] strArr, int[] iArr, JH0[] jh0Arr, int[] iArr2, int[][][] iArr3, JH0 jh0) {
        this.f14472a = iArr;
        this.f14473b = jh0Arr;
        this.f14475d = iArr3;
        this.f14474c = iArr2;
        this.f14476e = jh0;
    }

    public final int a(int i8, int i9, boolean z7) {
        int i10 = this.f14473b[i8].b(i9).f27902a;
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            if ((this.f14475d[i8][i9][i13] & 7) == 4) {
                iArr[i12] = i13;
                i12++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i12);
        String str = null;
        int i14 = 0;
        int i15 = 16;
        boolean z8 = false;
        while (i11 < copyOf.length) {
            String str2 = this.f14473b[i8].b(i9).b(copyOf[i11]).f14334o;
            int i16 = i14 + 1;
            if (i14 == 0) {
                str = str2;
            } else {
                z8 |= !Objects.equals(str, str2);
            }
            i15 = Math.min(i15, this.f14475d[i8][i9][i11] & 24);
            i11++;
            i14 = i16;
        }
        return z8 ? Math.min(i15, this.f14474c[i8]) : i15;
    }

    public final int b(int i8, int i9, int i10) {
        return this.f14475d[i8][i9][i10];
    }

    public final int c(int i8) {
        return this.f14472a[i8];
    }

    public final JH0 d(int i8) {
        return this.f14473b[i8];
    }

    public final JH0 e() {
        return this.f14476e;
    }
}
