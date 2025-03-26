package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class LU implements InterfaceC4692yT {

    /* renamed from: a, reason: collision with root package name */
    private final C4358vM f16840a;

    public LU(C4358vM c4358vM) {
        this.f16840a = c4358vM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4692yT
    public final C4801zT a(String str, JSONObject jSONObject) {
        return new C4801zT(this.f16840a.c(str, jSONObject), new BinderC4148tU(), str);
    }
}
