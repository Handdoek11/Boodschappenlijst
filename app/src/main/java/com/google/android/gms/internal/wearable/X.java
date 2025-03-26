package com.google.android.gms.internal.wearable;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class X extends I {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f30104b = Logger.getLogger(X.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f30105c = f1.C();

    /* renamed from: a, reason: collision with root package name */
    Y f30106a;

    /* synthetic */ X(W w7) {
    }

    public static int a(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    static int w(int i8, I0 i02, U0 u02) {
        int z7 = z(i8 << 3);
        return z7 + z7 + ((C) i02).a(u02);
    }

    static int x(I0 i02, U0 u02) {
        int a8 = ((C) i02).a(u02);
        return z(a8) + a8;
    }

    public static int y(String str) {
        int length;
        try {
            length = i1.c(str);
        } catch (h1 unused) {
            length = str.getBytes(AbstractC5269s0.f30212a).length;
        }
        return z(length) + length;
    }

    public static int z(int i8) {
        return (352 - (Integer.numberOfLeadingZeros(i8) * 9)) >>> 6;
    }

    public final void b() {
        if (e() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c(String str, h1 h1Var) {
        f30104b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) h1Var);
        byte[] bytes = str.getBytes(AbstractC5269s0.f30212a);
        try {
            int length = bytes.length;
            t(length);
            o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzbu(e8);
        }
    }

    public abstract int e();

    public abstract void f(byte b8);

    public abstract void g(int i8, boolean z7);

    public abstract void h(int i8, Q q8);

    public abstract void i(int i8, int i9);

    public abstract void j(int i8);

    public abstract void k(int i8, long j8);

    public abstract void l(long j8);

    public abstract void m(int i8, int i9);

    public abstract void n(int i8);

    public abstract void o(byte[] bArr, int i8, int i9);

    abstract void p(int i8, I0 i02, U0 u02);

    public abstract void q(int i8, String str);

    public abstract void r(int i8, int i9);

    public abstract void s(int i8, int i9);

    public abstract void t(int i8);

    public abstract void u(int i8, long j8);

    public abstract void v(long j8);
}
