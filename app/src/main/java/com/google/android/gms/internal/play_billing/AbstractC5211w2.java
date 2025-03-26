package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5211w2 extends AbstractC5128i2 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f30022b = Logger.getLogger(AbstractC5211w2.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f30023c = E3.C();

    /* renamed from: a, reason: collision with root package name */
    C5216x2 f30024a;

    /* synthetic */ AbstractC5211w2(AbstractC5205v2 abstractC5205v2) {
    }

    public static int a(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    static int w(int i8, InterfaceC5123h3 interfaceC5123h3, InterfaceC5188s3 interfaceC5188s3) {
        int z7 = z(i8 << 3);
        return z7 + z7 + ((AbstractC5086b2) interfaceC5123h3).a(interfaceC5188s3);
    }

    static int x(InterfaceC5123h3 interfaceC5123h3, InterfaceC5188s3 interfaceC5188s3) {
        int a8 = ((AbstractC5086b2) interfaceC5123h3).a(interfaceC5188s3);
        return z(a8) + a8;
    }

    public static int y(String str) {
        int length;
        try {
            length = H3.c(str);
        } catch (G3 unused) {
            length = str.getBytes(R2.f29809a).length;
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

    final void c(String str, G3 g32) {
        f30022b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) g32);
        byte[] bytes = str.getBytes(R2.f29809a);
        try {
            int length = bytes.length;
            t(length);
            o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgp(e8);
        }
    }

    public abstract int e();

    public abstract void f(byte b8);

    public abstract void g(int i8, boolean z7);

    public abstract void h(int i8, AbstractC5176q2 abstractC5176q2);

    public abstract void i(int i8, int i9);

    public abstract void j(int i8);

    public abstract void k(int i8, long j8);

    public abstract void l(long j8);

    public abstract void m(int i8, int i9);

    public abstract void n(int i8);

    public abstract void o(byte[] bArr, int i8, int i9);

    abstract void p(int i8, InterfaceC5123h3 interfaceC5123h3, InterfaceC5188s3 interfaceC5188s3);

    public abstract void q(int i8, String str);

    public abstract void r(int i8, int i9);

    public abstract void s(int i8, int i9);

    public abstract void t(int i8);

    public abstract void u(int i8, long j8);

    public abstract void v(long j8);
}
