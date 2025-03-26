package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1468Jw implements InterfaceC1325Fw {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0611r0 f16461a;

    public C1468Jw(InterfaceC0611r0 interfaceC0611r0) {
        this.f16461a = interfaceC0611r0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1325Fw
    public final void a(Map map) {
        this.f16461a.S(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
