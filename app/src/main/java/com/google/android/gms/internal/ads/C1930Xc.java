package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.Xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1930Xc {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f20095a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20096b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20097c;

    /* renamed from: d, reason: collision with root package name */
    private final long f20098d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20099e;

    private C1930Xc(InputStream inputStream, boolean z7, boolean z8, long j8, boolean z9) {
        this.f20095a = inputStream;
        this.f20096b = z7;
        this.f20097c = z8;
        this.f20098d = j8;
        this.f20099e = z9;
    }

    public static C1930Xc b(InputStream inputStream, boolean z7, boolean z8, long j8, boolean z9) {
        return new C1930Xc(inputStream, z7, z8, j8, z9);
    }

    public final long a() {
        return this.f20098d;
    }

    public final InputStream c() {
        return this.f20095a;
    }

    public final boolean d() {
        return this.f20096b;
    }

    public final boolean e() {
        return this.f20099e;
    }

    public final boolean f() {
        return this.f20097c;
    }
}
