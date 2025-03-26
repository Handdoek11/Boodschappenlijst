package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Hv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1396Hv implements InterfaceC3022j60 {

    /* renamed from: a, reason: collision with root package name */
    private final C3107jv f15811a;

    /* renamed from: b, reason: collision with root package name */
    private Context f15812b;

    /* renamed from: c, reason: collision with root package name */
    private String f15813c;

    /* synthetic */ C1396Hv(C3107jv c3107jv, AbstractC1676Pv abstractC1676Pv) {
        this.f15811a = c3107jv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3022j60
    public final InterfaceC3131k60 a() {
        AbstractC3332ly0.c(this.f15812b, Context.class);
        return new C1432Iv(this.f15811a, this.f15812b, this.f15813c, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3022j60
    public final /* bridge */ /* synthetic */ InterfaceC3022j60 b(Context context) {
        context.getClass();
        this.f15812b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3022j60
    public final /* synthetic */ InterfaceC3022j60 n(String str) {
        this.f15813c = str;
        return this;
    }
}
