package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.internal.ads.Ea0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258Ea0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14748a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14749b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5781e f14750c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14751d = ((Long) D2.A.c().a(AbstractC3184kf.f23630A)).longValue() * 1000;

    public C1258Ea0(Object obj, InterfaceC5781e interfaceC5781e) {
        this.f14748a = obj;
        this.f14750c = interfaceC5781e;
        this.f14749b = interfaceC5781e.a();
    }

    public final long a() {
        return (this.f14751d + Math.min(Math.max(((Long) D2.A.c().a(AbstractC3184kf.f24025v)).longValue(), -900000L), 10000L)) - (this.f14750c.a() - this.f14749b);
    }

    public final Object b() {
        return this.f14748a;
    }

    public final boolean c() {
        return this.f14750c.a() >= this.f14749b + this.f14751d;
    }
}
