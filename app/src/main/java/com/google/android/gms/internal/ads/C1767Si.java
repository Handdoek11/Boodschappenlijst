package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Si, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767Si {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18943a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18944b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f18945c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f18946d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.f18945c;
    }

    public final synchronized void b(boolean z7, float f8) {
        this.f18944b = z7;
        this.f18945c = f8;
    }

    public final synchronized void c(boolean z7) {
        this.f18943a = z7;
        this.f18946d.set(true);
    }

    public final synchronized boolean d() {
        return this.f18944b;
    }

    public final synchronized boolean e(boolean z7) {
        if (!this.f18946d.get()) {
            return z7;
        }
        return this.f18943a;
    }
}
