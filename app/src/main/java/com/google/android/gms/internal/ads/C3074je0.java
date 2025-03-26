package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.je0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3074je0 {

    /* renamed from: b, reason: collision with root package name */
    private static C3074je0 f23291b;

    /* renamed from: a, reason: collision with root package name */
    final C2640fe0 f23292a;

    private C3074je0(Context context) {
        this.f23292a = C2640fe0.b(context);
        C2531ee0.a(context);
    }

    public static final C3074je0 a(Context context) {
        C3074je0 c3074je0;
        synchronized (C3074je0.class) {
            try {
                if (f23291b == null) {
                    f23291b = new C3074je0(context);
                }
                c3074je0 = f23291b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3074je0;
    }

    public final void b(C2423de0 c2423de0) {
        synchronized (C3074je0.class) {
            this.f23292a.e("vendor_scoped_gpid_v2_id");
            this.f23292a.e("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
