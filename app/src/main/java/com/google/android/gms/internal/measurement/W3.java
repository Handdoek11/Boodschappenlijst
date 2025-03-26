package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class W3 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f29044b = 100;

    /* renamed from: a, reason: collision with root package name */
    int f29045a;

    public static int a(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public static long b(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    static W3 c(byte[] bArr, int i8, int i9, boolean z7) {
        Z3 z32 = new Z3(bArr, i9);
        try {
            z32.d(i9);
            return z32;
        } catch (zzkb e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract int d(int i8);

    public abstract int e();

    private W3() {
        this.f29045a = f29044b;
    }
}
