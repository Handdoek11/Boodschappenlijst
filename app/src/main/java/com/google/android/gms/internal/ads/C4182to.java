package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.to, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4182to extends AbstractC3964ro {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26926a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f26927b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f26928c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1805Tk f26929d;

    /* renamed from: e, reason: collision with root package name */
    private final H2.a f26930e;

    public C4182to(Context context, InterfaceC1805Tk interfaceC1805Tk, H2.a aVar) {
        this.f26927b = context.getApplicationContext();
        this.f26930e = aVar;
        this.f26929d = interfaceC1805Tk;
    }

    public static JSONObject c(Context context, H2.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) AbstractC3295lg.f24362b.e()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f2914o);
            jSONObject.put("mf", AbstractC3295lg.f24363c.e());
            jSONObject.put("cl", "697668803");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3964ro
    public final com.google.common.util.concurrent.d a() {
        synchronized (this.f26926a) {
            try {
                if (this.f26928c == null) {
                    this.f26928c = this.f26927b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.f26928c;
        if (C2.v.c().a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) AbstractC3295lg.f24364d.e()).longValue()) {
            return AbstractC2326ck0.h(null);
        }
        return AbstractC2326ck0.m(this.f26929d.c(c(this.f26927b, this.f26930e)), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.so
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                this.f26735a.b((JSONObject) obj);
                return null;
            }
        }, AbstractC1497Kq.f16650g);
    }

    final /* synthetic */ Void b(JSONObject jSONObject) {
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23838a;
        D2.A.b();
        SharedPreferences a8 = C2424df.a(this.f26927b);
        if (a8 == null) {
            return null;
        }
        SharedPreferences.Editor edit = a8.edit();
        D2.A.a();
        int i8 = AbstractC2209bg.f20908a;
        D2.A.a().e(edit, 1, jSONObject);
        D2.A.b();
        edit.commit();
        SharedPreferences sharedPreferences = this.f26928c;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", C2.v.c().a()).apply();
        return null;
    }
}
