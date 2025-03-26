package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.g50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2695g50 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f22228a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f22229b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f22230c;

    public C2695g50(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f22228a = interfaceC4203ty0;
        this.f22229b = interfaceC4203ty02;
        this.f22230c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2477e50 zzb() {
        Context context = (Context) this.f22228a.zzb();
        C4222u70 c4222u70 = (C4222u70) this.f22229b.zzb();
        N70 n70 = (N70) this.f22230c.zzb();
        C4404vq g8 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23899g6)).booleanValue() ? C2.v.s().j().g() : C2.v.s().j().e();
        boolean z7 = false;
        if (g8 != null && g8.h()) {
            z7 = true;
        }
        if (((Integer) D2.A.c().a(AbstractC3184kf.f24040w6)).intValue() > 0) {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23890f6)).booleanValue() || z7) {
                M70 a8 = n70.a(D70.AppOpen, context, c4222u70, new H40(new E40()));
                T40 t40 = new T40(new S40());
                InterfaceC4658y70 interfaceC4658y70 = a8.f17233a;
                InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16644a;
                return new J40(t40, new P40(interfaceC4658y70, interfaceExecutorServiceC3522nk0), a8.f17234b, a8.f17233a.zza().f15286y, interfaceExecutorServiceC3522nk0);
            }
        }
        return new S40();
    }
}
