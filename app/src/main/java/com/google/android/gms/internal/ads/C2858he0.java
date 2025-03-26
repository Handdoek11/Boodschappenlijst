package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.he0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2858he0 extends AbstractC2749ge0 {

    /* renamed from: i, reason: collision with root package name */
    private static C2858he0 f22591i;

    private C2858he0(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final C2858he0 k(Context context) {
        C2858he0 c2858he0;
        synchronized (C2858he0.class) {
            try {
                if (f22591i == null) {
                    f22591i = new C2858he0(context);
                }
                c2858he0 = f22591i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2858he0;
    }

    public final C2423de0 i(long j8, boolean z7) {
        C2423de0 b8;
        synchronized (C2858he0.class) {
            b8 = b(null, null, j8, z7);
        }
        return b8;
    }

    public final C2423de0 j(String str, String str2, long j8, boolean z7) {
        C2423de0 b8;
        synchronized (C2858he0.class) {
            b8 = b(str, str2, j8, z7);
        }
        return b8;
    }

    public final void l() {
        synchronized (C2858he0.class) {
            f(false);
        }
    }

    public final void m() {
        synchronized (C2858he0.class) {
            f(true);
        }
    }
}
