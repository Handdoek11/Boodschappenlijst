package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3511nf {

    /* renamed from: a, reason: collision with root package name */
    private final String f25020a = (String) AbstractC2643fg.f22091a.e();

    /* renamed from: b, reason: collision with root package name */
    private final Map f25021b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f25022c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25023d;

    public C3511nf(Context context, String str) {
        this.f25022c = context;
        this.f25023d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f25021b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        C2.v.t();
        linkedHashMap.put("device", G2.D0.X());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        C2.v.t();
        linkedHashMap.put("is_lite_sdk", true != G2.D0.f(context) ? "0" : "1");
        Future b8 = C2.v.q().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C1173Bo) b8.get()).f13871j));
            linkedHashMap.put("network_fine", Integer.toString(((C1173Bo) b8.get()).f13872k));
        } catch (Exception e8) {
            C2.v.s().x(e8, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.jb)).booleanValue()) {
            Map map = this.f25021b;
            C2.v.t();
            map.put("is_bstar", true != G2.D0.c(context) ? "0" : "1");
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.o9)).booleanValue()) {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.f24012t2)).booleanValue() || AbstractC3187kg0.d(C2.v.s().o())) {
                return;
            }
            this.f25021b.put("plugin", C2.v.s().o());
        }
    }

    final Context a() {
        return this.f25022c;
    }

    final String b() {
        return this.f25023d;
    }

    final String c() {
        return this.f25020a;
    }

    final Map d() {
        return this.f25021b;
    }
}
