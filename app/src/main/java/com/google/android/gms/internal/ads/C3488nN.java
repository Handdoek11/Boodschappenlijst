package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q1.AbstractC6419f;

/* renamed from: com.google.android.gms.internal.ads.nN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3488nN implements JD, ZC, InterfaceC3360mC, DG {

    /* renamed from: o, reason: collision with root package name */
    private final BN f24926o;

    /* renamed from: s, reason: collision with root package name */
    private final NN f24927s;

    /* renamed from: t, reason: collision with root package name */
    private final int f24928t;

    C3488nN(BN bn, NN nn, int i8) {
        this.f24926o = bn;
        this.f24927s = nn;
        this.f24928t = i8;
    }

    private final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j8 = bundle.getLong(str);
            if (j8 >= 0) {
                this.f24926o.c(str, String.valueOf(j8));
            }
        }
    }

    private final void c(Bundle bundle, AbstractC4169th0 abstractC4169th0) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(EnumC3706pN.PUBLIC_API_CALLBACK.a(), C2.v.c().a());
        if (bundle.containsKey("ls")) {
            this.f24926o.c("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = abstractC4169th0.size();
        for (int i8 = 0; i8 < size; i8++) {
            C3815qN c3815qN = (C3815qN) abstractC4169th0.get(i8);
            long j8 = bundle.getLong(c3815qN.a().a(), -1L);
            long j9 = bundle.getLong(c3815qN.b().a(), -1L);
            if (j8 > 0 && j9 > 0) {
                this.f24926o.c(c3815qN.c(), String.valueOf(j9 - j8));
            }
        }
        b(bundle.getBundle("client_sig_latency_key"));
        b(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23990q7)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                this.f24926o.c("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                this.f24926o.c("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void E(String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23733M6)).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23990q7)).booleanValue()) {
                this.f24926o.b().put("sgw", String.valueOf(this.f24928t));
            }
            this.f24926o.b().put("action", "sgf");
            this.f24926o.c("sgf_reason", str);
            this.f24927s.g(this.f24926o.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
        this.f24926o.e(c4618xo.f27916o);
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void T0(C60 c60) {
        this.f24926o.d(c60);
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void a(M2.N n8) {
        String str;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23733M6)).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23990q7)).booleanValue()) {
                this.f24926o.b().put("sgw", String.valueOf(this.f24928t));
            }
            if (n8 == null) {
                this.f24926o.b().put("action", "sgs");
                this.f24926o.b().put("request_id", "-1");
                this.f24927s.g(this.f24926o.b());
                return;
            }
            C4618xo c4618xo = n8.f3804d;
            Bundle bundle = n8.f3805e;
            if (c4618xo != null) {
                c(c4618xo.f27914D, C3815qN.f25905d);
            } else if (bundle != null && !bundle.isEmpty()) {
                c(bundle, C3815qN.f25905d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(n8.f3803c) ? n8.f3802b : n8.f3803c);
                this.f24926o.b().put("action", "sgs");
                Map b8 = this.f24926o.b();
                if (((Boolean) D2.A.c().a(AbstractC3184kf.A9)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e8) {
                        H2.p.e("Error retrieving JSONObject from the requestJson, ", e8);
                    }
                } else {
                    str = "na";
                }
                b8.put("tpc", str);
                C4618xo c4618xo2 = n8.f3804d;
                if (c4618xo2 != null) {
                    this.f24926o.e(c4618xo2.f27916o);
                }
                this.f24927s.g(this.f24926o.b());
            } catch (JSONException unused) {
                this.f24926o.b().put("action", "sgf");
                this.f24926o.b().put("sgf_reason", "request_invalid");
                this.f24927s.g(this.f24926o.b());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
    public final void r0(D2.W0 w02) {
        this.f24926o.b().put("action", "ftl");
        this.f24926o.c("ftl", String.valueOf(w02.f1162o));
        this.f24926o.c("ed", w02.f1164t);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23829Y6)).booleanValue()) {
            this.f24926o.c("emsg", w02.f1163s);
        }
        this.f24927s.g(this.f24926o.b());
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void s() {
        this.f24926o.b().put("action", "loaded");
        c(this.f24926o.a(), C3815qN.f25906e);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.xc)).booleanValue()) {
            this.f24926o.b().put("mafe", true != AbstractC6419f.a("MUTE_AUDIO") ? "0" : "1");
        }
        this.f24927s.g(this.f24926o.b());
    }
}
