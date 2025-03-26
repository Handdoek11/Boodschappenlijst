package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class U10 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final String f19210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19211b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19212c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19213d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f19214e;

    public U10(String str, String str2, String str3, String str4, Long l8) {
        this.f19210a = str;
        this.f19211b = str2;
        this.f19212c = str3;
        this.f19213d = str4;
        this.f19214e = l8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Y60.c(((KB) obj).f16552b, "fbs_aeid", this.f19212c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        Y60.c(bundle, "gmp_app_id", this.f19210a);
        Y60.c(bundle, "fbs_aiid", this.f19211b);
        Y60.c(bundle, "fbs_aeid", this.f19212c);
        Y60.c(bundle, "apm_id_origin", this.f19213d);
        Long l8 = this.f19214e;
        if (l8 != null) {
            bundle.putLong("sai_timeout", l8.longValue());
        }
    }
}
