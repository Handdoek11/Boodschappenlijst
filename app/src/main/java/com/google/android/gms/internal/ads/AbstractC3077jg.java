package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3077jg {

    /* renamed from: a, reason: collision with root package name */
    public static final C1831Uf f23295a = C1831Uf.d("gads:init:init_on_bg_thread", true);

    /* renamed from: b, reason: collision with root package name */
    public static final C1831Uf f23296b = C1831Uf.d("gads:init:init_on_single_bg_thread", false);

    /* renamed from: c, reason: collision with root package name */
    public static final C1831Uf f23297c = C1831Uf.d("gads:adloader_load_bg_thread", true);

    /* renamed from: d, reason: collision with root package name */
    public static final C1831Uf f23298d = C1831Uf.d("gads:appopen_load_on_bg_thread", true);

    /* renamed from: e, reason: collision with root package name */
    public static final C1831Uf f23299e = C1831Uf.d("gads:banner_destroy_bg_thread", false);

    /* renamed from: f, reason: collision with root package name */
    public static final C1831Uf f23300f = C1831Uf.d("gads:banner_load_bg_thread", true);

    /* renamed from: g, reason: collision with root package name */
    public static final C1831Uf f23301g = C1831Uf.d("gads:banner_pause_bg_thread", false);

    /* renamed from: h, reason: collision with root package name */
    public static final C1831Uf f23302h = C1831Uf.d("gads:banner_resume_bg_thread", false);

    /* renamed from: i, reason: collision with root package name */
    public static final C1831Uf f23303i = C1831Uf.d("gads:interstitial_load_on_bg_thread", true);

    /* renamed from: j, reason: collision with root package name */
    public static final C1831Uf f23304j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1831Uf f23305k;

    static {
        C1831Uf.d("gads:persist_flags_on_bg_thread", true);
        f23304j = C1831Uf.d("gads:query_info_bg_thread", true);
        f23305k = C1831Uf.d("gads:rewarded_load_bg_thread", true);
    }
}
