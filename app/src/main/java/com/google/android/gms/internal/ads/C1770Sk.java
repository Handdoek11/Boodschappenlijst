package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770Sk implements InterfaceC3085jk, InterfaceC1735Rk {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1735Rk f18948o;

    /* renamed from: s, reason: collision with root package name */
    private final HashSet f18949s = new HashSet();

    public C1770Sk(InterfaceC1735Rk interfaceC1735Rk) {
        this.f18948o = interfaceC1735Rk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2869hk
    public final /* synthetic */ void D0(String str, Map map) {
        AbstractC2977ik.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1735Rk
    public final void H0(String str, InterfaceC1662Pi interfaceC1662Pi) {
        this.f18948o.H0(str, interfaceC1662Pi);
        this.f18949s.add(new AbstractMap.SimpleEntry(str, interfaceC1662Pi));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1735Rk
    public final void M0(String str, InterfaceC1662Pi interfaceC1662Pi) {
        this.f18948o.M0(str, interfaceC1662Pi);
        this.f18949s.remove(new AbstractMap.SimpleEntry(str, interfaceC1662Pi));
    }

    public final void a() {
        Iterator it = this.f18949s.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            AbstractC0608p0.k("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC1662Pi) simpleEntry.getValue()).toString())));
            this.f18948o.M0((String) simpleEntry.getKey(), (InterfaceC1662Pi) simpleEntry.getValue());
        }
        this.f18949s.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3085jk, com.google.android.gms.internal.ads.InterfaceC4174tk
    public final /* synthetic */ void m(String str, String str2) {
        AbstractC2977ik.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final /* synthetic */ void m1(String str, JSONObject jSONObject) {
        AbstractC2977ik.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3085jk, com.google.android.gms.internal.ads.InterfaceC4174tk
    public final void n(String str) {
        this.f18948o.n(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3085jk, com.google.android.gms.internal.ads.InterfaceC2869hk
    public final /* synthetic */ void p(String str, JSONObject jSONObject) {
        AbstractC2977ik.b(this, str, jSONObject);
    }
}
