package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Y10 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20181a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20182b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20183c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20184d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20185e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20186f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20187g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20188h;

    Y10(boolean z7, boolean z8, String str, boolean z9, int i8, int i9, int i10, String str2) {
        this.f20181a = z7;
        this.f20182b = z8;
        this.f20183c = str;
        this.f20184d = z9;
        this.f20185e = i8;
        this.f20186f = i9;
        this.f20187g = i10;
        this.f20188h = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        KB kb = (KB) obj;
        kb.f16552b.putString("js", this.f20183c);
        kb.f16552b.putInt("target_api", this.f20185e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        bundle.putString("js", this.f20183c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) D2.A.c().a(AbstractC3184kf.f23754P3));
        bundle.putInt("target_api", this.f20185e);
        bundle.putInt("dv", this.f20186f);
        bundle.putInt("lv", this.f20187g);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23748O5)).booleanValue() && !TextUtils.isEmpty(this.f20188h)) {
            bundle.putString("ev", this.f20188h);
        }
        Bundle a8 = Y60.a(bundle, "sdk_env");
        a8.putBoolean("mf", ((Boolean) AbstractC3295lg.f24363c.e()).booleanValue());
        a8.putBoolean("instant_app", this.f20181a);
        a8.putBoolean("lite", this.f20182b);
        a8.putBoolean("is_privileged_process", this.f20184d);
        bundle.putBundle("sdk_env", a8);
        Bundle a9 = Y60.a(a8, "build_meta");
        a9.putString("cl", "697668803");
        a9.putString("rapid_rc", "dev");
        a9.putString("rapid_rollup", "HEAD");
        a8.putBundle("build_meta", a9);
    }
}
