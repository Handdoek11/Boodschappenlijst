package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ee0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2531ee0 {

    /* renamed from: b, reason: collision with root package name */
    private static C2531ee0 f21856b;

    /* renamed from: a, reason: collision with root package name */
    final C2640fe0 f21857a;

    private C2531ee0(Context context) {
        this.f21857a = C2640fe0.b(context);
    }

    public static final C2531ee0 a(Context context) {
        C2531ee0 c2531ee0;
        synchronized (C2531ee0.class) {
            try {
                if (f21856b == null) {
                    f21856b = new C2531ee0(context);
                }
                c2531ee0 = f21856b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2531ee0;
    }

    public final void b(boolean z7) {
        synchronized (C2531ee0.class) {
            this.f21857a.d("paidv2_user_option", Boolean.valueOf(z7));
        }
    }

    public final void c(boolean z7) {
        synchronized (C2531ee0.class) {
            try {
                this.f21857a.d("paidv2_publisher_option", Boolean.valueOf(z7));
                if (!z7) {
                    this.f21857a.e("paidv2_creation_time");
                    this.f21857a.e("paidv2_id");
                    this.f21857a.e("vendor_scoped_gpid_v2_id");
                    this.f21857a.e("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean f8;
        synchronized (C2531ee0.class) {
            f8 = this.f21857a.f("paidv2_publisher_option", true);
        }
        return f8;
    }

    public final boolean e() {
        boolean f8;
        synchronized (C2531ee0.class) {
            f8 = this.f21857a.f("paidv2_user_option", true);
        }
        return f8;
    }
}
