package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Uk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1840Uk {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19436a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f19437b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private C2544el f19438c;

    /* renamed from: d, reason: collision with root package name */
    private C2544el f19439d;

    private static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final C2544el a(Context context, H2.a aVar, RunnableC3791q90 runnableC3791q90) {
        C2544el c2544el;
        synchronized (this.f19436a) {
            try {
                if (this.f19438c == null) {
                    this.f19438c = new C2544el(c(context), aVar, (String) D2.A.c().a(AbstractC3184kf.f23838a), runnableC3791q90);
                }
                c2544el = this.f19438c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2544el;
    }

    public final C2544el b(Context context, H2.a aVar, RunnableC3791q90 runnableC3791q90) {
        C2544el c2544el;
        synchronized (this.f19437b) {
            try {
                if (this.f19439d == null) {
                    this.f19439d = new C2544el(c(context), aVar, (String) AbstractC4384vg.f27320a.e(), runnableC3791q90);
                }
                c2544el = this.f19439d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2544el;
    }
}
