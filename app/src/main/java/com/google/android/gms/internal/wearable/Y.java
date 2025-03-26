package com.google.android.gms.internal.wearable;

import java.util.List;

/* loaded from: classes2.dex */
final class Y implements k1 {

    /* renamed from: a, reason: collision with root package name */
    private final X f30107a;

    private Y(X x7) {
        byte[] bArr = AbstractC5269s0.f30213b;
        this.f30107a = x7;
        x7.f30106a = this;
    }

    public static Y K(X x7) {
        Y y7 = x7.f30106a;
        return y7 != null ? y7 : new Y(x7);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void A(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5250i0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30107a.i(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                    i9++;
                }
                return;
            }
            this.f30107a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Float) list.get(i11)).floatValue();
                i10 += 4;
            }
            this.f30107a.t(i10);
            while (i9 < list.size()) {
                this.f30107a.j(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        C5250i0 c5250i0 = (C5250i0) list;
        if (!z7) {
            while (i9 < c5250i0.size()) {
                this.f30107a.i(i8, Float.floatToRawIntBits(c5250i0.c(i9)));
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5250i0.size(); i13++) {
            c5250i0.c(i13);
            i12 += 4;
        }
        this.f30107a.t(i12);
        while (i9 < c5250i0.size()) {
            this.f30107a.j(Float.floatToRawIntBits(c5250i0.c(i9)));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void B(int i8, int i9) {
        this.f30107a.s(i8, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void C(int i8, long j8) {
        this.f30107a.k(i8, j8);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void D(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof InterfaceC5275v0)) {
            while (i9 < list.size()) {
                this.f30107a.q(i8, (String) list.get(i9));
                i9++;
            }
            return;
        }
        InterfaceC5275v0 interfaceC5275v0 = (InterfaceC5275v0) list;
        while (i9 < list.size()) {
            Object a8 = interfaceC5275v0.a();
            if (a8 instanceof String) {
                this.f30107a.q(i8, (String) a8);
            } else {
                this.f30107a.h(i8, (Q) a8);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void E(int i8, long j8) {
        this.f30107a.u(i8, j8);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void F(int i8) {
        this.f30107a.r(i8, 3);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void G(int i8) {
        this.f30107a.r(i8, 4);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void H(int i8, Object obj, U0 u02) {
        X x7 = this.f30107a;
        x7.r(i8, 3);
        u02.h((I0) obj, x7.f30106a);
        x7.r(i8, 4);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void I(int i8, Q q8) {
        this.f30107a.h(i8, q8);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void J(int i8, Object obj, U0 u02) {
        this.f30107a.p(i8, (I0) obj, u02);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void a(int i8, List list, boolean z7) {
        if (list instanceof H) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30107a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30107a.g(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).booleanValue();
            i10++;
        }
        this.f30107a.t(i10);
        while (i9 < list.size()) {
            this.f30107a.f(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void b(int i8, List list, boolean z7) {
        if (list instanceof AbstractC5260n0) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30107a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30107a.i(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).intValue();
            i10 += 4;
        }
        this.f30107a.t(i10);
        while (i9 < list.size()) {
            this.f30107a.j(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void c(int i8, List list, boolean z7) {
        if (list instanceof AbstractC5260n0) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30107a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30107a.m(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += X.a(((Integer) list.get(i11)).intValue());
        }
        this.f30107a.t(i10);
        while (i9 < list.size()) {
            this.f30107a.n(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void d(int i8, int i9) {
        this.f30107a.m(i8, i9);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void e(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5281y0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30107a.k(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f30107a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).longValue();
                i10 += 8;
            }
            this.f30107a.t(i10);
            while (i9 < list.size()) {
                this.f30107a.l(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        C5281y0 c5281y0 = (C5281y0) list;
        if (!z7) {
            while (i9 < c5281y0.size()) {
                this.f30107a.k(i8, c5281y0.c(i9));
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5281y0.size(); i13++) {
            c5281y0.c(i13);
            i12 += 8;
        }
        this.f30107a.t(i12);
        while (i9 < c5281y0.size()) {
            this.f30107a.l(c5281y0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void f(int i8, List list, boolean z7) {
        if (list instanceof Z) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30107a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30107a.k(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).doubleValue();
            i10 += 8;
        }
        this.f30107a.t(i10);
        while (i9 < list.size()) {
            this.f30107a.l(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void g(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f30107a.h(i8, (Q) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void h(int i8, String str) {
        this.f30107a.q(i8, str);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void i(int i8, int i9) {
        this.f30107a.s(i8, i9);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void j(int i8, List list, boolean z7) {
        if (list instanceof AbstractC5260n0) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30107a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30107a.i(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).intValue();
            i10 += 4;
        }
        this.f30107a.t(i10);
        while (i9 < list.size()) {
            this.f30107a.j(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void k(int i8, int i9) {
        this.f30107a.i(i8, i9);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void l(int i8, boolean z7) {
        this.f30107a.g(i8, z7);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void m(int i8, long j8) {
        this.f30107a.u(i8, j8);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void n(int i8, List list, boolean z7) {
        if (list instanceof AbstractC5260n0) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30107a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30107a.s(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += X.z(((Integer) list.get(i11)).intValue());
        }
        this.f30107a.t(i10);
        while (i9 < list.size()) {
            this.f30107a.t(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void o(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5281y0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30107a.k(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f30107a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).longValue();
                i10 += 8;
            }
            this.f30107a.t(i10);
            while (i9 < list.size()) {
                this.f30107a.l(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        C5281y0 c5281y0 = (C5281y0) list;
        if (!z7) {
            while (i9 < c5281y0.size()) {
                this.f30107a.k(i8, c5281y0.c(i9));
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5281y0.size(); i13++) {
            c5281y0.c(i13);
            i12 += 8;
        }
        this.f30107a.t(i12);
        while (i9 < c5281y0.size()) {
            this.f30107a.l(c5281y0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void p(int i8, List list, boolean z7) {
        if (list instanceof AbstractC5260n0) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30107a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30107a.m(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += X.a(((Integer) list.get(i11)).intValue());
        }
        this.f30107a.t(i10);
        while (i9 < list.size()) {
            this.f30107a.n(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void q(int i8, long j8) {
        this.f30107a.k(i8, j8);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void r(int i8, int i9) {
        this.f30107a.m(i8, i9);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void s(int i8, List list, boolean z7) {
        if (list instanceof AbstractC5260n0) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30107a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                X x7 = this.f30107a;
                int intValue = ((Integer) list.get(i9)).intValue();
                x7.s(i8, (intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            i10 += X.z((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.f30107a.t(i10);
        while (i9 < list.size()) {
            X x8 = this.f30107a;
            int intValue3 = ((Integer) list.get(i9)).intValue();
            x8.t((intValue3 >> 31) ^ (intValue3 + intValue3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void t(int i8, double d8) {
        this.f30107a.k(i8, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void u(int i8, long j8) {
        this.f30107a.u(i8, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void v(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5281y0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30107a.u(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f30107a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += X.a(((Long) list.get(i11)).longValue());
            }
            this.f30107a.t(i10);
            while (i9 < list.size()) {
                this.f30107a.v(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        C5281y0 c5281y0 = (C5281y0) list;
        if (!z7) {
            while (i9 < c5281y0.size()) {
                this.f30107a.u(i8, c5281y0.c(i9));
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5281y0.size(); i13++) {
            i12 += X.a(c5281y0.c(i13));
        }
        this.f30107a.t(i12);
        while (i9 < c5281y0.size()) {
            this.f30107a.v(c5281y0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void w(int i8, float f8) {
        this.f30107a.i(i8, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void x(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5281y0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30107a.u(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f30107a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += X.a(((Long) list.get(i11)).longValue());
            }
            this.f30107a.t(i10);
            while (i9 < list.size()) {
                this.f30107a.v(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        C5281y0 c5281y0 = (C5281y0) list;
        if (!z7) {
            while (i9 < c5281y0.size()) {
                this.f30107a.u(i8, c5281y0.c(i9));
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5281y0.size(); i13++) {
            i12 += X.a(c5281y0.c(i13));
        }
        this.f30107a.t(i12);
        while (i9 < c5281y0.size()) {
            this.f30107a.v(c5281y0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void y(int i8, int i9) {
        this.f30107a.i(i8, i9);
    }

    @Override // com.google.android.gms.internal.wearable.k1
    public final void z(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5281y0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    X x7 = this.f30107a;
                    long longValue = ((Long) list.get(i9)).longValue();
                    x7.u(i8, (longValue >> 63) ^ (longValue + longValue));
                    i9++;
                }
                return;
            }
            this.f30107a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long longValue2 = ((Long) list.get(i11)).longValue();
                i10 += X.a((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.f30107a.t(i10);
            while (i9 < list.size()) {
                X x8 = this.f30107a;
                long longValue3 = ((Long) list.get(i9)).longValue();
                x8.v((longValue3 >> 63) ^ (longValue3 + longValue3));
                i9++;
            }
            return;
        }
        C5281y0 c5281y0 = (C5281y0) list;
        if (!z7) {
            while (i9 < c5281y0.size()) {
                X x9 = this.f30107a;
                long c8 = c5281y0.c(i9);
                x9.u(i8, (c8 >> 63) ^ (c8 + c8));
                i9++;
            }
            return;
        }
        this.f30107a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5281y0.size(); i13++) {
            long c9 = c5281y0.c(i13);
            i12 += X.a((c9 >> 63) ^ (c9 + c9));
        }
        this.f30107a.t(i12);
        while (i9 < c5281y0.size()) {
            X x10 = this.f30107a;
            long c10 = c5281y0.c(i9);
            x10.v((c10 >> 63) ^ (c10 + c10));
            i9++;
        }
    }
}
