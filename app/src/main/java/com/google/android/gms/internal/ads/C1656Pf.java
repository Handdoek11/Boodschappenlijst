package com.google.android.gms.internal.ads;

import M2.AbstractC0656c;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C6881g;
import w2.EnumC6877c;

/* renamed from: com.google.android.gms.internal.ads.Pf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1656Pf {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f18237a;

    /* renamed from: b, reason: collision with root package name */
    private final M2.l0 f18238b;

    /* renamed from: c, reason: collision with root package name */
    private final M2.c0 f18239c;

    /* renamed from: d, reason: collision with root package name */
    private final NN f18240d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f18241e;

    /* renamed from: f, reason: collision with root package name */
    private C1551Mf f18242f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.browser.customtabs.f f18243g;

    /* renamed from: h, reason: collision with root package name */
    private String f18244h;

    /* renamed from: i, reason: collision with root package name */
    private long f18245i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f18246j;

    /* renamed from: k, reason: collision with root package name */
    private JSONArray f18247k;

    /* renamed from: l, reason: collision with root package name */
    private Context f18248l;

    public C1656Pf(ScheduledExecutorService scheduledExecutorService, M2.l0 l0Var, M2.c0 c0Var, NN nn) {
        this.f18237a = scheduledExecutorService;
        this.f18238b = l0Var;
        this.f18239c = c0Var;
        this.f18240d = nn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) D2.A.c().a(com.google.android.gms.internal.ads.AbstractC3184kf.K9)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.Mf r0 = r5.f18242f
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            H2.p.d(r0)
            return
        La:
            java.lang.Boolean r0 = r0.l()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.f18244h
            if (r0 == 0) goto L70
            androidx.browser.customtabs.f r0 = r5.f18243g
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.f18237a
            if (r0 == 0) goto L70
            long r0 = r5.f18245i
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            f3.e r0 = C2.v.c()
            long r0 = r0.b()
            long r2 = r5.f18245i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.K9
            com.google.android.gms.internal.ads.if r1 = D2.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            androidx.browser.customtabs.f r0 = r5.f18243g
            java.lang.String r1 = r5.f18244h
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.h(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r5.f18237a
            java.lang.Runnable r1 = r5.f18241e
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.AbstractC3184kf.L9
            com.google.android.gms.internal.ads.if r3 = D2.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            G2.AbstractC0608p0.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1656Pf.j():void");
    }

    private final void k(JSONObject jSONObject) {
        try {
            if (this.f18247k == null) {
                this.f18247k = new JSONArray((String) D2.A.c().a(AbstractC3184kf.N9));
            }
            jSONObject.put("eids", this.f18247k);
        } catch (JSONException e8) {
            H2.p.e("Error fetching the PACT active eids JSON: ", e8);
        }
    }

    public final androidx.browser.customtabs.f b() {
        return this.f18243g;
    }

    final JSONObject c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC3840qg.f25981c.e()).booleanValue() ? ((Long) AbstractC3840qg.f25984f.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) AbstractC3840qg.f25979a.e()).booleanValue()) {
            jSONObject.put("as", this.f18239c.a());
        }
        return jSONObject;
    }

    final JSONObject d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC3840qg.f25981c.e()).booleanValue() ? ((Long) AbstractC3840qg.f25984f.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) AbstractC3840qg.f25979a.e()).booleanValue()) {
            jSONObject.put("as", this.f18239c.a());
        }
        return jSONObject;
    }

    final void f() {
        this.f18245i = C2.v.c().b() + ((Integer) D2.A.c().a(AbstractC3184kf.J9)).intValue();
        if (this.f18241e == null) {
            this.f18241e = new Runnable() { // from class: com.google.android.gms.internal.ads.Nf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17576o.j();
                }
            };
        }
        j();
    }

    public final void g(Context context, androidx.browser.customtabs.c cVar, String str, androidx.browser.customtabs.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.f18248l = context;
        this.f18244h = str;
        C1551Mf c1551Mf = new C1551Mf(this, bVar, this.f18240d);
        this.f18242f = c1551Mf;
        androidx.browser.customtabs.f e8 = cVar.e(c1551Mf);
        this.f18243g = e8;
        if (e8 == null) {
            H2.p.d("CustomTabsClient failed to create new session.");
        }
        AbstractC0656c.d(this.f18240d, null, "pact_action", new Pair("pe", "pact_init"));
    }

    final void h(String str) {
        try {
            androidx.browser.customtabs.f fVar = this.f18243g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f18246j).toString());
            k(jSONObject);
            if (((Boolean) AbstractC3840qg.f25979a.e()).booleanValue()) {
                jSONObject.put("as", this.f18239c.a());
            }
            fVar.g(jSONObject.toString(), null);
            C1621Of c1621Of = new C1621Of(this, str);
            if (((Boolean) AbstractC3840qg.f25981c.e()).booleanValue()) {
                this.f18238b.g(this.f18243g, c1621Of);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            O2.a.a(this.f18248l, EnumC6877c.BANNER, ((C6881g.a) new C6881g.a().b(AdMobAdapter.class, bundle)).g(), c1621Of);
        } catch (JSONException e8) {
            H2.p.e("Error creating JSON: ", e8);
        }
    }

    public final void i(long j8) {
        this.f18246j = j8;
    }
}
