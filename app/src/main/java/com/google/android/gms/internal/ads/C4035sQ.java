package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.sQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4035sQ {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f26655a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f26656b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f26657c;

    /* renamed from: d, reason: collision with root package name */
    private final OQ f26658d;

    /* renamed from: e, reason: collision with root package name */
    private final Xx0 f26659e;

    public C4035sQ(ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk02, OQ oq, Xx0 xx0) {
        this.f26655a = scheduledExecutorService;
        this.f26656b = interfaceExecutorServiceC3522nk0;
        this.f26657c = interfaceExecutorServiceC3522nk02;
        this.f26658d = oq;
        this.f26659e = xx0;
    }

    final /* synthetic */ C2296cR a(C4618xo c4618xo) {
        return (C2296cR) this.f26658d.c(c4618xo).get(((Integer) D2.A.c().a(AbstractC3184kf.f24055y5)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.d b(final C4618xo c4618xo, int i8, Throwable th) {
        Bundle bundle;
        if (c4618xo != null && (bundle = c4618xo.f27914D) != null) {
            bundle.putBoolean("ls", true);
        }
        return AbstractC2326ck0.n(((GR) this.f26659e.zzb()).v7(c4618xo, i8), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.pQ
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return AbstractC2326ck0.h(new C2296cR((InputStream) obj, c4618xo));
            }
        }, this.f26656b);
    }

    public final com.google.common.util.concurrent.d c(final C4618xo c4618xo) {
        com.google.common.util.concurrent.d p02;
        String str = c4618xo.f27919u;
        C2.v.t();
        if (G2.D0.d(str)) {
            p02 = AbstractC2326ck0.g(new zzdyh(1));
        } else {
            p02 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23963n7)).booleanValue() ? this.f26657c.p0(new Callable() { // from class: com.google.android.gms.internal.ads.qQ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f25919o.a(c4618xo);
                }
            }) : this.f26658d.c(c4618xo);
        }
        final int callingUid = Binder.getCallingUid();
        return (Sj0) AbstractC2326ck0.f((Sj0) AbstractC2326ck0.o(Sj0.D(p02), ((Integer) D2.A.c().a(AbstractC3184kf.f24055y5)).intValue(), TimeUnit.SECONDS, this.f26655a), Throwable.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.rQ
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f26168a.b(c4618xo, callingUid, (Throwable) obj);
            }
        }, this.f26656b);
    }
}
