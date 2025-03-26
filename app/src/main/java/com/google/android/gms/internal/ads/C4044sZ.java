package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.internal.ads.sZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4044sZ {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.d f26697a;

    /* renamed from: b, reason: collision with root package name */
    private final long f26698b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5781e f26699c;

    public C4044sZ(com.google.common.util.concurrent.d dVar, long j8, InterfaceC5781e interfaceC5781e) {
        this.f26697a = dVar;
        this.f26699c = interfaceC5781e;
        this.f26698b = interfaceC5781e.b() + j8;
    }

    public final boolean a() {
        return this.f26698b < this.f26699c.b();
    }
}
