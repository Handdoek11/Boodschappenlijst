package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Zx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2028Zx implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20578a;

    public C2028Zx(InterfaceC4203ty0 interfaceC4203ty0) {
        this.f20578a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((C2269cA) this.f20578a).a().f25828z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
