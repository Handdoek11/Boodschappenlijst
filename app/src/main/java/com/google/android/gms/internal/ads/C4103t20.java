package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.t20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4103t20 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26793a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26794b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26795c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26796d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26797e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26798f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26799g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f26800h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26801i;

    /* renamed from: j, reason: collision with root package name */
    public final String f26802j;

    /* renamed from: k, reason: collision with root package name */
    public final String f26803k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26804l;

    /* renamed from: m, reason: collision with root package name */
    public final String f26805m;

    /* renamed from: n, reason: collision with root package name */
    public final long f26806n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f26807o;

    /* renamed from: p, reason: collision with root package name */
    public final String f26808p;

    /* renamed from: q, reason: collision with root package name */
    public final int f26809q;

    public C4103t20(boolean z7, boolean z8, String str, boolean z9, boolean z10, boolean z11, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z12, String str6, long j8, boolean z13, String str7, int i8) {
        this.f26793a = z7;
        this.f26794b = z8;
        this.f26795c = str;
        this.f26796d = z9;
        this.f26797e = z10;
        this.f26798f = z11;
        this.f26799g = str2;
        this.f26800h = arrayList;
        this.f26801i = str3;
        this.f26802j = str4;
        this.f26803k = str5;
        this.f26804l = z12;
        this.f26805m = str6;
        this.f26806n = j8;
        this.f26807o = z13;
        this.f26808p = str7;
        this.f26809q = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((KB) obj).f16552b;
        bundle.putBoolean("simulator", this.f26796d);
        bundle.putInt("build_api_level", this.f26809q);
        if (!this.f26800h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f26800h);
        }
        bundle.putString("submodel", this.f26805m);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        bundle.putBoolean("cog", this.f26793a);
        bundle.putBoolean("coh", this.f26794b);
        bundle.putString("gl", this.f26795c);
        bundle.putBoolean("simulator", this.f26796d);
        bundle.putBoolean("is_latchsky", this.f26797e);
        bundle.putInt("build_api_level", this.f26809q);
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Ua)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f26798f);
        }
        bundle.putString("hl", this.f26799g);
        if (!this.f26800h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f26800h);
        }
        bundle.putString("mv", this.f26801i);
        bundle.putString("submodel", this.f26805m);
        Bundle a8 = Y60.a(bundle, "device");
        bundle.putBundle("device", a8);
        a8.putString("build", this.f26803k);
        a8.putLong("remaining_data_partition_space", this.f26806n);
        Bundle a9 = Y60.a(a8, "browser");
        a8.putBundle("browser", a9);
        a9.putBoolean("is_browser_custom_tabs_capable", this.f26804l);
        if (!TextUtils.isEmpty(this.f26802j)) {
            Bundle a10 = Y60.a(a8, "play_store");
            a8.putBundle("play_store", a10);
            a10.putString("package_version", this.f26802j);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.kb)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f26807o);
        }
        if (!TextUtils.isEmpty(this.f26808p)) {
            bundle.putString("v_unity", this.f26808p);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.eb)).booleanValue()) {
            Y60.g(bundle, "gotmt_l", true, ((Boolean) D2.A.c().a(AbstractC3184kf.bb)).booleanValue());
            Y60.g(bundle, "gotmt_i", true, ((Boolean) D2.A.c().a(AbstractC3184kf.ab)).booleanValue());
        }
    }
}
