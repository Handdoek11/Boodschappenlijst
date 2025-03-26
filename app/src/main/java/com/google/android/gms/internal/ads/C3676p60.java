package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.internal.ads.p60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3676p60 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5781e f25346a;

    /* renamed from: b, reason: collision with root package name */
    private final HN f25347b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f25348c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile int f25350e = 1;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f25349d = 0;

    public C3676p60(InterfaceC5781e interfaceC5781e, HN hn) {
        this.f25346a = interfaceC5781e;
        this.f25347b = hn;
    }

    private final void e() {
        long a8 = this.f25346a.a();
        synchronized (this.f25348c) {
            try {
                if (this.f25350e == 3) {
                    if (this.f25349d + ((Long) D2.A.c().a(AbstractC3184kf.f23756P5)).longValue() <= a8) {
                        this.f25350e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(int i8, int i9) {
        e();
        Object obj = this.f25348c;
        long a8 = this.f25346a.a();
        synchronized (obj) {
            try {
                if (this.f25350e != i8) {
                    return;
                }
                this.f25350e = i9;
                if (this.f25350e == 3) {
                    this.f25349d = a8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        f(2, 3);
    }

    public final void b(boolean z7) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Tc)).booleanValue()) {
            GN a8 = this.f25347b.a();
            a8.b("action", "mbs_state");
            a8.b("mbs_state", true != z7 ? "0" : "1");
            a8.g();
        }
        if (z7) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z7;
        synchronized (this.f25348c) {
            e();
            z7 = this.f25350e == 3;
        }
        return z7;
    }

    public final boolean d() {
        boolean z7;
        synchronized (this.f25348c) {
            e();
            z7 = this.f25350e == 2;
        }
        return z7;
    }
}
