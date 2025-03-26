package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5294b2 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f30831g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f30832a;

    /* renamed from: b, reason: collision with root package name */
    private final Z1 f30833b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f30834c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f30835d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f30836e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f30837f;

    public final Object a(Object obj) {
        synchronized (this.f30835d) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC5308d2.f30899a == null) {
            return this.f30834c;
        }
        synchronized (f30831g) {
            try {
                if (C5298c.a()) {
                    return this.f30837f == null ? this.f30834c : this.f30837f;
                }
                try {
                    for (C5294b2 c5294b2 : G.f30422a) {
                        if (C5298c.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            Z1 z12 = c5294b2.f30833b;
                            if (z12 != null) {
                                obj2 = z12.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f30831g) {
                            c5294b2.f30837f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                Z1 z13 = this.f30833b;
                if (z13 == null) {
                    return this.f30834c;
                }
                try {
                    return z13.zza();
                } catch (IllegalStateException unused3) {
                    return this.f30834c;
                } catch (SecurityException unused4) {
                    return this.f30834c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f30832a;
    }

    private C5294b2(String str, Object obj, Object obj2, Z1 z12) {
        this.f30835d = new Object();
        this.f30836e = null;
        this.f30837f = null;
        this.f30832a = str;
        this.f30834c = obj;
        this.f30833b = z12;
    }
}
