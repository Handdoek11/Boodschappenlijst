package com.google.android.gms.internal.ads;

import A3.AbstractC0376j;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.p70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3678p70 {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC0376j f25352a;

    /* renamed from: b, reason: collision with root package name */
    public static S2.b f25353b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f25354c = new Object();

    public static AbstractC0376j a(Context context) {
        AbstractC0376j abstractC0376j;
        b(context, false);
        synchronized (f25354c) {
            abstractC0376j = f25352a;
        }
        return abstractC0376j;
    }

    public static void b(Context context, boolean z7) {
        synchronized (f25354c) {
            try {
                if (f25353b == null) {
                    f25353b = S2.a.a(context);
                }
                AbstractC0376j abstractC0376j = f25352a;
                if (abstractC0376j == null || ((abstractC0376j.r() && !f25352a.s()) || (z7 && f25352a.r()))) {
                    f25352a = ((S2.b) Z2.r.m(f25353b, "the appSetIdClient shouldn't be null")).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
