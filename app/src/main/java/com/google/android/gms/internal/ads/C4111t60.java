package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.t60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4111t60 {

    /* renamed from: a, reason: collision with root package name */
    public final List f26831a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26833c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26834d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26835e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26836f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26837g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26838h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26839i;

    /* renamed from: j, reason: collision with root package name */
    public final C4002s60 f26840j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f26841k;

    /* renamed from: l, reason: collision with root package name */
    public final String f26842l;

    /* renamed from: m, reason: collision with root package name */
    public final String f26843m;

    /* renamed from: n, reason: collision with root package name */
    public final String f26844n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f26845o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f26846p;

    /* renamed from: q, reason: collision with root package name */
    public final String f26847q;

    /* renamed from: r, reason: collision with root package name */
    public final int f26848r;

    /* renamed from: s, reason: collision with root package name */
    public long f26849s;

    /* renamed from: t, reason: collision with root package name */
    public long f26850t;

    C4111t60(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        C4002s60 c4002s60 = null;
        long j8 = -1;
        long j9 = -1;
        long j10 = 0;
        int i10 = -1;
        int i11 = 1;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                emptyList = G2.U.d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i8 = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str6 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z7 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i9 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j10 = jsonReader.nextLong();
            } else {
                String str8 = str3;
                if (((Boolean) D2.A.c().a(AbstractC3184kf.h8)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    c4002s60 = new C4002s60(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.na)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23669E6)).booleanValue()) {
                            try {
                                try {
                                    Bundle a8 = G2.U.a(G2.U.i(jsonReader));
                                    if (a8 != null) {
                                        bundle = a8;
                                    }
                                } catch (IOException | JSONException unused) {
                                }
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.h9)).booleanValue()) {
                            str5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.h9)).booleanValue()) {
                            str4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        AbstractC2207bf abstractC2207bf = AbstractC3184kf.i9;
                        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str2 = jsonReader.nextString();
                        } else if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = G2.U.i(jsonReader);
                        } else if (Objects.equals(nextName, "max_parallel_renderers")) {
                            i11 = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) D2.A.c().a(AbstractC3184kf.p9)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = G2.U.i(jsonReader);
                            } else {
                                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23940l2)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                    try {
                                        Bundle a9 = G2.U.a(G2.U.i(jsonReader));
                                        if (a9 != null) {
                                            j9 = a(a9.getDouble("start_time"));
                                            j8 = a(a9.getDouble("end_time"));
                                        }
                                    } catch (IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                str3 = str8;
            }
        }
        String str9 = str3;
        jsonReader.endObject();
        this.f26831a = emptyList;
        this.f26833c = i8;
        if (((Boolean) AbstractC3948rg.f26207c.e()).booleanValue()) {
            this.f26834d = -1;
        } else {
            C1831Uf c1831Uf = AbstractC1971Yf.f20297a;
            if (((Long) c1831Uf.e()).longValue() > -1) {
                this.f26834d = ((Long) c1831Uf.e()).intValue();
            } else {
                this.f26834d = i10;
            }
        }
        this.f26832b = str;
        this.f26835e = str6;
        this.f26836f = i9;
        this.f26837g = j10;
        this.f26840j = c4002s60;
        this.f26838h = z7;
        this.f26839i = str7;
        this.f26841k = bundle;
        this.f26842l = str4;
        this.f26843m = str5;
        this.f26844n = str2;
        this.f26845o = jSONObject;
        this.f26846p = jSONObject2;
        this.f26847q = str9;
        C1831Uf c1831Uf2 = AbstractC3731pg.f25486a;
        this.f26848r = ((Long) c1831Uf2.e()).longValue() > 0 ? ((Long) c1831Uf2.e()).intValue() : i11;
        this.f26849s = j9;
        this.f26850t = j8;
    }

    private static final long a(double d8) {
        if (d8 > 9.223372036854776E18d || d8 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d8;
    }
}
