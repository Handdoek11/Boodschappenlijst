package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SU implements MU {

    /* renamed from: a, reason: collision with root package name */
    private final QH f18906a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f18907b;

    /* renamed from: c, reason: collision with root package name */
    private final C2615fK f18908c;

    /* renamed from: d, reason: collision with root package name */
    private final C3133k70 f18909d;

    /* renamed from: e, reason: collision with root package name */
    private final C4684yL f18910e;

    /* renamed from: f, reason: collision with root package name */
    private final BN f18911f;

    public SU(QH qh, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, C2615fK c2615fK, C3133k70 c3133k70, C4684yL c4684yL, BN bn) {
        this.f18906a = qh;
        this.f18907b = interfaceExecutorServiceC3522nk0;
        this.f18908c = c2615fK;
        this.f18909d = c3133k70;
        this.f18910e = c4684yL;
        this.f18911f = bn;
    }

    private final com.google.common.util.concurrent.d g(final C60 c60, final C3785q60 c3785q60, final JSONObject jSONObject) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23949m2)).booleanValue()) {
            this.f18911f.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_START.a(), C2.v.c().a());
        }
        C3133k70 c3133k70 = this.f18909d;
        C2615fK c2615fK = this.f18908c;
        final com.google.common.util.concurrent.d a8 = c3133k70.a();
        final com.google.common.util.concurrent.d a9 = c2615fK.a(c60, c3785q60, jSONObject);
        return AbstractC2326ck0.c(a8, a9).a(new Callable() { // from class: com.google.android.gms.internal.ads.NU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f17536o.c(a9, a8, c60, c3785q60, jSONObject);
            }
        }, this.f18907b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        C4220u60 c4220u60 = c3785q60.f25814s;
        return (c4220u60 == null || c4220u60.f26998c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(final C60 c60, final C3785q60 c3785q60) {
        return AbstractC2326ck0.n(AbstractC2326ck0.n(this.f18909d.a(), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.PU
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f18190a.e(c3785q60, (C4030sL) obj);
            }
        }, this.f18907b), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.QU
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f18470a.f(c60, c3785q60, (JSONArray) obj);
            }
        }, this.f18907b);
    }

    final /* synthetic */ CI c(com.google.common.util.concurrent.d dVar, com.google.common.util.concurrent.d dVar2, C60 c60, C3785q60 c3785q60, JSONObject jSONObject) {
        HI hi = (HI) dVar.get();
        C4030sL c4030sL = (C4030sL) dVar2.get();
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23949m2;
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f18911f.a().putLong(EnumC3706pN.RENDERING_WEBVIEW_CREATION_END.a(), C2.v.c().a());
        }
        II c8 = this.f18906a.c(new C2161bA(c60, c3785q60, null), new TI(hi), new C2502eI(jSONObject, c4030sL));
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            long a8 = C2.v.c().a();
            this.f18911f.a().putLong(EnumC3706pN.RENDERING_AD_COMPONENT_CREATION_END.a(), a8);
            this.f18911f.a().putLong(EnumC3706pN.RENDERING_CONFIGURE_WEBVIEW_START.a(), a8);
        }
        c8.j().b();
        c8.k().a(c4030sL);
        c8.i().a(hi.f0());
        c8.l().a(this.f18910e, hi.d0());
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            this.f18911f.a().putLong(EnumC3706pN.RENDERING_CONFIGURE_WEBVIEW_END.a(), C2.v.c().a());
        }
        return c8.h();
    }

    final /* synthetic */ com.google.common.util.concurrent.d d(C4030sL c4030sL, JSONObject jSONObject) {
        this.f18909d.b(AbstractC2326ck0.h(c4030sL));
        if (jSONObject.optBoolean("success")) {
            return AbstractC2326ck0.h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbnv("process json failed");
    }

    final /* synthetic */ com.google.common.util.concurrent.d e(C3785q60 c3785q60, final C4030sL c4030sL) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.B8)).booleanValue() && f3.m.l()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", c3785q60.f25814s.f26998c);
        jSONObject2.put("sdk_params", jSONObject);
        return AbstractC2326ck0.n(c4030sL.g("google.afma.nativeAds.preProcessJson", jSONObject2), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.OU
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f17890a.d(c4030sL, (JSONObject) obj);
            }
        }, this.f18907b);
    }

    final /* synthetic */ com.google.common.util.concurrent.d f(C60 c60, C3785q60 c3785q60, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return AbstractC2326ck0.g(new zzdvy(3));
        }
        if (c60.f14100a.f28044a.f16773k <= 1) {
            return AbstractC2326ck0.m(g(c60, c3785q60, jSONArray.getJSONObject(0)), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.RU
                @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                public final Object apply(Object obj) {
                    return Collections.singletonList(AbstractC2326ck0.h((CI) obj));
                }
            }, this.f18907b);
        }
        int length = jSONArray.length();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23958n2)).booleanValue()) {
            this.f18911f.c("nsl", String.valueOf(length));
        }
        this.f18909d.c(Math.min(length, c60.f14100a.f28044a.f16773k));
        ArrayList arrayList = new ArrayList(c60.f14100a.f28044a.f16773k);
        for (int i8 = 0; i8 < c60.f14100a.f28044a.f16773k; i8++) {
            if (i8 < length) {
                arrayList.add(g(c60, c3785q60, jSONArray.getJSONObject(i8)));
            } else {
                arrayList.add(AbstractC2326ck0.g(new zzdvy(3)));
            }
        }
        return AbstractC2326ck0.h(arrayList);
    }
}
