package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.yQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4689yQ implements InterfaceC2188bR {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f28111h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    private final ZP f28112a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f28113b;

    /* renamed from: c, reason: collision with root package name */
    private final L60 f28114c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f28115d;

    /* renamed from: e, reason: collision with root package name */
    private final C2514eS f28116e;

    /* renamed from: f, reason: collision with root package name */
    private final RunnableC3464n90 f28117f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f28118g;

    C4689yQ(Context context, L60 l60, ZP zp, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, ScheduledExecutorService scheduledExecutorService, C2514eS c2514eS, RunnableC3464n90 runnableC3464n90) {
        this.f28118g = context;
        this.f28114c = l60;
        this.f28112a = zp;
        this.f28113b = interfaceExecutorServiceC3522nk0;
        this.f28115d = scheduledExecutorService;
        this.f28116e = c2514eS;
        this.f28117f = runnableC3464n90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2188bR
    public final com.google.common.util.concurrent.d a(C4618xo c4618xo) {
        Context context = this.f28118g;
        com.google.common.util.concurrent.d c8 = this.f28112a.c(c4618xo);
        InterfaceC2160b90 a8 = AbstractC2051a90.a(context, 11);
        AbstractC3355m90.d(c8, a8);
        com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(c8, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.vQ
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f27254a.c((C2296cR) obj);
            }
        }, this.f28113b);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f24047x5)).booleanValue()) {
            n8 = AbstractC2326ck0.f(AbstractC2326ck0.o(n8, ((Integer) D2.A.c().a(AbstractC3184kf.f24055y5)).intValue(), TimeUnit.SECONDS, this.f28115d), TimeoutException.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.wQ
                @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                public final com.google.common.util.concurrent.d a(Object obj) {
                    return AbstractC2326ck0.g(new zzdvy(5));
                }
            }, AbstractC1497Kq.f16650g);
        }
        AbstractC3355m90.a(n8, this.f28117f, a8);
        AbstractC2326ck0.r(n8, new C4580xQ(this), AbstractC1497Kq.f16650g);
        return n8;
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(C2296cR c2296cR) {
        return AbstractC2326ck0.h(new C60(new C4656y60(this.f28114c), A60.a(new InputStreamReader(c2296cR.b()), c2296cR.a())));
    }
}
