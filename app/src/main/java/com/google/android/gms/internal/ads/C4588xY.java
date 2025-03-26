package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.xY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4588xY {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f27871a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private C4479wY f27872b;

    final C4479wY a() {
        return this.f27872b;
    }

    final void b(C4479wY c4479wY) {
        this.f27872b = c4479wY;
    }

    public final void c(boolean z7) {
        this.f27871a.set(true);
    }

    public final boolean d() {
        return this.f27871a.get();
    }
}
