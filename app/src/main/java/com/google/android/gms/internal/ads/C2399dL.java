package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2399dL implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1163Bh f21527a;

    /* renamed from: b, reason: collision with root package name */
    private final C4030sL f21528b;

    /* renamed from: c, reason: collision with root package name */
    private final Xx0 f21529c;

    public C2399dL(SI si, HI hi, C4030sL c4030sL, Xx0 xx0) {
        this.f21527a = si.c(hi.a());
        this.f21528b = c4030sL;
        this.f21529c = xx0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f21527a.Z3((InterfaceC3842qh) this.f21529c.zzb(), str);
        } catch (RemoteException e8) {
            H2.p.h("Failed to call onCustomClick for asset " + str + ".", e8);
        }
    }

    public final void b() {
        if (this.f21527a == null) {
            return;
        }
        this.f21528b.l("/nativeAdCustomClick", this);
    }
}
