package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2979il implements InterfaceC1805Tk {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1875Vk f23055a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1910Wk f23056b;

    /* renamed from: c, reason: collision with root package name */
    private final C1700Qk f23057c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23058d;

    C2979il(C1700Qk c1700Qk, String str, InterfaceC1910Wk interfaceC1910Wk, InterfaceC1875Vk interfaceC1875Vk) {
        this.f23057c = c1700Qk;
        this.f23058d = str;
        this.f23056b = interfaceC1910Wk;
        this.f23055a = interfaceC1875Vk;
    }

    static /* bridge */ /* synthetic */ void d(C2979il c2979il, C1491Kk c1491Kk, InterfaceC1735Rk interfaceC1735Rk, Object obj, C1811Tq c1811Tq) {
        try {
            C2.v.t();
            String uuid = UUID.randomUUID().toString();
            AbstractC1627Oi.f17929o.c(uuid, new C2871hl(c2979il, c1491Kk, c1811Tq));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", c2979il.f23056b.c(obj));
            interfaceC1735Rk.m1(c2979il.f23058d, jSONObject);
        } catch (Exception e8) {
            try {
                c1811Tq.d(e8);
                H2.p.e("Unable to invokeJavascript", e8);
            } finally {
                c1491Kk.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
    public final com.google.common.util.concurrent.d a(Object obj) {
        return c(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805Tk
    public final com.google.common.util.concurrent.d c(Object obj) {
        C1811Tq c1811Tq = new C1811Tq();
        C1491Kk b8 = this.f23057c.b(null);
        AbstractC0608p0.k("callJs > getEngine: Promise created");
        b8.f(new C2653fl(this, b8, obj, c1811Tq), new C2762gl(this, c1811Tq, b8));
        return c1811Tq;
    }
}
