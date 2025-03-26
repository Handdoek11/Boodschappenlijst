package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1401Ia implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final C3610oa f15966o;

    /* renamed from: s, reason: collision with root package name */
    private final C2918i8 f15967s;

    public CallableC1401Ia(C3610oa c3610oa, C2918i8 c2918i8) {
        this.f15966o = c3610oa;
        this.f15967s = c2918i8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.f15966o.l() != null) {
            this.f15966o.l().get();
        }
        E8 c8 = this.f15966o.c();
        if (c8 == null) {
            return null;
        }
        try {
            synchronized (this.f15967s) {
                this.f15967s.i(c8.m(), Eu0.a());
            }
            return null;
        } catch (zzgyg | NullPointerException unused) {
            return null;
        }
    }
}
