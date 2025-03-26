package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class GN {

    /* renamed from: a, reason: collision with root package name */
    private final Map f15361a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HN f15362b;

    GN(HN hn) {
        this.f15362b = hn;
    }

    static /* bridge */ /* synthetic */ GN a(GN gn) {
        gn.f15361a.putAll(gn.f15362b.f15718c);
        return gn;
    }

    public final GN b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f15361a.put(str, str2);
        }
        return this;
    }

    public final GN c(C3785q60 c3785q60) {
        b("aai", c3785q60.f25822w);
        b("request_id", c3785q60.f25805n0);
        b("ad_format", C3785q60.a(c3785q60.f25780b));
        return this;
    }

    public final GN d(C4111t60 c4111t60) {
        b("gqi", c4111t60.f26832b);
        return this;
    }

    public final String e() {
        return this.f15362b.f15716a.b(this.f15361a);
    }

    public final void f() {
        this.f15362b.f15717b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.FN
            @Override // java.lang.Runnable
            public final void run() {
                this.f15140o.i();
            }
        });
    }

    public final void g() {
        this.f15362b.f15717b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.DN
            @Override // java.lang.Runnable
            public final void run() {
                this.f14483o.j();
            }
        });
    }

    public final void h() {
        this.f15362b.f15717b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.EN
            @Override // java.lang.Runnable
            public final void run() {
                this.f14724o.k();
            }
        });
    }

    final /* synthetic */ void i() {
        this.f15362b.f15716a.e(this.f15361a);
    }

    final /* synthetic */ void j() {
        this.f15362b.f15716a.g(this.f15361a);
    }

    final /* synthetic */ void k() {
        this.f15362b.f15716a.f(this.f15361a);
    }
}
