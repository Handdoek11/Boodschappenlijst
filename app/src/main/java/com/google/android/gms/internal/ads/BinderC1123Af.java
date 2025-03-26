package com.google.android.gms.internal.ads;

import android.view.View;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1123Af extends AbstractBinderC1159Bf {

    /* renamed from: o, reason: collision with root package name */
    private final C2.g f13612o;

    /* renamed from: s, reason: collision with root package name */
    private final String f13613s;

    /* renamed from: t, reason: collision with root package name */
    private final String f13614t;

    public BinderC1123Af(C2.g gVar, String str, String str2) {
        this.f13612o = gVar;
        this.f13613s = str;
        this.f13614t = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1195Cf
    public final String a() {
        return this.f13614t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1195Cf
    public final void b() {
        this.f13612o.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1195Cf
    public final void c() {
        this.f13612o.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1195Cf
    public final void l0(InterfaceC5852a interfaceC5852a) {
        if (interfaceC5852a == null) {
            return;
        }
        this.f13612o.b((View) BinderC5853b.J0(interfaceC5852a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1195Cf
    public final String zzb() {
        return this.f13613s;
    }
}
