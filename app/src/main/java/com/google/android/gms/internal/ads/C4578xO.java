package com.google.android.gms.internal.ads;

import android.content.Context;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.ads.xO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4578xO implements InterfaceC3053jO {

    /* renamed from: a, reason: collision with root package name */
    private final long f27855a;

    /* renamed from: b, reason: collision with root package name */
    private final AX f27856b;

    C4578xO(long j8, Context context, C3816qO c3816qO, AbstractC4630xu abstractC4630xu, String str) {
        this.f27855a = j8;
        InterfaceC4000s50 B7 = abstractC4630xu.B();
        B7.a(context);
        B7.b(new D2.c2());
        B7.v(str);
        AX zza = B7.d().zza();
        this.f27856b = zza;
        zza.J5(new BinderC4469wO(this, c3816qO));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053jO
    public final void a() {
        this.f27856b.S5(BinderC5853b.p2(null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053jO
    public final void b(D2.X1 x12) {
        this.f27856b.T3(x12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053jO
    public final void zza() {
        this.f27856b.B();
    }
}
