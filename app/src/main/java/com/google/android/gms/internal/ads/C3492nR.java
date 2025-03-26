package com.google.android.gms.internal.ads;

import android.os.Binder;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.nR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3492nR {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f24955a;

    /* renamed from: b, reason: collision with root package name */
    private final SQ f24956b;

    /* renamed from: c, reason: collision with root package name */
    private final Xx0 f24957c;

    public C3492nR(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, SQ sq, Xx0 xx0) {
        this.f24955a = interfaceExecutorServiceC3522nk0;
        this.f24956b = sq;
        this.f24957c = xx0;
    }

    private final com.google.common.util.concurrent.d g(final C4618xo c4618xo, InterfaceC3383mR interfaceC3383mR, final InterfaceC3383mR interfaceC3383mR2, final InterfaceC1420Ij0 interfaceC1420Ij0) {
        String str = c4618xo.f27919u;
        C2.v.t();
        return (Sj0) AbstractC2326ck0.f((Sj0) AbstractC2326ck0.n((Sj0) AbstractC2326ck0.n(Sj0.D(G2.D0.d(str) ? AbstractC2326ck0.g(new zzdyh(1)) : AbstractC2326ck0.f(interfaceC3383mR.a(c4618xo), ExecutionException.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.lR
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                Throwable th = (ExecutionException) obj;
                if (th.getCause() != null) {
                    th = th.getCause();
                }
                return AbstractC2326ck0.g(th);
            }
        }, this.f24955a)), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.jR
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return AbstractC2326ck0.h(((C2296cR) obj).b());
            }
        }, this.f24955a), interfaceC1420Ij0, this.f24955a), zzdyh.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.kR
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f23589a.b(interfaceC3383mR2, c4618xo, interfaceC1420Ij0, (zzdyh) obj);
            }
        }, this.f24955a);
    }

    public final com.google.common.util.concurrent.d a(final C4618xo c4618xo) {
        InterfaceC1420Ij0 interfaceC1420Ij0 = new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.gR
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                String str = new String(AbstractC1489Ki0.b((InputStream) obj), StandardCharsets.UTF_8);
                C4618xo c4618xo2 = c4618xo;
                c4618xo2.f27911A = str;
                return AbstractC2326ck0.h(c4618xo2);
            }
        };
        final SQ sq = this.f24956b;
        Objects.requireNonNull(sq);
        return g(c4618xo, new InterfaceC3383mR() { // from class: com.google.android.gms.internal.ads.hR
            @Override // com.google.android.gms.internal.ads.InterfaceC3383mR
            public final com.google.common.util.concurrent.d a(C4618xo c4618xo2) {
                return sq.c(c4618xo2);
            }
        }, new InterfaceC3383mR() { // from class: com.google.android.gms.internal.ads.iR
            @Override // com.google.android.gms.internal.ads.InterfaceC3383mR
            public final com.google.common.util.concurrent.d a(C4618xo c4618xo2) {
                return this.f22974a.c(c4618xo2);
            }
        }, interfaceC1420Ij0);
    }

    final /* synthetic */ com.google.common.util.concurrent.d b(InterfaceC3383mR interfaceC3383mR, C4618xo c4618xo, InterfaceC1420Ij0 interfaceC1420Ij0, zzdyh zzdyhVar) {
        return AbstractC2326ck0.n(interfaceC3383mR.a(c4618xo), interfaceC1420Ij0, this.f24955a);
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(C4618xo c4618xo) {
        return ((GR) this.f24957c.zzb()).t7(c4618xo, Binder.getCallingUid());
    }

    final /* synthetic */ com.google.common.util.concurrent.d d(C4618xo c4618xo) {
        return this.f24956b.d(c4618xo.f27923y);
    }

    final /* synthetic */ com.google.common.util.concurrent.d e(C4618xo c4618xo) {
        return ((GR) this.f24957c.zzb()).w7(c4618xo.f27923y);
    }

    public final com.google.common.util.concurrent.d f(C4618xo c4618xo) {
        return g(c4618xo, new InterfaceC3383mR() { // from class: com.google.android.gms.internal.ads.eR
            @Override // com.google.android.gms.internal.ads.InterfaceC3383mR
            public final com.google.common.util.concurrent.d a(C4618xo c4618xo2) {
                return this.f21811a.d(c4618xo2);
            }
        }, new InterfaceC3383mR() { // from class: com.google.android.gms.internal.ads.fR
            @Override // com.google.android.gms.internal.ads.InterfaceC3383mR
            public final com.google.common.util.concurrent.d a(C4618xo c4618xo2) {
                return this.f22038a.e(c4618xo2);
            }
        }, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.dR
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return AbstractC2326ck0.h(null);
            }
        });
    }
}
