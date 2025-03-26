package com.google.android.gms.internal.ads;

import G2.AbstractC0585e;
import G2.InterfaceC0611r0;
import android.content.Context;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Vw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1887Vw implements InterfaceC1325Fw {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19679a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0611r0 f19680b = C2.v.s().j();

    public C1887Vw(Context context) {
        this.f19679a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1325Fw
    public final void a(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        InterfaceC0611r0 interfaceC0611r0 = this.f19680b;
        boolean parseBoolean = Boolean.parseBoolean(str);
        interfaceC0611r0.l0(parseBoolean);
        if (parseBoolean) {
            AbstractC0585e.c(this.f19679a);
        }
    }
}
