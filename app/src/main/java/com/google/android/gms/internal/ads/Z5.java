package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class Z5 {

    /* renamed from: a, reason: collision with root package name */
    private final List f20406a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0[] f20407b;

    /* renamed from: c, reason: collision with root package name */
    private final C1442Jc0 f20408c = new C1442Jc0(new InterfaceC1404Ib0() { // from class: com.google.android.gms.internal.ads.Y5
        @Override // com.google.android.gms.internal.ads.InterfaceC1404Ib0
        public final void a(long j8, UQ uq) {
            this.f20208a.d(j8, uq);
        }
    });

    public Z5(List list) {
        this.f20406a = list;
        this.f20407b = new Y0[list.size()];
    }

    public final void a(long j8, UQ uq) {
        this.f20408c.b(j8, uq);
    }

    public final void b(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        for (int i8 = 0; i8 < this.f20407b.length; i8++) {
            c3021j6.c();
            Y0 R7 = interfaceC4207u0.R(c3021j6.a(), 3);
            D d8 = (D) this.f20406a.get(i8);
            String str = d8.f14334o;
            boolean z7 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z7 = false;
            }
            AbstractC3796qC.e(z7, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String str2 = d8.f14320a;
            if (str2 == null) {
                str2 = c3021j6.b();
            }
            C2723gJ0 c2723gJ0 = new C2723gJ0();
            c2723gJ0.m(str2);
            c2723gJ0.B(str);
            c2723gJ0.D(d8.f14324e);
            c2723gJ0.q(d8.f14323d);
            c2723gJ0.p0(d8.f14316I);
            c2723gJ0.n(d8.f14337r);
            R7.c(c2723gJ0.H());
            this.f20407b[i8] = R7;
        }
    }

    public final void c() {
        this.f20408c.c();
    }

    final /* synthetic */ void d(long j8, UQ uq) {
        AbstractC2358d0.a(j8, uq, this.f20407b);
    }

    public final void e(int i8) {
        this.f20408c.d(i8);
    }
}
