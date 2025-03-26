package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class Vk0 implements InterfaceC2646fh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19647a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2646fh0 f19648b;

    public Vk0(Context context) {
        Xl0 xl0 = new Xl0();
        this.f19647a = context.getApplicationContext();
        this.f19648b = xl0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2646fh0
    public final /* bridge */ /* synthetic */ InterfaceC1344Gh0 zza() {
        return new C4504wl0(this.f19647a, this.f19648b.zza());
    }
}
