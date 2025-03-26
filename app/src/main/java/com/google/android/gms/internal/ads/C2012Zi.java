package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import F2.InterfaceC0570b;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Zi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2012Zi implements InterfaceC0570b {

    /* renamed from: a, reason: collision with root package name */
    boolean f20526a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f20527b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC0484a f20528c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map f20529d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map f20530e;

    C2012Zi(C2323cj c2323cj, boolean z7, InterfaceC0484a interfaceC0484a, Map map, Map map2) {
        this.f20527b = z7;
        this.f20528c = interfaceC0484a;
        this.f20529d = map;
        this.f20530e = map2;
    }

    @Override // F2.InterfaceC0570b
    public final void A(int i8) {
    }

    @Override // F2.InterfaceC0570b
    public final void B(boolean z7) {
        if (this.f20526a) {
            return;
        }
        if (z7 && this.f20527b) {
            ((InterfaceC3912rG) this.f20528c).K0();
        }
        this.f20526a = true;
        this.f20529d.put((String) this.f20530e.get("event_id"), Boolean.valueOf(z7));
        ((InterfaceC2869hk) this.f20528c).D0("openIntentAsync", this.f20529d);
    }
}
