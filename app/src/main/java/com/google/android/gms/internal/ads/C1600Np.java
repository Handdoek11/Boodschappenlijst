package com.google.android.gms.internal.ads;

import android.content.Context;
import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.internal.ads.Np, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1600Np {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5781e f17632a;

    /* renamed from: b, reason: collision with root package name */
    private final C1531Lp f17633b;

    C1600Np(InterfaceC5781e interfaceC5781e, C1531Lp c1531Lp) {
        this.f17632a = interfaceC5781e;
        this.f17633b = c1531Lp;
    }

    public static C1600Np a(Context context) {
        return AbstractC1985Yp.d(context).b();
    }

    public final void b(int i8, long j8) {
        this.f17633b.a(i8, j8);
    }

    public final void c(D2.K1 k12) {
        this.f17633b.a(-1, this.f17632a.a());
    }

    public final void d() {
        this.f17633b.a(-1, this.f17632a.a());
    }
}
