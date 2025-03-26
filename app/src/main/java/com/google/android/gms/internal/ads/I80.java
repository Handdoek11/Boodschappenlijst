package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class I80 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15874a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15875b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f15876c;

    /* renamed from: d, reason: collision with root package name */
    private final List f15877d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f15878e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ K80 f15879f;

    private I80(K80 k80, Object obj, String str, com.google.common.util.concurrent.d dVar, List list, com.google.common.util.concurrent.d dVar2) {
        this.f15879f = k80;
        this.f15874a = obj;
        this.f15875b = str;
        this.f15876c = dVar;
        this.f15877d = list;
        this.f15878e = dVar2;
    }

    public final C4551x80 a() {
        Object obj = this.f15874a;
        String str = this.f15875b;
        if (str == null) {
            str = this.f15879f.f(obj);
        }
        final C4551x80 c4551x80 = new C4551x80(obj, str, this.f15878e);
        this.f15879f.f16527c.t0(c4551x80);
        com.google.common.util.concurrent.d dVar = this.f15876c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.G80
            @Override // java.lang.Runnable
            public final void run() {
                this.f15312o.f15879f.f16527c.b0(c4551x80);
            }
        };
        InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16650g;
        dVar.f(runnable, interfaceExecutorServiceC3522nk0);
        AbstractC2326ck0.r(c4551x80, new H80(this, c4551x80), interfaceExecutorServiceC3522nk0);
        return c4551x80;
    }

    public final I80 b(Object obj) {
        return this.f15879f.b(obj, a());
    }

    public final I80 c(Class cls, InterfaceC1420Ij0 interfaceC1420Ij0) {
        return new I80(this.f15879f, this.f15874a, this.f15875b, this.f15876c, this.f15877d, AbstractC2326ck0.f(this.f15878e, cls, interfaceC1420Ij0, this.f15879f.f16525a));
    }

    public final I80 d(final com.google.common.util.concurrent.d dVar) {
        return g(new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.F80
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return dVar;
            }
        }, AbstractC1497Kq.f16650g);
    }

    public final I80 e(final InterfaceC4333v80 interfaceC4333v80) {
        return f(new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.D80
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return AbstractC2326ck0.h(interfaceC4333v80.a(obj));
            }
        });
    }

    public final I80 f(InterfaceC1420Ij0 interfaceC1420Ij0) {
        return g(interfaceC1420Ij0, this.f15879f.f16525a);
    }

    public final I80 g(InterfaceC1420Ij0 interfaceC1420Ij0, Executor executor) {
        return new I80(this.f15879f, this.f15874a, this.f15875b, this.f15876c, this.f15877d, AbstractC2326ck0.n(this.f15878e, interfaceC1420Ij0, executor));
    }

    public final I80 h(String str) {
        return new I80(this.f15879f, this.f15874a, str, this.f15876c, this.f15877d, this.f15878e);
    }

    public final I80 i(long j8, TimeUnit timeUnit) {
        return new I80(this.f15879f, this.f15874a, this.f15875b, this.f15876c, this.f15877d, AbstractC2326ck0.o(this.f15878e, j8, timeUnit, this.f15879f.f16526b));
    }
}
