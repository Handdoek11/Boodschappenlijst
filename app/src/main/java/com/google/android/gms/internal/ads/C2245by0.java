package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.by0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2245by0 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3441my0 f21033a;

    public static void a(InterfaceC3441my0 interfaceC3441my0, InterfaceC3441my0 interfaceC3441my02) {
        C2245by0 c2245by0 = (C2245by0) interfaceC3441my0;
        if (c2245by0.f21033a != null) {
            throw new IllegalStateException();
        }
        c2245by0.f21033a = interfaceC3441my02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final Object zzb() {
        InterfaceC3441my0 interfaceC3441my0 = this.f21033a;
        if (interfaceC3441my0 != null) {
            return interfaceC3441my0.zzb();
        }
        throw new IllegalStateException();
    }
}
