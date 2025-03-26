package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ie0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2967ie0 extends AbstractC2749ge0 {

    /* renamed from: i, reason: collision with root package name */
    private static C2967ie0 f23011i;

    private C2967ie0(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final C2967ie0 j(Context context) {
        C2967ie0 c2967ie0;
        synchronized (C2967ie0.class) {
            try {
                if (f23011i == null) {
                    f23011i = new C2967ie0(context);
                }
                c2967ie0 = f23011i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2967ie0;
    }

    public final C2423de0 i(long j8, boolean z7) {
        synchronized (C2967ie0.class) {
            try {
                if (this.f22411g.d()) {
                    return b(null, null, j8, z7);
                }
                return new C2423de0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (C2967ie0.class) {
            try {
                if (g(false)) {
                    f(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
