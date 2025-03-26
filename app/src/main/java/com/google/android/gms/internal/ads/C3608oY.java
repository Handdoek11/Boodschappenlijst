package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.oY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3608oY implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final D2.c2 f25198a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25199b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25200c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25201d;

    /* renamed from: e, reason: collision with root package name */
    public final float f25202e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25203f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25204g;

    /* renamed from: h, reason: collision with root package name */
    public final String f25205h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f25206i;

    public C3608oY(D2.c2 c2Var, String str, boolean z7, String str2, float f8, int i8, int i9, String str3, boolean z8) {
        Z2.r.m(c2Var, "the adSize must not be null");
        this.f25198a = c2Var;
        this.f25199b = str;
        this.f25200c = z7;
        this.f25201d = str2;
        this.f25202e = f8;
        this.f25203f = i8;
        this.f25204g = i9;
        this.f25205h = str3;
        this.f25206i = z8;
    }

    private final void b(Bundle bundle) {
        Y60.f(bundle, "smart_w", "full", this.f25198a.f1225v == -1);
        Y60.f(bundle, "smart_h", "auto", this.f25198a.f1222s == -2);
        Y60.g(bundle, "ene", true, this.f25198a.f1215A);
        Y60.f(bundle, "rafmt", "102", this.f25198a.f1218D);
        Y60.f(bundle, "rafmt", "103", this.f25198a.f1219E);
        Y60.f(bundle, "rafmt", "105", this.f25198a.f1220F);
        Y60.g(bundle, "inline_adaptive_slot", true, this.f25206i);
        Y60.g(bundle, "interscroller_slot", true, this.f25198a.f1220F);
        Y60.c(bundle, "format", this.f25199b);
        Y60.f(bundle, "fluid", "height", this.f25200c);
        Y60.f(bundle, "sz", this.f25201d, !TextUtils.isEmpty(this.f25201d));
        bundle.putFloat("u_sd", this.f25202e);
        bundle.putInt("sw", this.f25203f);
        bundle.putInt("sh", this.f25204g);
        Y60.f(bundle, "sc", this.f25205h, !TextUtils.isEmpty(this.f25205h));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        D2.c2[] c2VarArr = this.f25198a.f1227x;
        if (c2VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f25198a.f1222s);
            bundle2.putInt("width", this.f25198a.f1225v);
            bundle2.putBoolean("is_fluid_height", this.f25198a.f1229z);
            arrayList.add(bundle2);
        } else {
            for (D2.c2 c2Var : c2VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", c2Var.f1229z);
                bundle3.putInt("height", c2Var.f1222s);
                bundle3.putInt("width", c2Var.f1225v);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
        b(((KB) obj).f16552b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void c(Object obj) {
        b(((KB) obj).f16551a);
    }
}
