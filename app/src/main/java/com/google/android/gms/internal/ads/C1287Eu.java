package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.Eu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287Eu implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f14788a;

    public C1287Eu(InterfaceC4203ty0 interfaceC4203ty0) {
        this.f14788a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((C1323Fu) this.f14788a).a().getApplicationInfo();
        AbstractC3332ly0.b(applicationInfo);
        return applicationInfo;
    }
}
