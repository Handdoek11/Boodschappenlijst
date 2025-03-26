package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class Ov0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f18073a = 100;

    Ov0() {
    }

    abstract Object a(Object obj);

    abstract Object b();

    abstract Object c(Object obj);

    abstract void d(Object obj, int i8, int i9);

    abstract void e(Object obj, int i8, long j8);

    abstract void f(Object obj, int i8, Object obj2);

    abstract void g(Object obj, int i8, AbstractC3542nu0 abstractC3542nu0);

    abstract void h(Object obj, int i8, long j8);

    abstract void i(Object obj);

    abstract void j(Object obj, Object obj2);

    final boolean k(Object obj, Cv0 cv0, int i8) {
        int d8 = cv0.d();
        int i9 = d8 >>> 3;
        int i10 = d8 & 7;
        if (i10 == 0) {
            h(obj, i9, cv0.j());
            return true;
        }
        if (i10 == 1) {
            e(obj, i9, cv0.i());
            return true;
        }
        if (i10 == 2) {
            g(obj, i9, cv0.p());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            d(obj, i9, cv0.c());
            return true;
        }
        Object b8 = b();
        int i11 = i9 << 3;
        int i12 = i8 + 1;
        if (i12 >= f18073a) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (cv0.a() != Integer.MAX_VALUE && k(b8, cv0, i12)) {
        }
        if ((i11 | 4) != cv0.d()) {
            throw new zzgyg("Protocol message end-group tag did not match expected tag.");
        }
        f(obj, i9, c(b8));
        return true;
    }
}
