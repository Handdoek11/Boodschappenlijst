package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.rs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3972rs extends G2.B {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC1567Mr f26226c;

    /* renamed from: d, reason: collision with root package name */
    final AbstractC1141As f26227d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26228e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f26229f;

    C3972rs(InterfaceC1567Mr interfaceC1567Mr, AbstractC1141As abstractC1141As, String str, String[] strArr) {
        this.f26226c = interfaceC1567Mr;
        this.f26227d = abstractC1141As;
        this.f26228e = str;
        this.f26229f = strArr;
        C2.v.C().c(this);
    }

    @Override // G2.B
    public final void a() {
        try {
            this.f26227d.r(this.f26228e, this.f26229f);
        } finally {
            G2.D0.f2566l.post(new RunnableC3864qs(this));
        }
    }

    @Override // G2.B
    public final com.google.common.util.concurrent.d b() {
        return (((Boolean) D2.A.c().a(AbstractC3184kf.f23877e2)).booleanValue() && (this.f26227d instanceof C1464Js)) ? AbstractC1497Kq.f16649f.p0(new Callable() { // from class: com.google.android.gms.internal.ads.ps
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25530o.d();
            }
        }) : super.b();
    }

    final /* synthetic */ Boolean d() {
        return Boolean.valueOf(this.f26227d.s(this.f26228e, this.f26229f, this));
    }

    public final String e() {
        return this.f26228e;
    }
}
