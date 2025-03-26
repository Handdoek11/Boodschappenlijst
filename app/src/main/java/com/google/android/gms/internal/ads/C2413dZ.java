package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.dZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2413dZ implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21584a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21585b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21586c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21587d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21588e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21589f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21590g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21591h;

    /* renamed from: i, reason: collision with root package name */
    public final float f21592i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f21593j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21594k;

    public C2413dZ(int i8, boolean z7, boolean z8, int i9, int i10, int i11, int i12, int i13, float f8, boolean z9, boolean z10) {
        this.f21584a = i8;
        this.f21585b = z7;
        this.f21586c = z8;
        this.f21587d = i9;
        this.f21588e = i10;
        this.f21589f = i11;
        this.f21590g = i12;
        this.f21591h = i13;
        this.f21592i = f8;
        this.f21593j = z9;
        this.f21594k = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Ra)).booleanValue()) {
            bundle.putInt("muv_min", this.f21588e);
            bundle.putInt("muv_max", this.f21589f);
        }
        bundle.putFloat("android_app_volume", this.f21592i);
        bundle.putBoolean("android_app_muted", this.f21593j);
        if (this.f21594k) {
            return;
        }
        bundle.putInt("am", this.f21584a);
        bundle.putBoolean("ma", this.f21585b);
        bundle.putBoolean("sp", this.f21586c);
        bundle.putInt("muv", this.f21587d);
        bundle.putInt("rm", this.f21590g);
        bundle.putInt("riv", this.f21591h);
    }
}
