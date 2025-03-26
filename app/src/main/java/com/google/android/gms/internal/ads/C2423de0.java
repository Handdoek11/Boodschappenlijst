package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.de0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2423de0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21624a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21625b;

    public C2423de0() {
        this.f21624a = null;
        this.f21625b = -1L;
    }

    public final long a() {
        return this.f21625b;
    }

    public final String b() {
        return this.f21624a;
    }

    public final boolean c() {
        return this.f21624a != null && this.f21625b > 0;
    }

    public C2423de0(String str, long j8) {
        this.f21624a = str;
        this.f21625b = j8;
    }
}
