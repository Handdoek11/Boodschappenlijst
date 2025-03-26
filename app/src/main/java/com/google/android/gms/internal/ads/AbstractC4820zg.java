package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4820zg {

    /* renamed from: a, reason: collision with root package name */
    public static final C1831Uf f28689a = C1831Uf.d("gads:trustless_token_for_decagon:enabled", true);

    /* renamed from: b, reason: collision with root package name */
    public static final C1831Uf f28690b;

    static {
        C1831Uf.d("gads:invalidate_token_at_refresh_start", true);
        C1831Uf.d("gms:expose_token_for_gma:enabled", true);
        C1831Uf.d("gads:referesh_rate_limit", false);
        f28690b = C1831Uf.b("gads:timeout_for_trustless_token:millis", 2000L);
        C1831Uf.d("gads:token_anonymization:enabled", true);
        C1831Uf.b("gads:cached_token:ttl_millis", 10800000L);
    }
}
