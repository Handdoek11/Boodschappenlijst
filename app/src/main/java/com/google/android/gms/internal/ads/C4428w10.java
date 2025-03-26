package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.w10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4428w10 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27422a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f27423b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27424c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27425d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27426e;

    /* renamed from: f, reason: collision with root package name */
    private final String f27427f;

    public C4428w10(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f27422a = str;
        this.f27423b = num;
        this.f27424c = str2;
        this.f27425d = str3;
        this.f27426e = str4;
        this.f27427f = str5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((KB) obj).f16552b;
        Y60.c(bundle, "pn", this.f27422a);
        Y60.c(bundle, "dl", this.f27425d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        Y60.c(bundle, "pn", this.f27422a);
        Integer num = this.f27423b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        Y60.c(bundle, "vnm", this.f27424c);
        Y60.c(bundle, "dl", this.f27425d);
        Y60.c(bundle, "ins_pn", this.f27426e);
        Y60.c(bundle, "ini_pn", this.f27427f);
    }
}
