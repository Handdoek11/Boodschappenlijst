package com.google.android.gms.internal.ads;

import A3.AbstractC0376j;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class RY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    final C1175Bq f18662a;

    /* renamed from: b, reason: collision with root package name */
    S2.b f18663b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f18664c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f18665d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f18666e;

    RY(Context context, C1175Bq c1175Bq, ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23851b3)).booleanValue()) {
            this.f18663b = S2.a.a(context);
        }
        this.f18666e = context;
        this.f18662a = c1175Bq;
        this.f18664c = scheduledExecutorService;
        this.f18665d = interfaceExecutorServiceC3522nk0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23817X2)).booleanValue()) {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23860c3)).booleanValue()) {
                if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23825Y2)).booleanValue()) {
                    return AbstractC2326ck0.m(AbstractC3401me0.a(this.f18663b.a(), null), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.OY
                        @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                        public final Object apply(Object obj) {
                            S2.c cVar = (S2.c) obj;
                            return new SY(cVar.a(), cVar.b());
                        }
                    }, AbstractC1497Kq.f16650g);
                }
                AbstractC0376j a8 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23851b3)).booleanValue() ? AbstractC3678p70.a(this.f18666e) : this.f18663b.a();
                if (a8 == null) {
                    return AbstractC2326ck0.h(new SY(null, -1));
                }
                com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(AbstractC3401me0.a(a8, null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.PY
                    @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                    public final com.google.common.util.concurrent.d a(Object obj) {
                        S2.c cVar = (S2.c) obj;
                        return cVar == null ? AbstractC2326ck0.h(new SY(null, -1)) : AbstractC2326ck0.h(new SY(cVar.a(), cVar.b()));
                    }
                }, AbstractC1497Kq.f16650g);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23833Z2)).booleanValue()) {
                    n8 = AbstractC2326ck0.o(n8, ((Long) D2.A.c().a(AbstractC3184kf.f23842a3)).longValue(), TimeUnit.MILLISECONDS, this.f18664c);
                }
                return AbstractC2326ck0.e(n8, Exception.class, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.QY
                    @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                    public final Object apply(Object obj) {
                        this.f18489a.f18662a.x((Exception) obj, "AppSetIdInfoSignal");
                        return new SY(null, -1);
                    }
                }, this.f18665d);
            }
        }
        return AbstractC2326ck0.h(new SY(null, -1));
    }
}
