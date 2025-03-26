package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2615fK {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f22006a;

    /* renamed from: b, reason: collision with root package name */
    private final C4247uK f22007b;

    /* renamed from: c, reason: collision with root package name */
    private final C4792zK f22008c;

    public C2615fK(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, C4247uK c4247uK, C4792zK c4792zK) {
        this.f22006a = interfaceExecutorServiceC3522nk0;
        this.f22007b = c4247uK;
        this.f22008c = c4792zK;
    }

    static final /* synthetic */ HI b(com.google.common.util.concurrent.d dVar, com.google.common.util.concurrent.d dVar2, com.google.common.util.concurrent.d dVar3, com.google.common.util.concurrent.d dVar4, com.google.common.util.concurrent.d dVar5, JSONObject jSONObject, com.google.common.util.concurrent.d dVar6, com.google.common.util.concurrent.d dVar7, com.google.common.util.concurrent.d dVar8, com.google.common.util.concurrent.d dVar9, com.google.common.util.concurrent.d dVar10) {
        HI hi = (HI) dVar.get();
        hi.p((List) dVar2.get());
        hi.m((InterfaceC1938Xg) dVar3.get());
        hi.q((InterfaceC1938Xg) dVar4.get());
        hi.j((InterfaceC1693Qg) dVar5.get());
        hi.s(C4247uK.j(jSONObject));
        hi.l(C4247uK.i(jSONObject));
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) dVar6.get();
        if (interfaceC4410vt != null) {
            hi.E(interfaceC4410vt);
            hi.D(interfaceC4410vt.M());
            hi.C(interfaceC4410vt.q());
        }
        hi.Q().putAll((Bundle) dVar7.get());
        InterfaceC4410vt interfaceC4410vt2 = (InterfaceC4410vt) dVar8.get();
        if (interfaceC4410vt2 != null) {
            hi.o(interfaceC4410vt2);
            hi.F(interfaceC4410vt2.M());
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23943l5)).booleanValue() || c(jSONObject)) {
            InterfaceC4410vt interfaceC4410vt3 = (InterfaceC4410vt) dVar9.get();
            if (interfaceC4410vt3 != null) {
                hi.t(interfaceC4410vt3);
            }
        } else {
            hi.u(dVar9);
            hi.x(new C1811Tq());
        }
        for (C4683yK c4683yK : (List) dVar10.get()) {
            if (c4683yK.f28103a != 1) {
                hi.n(c4683yK.f28104b, c4683yK.f28106d);
            } else {
                hi.z(c4683yK.f28104b, c4683yK.f28105c);
            }
        }
        return hi;
    }

    private static final boolean c(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final com.google.common.util.concurrent.d a(final C60 c60, final C3785q60 c3785q60, final JSONObject jSONObject) {
        final com.google.common.util.concurrent.d h8;
        JSONObject optJSONObject;
        com.google.common.util.concurrent.d h9;
        final com.google.common.util.concurrent.d p02 = this.f22006a.p0(new Callable(this) { // from class: com.google.android.gms.internal.ads.ZJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HI hi = new HI();
                JSONObject jSONObject2 = jSONObject;
                hi.B(jSONObject2.optInt("template_id", -1));
                hi.k(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String optString = optJSONObject2 != null ? optJSONObject2.optString("omid_partner_name") : null;
                C60 c602 = c60;
                hi.v(optString);
                L60 l60 = c602.f14100a.f28044a;
                if (!l60.f16769g.contains(Integer.toString(hi.P()))) {
                    throw new zzegu(1, "Invalid template ID: " + hi.P());
                }
                if (hi.P() == 3) {
                    if (hi.a() == null) {
                        throw new zzegu(1, "No custom template id for custom template ad response.");
                    }
                    if (!l60.f16770h.contains(hi.a())) {
                        throw new zzegu(1, "Unexpected custom template id in the response.");
                    }
                }
                C3785q60 c3785q602 = c3785q60;
                hi.y(jSONObject2.optDouble("rating", -1.0d));
                String optString2 = jSONObject2.optString("headline", null);
                if (c3785q602.f25764M) {
                    C2.v.t();
                    optString2 = G2.D0.e0() + " : " + optString2;
                }
                hi.z("headline", optString2);
                hi.z("body", jSONObject2.optString("body", null));
                hi.z("call_to_action", jSONObject2.optString("call_to_action", null));
                hi.z("store", jSONObject2.optString("store", null));
                hi.z("price", jSONObject2.optString("price", null));
                hi.z("advertiser", jSONObject2.optString("advertiser", null));
                return hi;
            }
        });
        final com.google.common.util.concurrent.d f8 = this.f22007b.f(jSONObject, "images");
        C4111t60 c4111t60 = c60.f14101b.f13520b;
        C4247uK c4247uK = this.f22007b;
        final com.google.common.util.concurrent.d g8 = c4247uK.g(jSONObject, "images", c3785q60, c4111t60);
        final com.google.common.util.concurrent.d e8 = c4247uK.e(jSONObject, "secondary_image");
        final com.google.common.util.concurrent.d e9 = c4247uK.e(jSONObject, "app_icon");
        final com.google.common.util.concurrent.d d8 = c4247uK.d(jSONObject, "attribution");
        final com.google.common.util.concurrent.d h10 = this.f22007b.h(jSONObject, c3785q60, c60.f14101b.f13520b);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Pc)).booleanValue() && ((Integer) Optional.ofNullable(jSONObject.optJSONObject("video")).map(new Function() { // from class: com.google.android.gms.internal.ads.aK
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((JSONObject) obj).optJSONArray("flags");
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.bK
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    JSONObject optJSONObject2 = jSONArray.optJSONObject(i8);
                    if (optJSONObject2.optString("key").equals("afma_video_player_type")) {
                        return optJSONObject2.optString("value");
                    }
                }
                return null;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.cK
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(0)).intValue() == 3) {
            C4247uK c4247uK2 = this.f22007b;
            C1811Tq c1811Tq = new C1811Tq();
            AbstractC2326ck0.r(h10, new C4138tK(c4247uK2, c1811Tq), AbstractC1497Kq.f16649f);
            h8 = c1811Tq;
        } else {
            h8 = AbstractC2326ck0.h(new Bundle());
        }
        final com.google.common.util.concurrent.d a8 = this.f22008c.a(jSONObject, "custom_assets");
        final C4247uK c4247uK3 = this.f22007b;
        if (jSONObject.optBoolean("enable_omid") && (optJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String optString = optJSONObject.optString("omid_html");
            h9 = TextUtils.isEmpty(optString) ? AbstractC2326ck0.h(null) : AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.jK
                @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                public final com.google.common.util.concurrent.d a(Object obj) {
                    return c4247uK3.c(optString, obj);
                }
            }, AbstractC1497Kq.f16649f);
        } else {
            h9 = AbstractC2326ck0.h(null);
        }
        final com.google.common.util.concurrent.d dVar = h9;
        ArrayList arrayList = new ArrayList();
        arrayList.add(p02);
        arrayList.add(f8);
        arrayList.add(g8);
        arrayList.add(e8);
        arrayList.add(e9);
        arrayList.add(d8);
        arrayList.add(h10);
        arrayList.add(h8);
        arrayList.add(a8);
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23943l5)).booleanValue() || c(jSONObject)) {
            arrayList.add(dVar);
        }
        return AbstractC2326ck0.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.dK
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2615fK.b(p02, f8, e9, e8, d8, jSONObject, h10, h8, g8, dVar, a8);
            }
        }, this.f22006a);
    }
}
