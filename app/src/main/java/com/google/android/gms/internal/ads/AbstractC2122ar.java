package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2122ar {

    /* renamed from: a, reason: collision with root package name */
    private final C1811Tq f20764a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f20765b;

    public AbstractC2122ar() {
        C1811Tq c1811Tq = new C1811Tq();
        this.f20764a = c1811Tq;
        this.f20765b = new AtomicInteger(0);
        AbstractC2326ck0.r(c1811Tq, new C1986Yq(this), AbstractC1497Kq.f16650g);
    }

    public final int a() {
        return this.f20765b.get();
    }

    public final void c() {
        this.f20764a.d(new Exception());
    }

    public final void d(Throwable th, String str) {
        this.f20764a.d(th);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.B7)).booleanValue()) {
            C2.v.s().w(th, str);
        }
    }

    public final void e(Object obj) {
        this.f20764a.c(obj);
    }

    public final void f(InterfaceC1951Xq interfaceC1951Xq, InterfaceC1881Vq interfaceC1881Vq) {
        AbstractC2326ck0.r(this.f20764a, new C2021Zq(this, interfaceC1951Xq, interfaceC1881Vq), AbstractC1497Kq.f16650g);
    }
}
