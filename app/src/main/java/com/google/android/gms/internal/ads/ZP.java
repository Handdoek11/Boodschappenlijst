package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ZP {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f20473a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f20474b;

    /* renamed from: c, reason: collision with root package name */
    private final IQ f20475c;

    /* renamed from: d, reason: collision with root package name */
    private final Xx0 f20476d;

    public ZP(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk02, IQ iq, Xx0 xx0) {
        this.f20473a = interfaceExecutorServiceC3522nk0;
        this.f20474b = interfaceExecutorServiceC3522nk02;
        this.f20475c = iq;
        this.f20476d = xx0;
    }

    final /* synthetic */ C2296cR a(C4618xo c4618xo) {
        return (C2296cR) this.f20475c.c(c4618xo).get(((Integer) D2.A.c().a(AbstractC3184kf.f24055y5)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.d b(final C4618xo c4618xo, int i8, zzdyh zzdyhVar) {
        Bundle bundle;
        if (c4618xo != null && (bundle = c4618xo.f27914D) != null) {
            bundle.putBoolean("ls", true);
        }
        return AbstractC2326ck0.n(((GR) this.f20476d.zzb()).u7(c4618xo, i8), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.VP
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return AbstractC2326ck0.h(new C2296cR((InputStream) obj, c4618xo));
            }
        }, this.f20474b);
    }

    public final com.google.common.util.concurrent.d c(final C4618xo c4618xo) {
        String str = c4618xo.f27919u;
        C2.v.t();
        com.google.common.util.concurrent.d g8 = G2.D0.d(str) ? AbstractC2326ck0.g(new zzdyh(1)) : AbstractC2326ck0.f(this.f20473a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.WP
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19784o.a(c4618xo);
            }
        }), ExecutionException.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.XP
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                Throwable th = (ExecutionException) obj;
                if (th.getCause() != null) {
                    th = th.getCause();
                }
                return AbstractC2326ck0.g(th);
            }
        }, this.f20474b);
        final int callingUid = Binder.getCallingUid();
        return AbstractC2326ck0.f(g8, zzdyh.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.YP
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f20251a.b(c4618xo, callingUid, (zzdyh) obj);
            }
        }, this.f20474b);
    }
}
