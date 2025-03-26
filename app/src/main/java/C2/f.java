package C2;

import D2.A;
import G2.AbstractC0608p0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC1601Nq;
import com.google.android.gms.internal.ads.AbstractC2051a90;
import com.google.android.gms.internal.ads.AbstractC2207bf;
import com.google.android.gms.internal.ads.AbstractC2219bl;
import com.google.android.gms.internal.ads.AbstractC2326ck0;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C2544el;
import com.google.android.gms.internal.ads.C4404vq;
import com.google.android.gms.internal.ads.GN;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.InterfaceC1420Ij0;
import com.google.android.gms.internal.ads.InterfaceC1805Tk;
import com.google.android.gms.internal.ads.InterfaceC1980Yk;
import com.google.android.gms.internal.ads.InterfaceC2160b90;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC3522nk0;
import com.google.android.gms.internal.ads.RunnableC3791q90;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f765a;

    /* renamed from: b, reason: collision with root package name */
    private long f766b = 0;

    static final /* synthetic */ com.google.common.util.concurrent.d d(Long l8, HN hn, RunnableC3791q90 runnableC3791q90, InterfaceC2160b90 interfaceC2160b90, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            v.s().j().Y(jSONObject.getString("appSettingsJson"));
            if (l8 != null) {
                f(hn, "cld_s", v.c().b() - l8.longValue());
            }
        }
        interfaceC2160b90.I0(optBoolean);
        runnableC3791q90.b(interfaceC2160b90.k());
        return AbstractC2326ck0.h(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HN hn, String str, long j8) {
        if (hn != null) {
            if (((Boolean) A.c().a(AbstractC3184kf.zc)).booleanValue()) {
                GN a8 = hn.a();
                a8.b("action", "lat_init");
                a8.b(str, Long.toString(j8));
                a8.g();
            }
        }
    }

    public final void a(Context context, H2.a aVar, String str, Runnable runnable, RunnableC3791q90 runnableC3791q90, HN hn, Long l8) {
        b(context, aVar, true, null, str, null, runnable, runnableC3791q90, hn, l8);
    }

    final void b(Context context, H2.a aVar, boolean z7, C4404vq c4404vq, String str, String str2, Runnable runnable, final RunnableC3791q90 runnableC3791q90, final HN hn, final Long l8) {
        PackageInfo f8;
        if (v.c().b() - this.f766b < 5000) {
            H2.p.g("Not retrying to fetch app settings");
            return;
        }
        this.f766b = v.c().b();
        if (c4404vq != null && !TextUtils.isEmpty(c4404vq.c())) {
            if (v.c().a() - c4404vq.a() <= ((Long) A.c().a(AbstractC3184kf.f23924j4)).longValue() && c4404vq.i()) {
                return;
            }
        }
        if (context == null) {
            H2.p.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            H2.p.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f765a = applicationContext;
        final InterfaceC2160b90 a8 = AbstractC2051a90.a(context, 4);
        a8.f();
        C2544el a9 = v.j().a(this.f765a, aVar, runnableC3791q90);
        InterfaceC1980Yk interfaceC1980Yk = AbstractC2219bl.f20925b;
        InterfaceC1805Tk a10 = a9.a("google.afma.config.fetchAppSettings", interfaceC1980Yk, interfaceC1980Yk);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z7);
            jSONObject.put("pn", context.getPackageName());
            AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23838a;
            jSONObject.put("experiment_ids", TextUtils.join(",", A.a().a()));
            jSONObject.put("js", aVar.f2914o);
            try {
                ApplicationInfo applicationInfo = this.f765a.getApplicationInfo();
                if (applicationInfo != null && (f8 = h3.e.a(context).f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", f8.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC0608p0.k("Error fetching PackageInfo.");
            }
            com.google.common.util.concurrent.d c8 = a10.c(jSONObject);
            InterfaceC1420Ij0 interfaceC1420Ij0 = new InterfaceC1420Ij0(this) { // from class: C2.d
                @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                public final com.google.common.util.concurrent.d a(Object obj) {
                    return f.d(l8, hn, runnableC3791q90, a8, (JSONObject) obj);
                }
            };
            InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16650g;
            com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(c8, interfaceC1420Ij0, interfaceExecutorServiceC3522nk0);
            if (runnable != null) {
                c8.f(runnable, interfaceExecutorServiceC3522nk0);
            }
            if (l8 != null) {
                c8.f(new Runnable(this) { // from class: C2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.f(hn, "cld_r", v.c().b() - l8.longValue());
                    }
                }, interfaceExecutorServiceC3522nk0);
            }
            if (((Boolean) A.c().a(AbstractC3184kf.C7)).booleanValue()) {
                AbstractC1601Nq.b(n8, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                AbstractC1601Nq.a(n8, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e8) {
            H2.p.e("Error requesting application settings", e8);
            a8.c(e8);
            a8.I0(false);
            runnableC3791q90.b(a8.k());
        }
    }

    public final void c(Context context, H2.a aVar, String str, C4404vq c4404vq, RunnableC3791q90 runnableC3791q90) {
        b(context, aVar, false, c4404vq, c4404vq != null ? c4404vq.b() : null, str, null, runnableC3791q90, null, null);
    }
}
