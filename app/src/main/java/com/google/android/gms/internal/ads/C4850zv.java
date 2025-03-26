package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.zv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4850zv implements InterfaceC4251uO {

    /* renamed from: a, reason: collision with root package name */
    private final C3107jv f28725a;

    /* renamed from: b, reason: collision with root package name */
    private Context f28726b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3954rj f28727c;

    /* synthetic */ C4850zv(C3107jv c3107jv, AbstractC1676Pv abstractC1676Pv) {
        this.f28725a = c3107jv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251uO
    public final InterfaceC4360vO a() {
        AbstractC3332ly0.c(this.f28726b, Context.class);
        AbstractC3332ly0.c(this.f28727c, InterfaceC3954rj.class);
        return new C1144Av(this.f28725a, this.f28726b, this.f28727c, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251uO
    public final /* bridge */ /* synthetic */ InterfaceC4251uO b(Context context) {
        context.getClass();
        this.f28726b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251uO
    public final /* bridge */ /* synthetic */ InterfaceC4251uO c(InterfaceC3954rj interfaceC3954rj) {
        interfaceC3954rj.getClass();
        this.f28727c = interfaceC3954rj;
        return this;
    }
}
