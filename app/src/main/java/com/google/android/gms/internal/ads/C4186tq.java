package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.tq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4186tq {

    /* renamed from: a, reason: collision with root package name */
    private long f26931a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f26932b = -1;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4295uq f26933c;

    public C4186tq(C4295uq c4295uq) {
        this.f26933c = c4295uq;
    }

    public final long a() {
        return this.f26932b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f26931a);
        bundle.putLong("tclose", this.f26932b);
        return bundle;
    }

    public final void c() {
        this.f26932b = this.f26933c.f27106a.b();
    }

    public final void d() {
        this.f26931a = this.f26933c.f27106a.b();
    }
}
