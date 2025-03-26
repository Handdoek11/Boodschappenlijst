package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class LB {

    /* renamed from: a, reason: collision with root package name */
    private final S80 f16789a;

    /* renamed from: b, reason: collision with root package name */
    private final H2.a f16790b;

    /* renamed from: c, reason: collision with root package name */
    private final ApplicationInfo f16791c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16792d;

    /* renamed from: e, reason: collision with root package name */
    private final List f16793e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f16794f;

    /* renamed from: g, reason: collision with root package name */
    private final Xx0 f16795g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16796h;

    /* renamed from: i, reason: collision with root package name */
    private final C3341m20 f16797i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC0611r0 f16798j;

    /* renamed from: k, reason: collision with root package name */
    private final L60 f16799k;

    /* renamed from: l, reason: collision with root package name */
    private final int f16800l;

    /* renamed from: m, reason: collision with root package name */
    private final C2171bF f16801m;

    LB(S80 s80, H2.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, Xx0 xx0, InterfaceC0611r0 interfaceC0611r0, String str2, C3341m20 c3341m20, L60 l60, C2171bF c2171bF, int i8) {
        this.f16789a = s80;
        this.f16790b = aVar;
        this.f16791c = applicationInfo;
        this.f16792d = str;
        this.f16793e = list;
        this.f16794f = packageInfo;
        this.f16795g = xx0;
        this.f16796h = str2;
        this.f16797i = c3341m20;
        this.f16798j = interfaceC0611r0;
        this.f16799k = l60;
        this.f16801m = c2171bF;
        this.f16800l = i8;
    }

    final /* synthetic */ C4618xo a(com.google.common.util.concurrent.d dVar, Bundle bundle) {
        KB kb = (KB) dVar.get();
        Bundle bundle2 = kb.f16551a;
        String str = (String) ((com.google.common.util.concurrent.d) this.f16795g.zzb()).get();
        boolean z7 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23765Q6)).booleanValue() && this.f16798j.L();
        String str2 = this.f16796h;
        PackageInfo packageInfo = this.f16794f;
        List list = this.f16793e;
        return new C4618xo(bundle2, this.f16790b, this.f16791c, this.f16792d, list, packageInfo, str, str2, null, null, z7, this.f16799k.b(), bundle, kb.f16552b);
    }

    public final com.google.common.util.concurrent.d b(Bundle bundle) {
        this.f16801m.zza();
        return B80.c(this.f16797i.a(new KB(new Bundle(), new Bundle()), bundle, this.f16800l == 2), M80.SIGNALS, this.f16789a).a();
    }

    public final com.google.common.util.concurrent.d c() {
        final Bundle bundle = new Bundle();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue()) {
            Bundle bundle2 = this.f16799k.f16781s;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final com.google.common.util.concurrent.d b8 = b(bundle);
        return this.f16789a.a(M80.REQUEST_PARCEL, b8, (com.google.common.util.concurrent.d) this.f16795g.zzb()).a(new Callable() { // from class: com.google.android.gms.internal.ads.JB
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16142o.a(b8, bundle);
            }
        }).a();
    }
}
