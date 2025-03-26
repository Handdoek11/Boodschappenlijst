package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class FQ {

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f15146l = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4630xu f15147a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15148b;

    /* renamed from: c, reason: collision with root package name */
    private final H2.a f15149c;

    /* renamed from: d, reason: collision with root package name */
    private final L60 f15150d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f15151e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f15152f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15153g;

    /* renamed from: h, reason: collision with root package name */
    private final RunnableC3464n90 f15154h;

    /* renamed from: i, reason: collision with root package name */
    private final BN f15155i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f15156j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private final C1317Fo f15157k;

    FQ(AbstractC4630xu abstractC4630xu, Context context, H2.a aVar, L60 l60, Executor executor, String str, RunnableC3464n90 runnableC3464n90, BN bn, C1317Fo c1317Fo, MR mr, ScheduledExecutorService scheduledExecutorService) {
        this.f15147a = abstractC4630xu;
        this.f15148b = context;
        this.f15149c = aVar;
        this.f15150d = l60;
        this.f15151e = executor;
        this.f15153g = str;
        this.f15154h = runnableC3464n90;
        abstractC4630xu.D();
        this.f15155i = bn;
        this.f15157k = c1317Fo;
        this.f15152f = scheduledExecutorService;
    }

    private final com.google.common.util.concurrent.d d(String str, final String str2) {
        String str3;
        com.google.common.util.concurrent.d h8;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return AbstractC2326ck0.g(new zzegu(15, "Invalid ad string."));
        }
        InterfaceC2160b90 a8 = AbstractC2051a90.a(this.f15148b, 11);
        a8.f();
        C2544el a9 = C2.v.j().a(this.f15148b, this.f15149c, this.f15147a.F());
        InterfaceC1980Yk interfaceC1980Yk = AbstractC2219bl.f20925b;
        final InterfaceC1805Tk a10 = a9.a("google.afma.response.normalize", interfaceC1980Yk, interfaceC1980Yk);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23781S6)).booleanValue()) {
            try {
                str3 = new JSONObject(str).optString("fetch_url", "");
            } catch (JSONException unused) {
                str3 = "";
            }
            if (TextUtils.isEmpty(str3)) {
                h8 = AbstractC2326ck0.h(str);
                this.f15155i.c("sst", "1");
            } else {
                this.f15155i.c("sst", "2");
                String str5 = (String) D2.A.c().a(AbstractC3184kf.f23797U6);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23789T6)).booleanValue()) {
                    List f8 = C2970ig0.c(f15146l).f(str3);
                    if (f8.size() < 2) {
                        h8 = AbstractC2326ck0.g(new zzegu(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) f8.get(1);
                        C2.v.t();
                        str3 = Uri.parse(str3).buildUpon().query(null).build().toString();
                        final IR ir = new IR(str3, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                        h8 = (Sj0) AbstractC2326ck0.f((Sj0) AbstractC2326ck0.o(Sj0.D(AbstractC1497Kq.f16644a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.DQ
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f14488o.c(ir);
                            }
                        })), ((Integer) D2.A.c().a(AbstractC3184kf.f23805V6)).intValue(), TimeUnit.MILLISECONDS, this.f15152f), Exception.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.EQ
                            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                            public final com.google.common.util.concurrent.d a(Object obj) {
                                zzegu zzeguVar;
                                Exception exc = (Exception) obj;
                                C2.v.s().w(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                                if (exc instanceof TimeoutException) {
                                    zzeguVar = new zzegu(1, "Timed out waiting for ad response.");
                                } else if (exc instanceof zzegu) {
                                    zzeguVar = (zzegu) exc;
                                } else {
                                    zzeguVar = new zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                                }
                                return AbstractC2326ck0.g(zzeguVar);
                            }
                        }, this.f15151e);
                    }
                } else {
                    final IR ir2 = new IR(str3, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                    h8 = (Sj0) AbstractC2326ck0.f((Sj0) AbstractC2326ck0.o(Sj0.D(AbstractC1497Kq.f16644a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.DQ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f14488o.c(ir2);
                        }
                    })), ((Integer) D2.A.c().a(AbstractC3184kf.f23805V6)).intValue(), TimeUnit.MILLISECONDS, this.f15152f), Exception.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.EQ
                        @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                        public final com.google.common.util.concurrent.d a(Object obj) {
                            zzegu zzeguVar;
                            Exception exc = (Exception) obj;
                            C2.v.s().w(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                            if (exc instanceof TimeoutException) {
                                zzeguVar = new zzegu(1, "Timed out waiting for ad response.");
                            } else if (exc instanceof zzegu) {
                                zzeguVar = (zzegu) exc;
                            } else {
                                zzeguVar = new zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                            }
                            return AbstractC2326ck0.g(zzeguVar);
                        }
                    }, this.f15151e);
                }
            }
        } else {
            h8 = AbstractC2326ck0.h(str);
            this.f15155i.c("sst", "1");
        }
        com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(AbstractC2326ck0.n(AbstractC2326ck0.n(h8, new InterfaceC1420Ij0(this) { // from class: com.google.android.gms.internal.ads.AQ
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                String str6 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str6);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str7));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return AbstractC2326ck0.h(jSONObject);
                } catch (JSONException e8) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e8.getCause())));
                }
            }
        }, this.f15151e), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.BQ
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return a10.c((JSONObject) obj);
            }
        }, this.f15151e), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.CQ
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f14165a.b((JSONObject) obj);
            }
        }, this.f15151e);
        AbstractC3355m90.a(n8, this.f15154h, a8);
        return n8;
    }

    private final String e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f15153g));
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            H2.p.g("Failed to update the ad types for rendering. ".concat(e8.toString()));
            return str;
        }
    }

    private final void f(EnumC3706pN enumC3706pN) {
        Bundle a8 = this.f15155i.a();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23821X6)).booleanValue()) {
            a8.putLong(enumC3706pN.a(), C2.v.c().a());
        }
    }

    private static final String g(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0181 A[Catch: all -> 0x008d, TryCatch #4 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008a, B:29:0x0092, B:32:0x009a, B:34:0x00a2, B:36:0x00a8, B:40:0x00b1, B:49:0x00e9, B:43:0x00c3, B:48:0x00d2, B:51:0x00ee, B:28:0x0090, B:52:0x0104, B:59:0x011d, B:62:0x0125, B:66:0x0149, B:68:0x015e, B:72:0x0181, B:74:0x0196, B:77:0x01aa, B:79:0x01b0, B:80:0x01bd, B:82:0x01bf, B:85:0x01c8, B:84:0x01c5, B:73:0x018b, B:69:0x0171, B:65:0x0133, B:56:0x010d, B:57:0x0112), top: B:117:0x0051, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b A[Catch: all -> 0x008d, TryCatch #4 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008a, B:29:0x0092, B:32:0x009a, B:34:0x00a2, B:36:0x00a8, B:40:0x00b1, B:49:0x00e9, B:43:0x00c3, B:48:0x00d2, B:51:0x00ee, B:28:0x0090, B:52:0x0104, B:59:0x011d, B:62:0x0125, B:66:0x0149, B:68:0x015e, B:72:0x0181, B:74:0x0196, B:77:0x01aa, B:79:0x01b0, B:80:0x01bd, B:82:0x01bf, B:85:0x01c8, B:84:0x01c5, B:73:0x018b, B:69:0x0171, B:65:0x0133, B:56:0x010d, B:57:0x0112), top: B:117:0x0051, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c5 A[Catch: all -> 0x008d, TryCatch #4 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008a, B:29:0x0092, B:32:0x009a, B:34:0x00a2, B:36:0x00a8, B:40:0x00b1, B:49:0x00e9, B:43:0x00c3, B:48:0x00d2, B:51:0x00ee, B:28:0x0090, B:52:0x0104, B:59:0x011d, B:62:0x0125, B:66:0x0149, B:68:0x015e, B:72:0x0181, B:74:0x0196, B:77:0x01aa, B:79:0x01b0, B:80:0x01bd, B:82:0x01bf, B:85:0x01c8, B:84:0x01c5, B:73:0x018b, B:69:0x0171, B:65:0x0133, B:56:0x010d, B:57:0x0112), top: B:117:0x0051, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.d a() {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.FQ.a():com.google.common.util.concurrent.d");
    }

    final /* synthetic */ com.google.common.util.concurrent.d b(JSONObject jSONObject) {
        return AbstractC2326ck0.h(new C60(new C4656y60(this.f15150d), A60.a(new StringReader(jSONObject.toString()), null)));
    }

    final /* synthetic */ String c(IR ir) {
        f(EnumC3706pN.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i8 = 0;
        int i9 = -1;
        while (true) {
            try {
                if (i8 >= ((Integer) D2.A.c().a(AbstractC3184kf.f23813W6)).intValue()) {
                    throw new zzegu(1, "Received HTTP error code from ad server: " + i9);
                }
                JR a8 = new KR(this.f15148b, this.f15149c.f2914o, this.f15157k, Binder.getCallingUid()).a(ir);
                int i10 = a8.f16246a;
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23821X6)).booleanValue()) {
                    this.f15155i.c("fr", String.valueOf(i8));
                }
                if (i10 == 200) {
                    f(EnumC3706pN.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return a8.f16248c;
                }
                i8++;
                i9 = i10;
            } catch (Exception e8) {
                throw new zzegu(1, e8.getMessage() == null ? "Fetch failed." : e8.getMessage(), e8);
            }
        }
    }
}
