package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class L2 {

    /* renamed from: a, reason: collision with root package name */
    private static K2 f28936a;

    public static synchronized K2 a() {
        K2 k22;
        synchronized (L2.class) {
            try {
                if (f28936a == null) {
                    b(new N2());
                }
                k22 = f28936a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k22;
    }

    private static synchronized void b(K2 k22) {
        synchronized (L2.class) {
            if (f28936a != null) {
                throw new IllegalStateException("init() already called");
            }
            f28936a = k22;
        }
    }
}
