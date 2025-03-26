package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.gms.internal.ads.Pu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1675Pu implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18291a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f18292b;

    public C1675Pu(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f18291a = interfaceC4203ty0;
        this.f18292b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return h3.e.a(((C1323Fu) this.f18291a).a()).f(((ApplicationInfo) this.f18292b.zzb()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
