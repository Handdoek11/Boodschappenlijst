package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Hw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1397Hw implements InterfaceC1325Fw {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0611r0 f15820a;

    public C1397Hw(InterfaceC0611r0 interfaceC0611r0) {
        this.f15820a = interfaceC0611r0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1325Fw
    public final void a(Map map) {
        this.f15820a.V(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
