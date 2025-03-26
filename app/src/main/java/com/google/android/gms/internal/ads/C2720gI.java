package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2720gI implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2502eI f22286a;

    public C2720gI(C2502eI c2502eI) {
        this.f22286a = c2502eI;
    }

    public static JSONObject a(C2502eI c2502eI) {
        JSONObject b8 = c2502eI.b();
        AbstractC3332ly0.b(b8);
        return b8;
    }

    public final JSONObject b() {
        return a(this.f22286a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* synthetic */ Object zzb() {
        return a(this.f22286a);
    }
}
