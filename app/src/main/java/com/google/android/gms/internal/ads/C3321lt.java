package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.lt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3321lt {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f24391a = new AtomicBoolean(false);

    public C3321lt(String str) {
    }

    public final void a() {
        this.f24391a.set(false);
    }

    public final void b() {
        this.f24391a.set(true);
    }

    public final void c() {
        this.f24391a.set(false);
    }

    public final boolean d() {
        return this.f24391a.get();
    }
}
