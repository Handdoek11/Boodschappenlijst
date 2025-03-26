package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4108t5 implements InterfaceC4217u5 {

    /* renamed from: a, reason: collision with root package name */
    private final List f26823a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0[] f26824b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26825c;

    /* renamed from: d, reason: collision with root package name */
    private int f26826d;

    /* renamed from: e, reason: collision with root package name */
    private int f26827e;

    /* renamed from: f, reason: collision with root package name */
    private long f26828f = -9223372036854775807L;

    public C4108t5(List list) {
        this.f26823a = list;
        this.f26824b = new Y0[list.size()];
    }

    private final boolean f(UQ uq, int i8) {
        if (uq.r() == 0) {
            return false;
        }
        if (uq.C() != i8) {
            this.f26825c = false;
        }
        this.f26826d--;
        return this.f26825c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
        if (this.f26825c) {
            AbstractC3796qC.f(this.f26828f != -9223372036854775807L);
            for (Y0 y02 : this.f26824b) {
                y02.b(this.f26828f, 1, this.f26827e, 0, null);
            }
            this.f26825c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f26825c = false;
        this.f26828f = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void c(UQ uq) {
        if (this.f26825c) {
            if (this.f26826d != 2 || f(uq, 32)) {
                if (this.f26826d != 1 || f(uq, 0)) {
                    int t7 = uq.t();
                    int r8 = uq.r();
                    for (Y0 y02 : this.f26824b) {
                        uq.l(t7);
                        y02.a(uq, r8);
                    }
                    this.f26827e += r8;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        for (int i8 = 0; i8 < this.f26824b.length; i8++) {
            C2696g6 c2696g6 = (C2696g6) this.f26823a.get(i8);
            c3021j6.c();
            Y0 R7 = interfaceC4207u0.R(c3021j6.a(), 3);
            C2723gJ0 c2723gJ0 = new C2723gJ0();
            c2723gJ0.m(c3021j6.b());
            c2723gJ0.B("application/dvbsubs");
            c2723gJ0.n(Collections.singletonList(c2696g6.f22232b));
            c2723gJ0.q(c2696g6.f22231a);
            R7.c(c2723gJ0.H());
            this.f26824b[i8] = R7;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        if ((i8 & 4) == 0) {
            return;
        }
        this.f26825c = true;
        this.f26828f = j8;
        this.f26827e = 0;
        this.f26826d = 2;
    }
}
