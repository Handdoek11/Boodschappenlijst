package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class C4 implements InterfaceC3562o4 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f14080a = new UQ();

    /* renamed from: b, reason: collision with root package name */
    private final UQ f14081b = new UQ();

    /* renamed from: c, reason: collision with root package name */
    private final B4 f14082c = new B4();

    /* renamed from: d, reason: collision with root package name */
    private Inflater f14083d;

    @Override // com.google.android.gms.internal.ads.InterfaceC3562o4
    public final void a(byte[] bArr, int i8, int i9, C3453n4 c3453n4, WE we) {
        this.f14080a.j(bArr, i9 + i8);
        this.f14080a.l(i8);
        UQ uq = this.f14080a;
        if (uq.r() > 0 && uq.v() == 120) {
            if (this.f14083d == null) {
                this.f14083d = new Inflater();
            }
            if (AbstractC2301cW.h(uq, this.f14081b, this.f14083d)) {
                UQ uq2 = this.f14081b;
                uq.j(uq2.n(), uq2.u());
            }
        }
        this.f14082c.e();
        ArrayList arrayList = new ArrayList();
        while (true) {
            UQ uq3 = this.f14080a;
            if (uq3.r() < 3) {
                we.a(new C2692g4(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            B4 b42 = this.f14082c;
            int u7 = uq3.u();
            int C7 = uq3.C();
            int G7 = uq3.G();
            int t7 = uq3.t() + G7;
            C3004iy c3004iy = null;
            if (t7 > u7) {
                uq3.l(u7);
            } else {
                if (C7 != 128) {
                    switch (C7) {
                        case 20:
                            B4.d(b42, uq3, G7);
                            break;
                        case C1445Je.zzm /* 21 */:
                            B4.b(b42, uq3, G7);
                            break;
                        case 22:
                            B4.c(b42, uq3, G7);
                            break;
                    }
                } else {
                    c3004iy = b42.a();
                    b42.e();
                }
                uq3.l(t7);
            }
            if (c3004iy != null) {
                arrayList.add(c3004iy);
            }
        }
    }
}
