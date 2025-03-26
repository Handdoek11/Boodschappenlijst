package com.google.android.gms.internal.play_billing;

import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5216x2 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5211w2 f30027a;

    private C5216x2(AbstractC5211w2 abstractC5211w2) {
        byte[] bArr = R2.f29810b;
        this.f30027a = abstractC5211w2;
        abstractC5211w2.f30024a = this;
    }

    public static C5216x2 K(AbstractC5211w2 abstractC5211w2) {
        C5216x2 c5216x2 = abstractC5211w2.f30024a;
        return c5216x2 != null ? c5216x2 : new C5216x2(abstractC5211w2);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void A(int i8, List list, boolean z7) {
        if (list instanceof H2) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30027a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30027a.i(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).floatValue();
            i10 += 4;
        }
        this.f30027a.t(i10);
        while (i9 < list.size()) {
            this.f30027a.j(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void B(int i8, int i9) {
        this.f30027a.s(i8, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void C(int i8, long j8) {
        this.f30027a.k(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void D(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof T2)) {
            while (i9 < list.size()) {
                this.f30027a.q(i8, (String) list.get(i9));
                i9++;
            }
            return;
        }
        T2 t22 = (T2) list;
        while (i9 < list.size()) {
            Object a8 = t22.a();
            if (a8 instanceof String) {
                this.f30027a.q(i8, (String) a8);
            } else {
                this.f30027a.h(i8, (AbstractC5176q2) a8);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void E(int i8, long j8) {
        this.f30027a.u(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void F(int i8) {
        this.f30027a.r(i8, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void G(int i8) {
        this.f30027a.r(i8, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void H(int i8, Object obj, InterfaceC5188s3 interfaceC5188s3) {
        this.f30027a.p(i8, (InterfaceC5123h3) obj, interfaceC5188s3);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void I(int i8, Object obj, InterfaceC5188s3 interfaceC5188s3) {
        AbstractC5211w2 abstractC5211w2 = this.f30027a;
        abstractC5211w2.r(i8, 3);
        interfaceC5188s3.i((InterfaceC5123h3) obj, abstractC5211w2.f30024a);
        abstractC5211w2.r(i8, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void J(int i8, AbstractC5176q2 abstractC5176q2) {
        this.f30027a.h(i8, abstractC5176q2);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void a(int i8, List list, boolean z7) {
        if (list instanceof AbstractC5122h2) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30027a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30027a.g(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).booleanValue();
            i10++;
        }
        this.f30027a.t(i10);
        while (i9 < list.size()) {
            this.f30027a.f(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void b(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof N2)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30027a.i(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f30027a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).intValue();
                i10 += 4;
            }
            this.f30027a.t(i10);
            while (i9 < list.size()) {
                this.f30027a.j(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        N2 n22 = (N2) list;
        if (!z7) {
            while (i9 < n22.size()) {
                this.f30027a.i(i8, n22.c(i9));
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < n22.size(); i13++) {
            n22.c(i13);
            i12 += 4;
        }
        this.f30027a.t(i12);
        while (i9 < n22.size()) {
            this.f30027a.j(n22.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void c(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof N2)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30027a.m(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f30027a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC5211w2.a(((Integer) list.get(i11)).intValue());
            }
            this.f30027a.t(i10);
            while (i9 < list.size()) {
                this.f30027a.n(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        N2 n22 = (N2) list;
        if (!z7) {
            while (i9 < n22.size()) {
                this.f30027a.m(i8, n22.c(i9));
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < n22.size(); i13++) {
            i12 += AbstractC5211w2.a(n22.c(i13));
        }
        this.f30027a.t(i12);
        while (i9 < n22.size()) {
            this.f30027a.n(n22.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void d(int i8, int i9) {
        this.f30027a.m(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void e(int i8, List list, boolean z7) {
        if (list instanceof X2) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30027a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30027a.k(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).longValue();
            i10 += 8;
        }
        this.f30027a.t(i10);
        while (i9 < list.size()) {
            this.f30027a.l(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void f(int i8, List list, boolean z7) {
        if (list instanceof AbstractC5221y2) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30027a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30027a.k(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).doubleValue();
            i10 += 8;
        }
        this.f30027a.t(i10);
        while (i9 < list.size()) {
            this.f30027a.l(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void g(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f30027a.h(i8, (AbstractC5176q2) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void h(int i8, String str) {
        this.f30027a.q(i8, str);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void i(int i8, int i9) {
        this.f30027a.s(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void j(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof N2)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30027a.i(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f30027a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).intValue();
                i10 += 4;
            }
            this.f30027a.t(i10);
            while (i9 < list.size()) {
                this.f30027a.j(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        N2 n22 = (N2) list;
        if (!z7) {
            while (i9 < n22.size()) {
                this.f30027a.i(i8, n22.c(i9));
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < n22.size(); i13++) {
            n22.c(i13);
            i12 += 4;
        }
        this.f30027a.t(i12);
        while (i9 < n22.size()) {
            this.f30027a.j(n22.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void k(int i8, int i9) {
        this.f30027a.i(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void l(int i8, boolean z7) {
        this.f30027a.g(i8, z7);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void m(int i8, long j8) {
        this.f30027a.u(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void n(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof N2)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30027a.s(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f30027a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC5211w2.z(((Integer) list.get(i11)).intValue());
            }
            this.f30027a.t(i10);
            while (i9 < list.size()) {
                this.f30027a.t(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        N2 n22 = (N2) list;
        if (!z7) {
            while (i9 < n22.size()) {
                this.f30027a.s(i8, n22.c(i9));
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < n22.size(); i13++) {
            i12 += AbstractC5211w2.z(n22.c(i13));
        }
        this.f30027a.t(i12);
        while (i9 < n22.size()) {
            this.f30027a.t(n22.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void o(int i8, List list, boolean z7) {
        if (list instanceof X2) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30027a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30027a.k(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).longValue();
            i10 += 8;
        }
        this.f30027a.t(i10);
        while (i9 < list.size()) {
            this.f30027a.l(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void p(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof N2)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f30027a.m(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f30027a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC5211w2.a(((Integer) list.get(i11)).intValue());
            }
            this.f30027a.t(i10);
            while (i9 < list.size()) {
                this.f30027a.n(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        N2 n22 = (N2) list;
        if (!z7) {
            while (i9 < n22.size()) {
                this.f30027a.m(i8, n22.c(i9));
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < n22.size(); i13++) {
            i12 += AbstractC5211w2.a(n22.c(i13));
        }
        this.f30027a.t(i12);
        while (i9 < n22.size()) {
            this.f30027a.n(n22.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void q(int i8, long j8) {
        this.f30027a.k(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void r(int i8, int i9) {
        this.f30027a.m(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void s(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof N2)) {
            if (!z7) {
                while (i9 < list.size()) {
                    AbstractC5211w2 abstractC5211w2 = this.f30027a;
                    int intValue = ((Integer) list.get(i9)).intValue();
                    abstractC5211w2.s(i8, (intValue >> 31) ^ (intValue + intValue));
                    i9++;
                }
                return;
            }
            this.f30027a.r(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue2 = ((Integer) list.get(i11)).intValue();
                i10 += AbstractC5211w2.z((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.f30027a.t(i10);
            while (i9 < list.size()) {
                AbstractC5211w2 abstractC5211w22 = this.f30027a;
                int intValue3 = ((Integer) list.get(i9)).intValue();
                abstractC5211w22.t((intValue3 >> 31) ^ (intValue3 + intValue3));
                i9++;
            }
            return;
        }
        N2 n22 = (N2) list;
        if (!z7) {
            while (i9 < n22.size()) {
                AbstractC5211w2 abstractC5211w23 = this.f30027a;
                int c8 = n22.c(i9);
                abstractC5211w23.s(i8, (c8 >> 31) ^ (c8 + c8));
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < n22.size(); i13++) {
            int c9 = n22.c(i13);
            i12 += AbstractC5211w2.z((c9 >> 31) ^ (c9 + c9));
        }
        this.f30027a.t(i12);
        while (i9 < n22.size()) {
            AbstractC5211w2 abstractC5211w24 = this.f30027a;
            int c10 = n22.c(i9);
            abstractC5211w24.t((c10 >> 31) ^ (c10 + c10));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void t(int i8, double d8) {
        this.f30027a.k(i8, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void u(int i8, long j8) {
        this.f30027a.u(i8, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void v(int i8, List list, boolean z7) {
        if (list instanceof X2) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30027a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30027a.u(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += AbstractC5211w2.a(((Long) list.get(i11)).longValue());
        }
        this.f30027a.t(i10);
        while (i9 < list.size()) {
            this.f30027a.v(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void w(int i8, float f8) {
        this.f30027a.i(i8, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void x(int i8, List list, boolean z7) {
        if (list instanceof X2) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30027a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f30027a.u(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += AbstractC5211w2.a(((Long) list.get(i11)).longValue());
        }
        this.f30027a.t(i10);
        while (i9 < list.size()) {
            this.f30027a.v(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void y(int i8, int i9) {
        this.f30027a.i(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.I3
    public final void z(int i8, List list, boolean z7) {
        if (list instanceof X2) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f30027a.r(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                AbstractC5211w2 abstractC5211w2 = this.f30027a;
                long longValue = ((Long) list.get(i9)).longValue();
                abstractC5211w2.u(i8, (longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
            return;
        }
        this.f30027a.r(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long longValue2 = ((Long) list.get(i11)).longValue();
            i10 += AbstractC5211w2.a((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.f30027a.t(i10);
        while (i9 < list.size()) {
            AbstractC5211w2 abstractC5211w22 = this.f30027a;
            long longValue3 = ((Long) list.get(i9)).longValue();
            abstractC5211w22.v((longValue3 >> 63) ^ (longValue3 + longValue3));
            i9++;
        }
    }
}
