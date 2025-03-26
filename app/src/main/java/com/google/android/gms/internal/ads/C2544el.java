package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.el, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2544el {

    /* renamed from: b, reason: collision with root package name */
    static final G2.E f21873b = new C2327cl();

    /* renamed from: c, reason: collision with root package name */
    static final G2.E f21874c = new C2436dl();

    /* renamed from: a, reason: collision with root package name */
    private final C1700Qk f21875a;

    public C2544el(Context context, H2.a aVar, String str, RunnableC3791q90 runnableC3791q90) {
        this.f21875a = new C1700Qk(context, aVar, str, f21873b, f21874c, runnableC3791q90);
    }

    public final InterfaceC1805Tk a(String str, InterfaceC1910Wk interfaceC1910Wk, InterfaceC1875Vk interfaceC1875Vk) {
        return new C2979il(this.f21875a, str, interfaceC1910Wk, interfaceC1875Vk);
    }

    public final C3523nl b() {
        return new C3523nl(this.f21875a);
    }
}
