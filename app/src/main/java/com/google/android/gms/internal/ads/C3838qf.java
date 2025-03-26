package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3838qf {
    public static final void a(C3729pf c3729pf, C3511nf c3511nf) {
        if (c3511nf.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(c3511nf.b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        c3729pf.d(c3511nf.a(), c3511nf.b(), c3511nf.c(), c3511nf.d());
    }
}
