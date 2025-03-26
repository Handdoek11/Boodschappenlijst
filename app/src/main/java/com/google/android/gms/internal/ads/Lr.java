package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Lr {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16897b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16898c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16900e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16901f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16902g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16903h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16904i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f16905j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f16906k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16907l;

    /* renamed from: m, reason: collision with root package name */
    public final long f16908m;

    /* renamed from: n, reason: collision with root package name */
    public final long f16909n;

    public Lr(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f16896a = a(jSONObject, "aggressive_media_codec_release", AbstractC3184kf.f23798V);
        this.f16897b = b(jSONObject, "byte_buffer_precache_limit", AbstractC3184kf.f23910i);
        this.f16898c = b(jSONObject, "exo_cache_buffer_size", AbstractC3184kf.f24000s);
        this.f16899d = b(jSONObject, "exo_connect_timeout_millis", AbstractC3184kf.f23874e);
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23865d;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f16900e = b(jSONObject, "exo_read_timeout_millis", AbstractC3184kf.f23883f);
        this.f16901f = b(jSONObject, "load_check_interval_bytes", AbstractC3184kf.f23892g);
        this.f16902g = b(jSONObject, "player_precache_limit", AbstractC3184kf.f23901h);
        this.f16903h = b(jSONObject, "socket_receive_buffer_size", AbstractC3184kf.f23919j);
        this.f16904i = a(jSONObject, "use_cache_data_source", AbstractC3184kf.f23978p4);
        b(jSONObject, "min_retry_count", AbstractC3184kf.f23928k);
        this.f16905j = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC3184kf.f23946m);
        this.f16906k = a(jSONObject, "enable_multiple_video_playback", AbstractC3184kf.f23832Z1);
        this.f16907l = a(jSONObject, "use_range_http_data_source", AbstractC3184kf.f23850b2);
        this.f16908m = c(jSONObject, "range_http_data_source_high_water_mark", AbstractC3184kf.f23859c2);
        this.f16909n = c(jSONObject, "range_http_data_source_low_water_mark", AbstractC3184kf.f23868d2);
    }

    private static final boolean a(JSONObject jSONObject, String str, AbstractC2207bf abstractC2207bf) {
        boolean booleanValue = ((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue();
        if (jSONObject == null) {
            return booleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return booleanValue;
        }
    }

    private static final int b(JSONObject jSONObject, String str, AbstractC2207bf abstractC2207bf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) D2.A.c().a(abstractC2207bf)).intValue();
    }

    private static final long c(JSONObject jSONObject, String str, AbstractC2207bf abstractC2207bf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) D2.A.c().a(abstractC2207bf)).longValue();
    }
}
