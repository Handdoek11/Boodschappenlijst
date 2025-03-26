package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4849zu0 implements InterfaceC2242bw0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4740yu0 f28724a;

    private C4849zu0(AbstractC4740yu0 abstractC4740yu0) {
        AbstractC2131av0.c(abstractC4740yu0, "output");
        this.f28724a = abstractC4740yu0;
        abstractC4740yu0.f28228a = this;
    }

    public static C4849zu0 K(AbstractC4740yu0 abstractC4740yu0) {
        C4849zu0 c4849zu0 = abstractC4740yu0.f28228a;
        return c4849zu0 != null ? c4849zu0 : new C4849zu0(abstractC4740yu0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void A(int i8, List list, boolean z7) {
        if (list instanceof Ju0) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f28724a.w(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f28724a.o(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).floatValue();
            i10 += 4;
        }
        this.f28724a.y(i10);
        while (i9 < list.size()) {
            this.f28724a.p(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void B(int i8, int i9) {
        this.f28724a.x(i8, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void C(int i8, long j8) {
        this.f28724a.q(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void D(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof InterfaceC2456dv0)) {
            while (i9 < list.size()) {
                this.f28724a.v(i8, (String) list.get(i9));
                i9++;
            }
            return;
        }
        InterfaceC2456dv0 interfaceC2456dv0 = (InterfaceC2456dv0) list;
        while (i9 < list.size()) {
            Object a8 = interfaceC2456dv0.a();
            if (a8 instanceof String) {
                this.f28724a.v(i8, (String) a8);
            } else {
                this.f28724a.m(i8, (AbstractC3542nu0) a8);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void E(int i8, long j8) {
        this.f28724a.z(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void F(int i8) {
        this.f28724a.w(i8, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void G(int i8) {
        this.f28724a.w(i8, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void H(int i8, Object obj, Iv0 iv0) {
        this.f28724a.u(i8, (InterfaceC3871qv0) obj, iv0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void I(int i8, AbstractC3542nu0 abstractC3542nu0) {
        this.f28724a.m(i8, abstractC3542nu0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void J(int i8, Object obj, Iv0 iv0) {
        AbstractC4740yu0 abstractC4740yu0 = this.f28724a;
        abstractC4740yu0.w(i8, 3);
        iv0.g((InterfaceC3871qv0) obj, abstractC4740yu0.f28228a);
        abstractC4740yu0.w(i8, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void a(int i8, List list, boolean z7) {
        if (list instanceof AbstractC2346cu0) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f28724a.w(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f28724a.l(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).booleanValue();
            i10++;
        }
        this.f28724a.y(i10);
        while (i9 < list.size()) {
            this.f28724a.k(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void b(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof Ru0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f28724a.o(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).intValue();
                i10 += 4;
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                this.f28724a.p(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        Ru0 ru0 = (Ru0) list;
        if (!z7) {
            while (i9 < ru0.size()) {
                this.f28724a.o(i8, ru0.c(i9));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < ru0.size(); i13++) {
            ru0.c(i13);
            i12 += 4;
        }
        this.f28724a.y(i12);
        while (i9 < ru0.size()) {
            this.f28724a.p(ru0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void c(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof Ru0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f28724a.s(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC4740yu0.f(((Integer) list.get(i11)).intValue());
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                this.f28724a.t(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        Ru0 ru0 = (Ru0) list;
        if (!z7) {
            while (i9 < ru0.size()) {
                this.f28724a.s(i8, ru0.c(i9));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < ru0.size(); i13++) {
            i12 += AbstractC4740yu0.f(ru0.c(i13));
        }
        this.f28724a.y(i12);
        while (i9 < ru0.size()) {
            this.f28724a.t(ru0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void d(int i8, int i9) {
        this.f28724a.s(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void e(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C2783gv0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f28724a.q(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).longValue();
                i10 += 8;
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                this.f28724a.r(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        C2783gv0 c2783gv0 = (C2783gv0) list;
        if (!z7) {
            while (i9 < c2783gv0.size()) {
                this.f28724a.q(i8, c2783gv0.c(i9));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c2783gv0.size(); i13++) {
            c2783gv0.c(i13);
            i12 += 8;
        }
        this.f28724a.y(i12);
        while (i9 < c2783gv0.size()) {
            this.f28724a.r(c2783gv0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void f(int i8, List list, boolean z7) {
        if (list instanceof Au0) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f28724a.w(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f28724a.q(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).doubleValue();
            i10 += 8;
        }
        this.f28724a.y(i10);
        while (i9 < list.size()) {
            this.f28724a.r(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void g(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f28724a.m(i8, (AbstractC3542nu0) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void h(int i8, String str) {
        this.f28724a.v(i8, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void i(int i8, int i9) {
        this.f28724a.x(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void j(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof Ru0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f28724a.o(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).intValue();
                i10 += 4;
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                this.f28724a.p(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        Ru0 ru0 = (Ru0) list;
        if (!z7) {
            while (i9 < ru0.size()) {
                this.f28724a.o(i8, ru0.c(i9));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < ru0.size(); i13++) {
            ru0.c(i13);
            i12 += 4;
        }
        this.f28724a.y(i12);
        while (i9 < ru0.size()) {
            this.f28724a.p(ru0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void k(int i8, int i9) {
        this.f28724a.o(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void l(int i8, boolean z7) {
        this.f28724a.l(i8, z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void m(int i8, long j8) {
        this.f28724a.z(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void n(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof Ru0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f28724a.x(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC4740yu0.e(((Integer) list.get(i11)).intValue());
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                this.f28724a.y(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        Ru0 ru0 = (Ru0) list;
        if (!z7) {
            while (i9 < ru0.size()) {
                this.f28724a.x(i8, ru0.c(i9));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < ru0.size(); i13++) {
            i12 += AbstractC4740yu0.e(ru0.c(i13));
        }
        this.f28724a.y(i12);
        while (i9 < ru0.size()) {
            this.f28724a.y(ru0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void o(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C2783gv0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f28724a.q(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).longValue();
                i10 += 8;
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                this.f28724a.r(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        C2783gv0 c2783gv0 = (C2783gv0) list;
        if (!z7) {
            while (i9 < c2783gv0.size()) {
                this.f28724a.q(i8, c2783gv0.c(i9));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c2783gv0.size(); i13++) {
            c2783gv0.c(i13);
            i12 += 8;
        }
        this.f28724a.y(i12);
        while (i9 < c2783gv0.size()) {
            this.f28724a.r(c2783gv0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void p(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof Ru0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f28724a.s(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC4740yu0.f(((Integer) list.get(i11)).intValue());
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                this.f28724a.t(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        Ru0 ru0 = (Ru0) list;
        if (!z7) {
            while (i9 < ru0.size()) {
                this.f28724a.s(i8, ru0.c(i9));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < ru0.size(); i13++) {
            i12 += AbstractC4740yu0.f(ru0.c(i13));
        }
        this.f28724a.y(i12);
        while (i9 < ru0.size()) {
            this.f28724a.t(ru0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void q(int i8, long j8) {
        this.f28724a.q(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void r(int i8, int i9) {
        this.f28724a.s(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void s(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof Ru0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    AbstractC4740yu0 abstractC4740yu0 = this.f28724a;
                    int intValue = ((Integer) list.get(i9)).intValue();
                    abstractC4740yu0.x(i8, (intValue >> 31) ^ (intValue + intValue));
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue2 = ((Integer) list.get(i11)).intValue();
                i10 += AbstractC4740yu0.e((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                AbstractC4740yu0 abstractC4740yu02 = this.f28724a;
                int intValue3 = ((Integer) list.get(i9)).intValue();
                abstractC4740yu02.y((intValue3 >> 31) ^ (intValue3 + intValue3));
                i9++;
            }
            return;
        }
        Ru0 ru0 = (Ru0) list;
        if (!z7) {
            while (i9 < ru0.size()) {
                AbstractC4740yu0 abstractC4740yu03 = this.f28724a;
                int c8 = ru0.c(i9);
                abstractC4740yu03.x(i8, (c8 >> 31) ^ (c8 + c8));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < ru0.size(); i13++) {
            int c9 = ru0.c(i13);
            i12 += AbstractC4740yu0.e((c9 >> 31) ^ (c9 + c9));
        }
        this.f28724a.y(i12);
        while (i9 < ru0.size()) {
            AbstractC4740yu0 abstractC4740yu04 = this.f28724a;
            int c10 = ru0.c(i9);
            abstractC4740yu04.y((c10 >> 31) ^ (c10 + c10));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void t(int i8, double d8) {
        this.f28724a.q(i8, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void u(int i8, long j8) {
        this.f28724a.z(i8, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void v(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C2783gv0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f28724a.z(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC4740yu0.f(((Long) list.get(i11)).longValue());
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                this.f28724a.A(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        C2783gv0 c2783gv0 = (C2783gv0) list;
        if (!z7) {
            while (i9 < c2783gv0.size()) {
                this.f28724a.z(i8, c2783gv0.c(i9));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c2783gv0.size(); i13++) {
            i12 += AbstractC4740yu0.f(c2783gv0.c(i13));
        }
        this.f28724a.y(i12);
        while (i9 < c2783gv0.size()) {
            this.f28724a.A(c2783gv0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void w(int i8, float f8) {
        this.f28724a.o(i8, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void x(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C2783gv0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f28724a.z(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC4740yu0.f(((Long) list.get(i11)).longValue());
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                this.f28724a.A(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        C2783gv0 c2783gv0 = (C2783gv0) list;
        if (!z7) {
            while (i9 < c2783gv0.size()) {
                this.f28724a.z(i8, c2783gv0.c(i9));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c2783gv0.size(); i13++) {
            i12 += AbstractC4740yu0.f(c2783gv0.c(i13));
        }
        this.f28724a.y(i12);
        while (i9 < c2783gv0.size()) {
            this.f28724a.A(c2783gv0.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void y(int i8, int i9) {
        this.f28724a.o(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2242bw0
    public final void z(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C2783gv0)) {
            if (!z7) {
                while (i9 < list.size()) {
                    AbstractC4740yu0 abstractC4740yu0 = this.f28724a;
                    long longValue = ((Long) list.get(i9)).longValue();
                    abstractC4740yu0.z(i8, (longValue >> 63) ^ (longValue + longValue));
                    i9++;
                }
                return;
            }
            this.f28724a.w(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long longValue2 = ((Long) list.get(i11)).longValue();
                i10 += AbstractC4740yu0.f((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.f28724a.y(i10);
            while (i9 < list.size()) {
                AbstractC4740yu0 abstractC4740yu02 = this.f28724a;
                long longValue3 = ((Long) list.get(i9)).longValue();
                abstractC4740yu02.A((longValue3 >> 63) ^ (longValue3 + longValue3));
                i9++;
            }
            return;
        }
        C2783gv0 c2783gv0 = (C2783gv0) list;
        if (!z7) {
            while (i9 < c2783gv0.size()) {
                AbstractC4740yu0 abstractC4740yu03 = this.f28724a;
                long c8 = c2783gv0.c(i9);
                abstractC4740yu03.z(i8, (c8 >> 63) ^ (c8 + c8));
                i9++;
            }
            return;
        }
        this.f28724a.w(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c2783gv0.size(); i13++) {
            long c9 = c2783gv0.c(i13);
            i12 += AbstractC4740yu0.f((c9 >> 63) ^ (c9 + c9));
        }
        this.f28724a.y(i12);
        while (i9 < c2783gv0.size()) {
            AbstractC4740yu0 abstractC4740yu04 = this.f28724a;
            long c10 = c2783gv0.c(i9);
            abstractC4740yu04.A((c10 >> 63) ^ (c10 + c10));
            i9++;
        }
    }
}
