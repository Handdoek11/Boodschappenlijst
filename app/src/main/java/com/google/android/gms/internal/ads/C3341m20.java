package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.m20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3341m20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24420a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f24421b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f24422c;

    /* renamed from: d, reason: collision with root package name */
    private final RunnableC3464n90 f24423d;

    /* renamed from: e, reason: collision with root package name */
    private final HN f24424e;

    /* renamed from: f, reason: collision with root package name */
    private long f24425f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f24426g = 0;

    public C3341m20(Context context, Executor executor, Set set, RunnableC3464n90 runnableC3464n90, HN hn) {
        this.f24420a = context;
        this.f24422c = executor;
        this.f24421b = set;
        this.f24423d = runnableC3464n90;
        this.f24424e = hn;
    }

    public final com.google.common.util.concurrent.d a(final Object obj, final Bundle bundle, final boolean z7) {
        InterfaceC2160b90 a8 = AbstractC2051a90.a(this.f24420a, 8);
        a8.f();
        final ArrayList arrayList = new ArrayList(this.f24421b.size());
        List arrayList2 = new ArrayList();
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.Db;
        if (!((String) D2.A.c().a(abstractC2207bf)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) D2.A.c().a(abstractC2207bf)).split(","));
        }
        List list = arrayList2;
        this.f24425f = C2.v.c().b();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue() && bundle != null) {
            long a9 = C2.v.c().a();
            if (obj instanceof KB) {
                bundle.putLong(EnumC3706pN.CLIENT_SIGNALS_START.a(), a9);
            } else {
                bundle.putLong(EnumC3706pN.GMS_SIGNALS_START.a(), a9);
            }
        }
        for (final InterfaceC3014j20 interfaceC3014j20 : this.f24421b) {
            if (!list.contains(String.valueOf(interfaceC3014j20.zza()))) {
                final long b8 = C2.v.c().b();
                com.google.common.util.concurrent.d zzb = interfaceC3014j20.zzb();
                zzb.f(new Runnable() { // from class: com.google.android.gms.internal.ads.k20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23493o.b(b8, interfaceC3014j20, bundle2);
                    }
                }, AbstractC1497Kq.f16650g);
                arrayList.add(zzb);
            }
        }
        com.google.common.util.concurrent.d a10 = AbstractC2326ck0.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.l20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC2907i20 interfaceC2907i20 = (InterfaceC2907i20) ((com.google.common.util.concurrent.d) it.next()).get();
                    if (interfaceC2907i20 != null) {
                        boolean z8 = z7;
                        interfaceC2907i20.c(obj2);
                        if (z8) {
                            interfaceC2907i20.a(obj2);
                        }
                    }
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long a11 = C2.v.c().a();
                    if (obj2 instanceof KB) {
                        bundle3.putLong(EnumC3706pN.CLIENT_SIGNALS_END.a(), a11);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(EnumC3706pN.GMS_SIGNALS_END.a(), a11);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.f24422c);
        if (RunnableC3791q90.a()) {
            AbstractC3355m90.a(a10, this.f24423d, a8);
        }
        return a10;
    }

    public final void b(long j8, InterfaceC3014j20 interfaceC3014j20, Bundle bundle) {
        long b8 = C2.v.c().b() - j8;
        if (((Boolean) AbstractC3513ng.f25025a.e()).booleanValue()) {
            AbstractC0608p0.k("Signal runtime (ms) : " + AbstractC3187kg0.c(interfaceC3014j20.getClass().getCanonicalName()) + " = " + b8);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23967o2)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + interfaceC3014j20.zza(), b8);
                }
            }
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23913i2)).booleanValue()) {
            GN a8 = this.f24424e.a();
            a8.b("action", "lat_ms");
            a8.b("lat_grp", "sig_lat_grp");
            a8.b("lat_id", String.valueOf(interfaceC3014j20.zza()));
            a8.b("clat_ms", String.valueOf(b8));
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23922j2)).booleanValue()) {
                synchronized (this) {
                    this.f24426g++;
                }
                a8.b("seq_num", C2.v.s().i().c());
                synchronized (this) {
                    try {
                        if (this.f24426g == this.f24421b.size() && this.f24425f != 0) {
                            this.f24426g = 0;
                            String valueOf = String.valueOf(C2.v.c().b() - this.f24425f);
                            if (interfaceC3014j20.zza() <= 39 || interfaceC3014j20.zza() >= 52) {
                                a8.b("lat_clsg", valueOf);
                            } else {
                                a8.b("lat_gmssg", valueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            a8.h();
        }
    }
}
