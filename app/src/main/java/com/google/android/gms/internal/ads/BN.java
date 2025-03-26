package com.google.android.gms.internal.ads;

import M2.AbstractC0656c;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class BN {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f13784a;

    /* renamed from: b, reason: collision with root package name */
    private final C1283Eq f13785b;

    /* renamed from: c, reason: collision with root package name */
    private final L60 f13786c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13787d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13788e;

    /* renamed from: f, reason: collision with root package name */
    private final C2.k f13789f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f13790g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private final Context f13791h;

    public BN(Context context, NN nn, C1283Eq c1283Eq, L60 l60, String str, String str2, C2.k kVar) {
        ActivityManager.MemoryInfo g8;
        ConcurrentHashMap c8 = nn.c();
        this.f13784a = c8;
        this.f13785b = c1283Eq;
        this.f13786c = l60;
        this.f13787d = str;
        this.f13788e = str2;
        this.f13789f = kVar;
        this.f13791h = context;
        c8.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.t9)).booleanValue()) {
            int p8 = kVar.p();
            int i8 = p8 - 1;
            if (p8 == 0) {
                throw null;
            }
            c8.put("asv", i8 != 0 ? i8 != 1 ? "na" : "2" : "1");
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            c("rt_f", String.valueOf(runtime.freeMemory()));
            c("rt_m", String.valueOf(runtime.maxMemory()));
            c("rt_t", String.valueOf(runtime.totalMemory()));
            c("wv_c", String.valueOf(C2.v.s().c()));
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23976p2)).booleanValue() && (g8 = H2.g.g(context)) != null) {
                c("mem_avl", String.valueOf(g8.availMem));
                c("mem_tt", String.valueOf(g8.totalMem));
                c("low_m", true != g8.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23733M6)).booleanValue()) {
            int f8 = AbstractC0656c.f(l60) - 1;
            if (f8 == 0) {
                c8.put("request_id", str);
                c8.put("scar", "false");
                return;
            }
            if (f8 == 1) {
                c8.put("request_id", str);
                c8.put("se", "query_g");
            } else if (f8 == 2) {
                c8.put("se", "r_adinfo");
            } else if (f8 != 3) {
                c8.put("se", "r_both");
            } else {
                c8.put("se", "r_adstring");
            }
            c8.put("scar", "true");
            c("ragent", l60.f16766d.f1175G);
            c("rtype", AbstractC0656c.b(AbstractC0656c.c(l60.f16766d)));
        }
    }

    public final Bundle a() {
        return this.f13790g;
    }

    public final Map b() {
        return this.f13784a;
    }

    public final void c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f13784a.put(str, str2);
    }

    public final void d(C60 c60) {
        if (!c60.f14101b.f13519a.isEmpty()) {
            C3785q60 c3785q60 = (C3785q60) c60.f14101b.f13519a.get(0);
            c("ad_format", C3785q60.a(c3785q60.f25780b));
            if (c3785q60.f25780b == 6) {
                this.f13784a.put("as", true != this.f13785b.l() ? "0" : "1");
            }
        }
        c("gqi", c60.f14101b.f13520b.f26832b);
    }

    public final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            c("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            c("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
