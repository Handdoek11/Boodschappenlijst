package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2353cy {

    /* renamed from: a, reason: collision with root package name */
    private final HN f21354a;

    /* renamed from: b, reason: collision with root package name */
    private final C60 f21355b;

    C2353cy(HN hn, C60 c60) {
        this.f21354a = hn;
        this.f21355b = c60;
    }

    public final void a(long j8, int i8) {
        GN a8 = this.f21354a.a();
        a8.d(this.f21355b.f14101b.f13520b);
        a8.b("action", "ad_closed");
        a8.b("show_time", String.valueOf(j8));
        a8.b("ad_format", "app_open_ad");
        int i9 = i8 - 1;
        a8.b("acr", i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        a8.g();
    }
}
