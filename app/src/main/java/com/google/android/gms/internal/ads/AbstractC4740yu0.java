package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.yu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4740yu0 extends AbstractC2563eu0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f28226b = Logger.getLogger(AbstractC4740yu0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f28227c = Vv0.a();

    /* renamed from: a, reason: collision with root package name */
    C4849zu0 f28228a;

    /* synthetic */ AbstractC4740yu0(AbstractC4631xu0 abstractC4631xu0) {
    }

    static int B(int i8, InterfaceC3871qv0 interfaceC3871qv0, Iv0 iv0) {
        int e8 = e(i8 << 3);
        return e8 + e8 + ((Wt0) interfaceC3871qv0).e(iv0);
    }

    static int b(InterfaceC3871qv0 interfaceC3871qv0, Iv0 iv0) {
        int e8 = ((Wt0) interfaceC3871qv0).e(iv0);
        return e(e8) + e8;
    }

    static int c(int i8) {
        if (i8 > 4096) {
            return 4096;
        }
        return i8;
    }

    public static int d(String str) {
        int length;
        try {
            length = AbstractC2133aw0.e(str);
        } catch (Zv0 unused) {
            length = str.getBytes(AbstractC2131av0.f20782a).length;
        }
        return e(length) + length;
    }

    public static int e(int i8) {
        return (352 - (Integer.numberOfLeadingZeros(i8) * 9)) >>> 6;
    }

    public static int f(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public abstract void A(long j8);

    @Override // com.google.android.gms.internal.ads.AbstractC2563eu0
    public abstract void a(byte[] bArr, int i8, int i9);

    public final void g() {
        if (n() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void h(String str, Zv0 zv0) {
        f28226b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zv0);
        byte[] bytes = str.getBytes(AbstractC2131av0.f20782a);
        try {
            int length = bytes.length;
            y(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgwt(e8);
        }
    }

    public abstract void j();

    public abstract void k(byte b8);

    public abstract void l(int i8, boolean z7);

    public abstract void m(int i8, AbstractC3542nu0 abstractC3542nu0);

    public abstract int n();

    public abstract void o(int i8, int i9);

    public abstract void p(int i8);

    public abstract void q(int i8, long j8);

    public abstract void r(long j8);

    public abstract void s(int i8, int i9);

    public abstract void t(int i8);

    abstract void u(int i8, InterfaceC3871qv0 interfaceC3871qv0, Iv0 iv0);

    public abstract void v(int i8, String str);

    public abstract void w(int i8, int i9);

    public abstract void x(int i8, int i9);

    public abstract void y(int i8);

    public abstract void z(int i8, long j8);
}
