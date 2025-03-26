package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4892d4 implements S5 {

    /* renamed from: a, reason: collision with root package name */
    private final zzjc f29270a;

    private C4892d4(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) AbstractC5026t4.f(zzjcVar, "output");
        this.f29270a = zzjcVar2;
        zzjcVar2.f29671a = this;
    }

    public static C4892d4 O(zzjc zzjcVar) {
        C4892d4 c4892d4 = zzjcVar.f29671a;
        return c4892d4 != null ? c4892d4 : new C4892d4(zzjcVar);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void A(int i8) {
        this.f29270a.V(i8, 3);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void B(int i8, float f8) {
        this.f29270a.J(i8, f8);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void C(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof G4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.m(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.S(((Long) list.get(i11)).longValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.s(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z7) {
            while (i9 < g42.size()) {
                this.f29270a.m(i8, g42.A(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            i12 += zzjc.S(g42.A(i13));
        }
        this.f29270a.U(i12);
        while (i9 < g42.size()) {
            this.f29270a.s(g42.A(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void D(int i8, int i9) {
        this.f29270a.b0(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void E(int i8, Object obj, InterfaceC4964l5 interfaceC4964l5) {
        zzjc zzjcVar = this.f29270a;
        zzjcVar.V(i8, 3);
        interfaceC4964l5.d((W4) obj, zzjcVar.f29671a);
        zzjcVar.V(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void F(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5034u4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.l(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.c0(((Integer) list.get(i11)).intValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.k(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C5034u4 c5034u4 = (C5034u4) list;
        if (!z7) {
            while (i9 < c5034u4.size()) {
                this.f29270a.l(i8, c5034u4.c(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5034u4.size(); i13++) {
            i12 += zzjc.c0(c5034u4.c(i13));
        }
        this.f29270a.U(i12);
        while (i9 < c5034u4.size()) {
            this.f29270a.k(c5034u4.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void G(int i8, Object obj, InterfaceC4964l5 interfaceC4964l5) {
        this.f29270a.p(i8, (W4) obj, interfaceC4964l5);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void H(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5034u4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.b0(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.v0(((Integer) list.get(i11)).intValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.U(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C5034u4 c5034u4 = (C5034u4) list;
        if (!z7) {
            while (i9 < c5034u4.size()) {
                this.f29270a.b0(i8, c5034u4.c(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5034u4.size(); i13++) {
            i12 += zzjc.v0(c5034u4.c(i13));
        }
        this.f29270a.U(i12);
        while (i9 < c5034u4.size()) {
            this.f29270a.U(c5034u4.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void I(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof D4)) {
            while (i9 < list.size()) {
                this.f29270a.q(i8, (String) list.get(i9));
                i9++;
            }
            return;
        }
        D4 d42 = (D4) list;
        while (i9 < list.size()) {
            Object m8 = d42.m(i9);
            if (m8 instanceof String) {
                this.f29270a.q(i8, (String) m8);
            } else {
                this.f29270a.n(i8, (K3) m8);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void J(int i8, int i9) {
        this.f29270a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void K(int i8, long j8) {
        this.f29270a.q0(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void L(int i8, List list, boolean z7) {
        if (list instanceof AbstractC5003q4) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f29270a.V(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f29270a.J(i8, ((Float) list.get(i9)).floatValue());
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzjc.d(((Float) list.get(i11)).floatValue());
        }
        this.f29270a.U(i10);
        while (i9 < list.size()) {
            this.f29270a.G(((Float) list.get(i9)).floatValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void M(int i8, int i9) {
        this.f29270a.y0(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void N(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f29270a.n(i8, (K3) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void a(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5034u4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.K(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.X(((Integer) list.get(i11)).intValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.H(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C5034u4 c5034u4 = (C5034u4) list;
        if (!z7) {
            while (i9 < c5034u4.size()) {
                this.f29270a.K(i8, c5034u4.c(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5034u4.size(); i13++) {
            i12 += zzjc.X(c5034u4.c(i13));
        }
        this.f29270a.U(i12);
        while (i9 < c5034u4.size()) {
            this.f29270a.H(c5034u4.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void b(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof G4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.q0(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.j0(((Long) list.get(i11)).longValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.r0(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z7) {
            while (i9 < g42.size()) {
                this.f29270a.q0(i8, g42.A(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            i12 += zzjc.j0(g42.A(i13));
        }
        this.f29270a.U(i12);
        while (i9 < g42.size()) {
            this.f29270a.r0(g42.A(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void c(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof G4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.m(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.f0(((Long) list.get(i11)).longValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.s(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z7) {
            while (i9 < g42.size()) {
                this.f29270a.m(i8, g42.A(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            i12 += zzjc.f0(g42.A(i13));
        }
        this.f29270a.U(i12);
        while (i9 < g42.size()) {
            this.f29270a.s(g42.A(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void d(int i8, long j8) {
        this.f29270a.m(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void e(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof G4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.L(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.n0(((Long) list.get(i11)).longValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.N(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z7) {
            while (i9 < g42.size()) {
                this.f29270a.L(i8, g42.A(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            i12 += zzjc.n0(g42.A(i13));
        }
        this.f29270a.U(i12);
        while (i9 < g42.size()) {
            this.f29270a.N(g42.A(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void f(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5034u4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.K(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.g0(((Integer) list.get(i11)).intValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.H(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C5034u4 c5034u4 = (C5034u4) list;
        if (!z7) {
            while (i9 < c5034u4.size()) {
                this.f29270a.K(i8, c5034u4.c(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5034u4.size(); i13++) {
            i12 += zzjc.g0(c5034u4.c(i13));
        }
        this.f29270a.U(i12);
        while (i9 < c5034u4.size()) {
            this.f29270a.H(c5034u4.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void g(int i8, String str) {
        this.f29270a.q(i8, str);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void h(int i8, long j8) {
        this.f29270a.L(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void i(int i8, boolean z7) {
        this.f29270a.r(i8, z7);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void j(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5034u4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.l(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.k0(((Integer) list.get(i11)).intValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.k(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C5034u4 c5034u4 = (C5034u4) list;
        if (!z7) {
            while (i9 < c5034u4.size()) {
                this.f29270a.l(i8, c5034u4.c(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5034u4.size(); i13++) {
            i12 += zzjc.k0(c5034u4.c(i13));
        }
        this.f29270a.U(i12);
        while (i9 < c5034u4.size()) {
            this.f29270a.k(c5034u4.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void k(int i8, List list, InterfaceC4964l5 interfaceC4964l5) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            G(i8, list.get(i9), interfaceC4964l5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void l(int i8, long j8) {
        this.f29270a.L(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void m(int i8) {
        this.f29270a.V(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void n(int i8, M4 m42, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f29270a.V(i8, 2);
            this.f29270a.U(N4.a(m42, entry.getKey(), entry.getValue()));
            N4.b(this.f29270a, m42, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void o(int i8, int i9) {
        this.f29270a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void p(int i8, List list, boolean z7) {
        if (list instanceof I3) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f29270a.V(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f29270a.r(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzjc.h(((Boolean) list.get(i11)).booleanValue());
        }
        this.f29270a.U(i10);
        while (i9 < list.size()) {
            this.f29270a.O(((Boolean) list.get(i9)).booleanValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void q(int i8, K3 k32) {
        this.f29270a.n(i8, k32);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void r(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof G4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.L(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.a0(((Long) list.get(i11)).longValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.N(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z7) {
            while (i9 < g42.size()) {
                this.f29270a.L(i8, g42.A(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            i12 += zzjc.a0(g42.A(i13));
        }
        this.f29270a.U(i12);
        while (i9 < g42.size()) {
            this.f29270a.N(g42.A(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void s(int i8, List list, InterfaceC4964l5 interfaceC4964l5) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            E(i8, list.get(i9), interfaceC4964l5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void t(int i8, int i9) {
        this.f29270a.K(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void u(int i8, long j8) {
        this.f29270a.m(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void v(int i8, Object obj) {
        if (obj instanceof K3) {
            this.f29270a.M(i8, (K3) obj);
        } else {
            this.f29270a.o(i8, (W4) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void w(int i8, List list, boolean z7) {
        if (list instanceof AbstractC4883c4) {
            androidx.appcompat.app.E.a(list);
            if (!z7) {
                throw null;
            }
            this.f29270a.V(i8, 2);
            throw null;
        }
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f29270a.I(i8, ((Double) list.get(i9)).doubleValue());
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzjc.c(((Double) list.get(i11)).doubleValue());
        }
        this.f29270a.U(i10);
        while (i9 < list.size()) {
            this.f29270a.F(((Double) list.get(i9)).doubleValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void x(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!(list instanceof C5034u4)) {
            if (!z7) {
                while (i9 < list.size()) {
                    this.f29270a.y0(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f29270a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += zzjc.o0(((Integer) list.get(i11)).intValue());
            }
            this.f29270a.U(i10);
            while (i9 < list.size()) {
                this.f29270a.x0(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C5034u4 c5034u4 = (C5034u4) list;
        if (!z7) {
            while (i9 < c5034u4.size()) {
                this.f29270a.y0(i8, c5034u4.c(i9));
                i9++;
            }
            return;
        }
        this.f29270a.V(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c5034u4.size(); i13++) {
            i12 += zzjc.o0(c5034u4.c(i13));
        }
        this.f29270a.U(i12);
        while (i9 < c5034u4.size()) {
            this.f29270a.x0(c5034u4.c(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void y(int i8, int i9) {
        this.f29270a.K(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final void z(int i8, double d8) {
        this.f29270a.I(i8, d8);
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final int zza() {
        return 1;
    }
}
