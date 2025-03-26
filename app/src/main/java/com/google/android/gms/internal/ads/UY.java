package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class UY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    final Context f19403a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19404b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19405c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19406d;

    /* renamed from: e, reason: collision with root package name */
    private final CA f19407e;

    /* renamed from: f, reason: collision with root package name */
    private final C4004s70 f19408f;

    /* renamed from: g, reason: collision with root package name */
    private final L60 f19409g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0611r0 f19410h = C2.v.s().j();

    /* renamed from: i, reason: collision with root package name */
    private final BN f19411i;

    /* renamed from: j, reason: collision with root package name */
    private final QA f19412j;

    public UY(Context context, String str, String str2, CA ca, C4004s70 c4004s70, L60 l60, BN bn, QA qa, long j8) {
        this.f19403a = context;
        this.f19404b = str;
        this.f19405c = str2;
        this.f19407e = ca;
        this.f19408f = c4004s70;
        this.f19409g = l60;
        this.f19411i = bn;
        this.f19412j = qa;
        this.f19406d = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        Bundle bundle = new Bundle();
        this.f19411i.b().put("seq_num", this.f19404b);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue()) {
            this.f19411i.c("tsacc", String.valueOf(C2.v.c().a() - this.f19406d));
            BN bn = this.f19411i;
            C2.v.t();
            bn.c("foreground", true != G2.D0.h(this.f19403a) ? "1" : "0");
        }
        this.f19407e.m(this.f19409g.f16766d);
        bundle.putAll(this.f19408f.a());
        return AbstractC2326ck0.h(new VY(this.f19403a, bundle, this.f19404b, this.f19405c, this.f19410h, this.f19409g.f16768f, this.f19412j));
    }
}
