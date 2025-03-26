package com.google.android.gms.internal.ads;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import w2.EnumC6877c;

/* renamed from: com.google.android.gms.internal.ads.wa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4482wa0 {

    /* renamed from: a, reason: collision with root package name */
    private final HN f27508a;

    C4482wa0(HN hn) {
        this.f27508a = hn;
    }

    private final void g(EnumC6877c enumC6877c, Optional optional, String str, long j8, Optional optional2) {
        final GN a8 = this.f27508a.a();
        a8.b(str, Long.toString(j8));
        a8.b("ad_format", enumC6877c == null ? "unknown" : enumC6877c.name());
        optional.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.ua0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                a8.b("action", (String) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional2.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.va0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                a8.b("gqi", (String) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a8.g();
    }

    public final void a(EnumC6877c enumC6877c, long j8, Optional optional, Optional optional2) {
        final GN a8 = this.f27508a.a();
        a8.b("plaac_ts", Long.toString(j8));
        a8.b("ad_format", enumC6877c.name());
        a8.b("action", "is_ad_available");
        optional.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.sa0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                a8.b("plaay_ts", Long.toString(((Long) obj).longValue()));
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional2.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.ta0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                a8.b("gqi", (String) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a8.g();
    }

    public final void b(EnumC6877c enumC6877c, long j8, Optional optional) {
        g(enumC6877c, Optional.empty(), "pano_ts", j8, optional);
    }

    public final void c(EnumC6877c enumC6877c, long j8) {
        g(enumC6877c, Optional.empty(), "paeo_ts", j8, Optional.empty());
    }

    public final void d(EnumC6877c enumC6877c, long j8) {
        g(enumC6877c, Optional.of("poll_ad"), "ppac_ts", j8, Optional.empty());
    }

    public final void e(EnumC6877c enumC6877c, long j8, Optional optional) {
        g(enumC6877c, Optional.of("poll_ad"), "ppla_ts", j8, optional);
    }

    public final void f(Map map, long j8) {
        GN a8 = this.f27508a.a();
        a8.b("action", "start_preload");
        a8.b("sp_ts", Long.toString(j8));
        for (EnumC6877c enumC6877c : map.keySet()) {
            String valueOf = String.valueOf(enumC6877c.name().toLowerCase(Locale.ENGLISH));
            a8.b(valueOf.concat("_count"), Integer.toString(((Integer) map.get(enumC6877c)).intValue()));
        }
        a8.g();
    }
}
