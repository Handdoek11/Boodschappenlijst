package com.google.android.gms.measurement.internal;

import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.measurement.internal.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5457y5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5781e f31276a;

    /* renamed from: b, reason: collision with root package name */
    private long f31277b;

    public C5457y5(InterfaceC5781e interfaceC5781e) {
        Z2.r.l(interfaceC5781e);
        this.f31276a = interfaceC5781e;
    }

    public final void a() {
        this.f31277b = 0L;
    }

    public final boolean b(long j8) {
        return this.f31277b == 0 || this.f31276a.b() - this.f31277b >= 3600000;
    }

    public final void c() {
        this.f31277b = this.f31276a.b();
    }
}
