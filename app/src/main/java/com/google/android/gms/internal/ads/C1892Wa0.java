package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Wa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1892Wa0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19817a;

    final void a(Context context) {
        AbstractC1789Tb0.c(context, "Application Context cannot be null");
        if (this.f19817a) {
            return;
        }
        this.f19817a = true;
        C1116Ab0.c().d(context);
        C3939rb0.i().d(context);
        AbstractC1614Ob0.b(context);
        AbstractC1649Pb0.d(context);
        AbstractC1754Sb0.a(context);
        C4593xb0.b().c(context);
        C3831qb0.b().d(context);
        C1188Cb0.a().e(context);
    }

    final boolean b() {
        return this.f19817a;
    }
}
