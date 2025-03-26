package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.y20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4648y20 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27975a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27978d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27979e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27980f;

    public C4648y20(String str, int i8, int i9, int i10, boolean z7, int i11) {
        this.f27975a = str;
        this.f27976b = i8;
        this.f27977c = i9;
        this.f27978d = i10;
        this.f27979e = z7;
        this.f27980f = i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        Y60.f(bundle, "carrier", this.f27975a, !TextUtils.isEmpty(this.f27975a));
        int i8 = this.f27976b;
        Y60.e(bundle, "cnt", i8, i8 != -2);
        bundle.putInt("gnt", this.f27977c);
        bundle.putInt("pt", this.f27978d);
        Bundle a8 = Y60.a(bundle, "device");
        bundle.putBundle("device", a8);
        Bundle a9 = Y60.a(a8, "network");
        a8.putBundle("network", a9);
        a9.putInt("active_network_state", this.f27980f);
        a9.putBoolean("active_network_metered", this.f27979e);
    }
}
