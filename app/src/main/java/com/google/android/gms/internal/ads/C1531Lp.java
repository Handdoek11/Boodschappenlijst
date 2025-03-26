package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import G2.InterfaceC0611r0;
import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.internal.ads.Lp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1531Lp {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0611r0 f16889a;

    C1531Lp(InterfaceC5781e interfaceC5781e, InterfaceC0611r0 interfaceC0611r0, C1950Xp c1950Xp) {
        this.f16889a = interfaceC0611r0;
    }

    public final void a(int i8, long j8) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23655D0)).booleanValue()) {
            return;
        }
        if (j8 - this.f16889a.c() < 0) {
            AbstractC0608p0.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23663E0)).booleanValue()) {
            this.f16889a.k0(i8);
            this.f16889a.c0(j8);
        } else {
            this.f16889a.k0(-1);
            this.f16889a.c0(j8);
        }
    }
}
