package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4840zq {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28713a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f28715c = 1;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f28714b = 0;

    /* synthetic */ C4840zq(AbstractC1139Aq abstractC1139Aq) {
    }

    public final void a() {
        long a8 = C2.v.c().a();
        synchronized (this.f28713a) {
            try {
                if (this.f28715c == 3) {
                    if (this.f28714b + ((Long) D2.A.c().a(AbstractC3184kf.f23756P5)).longValue() <= a8) {
                        this.f28715c = 1;
                    }
                }
            } finally {
            }
        }
        long a9 = C2.v.c().a();
        synchronized (this.f28713a) {
            try {
                if (this.f28715c != 2) {
                    return;
                }
                this.f28715c = 3;
                if (this.f28715c == 3) {
                    this.f28714b = a9;
                }
            } finally {
            }
        }
    }
}
