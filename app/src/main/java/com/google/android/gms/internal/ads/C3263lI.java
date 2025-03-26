package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3263lI implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f24300a;

    public C3263lI(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f24300a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* synthetic */ Object zzb() {
        H2.a a8 = ((C1815Tu) this.f24300a).a();
        C2.v.t();
        return new C4265ub(UUID.randomUUID().toString(), a8, "native", new JSONObject(), false, true);
    }
}
