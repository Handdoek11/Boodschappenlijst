package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ct, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1214Ct implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f14249a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f14250b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f14251c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1358Gt f14252d;

    C1214Ct(AbstractC1358Gt abstractC1358Gt, List list, String str, Uri uri) {
        this.f14249a = list;
        this.f14250b = str;
        this.f14251c = uri;
        this.f14252d = abstractC1358Gt;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        H2.p.g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f14251c)));
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List list = this.f14249a;
        String str = this.f14250b;
        this.f14252d.w((Map) obj, list, str);
    }
}
