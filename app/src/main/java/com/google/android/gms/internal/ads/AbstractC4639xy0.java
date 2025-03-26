package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.xy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4639xy0 extends AbstractC1981Yl {

    /* renamed from: b, reason: collision with root package name */
    private final int f27945b;

    /* renamed from: c, reason: collision with root package name */
    private final CH0 f27946c;

    public AbstractC4639xy0(boolean z7, CH0 ch0) {
        this.f27946c = ch0;
        this.f27945b = ch0.c();
    }

    private final int w(int i8, boolean z7) {
        if (z7) {
            return this.f27946c.d(i8);
        }
        if (i8 >= this.f27945b - 1) {
            return -1;
        }
        return i8 + 1;
    }

    private final int x(int i8, boolean z7) {
        if (z7) {
            return this.f27946c.e(i8);
        }
        if (i8 <= 0) {
            return -1;
        }
        return i8 - 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int a(Object obj) {
        int a8;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int p8 = p(obj2);
            if (p8 != -1 && (a8 = u(p8).a(obj3)) != -1) {
                return s(p8) + a8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final C1945Xk d(int i8, C1945Xk c1945Xk, boolean z7) {
        int q8 = q(i8);
        int t7 = t(q8);
        u(q8).d(i8 - s(q8), c1945Xk, z7);
        c1945Xk.f20118c += t7;
        if (z7) {
            Object v7 = v(q8);
            Object obj = c1945Xk.f20117b;
            obj.getClass();
            c1945Xk.f20117b = Pair.create(v7, obj);
        }
        return c1945Xk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final C4721yl e(int i8, C4721yl c4721yl, long j8) {
        int r8 = r(i8);
        int t7 = t(r8);
        int s8 = s(r8);
        u(r8).e(i8 - t7, c4721yl, j8);
        Object v7 = v(r8);
        if (!C4721yl.f28182o.equals(c4721yl.f28184a)) {
            v7 = Pair.create(v7, c4721yl.f28184a);
        }
        c4721yl.f28184a = v7;
        c4721yl.f28196m += s8;
        c4721yl.f28197n += s8;
        return c4721yl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final Object f(int i8) {
        int q8 = q(i8);
        return Pair.create(v(q8), u(q8).f(i8 - s(q8)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int g(boolean z7) {
        if (this.f27945b != 0) {
            int a8 = z7 ? this.f27946c.a() : 0;
            while (u(a8).o()) {
                a8 = w(a8, z7);
                if (a8 == -1) {
                }
            }
            return t(a8) + u(a8).g(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int h(boolean z7) {
        int i8 = this.f27945b;
        if (i8 != 0) {
            int b8 = z7 ? this.f27946c.b() : i8 - 1;
            while (u(b8).o()) {
                b8 = x(b8, z7);
                if (b8 == -1) {
                }
            }
            return t(b8) + u(b8).h(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int j(int i8, int i9, boolean z7) {
        int r8 = r(i8);
        int t7 = t(r8);
        int j8 = u(r8).j(i8 - t7, i9 == 2 ? 0 : i9, z7);
        if (j8 != -1) {
            return t7 + j8;
        }
        int w7 = w(r8, z7);
        while (w7 != -1 && u(w7).o()) {
            w7 = w(w7, z7);
        }
        if (w7 != -1) {
            return t(w7) + u(w7).g(z7);
        }
        if (i9 == 2) {
            return g(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int k(int i8, int i9, boolean z7) {
        int r8 = r(i8);
        int t7 = t(r8);
        int k8 = u(r8).k(i8 - t7, 0, false);
        if (k8 != -1) {
            return t7 + k8;
        }
        int x7 = x(r8, false);
        while (x7 != -1 && u(x7).o()) {
            x7 = x(x7, false);
        }
        if (x7 != -1) {
            return t(x7) + u(x7).h(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final C1945Xk n(Object obj, C1945Xk c1945Xk) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p8 = p(obj2);
        int t7 = t(p8);
        u(p8).n(obj3, c1945Xk);
        c1945Xk.f20118c += t7;
        c1945Xk.f20117b = obj;
        return c1945Xk;
    }

    protected abstract int p(Object obj);

    protected abstract int q(int i8);

    protected abstract int r(int i8);

    protected abstract int s(int i8);

    protected abstract int t(int i8);

    protected abstract AbstractC1981Yl u(int i8);

    protected abstract Object v(int i8);
}
