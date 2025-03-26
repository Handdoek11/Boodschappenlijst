package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.vb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4375vb0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3179kc0 f27295a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27296b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC2525eb0 f27297c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27298d = "Ad overlay";

    public C4375vb0(View view, EnumC2525eb0 enumC2525eb0, String str) {
        this.f27295a = new C3179kc0(view);
        this.f27296b = view.getClass().getCanonicalName();
        this.f27297c = enumC2525eb0;
    }

    public final EnumC2525eb0 a() {
        return this.f27297c;
    }

    public final C3179kc0 b() {
        return this.f27295a;
    }

    public final String c() {
        return this.f27298d;
    }

    public final String d() {
        return this.f27296b;
    }
}
