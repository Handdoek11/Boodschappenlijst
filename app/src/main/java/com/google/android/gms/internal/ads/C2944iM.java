package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.iM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2944iM {

    /* renamed from: a, reason: collision with root package name */
    private int f22961a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f22962b;

    public C2944iM(int i8) {
        this.f22962b = new long[i8];
    }

    public final int a() {
        return this.f22961a;
    }

    public final long b(int i8) {
        if (i8 >= 0 && i8 < this.f22961a) {
            return this.f22962b[i8];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i8 + ", size is " + this.f22961a);
    }

    public final void c(long j8) {
        int i8 = this.f22961a;
        long[] jArr = this.f22962b;
        if (i8 == jArr.length) {
            this.f22962b = Arrays.copyOf(jArr, i8 + i8);
        }
        long[] jArr2 = this.f22962b;
        int i9 = this.f22961a;
        this.f22961a = i9 + 1;
        jArr2[i9] = j8;
    }

    public final void d(long[] jArr) {
        int i8 = this.f22961a;
        int length = jArr.length;
        int i9 = i8 + length;
        long[] jArr2 = this.f22962b;
        int length2 = jArr2.length;
        if (i9 > length2) {
            this.f22962b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i9));
        }
        System.arraycopy(jArr, 0, this.f22962b, this.f22961a, length);
        this.f22961a = i9;
    }
}
