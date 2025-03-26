package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1942Xi implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f20112a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC0484a f20113b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f20114c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2323cj f20115d;

    C1942Xi(C2323cj c2323cj, Map map, InterfaceC0484a interfaceC0484a, String str) {
        this.f20112a = map;
        this.f20113b = interfaceC0484a;
        this.f20114c = str;
        this.f20115d = c2323cj;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        C2.v.s().x(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String str = (String) obj;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.V9)).booleanValue()) {
            this.f20112a.put("u", str);
        }
        this.f20115d.h(str, this.f20113b, this.f20112a, this.f20114c);
    }
}
