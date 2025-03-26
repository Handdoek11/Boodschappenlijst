package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.x10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4537x10 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f27708a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f27709b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f27710c;

    public C4537x10(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f27708a = interfaceC4203ty0;
        this.f27709b = interfaceC4203ty02;
        this.f27710c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4319v10 zzb() {
        return new C4319v10((ApplicationInfo) this.f27708a.zzb(), (PackageInfo) this.f27709b.zzb(), ((C1323Fu) this.f27710c).a());
    }
}
