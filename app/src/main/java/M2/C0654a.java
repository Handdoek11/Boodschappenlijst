package M2;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC3840qg;
import com.google.android.gms.internal.ads.C1445Je;
import com.google.android.gms.internal.ads.C2959ia0;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC3522nk0;
import com.google.android.gms.internal.ads.N9;
import com.google.android.gms.internal.ads.NN;
import com.google.android.gms.internal.ads.P60;
import com.google.android.gms.internal.ads.zzavb;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C6881g;
import w2.EnumC6877c;

/* renamed from: M2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3836a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f3837b;

    /* renamed from: c, reason: collision with root package name */
    private final N9 f3838c;

    /* renamed from: d, reason: collision with root package name */
    private final P60 f3839d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3840e;

    /* renamed from: f, reason: collision with root package name */
    private final NN f3841f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f3842g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f3843h = AbstractC1497Kq.f16649f;

    /* renamed from: i, reason: collision with root package name */
    private final C2959ia0 f3844i;

    /* renamed from: j, reason: collision with root package name */
    private final l0 f3845j;

    /* renamed from: k, reason: collision with root package name */
    private final c0 f3846k;

    /* renamed from: l, reason: collision with root package name */
    private final g0 f3847l;

    C0654a(WebView webView, N9 n9, NN nn, C2959ia0 c2959ia0, P60 p60, l0 l0Var, c0 c0Var, g0 g0Var) {
        this.f3837b = webView;
        Context context = webView.getContext();
        this.f3836a = context;
        this.f3838c = n9;
        this.f3841f = nn;
        AbstractC3184kf.a(context);
        this.f3840e = ((Integer) D2.A.c().a(AbstractC3184kf.w9)).intValue();
        this.f3842g = ((Boolean) D2.A.c().a(AbstractC3184kf.x9)).booleanValue();
        this.f3844i = c2959ia0;
        this.f3839d = p60;
        this.f3845j = l0Var;
        this.f3846k = c0Var;
        this.f3847l = g0Var;
    }

    final /* synthetic */ void e(Bundle bundle, O2.b bVar) {
        CookieManager a8 = C2.v.u().a(this.f3836a);
        bundle.putBoolean("accept_3p_cookie", a8 != null ? a8.acceptThirdPartyCookies(this.f3837b) : false);
        O2.a.a(this.f3836a, EnumC6877c.BANNER, ((C6881g.a) new C6881g.a().b(AdMobAdapter.class, bundle)).g(), bVar);
    }

    final /* synthetic */ void f(String str) {
        P60 p60;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) D2.A.c().a(AbstractC3184kf.Sb)).booleanValue() || (p60 = this.f3839d) == null) ? this.f3838c.a(parse, this.f3836a, this.f3837b, null) : p60.a(parse, this.f3836a, this.f3837b, null);
        } catch (zzavb e8) {
            H2.p.c("Failed to append the click signal to URL: ", e8);
            C2.v.s().x(e8, "TaggingLibraryJsInterface.recordClick");
        }
        this.f3844i.d(parse.toString(), null, null);
    }

    @JavascriptInterface
    @TargetApi(C1445Je.zzm)
    public String getClickSignals(String str) {
        try {
            long a8 = C2.v.c().a();
            String e8 = this.f3838c.c().e(this.f3836a, str, this.f3837b);
            if (this.f3842g) {
                AbstractC0656c.d(this.f3841f, null, "csg", new Pair("clat", String.valueOf(C2.v.c().a() - a8)));
            }
            return e8;
        } catch (RuntimeException e9) {
            H2.p.e("Exception getting click signals. ", e9);
            C2.v.s().x(e9, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(C1445Je.zzm)
    public String getClickSignalsWithTimeout(final String str, int i8) {
        if (i8 <= 0) {
            H2.p.d("Invalid timeout for getting click signals. Timeout=" + i8);
            return "";
        }
        try {
            return (String) AbstractC1497Kq.f16644a.p0(new Callable() { // from class: M2.U
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f3820o.getClickSignals(str);
                }
            }).get(Math.min(i8, this.f3840e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            H2.p.e("Exception getting click signals with timeout. ", e8);
            C2.v.s().x(e8, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(C1445Je.zzm)
    public String getQueryInfo() {
        C2.v.t();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final Y y7 = new Y(this, uuid);
        if (((Boolean) AbstractC3840qg.f25981c.e()).booleanValue()) {
            this.f3845j.g(this.f3837b, y7);
        } else {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.z9)).booleanValue()) {
                this.f3843h.execute(new Runnable() { // from class: M2.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3822o.e(bundle, y7);
                    }
                });
            } else {
                O2.a.a(this.f3836a, EnumC6877c.BANNER, ((C6881g.a) new C6881g.a().b(AdMobAdapter.class, bundle)).g(), y7);
            }
        }
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(C1445Je.zzm)
    public String getViewSignals() {
        try {
            long a8 = C2.v.c().a();
            String i8 = this.f3838c.c().i(this.f3836a, this.f3837b, null);
            if (this.f3842g) {
                AbstractC0656c.d(this.f3841f, null, "vsg", new Pair("vlat", String.valueOf(C2.v.c().a() - a8)));
            }
            return i8;
        } catch (RuntimeException e8) {
            H2.p.e("Exception getting view signals. ", e8);
            C2.v.s().x(e8, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(C1445Je.zzm)
    public String getViewSignalsWithTimeout(int i8) {
        if (i8 <= 0) {
            H2.p.d("Invalid timeout for getting view signals. Timeout=" + i8);
            return "";
        }
        try {
            return (String) AbstractC1497Kq.f16644a.p0(new Callable() { // from class: M2.S
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f3817o.getViewSignals();
                }
            }).get(Math.min(i8, this.f3840e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            H2.p.e("Exception getting view signals with timeout. ", e8);
            C2.v.s().x(e8, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(C1445Je.zzm)
    public void recordClick(final String str) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.B9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: M2.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f3818o.f(str);
            }
        });
    }

    @JavascriptInterface
    @TargetApi(C1445Je.zzm)
    public void reportTouchEvent(String str) {
        int i8;
        int i9;
        int i10;
        float f8;
        int i11;
        int i12;
        int i13;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i8 = jSONObject.getInt("x");
            i9 = jSONObject.getInt("y");
            i10 = jSONObject.getInt("duration_ms");
            f8 = (float) jSONObject.getDouble("force");
            i11 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e8) {
            e = e8;
        }
        try {
            if (i11 != 0) {
                int i14 = 1;
                if (i11 != 1) {
                    i14 = 2;
                    if (i11 != 2) {
                        i14 = 3;
                        i13 = i11 != 3 ? -1 : 0;
                    }
                }
                i12 = i14;
                this.f3838c.d(MotionEvent.obtain(0L, i10, i12, i8, i9, f8, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            this.f3838c.d(MotionEvent.obtain(0L, i10, i12, i8, i9, f8, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e9) {
            e = e9;
            H2.p.e("Failed to parse the touch string. ", e);
            C2.v.s().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e10) {
            e = e10;
            H2.p.e("Failed to parse the touch string. ", e);
            C2.v.s().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i12 = i13;
    }
}
