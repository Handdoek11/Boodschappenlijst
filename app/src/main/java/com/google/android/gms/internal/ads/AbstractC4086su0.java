package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.su0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4086su0 {

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f26752d = 100;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26753e = 0;

    /* renamed from: a, reason: collision with root package name */
    int f26754a;

    /* renamed from: b, reason: collision with root package name */
    final int f26755b = f26752d;

    /* renamed from: c, reason: collision with root package name */
    C4195tu0 f26756c;

    /* synthetic */ AbstractC4086su0(AbstractC3977ru0 abstractC3977ru0) {
    }

    public static int c(int i8) {
        return (i8 >>> 1) ^ (-(i8 & 1));
    }

    public static long d(long j8) {
        return (j8 >>> 1) ^ (-(1 & j8));
    }

    public static AbstractC4086su0 e(InputStream inputStream, int i8) {
        if (inputStream != null) {
            return new C3869qu0(inputStream, 4096, null);
        }
        byte[] bArr = AbstractC2131av0.f20783b;
        int length = bArr.length;
        return f(bArr, 0, 0, false);
    }

    static AbstractC4086su0 f(byte[] bArr, int i8, int i9, boolean z7) {
        C3651ou0 c3651ou0 = new C3651ou0(bArr, i8, i9, z7, null);
        try {
            c3651ou0.j(i9);
            return c3651ou0;
        } catch (zzgyg e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract void A(int i8);

    public abstract boolean a();

    public abstract boolean b();

    public abstract double g();

    public abstract float h();

    public abstract int i();

    public abstract int j(int i8);

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract AbstractC3542nu0 w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i8);
}
