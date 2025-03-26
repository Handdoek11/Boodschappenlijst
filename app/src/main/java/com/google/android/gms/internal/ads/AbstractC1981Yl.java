package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.Yl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1981Yl {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1981Yl f20311a = new C4610xk();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    protected AbstractC1981Yl() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract C1945Xk d(int i8, C1945Xk c1945Xk, boolean z7);

    public abstract C4721yl e(int i8, C4721yl c4721yl, long j8);

    public final boolean equals(Object obj) {
        int h8;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1981Yl)) {
            return false;
        }
        AbstractC1981Yl abstractC1981Yl = (AbstractC1981Yl) obj;
        if (abstractC1981Yl.c() == c() && abstractC1981Yl.b() == b()) {
            C4721yl c4721yl = new C4721yl();
            C1945Xk c1945Xk = new C1945Xk();
            C4721yl c4721yl2 = new C4721yl();
            C1945Xk c1945Xk2 = new C1945Xk();
            for (int i8 = 0; i8 < c(); i8++) {
                if (!e(i8, c4721yl, 0L).equals(abstractC1981Yl.e(i8, c4721yl2, 0L))) {
                    return false;
                }
            }
            for (int i9 = 0; i9 < b(); i9++) {
                if (!d(i9, c1945Xk, true).equals(abstractC1981Yl.d(i9, c1945Xk2, true))) {
                    return false;
                }
            }
            int g8 = g(true);
            if (g8 == abstractC1981Yl.g(true) && (h8 = h(true)) == abstractC1981Yl.h(true)) {
                while (g8 != h8) {
                    int j8 = j(g8, 0, true);
                    if (j8 != abstractC1981Yl.j(g8, 0, true)) {
                        return false;
                    }
                    g8 = j8;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i8);

    public int g(boolean z7) {
        return o() ? -1 : 0;
    }

    public int h(boolean z7) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i8;
        C4721yl c4721yl = new C4721yl();
        C1945Xk c1945Xk = new C1945Xk();
        int c8 = c() + 217;
        int i9 = 0;
        while (true) {
            i8 = c8 * 31;
            if (i9 >= c()) {
                break;
            }
            c8 = i8 + e(i9, c4721yl, 0L).hashCode();
            i9++;
        }
        int b8 = i8 + b();
        for (int i10 = 0; i10 < b(); i10++) {
            b8 = (b8 * 31) + d(i10, c1945Xk, true).hashCode();
        }
        int g8 = g(true);
        while (g8 != -1) {
            b8 = (b8 * 31) + g8;
            g8 = j(g8, 0, true);
        }
        return b8;
    }

    public final int i(int i8, C1945Xk c1945Xk, C4721yl c4721yl, int i9, boolean z7) {
        int i10 = d(i8, c1945Xk, false).f20118c;
        if (e(i10, c4721yl, 0L).f28197n != i8) {
            return i8 + 1;
        }
        int j8 = j(i10, i9, z7);
        if (j8 == -1) {
            return -1;
        }
        return e(j8, c4721yl, 0L).f28196m;
    }

    public int j(int i8, int i9, boolean z7) {
        if (i9 == 0) {
            if (i8 == h(z7)) {
                return -1;
            }
            return i8 + 1;
        }
        if (i9 == 1) {
            return i8;
        }
        if (i9 == 2) {
            return i8 == h(z7) ? g(z7) : i8 + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i8, int i9, boolean z7) {
        if (i8 == g(false)) {
            return -1;
        }
        return i8 - 1;
    }

    public final Pair l(C4721yl c4721yl, C1945Xk c1945Xk, int i8, long j8) {
        Pair m8 = m(c4721yl, c1945Xk, i8, j8, 0L);
        m8.getClass();
        return m8;
    }

    public final Pair m(C4721yl c4721yl, C1945Xk c1945Xk, int i8, long j8, long j9) {
        AbstractC3796qC.a(i8, 0, c());
        e(i8, c4721yl, j9);
        if (j8 == -9223372036854775807L) {
            long j10 = c4721yl.f28194k;
            j8 = 0;
        }
        int i9 = c4721yl.f28196m;
        d(i9, c1945Xk, false);
        while (i9 < c4721yl.f28197n) {
            long j11 = c1945Xk.f20120e;
            if (j8 == 0) {
                break;
            }
            int i10 = i9 + 1;
            long j12 = d(i10, c1945Xk, false).f20120e;
            if (j8 < 0) {
                break;
            }
            i9 = i10;
        }
        d(i9, c1945Xk, true);
        long j13 = c1945Xk.f20120e;
        long j14 = c1945Xk.f20119d;
        if (j14 != -9223372036854775807L) {
            j8 = Math.min(j8, j14 - 1);
        }
        long max = Math.max(0L, j8);
        Object obj = c1945Xk.f20117b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public C1945Xk n(Object obj, C1945Xk c1945Xk) {
        return d(a(obj), c1945Xk, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
