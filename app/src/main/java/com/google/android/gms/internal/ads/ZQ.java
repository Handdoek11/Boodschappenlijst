package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class ZQ implements InterfaceC2188bR {

    /* renamed from: a, reason: collision with root package name */
    private final Map f20477a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f20478b;

    /* renamed from: c, reason: collision with root package name */
    private final HD f20479c;

    public ZQ(Map map, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, HD hd) {
        this.f20477a = map;
        this.f20478b = interfaceExecutorServiceC3522nk0;
        this.f20479c = hd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2188bR
    public final com.google.common.util.concurrent.d a(final C4618xo c4618xo) {
        this.f20479c.Q(c4618xo);
        com.google.common.util.concurrent.d g8 = AbstractC2326ck0.g(new zzdvy(3));
        for (String str : ((String) D2.A.c().a(AbstractC3184kf.d8)).split(",")) {
            final InterfaceC4203ty0 interfaceC4203ty0 = (InterfaceC4203ty0) this.f20477a.get(str.trim());
            if (interfaceC4203ty0 != null) {
                g8 = AbstractC2326ck0.f(g8, zzdvy.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.XQ
                    @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                    public final com.google.common.util.concurrent.d a(Object obj) {
                        return ((InterfaceC2188bR) interfaceC4203ty0.zzb()).a(c4618xo);
                    }
                }, this.f20478b);
            }
        }
        AbstractC2326ck0.r(g8, new YQ(this), AbstractC1497Kq.f16650g);
        return g8;
    }
}
