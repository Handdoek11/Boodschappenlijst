package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class A0 extends B0 implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    private static final A0 f29675t = new A0(V.f29842s, U.f29837s);

    /* renamed from: o, reason: collision with root package name */
    final W f29676o;

    /* renamed from: s, reason: collision with root package name */
    final W f29677s;

    private A0(W w7, W w8) {
        this.f29676o = w7;
        this.f29677s = w8;
        if (w7.a(w8) > 0 || w7 == U.f29837s || w8 == V.f29842s) {
            throw new IllegalArgumentException("Invalid range: ".concat(e(w7, w8)));
        }
    }

    public static A0 a() {
        return f29675t;
    }

    private static String e(W w7, W w8) {
        StringBuilder sb = new StringBuilder(16);
        w7.c(sb);
        sb.append("..");
        w8.f(sb);
        return sb.toString();
    }

    public final A0 b(A0 a02) {
        int a8 = this.f29676o.a(a02.f29676o);
        int a9 = this.f29677s.a(a02.f29677s);
        if (a8 >= 0 && a9 <= 0) {
            return this;
        }
        if (a8 <= 0 && a9 >= 0) {
            return a02;
        }
        W w7 = a8 >= 0 ? this.f29676o : a02.f29676o;
        W w8 = a9 <= 0 ? this.f29677s : a02.f29677s;
        AbstractC5202v.d(w7.a(w8) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, a02);
        return new A0(w7, w8);
    }

    public final A0 c(A0 a02) {
        int a8 = this.f29676o.a(a02.f29676o);
        int a9 = this.f29677s.a(a02.f29677s);
        if (a8 <= 0 && a9 >= 0) {
            return this;
        }
        if (a8 >= 0 && a9 <= 0) {
            return a02;
        }
        W w7 = a8 <= 0 ? this.f29676o : a02.f29676o;
        if (a9 >= 0) {
            a02 = this;
        }
        return new A0(w7, a02.f29677s);
    }

    public final boolean d() {
        return this.f29676o.equals(this.f29677s);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A0) {
            A0 a02 = (A0) obj;
            if (this.f29676o.equals(a02.f29676o) && this.f29677s.equals(a02.f29677s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f29676o.hashCode() * 31) + this.f29677s.hashCode();
    }

    public final String toString() {
        return e(this.f29676o, this.f29677s);
    }
}
