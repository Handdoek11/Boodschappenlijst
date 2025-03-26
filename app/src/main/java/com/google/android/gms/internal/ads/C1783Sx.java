package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Sx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1783Sx implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18982a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f18983b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f18984c;

    public C1783Sx(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f18982a = interfaceC4203ty0;
        this.f18983b = interfaceC4203ty02;
        this.f18984c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        H2.a a8 = ((C1815Tu) this.f18982a).a();
        JSONObject jSONObject = (JSONObject) this.f18983b.zzb();
        String str = (String) this.f18984c.zzb();
        boolean equals = "native".equals(str);
        C2.v.t();
        return new C4265ub(UUID.randomUUID().toString(), a8, str, jSONObject, false, equals);
    }
}
