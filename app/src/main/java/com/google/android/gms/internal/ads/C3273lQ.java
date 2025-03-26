package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3273lQ implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f24320a;

    public C3273lQ(InterfaceC4203ty0 interfaceC4203ty0) {
        this.f24320a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((C1323Fu) this.f24320a).a().getPackageName();
        AbstractC3332ly0.b(packageName);
        return packageName;
    }
}
