package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class C1 {

    /* renamed from: a, reason: collision with root package name */
    protected final Y0 f14063a;

    protected C1(Y0 y02) {
        this.f14063a = y02;
    }

    protected abstract boolean a(UQ uq);

    protected abstract boolean b(UQ uq, long j8);

    public final boolean c(UQ uq, long j8) {
        return a(uq) && b(uq, j8);
    }
}
