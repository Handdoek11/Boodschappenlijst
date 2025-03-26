package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3457n6 {

    /* renamed from: a, reason: collision with root package name */
    private final List f24876a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0[] f24877b;

    public C3457n6(List list) {
        this.f24876a = list;
        this.f24877b = new Y0[list.size()];
    }

    public final void a(long j8, UQ uq) {
        if (uq.r() < 9) {
            return;
        }
        int w7 = uq.w();
        int w8 = uq.w();
        int C7 = uq.C();
        if (w7 == 434 && w8 == 1195456820 && C7 == 3) {
            AbstractC2358d0.b(j8, uq, this.f24877b);
        }
    }

    public final void b(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        for (int i8 = 0; i8 < this.f24877b.length; i8++) {
            c3021j6.c();
            Y0 R7 = interfaceC4207u0.R(c3021j6.a(), 3);
            D d8 = (D) this.f24876a.get(i8);
            String str = d8.f14334o;
            boolean z7 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z7 = false;
            }
            AbstractC3796qC.e(z7, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            C2723gJ0 c2723gJ0 = new C2723gJ0();
            c2723gJ0.m(c3021j6.b());
            c2723gJ0.B(str);
            c2723gJ0.D(d8.f14324e);
            c2723gJ0.q(d8.f14323d);
            c2723gJ0.p0(d8.f14316I);
            c2723gJ0.n(d8.f14337r);
            R7.c(c2723gJ0.H());
            this.f24877b[i8] = R7;
        }
    }
}
