package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3850ql implements InterfaceC1420Ij0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25988a = "google.afma.activeView.handleUpdate";

    /* renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f25989b;

    C3850ql(com.google.common.util.concurrent.d dVar, String str, InterfaceC1910Wk interfaceC1910Wk, InterfaceC1875Vk interfaceC1875Vk) {
        this.f25989b = dVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
    public final com.google.common.util.concurrent.d a(Object obj) {
        return c(obj);
    }

    final /* synthetic */ com.google.common.util.concurrent.d b(Object obj, InterfaceC1735Rk interfaceC1735Rk) {
        C1811Tq c1811Tq = new C1811Tq();
        C2.v.t();
        String uuid = UUID.randomUUID().toString();
        AbstractC1627Oi.f17929o.c(uuid, new C3741pl(this, c1811Tq));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        interfaceC1735Rk.m1(this.f25988a, jSONObject);
        return c1811Tq;
    }

    public final com.google.common.util.concurrent.d c(final Object obj) {
        return AbstractC2326ck0.n(this.f25989b, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.ol
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj2) {
                return this.f25265a.b(obj, (InterfaceC1735Rk) obj2);
            }
        }, AbstractC1497Kq.f16650g);
    }
}
