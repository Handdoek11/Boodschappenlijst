package com.google.android.gms.internal.ads;

import D2.C0555y;
import G2.AbstractC0608p0;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class GR extends AbstractBinderC3093jo {

    /* renamed from: o, reason: collision with root package name */
    private final Context f15376o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f15377s;

    /* renamed from: t, reason: collision with root package name */
    private final PR f15378t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC1181Bw f15379u;

    /* renamed from: v, reason: collision with root package name */
    private final ArrayDeque f15380v;

    /* renamed from: w, reason: collision with root package name */
    private final RunnableC3791q90 f15381w;

    /* renamed from: x, reason: collision with root package name */
    private final C1317Fo f15382x;

    public GR(Context context, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, C1317Fo c1317Fo, InterfaceC1181Bw interfaceC1181Bw, PR pr, ArrayDeque arrayDeque, MR mr, RunnableC3791q90 runnableC3791q90) {
        AbstractC3184kf.a(context);
        this.f15376o = context;
        this.f15377s = interfaceExecutorServiceC3522nk0;
        this.f15382x = c1317Fo;
        this.f15378t = pr;
        this.f15379u = interfaceC1181Bw;
        this.f15380v = arrayDeque;
        this.f15381w = runnableC3791q90;
    }

    private static com.google.common.util.concurrent.d A7(final C4618xo c4618xo, S80 s80, final O20 o20) {
        InterfaceC1420Ij0 interfaceC1420Ij0 = new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.qR
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return o20.b().a(C0555y.b().m((Bundle) obj), c4618xo.f27914D, false);
            }
        };
        return s80.b(M80.GMS_SIGNALS, AbstractC2326ck0.h(c4618xo.f27916o)).f(interfaceC1420Ij0).e(new InterfaceC4333v80() { // from class: com.google.android.gms.internal.ads.rR
            @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
            public final Object a(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                AbstractC0608p0.k("Ad request signals:");
                AbstractC0608p0.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final synchronized void B7(DR dr) {
        p();
        this.f15380v.addLast(dr);
    }

    private final void C7(com.google.common.util.concurrent.d dVar, InterfaceC3747po interfaceC3747po, C4618xo c4618xo) {
        AbstractC2326ck0.r(AbstractC2326ck0.n(dVar, new InterfaceC1420Ij0(this) { // from class: com.google.android.gms.internal.ads.yR
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.l70
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    f3.k.b(inputStream2, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                } finally {
                                }
                            } catch (IOException unused) {
                            }
                        } finally {
                        }
                    }
                });
                return AbstractC2326ck0.h(parcelFileDescriptor);
            }
        }, AbstractC1497Kq.f16644a), new CR(this, c4618xo, interfaceC3747po), AbstractC1497Kq.f16650g);
    }

    private final synchronized void p() {
        int intValue = ((Long) AbstractC4057sg.f26722b.e()).intValue();
        while (this.f15380v.size() >= intValue) {
            this.f15380v.removeFirst();
        }
    }

    private final synchronized DR y7(String str) {
        Iterator it = this.f15380v.iterator();
        while (it.hasNext()) {
            DR dr = (DR) it.next();
            if (dr.f14492c.equals(str)) {
                it.remove();
                return dr;
            }
        }
        return null;
    }

    private static com.google.common.util.concurrent.d z7(com.google.common.util.concurrent.d dVar, S80 s80, C2544el c2544el, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90) {
        InterfaceC1805Tk a8 = c2544el.a("AFMA_getAdDictionary", AbstractC2219bl.f20925b, new InterfaceC1875Vk() { // from class: com.google.android.gms.internal.ads.xR
            @Override // com.google.android.gms.internal.ads.InterfaceC1875Vk
            public final Object a(JSONObject jSONObject) {
                return new C4836zo(jSONObject);
            }
        });
        AbstractC3355m90.d(dVar, interfaceC2160b90);
        C4551x80 a9 = s80.b(M80.BUILD_URL, dVar).f(a8).a();
        AbstractC3355m90.c(a9, runnableC3464n90, interfaceC2160b90);
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3202ko
    public final void N2(C2768go c2768go, C3856qo c3856qo) {
        if (((Boolean) AbstractC4820zg.f28689a.e()).booleanValue()) {
            this.f15379u.M();
            String str = c2768go.f22446o;
            AbstractC2326ck0.r(AbstractC2326ck0.h(null), new AR(this, c3856qo, c2768go), AbstractC1497Kq.f16650g);
        } else {
            try {
                c3856qo.q2("", c2768go);
            } catch (RemoteException e8) {
                AbstractC0608p0.l("Service can't call client", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3202ko
    public final void a4(C4618xo c4618xo, InterfaceC3747po interfaceC3747po) {
        Bundle bundle;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue() && (bundle = c4618xo.f27914D) != null) {
            bundle.putLong(EnumC3706pN.SERVICE_CONNECTED.a(), C2.v.c().a());
        }
        C7(v7(c4618xo, Binder.getCallingUid()), interfaceC3747po, c4618xo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3202ko
    public final void h3(C4618xo c4618xo, InterfaceC3747po interfaceC3747po) {
        Bundle bundle;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue() && (bundle = c4618xo.f27914D) != null) {
            bundle.putLong(EnumC3706pN.SERVICE_CONNECTED.a(), C2.v.c().a());
        }
        com.google.common.util.concurrent.d u7 = u7(c4618xo, Binder.getCallingUid());
        C7(u7, interfaceC3747po, c4618xo);
        if (((Boolean) AbstractC3295lg.f24365e.e()).booleanValue()) {
            PR pr = this.f15378t;
            Objects.requireNonNull(pr);
            u7.f(new RunnableC4472wR(pr), this.f15377s);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3202ko
    public final void o1(C4618xo c4618xo, InterfaceC3747po interfaceC3747po) {
        C7(t7(c4618xo, Binder.getCallingUid()), interfaceC3747po, c4618xo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3202ko
    public final void r4(String str, InterfaceC3747po interfaceC3747po) {
        C7(w7(str), interfaceC3747po, null);
    }

    public final com.google.common.util.concurrent.d t7(final C4618xo c4618xo, int i8) {
        if (!((Boolean) AbstractC4057sg.f26721a.e()).booleanValue()) {
            return AbstractC2326ck0.g(new Exception("Split request is disabled."));
        }
        G70 g70 = c4618xo.f27924z;
        if (g70 == null) {
            return AbstractC2326ck0.g(new Exception("Pool configuration missing from request."));
        }
        if (g70.f15283v == 0 || g70.f15284w == 0) {
            return AbstractC2326ck0.g(new Exception("Caching is disabled."));
        }
        C2544el b8 = C2.v.j().b(this.f15376o, H2.a.A0(), this.f15381w);
        O20 a8 = this.f15379u.a(c4618xo, i8);
        S80 c8 = a8.c();
        final com.google.common.util.concurrent.d A7 = A7(c4618xo, c8, a8);
        RunnableC3464n90 d8 = a8.d();
        final InterfaceC2160b90 a9 = AbstractC2051a90.a(this.f15376o, 9);
        final com.google.common.util.concurrent.d z7 = z7(A7, c8, b8, d8, a9);
        return c8.a(M80.GET_URL_AND_CACHE_KEY, A7, z7).a(new Callable() { // from class: com.google.android.gms.internal.ads.vR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f27255o.x7(z7, A7, c4618xo, a9);
            }
        }).a();
    }

    public final com.google.common.util.concurrent.d u7(final C4618xo c4618xo, int i8) {
        DR y7;
        C4551x80 a8;
        C2544el b8 = C2.v.j().b(this.f15376o, H2.a.A0(), this.f15381w);
        O20 a9 = this.f15379u.a(c4618xo, i8);
        InterfaceC1805Tk a10 = b8.a("google.afma.response.normalize", FR.f15158d, AbstractC2219bl.f20926c);
        if (((Boolean) AbstractC4057sg.f26721a.e()).booleanValue()) {
            y7 = y7(c4618xo.f27923y);
            if (y7 == null) {
                AbstractC0608p0.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = c4618xo.f27911A;
            y7 = null;
            if (str != null && !str.isEmpty()) {
                AbstractC0608p0.k("Request contained a PoolKey but split request is disabled.");
            }
        }
        InterfaceC2160b90 a11 = y7 == null ? AbstractC2051a90.a(this.f15376o, 9) : y7.f14493d;
        RunnableC3464n90 d8 = a9.d();
        d8.d(c4618xo.f27916o.getStringArrayList("ad_types"));
        OR or = new OR(c4618xo.f27922x, d8, a11);
        KR kr = new KR(this.f15376o, c4618xo.f27917s.f2914o, this.f15382x, i8);
        S80 c8 = a9.c();
        InterfaceC2160b90 a12 = AbstractC2051a90.a(this.f15376o, 11);
        if (y7 == null) {
            final com.google.common.util.concurrent.d A7 = A7(c4618xo, c8, a9);
            final com.google.common.util.concurrent.d z7 = z7(A7, c8, b8, d8, a11);
            InterfaceC2160b90 a13 = AbstractC2051a90.a(this.f15376o, 10);
            final C4551x80 a14 = c8.a(M80.HTTP, z7, A7).a(new Callable() { // from class: com.google.android.gms.internal.ads.sR
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C4618xo c4618xo2;
                    Bundle bundle;
                    C4836zo c4836zo = (C4836zo) z7.get();
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue() && (bundle = (c4618xo2 = c4618xo).f27914D) != null) {
                        bundle.putLong(EnumC3706pN.GET_AD_DICTIONARY_SDKCORE_START.a(), c4836zo.c());
                        c4618xo2.f27914D.putLong(EnumC3706pN.GET_AD_DICTIONARY_SDKCORE_END.a(), c4836zo.b());
                    }
                    return new NR((JSONObject) A7.get(), c4836zo);
                }
            }).e(or).e(new C2921i90(a13)).e(kr).a();
            AbstractC3355m90.a(a14, d8, a13);
            AbstractC3355m90.d(a14, a12);
            a8 = c8.a(M80.PRE_PROCESS, A7, z7, a14).a(new Callable() { // from class: com.google.android.gms.internal.ads.tR
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue() && (bundle = c4618xo.f27914D) != null) {
                        bundle.putLong(EnumC3706pN.HTTP_RESPONSE_READY.a(), C2.v.c().a());
                    }
                    return new FR((JR) a14.get(), (JSONObject) A7.get(), (C4836zo) z7.get());
                }
            }).f(a10).a();
        } else {
            NR nr = new NR(y7.f14491b, y7.f14490a);
            InterfaceC2160b90 a15 = AbstractC2051a90.a(this.f15376o, 10);
            final C4551x80 a16 = c8.b(M80.HTTP, AbstractC2326ck0.h(nr)).e(or).e(new C2921i90(a15)).e(kr).a();
            AbstractC3355m90.a(a16, d8, a15);
            final com.google.common.util.concurrent.d h8 = AbstractC2326ck0.h(y7);
            AbstractC3355m90.d(a16, a12);
            a8 = c8.a(M80.PRE_PROCESS, a16, h8).a(new Callable() { // from class: com.google.android.gms.internal.ads.pR
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    JR jr = (JR) a16.get();
                    com.google.common.util.concurrent.d dVar = h8;
                    return new FR(jr, ((DR) dVar.get()).f14491b, ((DR) dVar.get()).f14490a);
                }
            }).f(a10).a();
        }
        AbstractC3355m90.a(a8, d8, a12);
        return a8;
    }

    public final com.google.common.util.concurrent.d v7(final C4618xo c4618xo, int i8) {
        C2544el b8 = C2.v.j().b(this.f15376o, H2.a.A0(), this.f15381w);
        if (!((Boolean) AbstractC4602xg.f27896a.e()).booleanValue()) {
            return AbstractC2326ck0.g(new Exception("Signal collection disabled."));
        }
        O20 a8 = this.f15379u.a(c4618xo, i8);
        final C3341m20 a9 = a8.a();
        InterfaceC1805Tk a10 = b8.a("google.afma.request.getSignals", AbstractC2219bl.f20925b, AbstractC2219bl.f20926c);
        InterfaceC2160b90 a11 = AbstractC2051a90.a(this.f15376o, 22);
        C4551x80 a12 = a8.c().b(M80.GET_SIGNALS, AbstractC2326ck0.h(c4618xo.f27916o)).e(new C2921i90(a11)).f(new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.zR
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return a9.a(C0555y.b().m((Bundle) obj), c4618xo.f27914D, false);
            }
        }).b(M80.JS_SIGNALS).f(a10).a();
        RunnableC3464n90 d8 = a8.d();
        d8.d(c4618xo.f27916o.getStringArrayList("ad_types"));
        d8.f(c4618xo.f27916o.getBundle("extras"));
        AbstractC3355m90.b(a12, d8, a11);
        if (((Boolean) AbstractC3295lg.f24366f.e()).booleanValue()) {
            PR pr = this.f15378t;
            Objects.requireNonNull(pr);
            a12.f(new RunnableC4472wR(pr), this.f15377s);
        }
        return a12;
    }

    public final com.google.common.util.concurrent.d w7(String str) {
        if (((Boolean) AbstractC4057sg.f26721a.e()).booleanValue()) {
            return y7(str) == null ? AbstractC2326ck0.g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : AbstractC2326ck0.h(new BR(this));
        }
        return AbstractC2326ck0.g(new Exception("Split request is disabled."));
    }

    final /* synthetic */ InputStream x7(com.google.common.util.concurrent.d dVar, com.google.common.util.concurrent.d dVar2, C4618xo c4618xo, InterfaceC2160b90 interfaceC2160b90) {
        String e8 = ((C4836zo) dVar.get()).e();
        B7(new DR((C4836zo) dVar.get(), (JSONObject) dVar2.get(), c4618xo.f27923y, e8, interfaceC2160b90));
        return new ByteArrayInputStream(e8.getBytes(StandardCharsets.UTF_8));
    }
}
