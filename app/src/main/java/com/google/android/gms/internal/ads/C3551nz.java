package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3551nz implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f25060a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f25061b;

    public C3551nz(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f25060a = interfaceC4203ty0;
        this.f25061b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3442mz zzb() {
        return new C3442mz(((C1819Ty) this.f25060a).a(), (Executor) this.f25061b.zzb());
    }
}
