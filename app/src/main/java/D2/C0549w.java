package D2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C1870Vh;
import com.google.android.gms.internal.ads.C1905Wh;
import com.google.android.gms.internal.ads.C3858qp;
import com.google.android.gms.internal.ads.C3962rn;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC1843Un;
import com.google.android.gms.internal.ads.InterfaceC2319ch;
import com.google.android.gms.internal.ads.InterfaceC2443dp;
import com.google.android.gms.internal.ads.InterfaceC3097jq;
import com.google.android.gms.internal.ads.InterfaceC3418mn;
import com.google.android.gms.internal.ads.InterfaceC4289un;

/* renamed from: D2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549w {

    /* renamed from: a, reason: collision with root package name */
    private final V1 f1352a;

    /* renamed from: b, reason: collision with root package name */
    private final T1 f1353b;

    /* renamed from: c, reason: collision with root package name */
    private final C0548v1 f1354c;

    /* renamed from: d, reason: collision with root package name */
    private final C1870Vh f1355d;

    /* renamed from: e, reason: collision with root package name */
    private final C3962rn f1356e;

    /* renamed from: f, reason: collision with root package name */
    private final C1905Wh f1357f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC1843Un f1358g;

    /* renamed from: h, reason: collision with root package name */
    private final W1 f1359h;

    public C0549w(V1 v12, T1 t12, C0548v1 c0548v1, C1870Vh c1870Vh, C3858qp c3858qp, C3962rn c3962rn, C1905Wh c1905Wh, W1 w12) {
        this.f1352a = v12;
        this.f1353b = t12;
        this.f1354c = c0548v1;
        this.f1355d = c1870Vh;
        this.f1356e = c3962rn;
        this.f1357f = c1905Wh;
        this.f1359h = w12;
    }

    static /* bridge */ /* synthetic */ void q(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C0555y.b().r(context, C0555y.c().f2914o, "gmob-apps", bundle, true);
    }

    public final Q c(Context context, String str, InterfaceC1242Dl interfaceC1242Dl) {
        return (Q) new C0532q(this, context, str, interfaceC1242Dl).d(context, false);
    }

    public final V d(Context context, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl) {
        return (V) new C0520m(this, context, c2Var, str, interfaceC1242Dl).d(context, false);
    }

    public final V e(Context context, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl) {
        return (V) new C0526o(this, context, c2Var, str, interfaceC1242Dl).d(context, false);
    }

    public final Q0 f(Context context, InterfaceC1242Dl interfaceC1242Dl) {
        return (Q0) new C0502g(this, context, interfaceC1242Dl).d(context, false);
    }

    public final InterfaceC2319ch h(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (InterfaceC2319ch) new C0543u(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final InterfaceC3418mn j(Context context, InterfaceC1242Dl interfaceC1242Dl) {
        return (InterfaceC3418mn) new C0514k(this, context, interfaceC1242Dl).d(context, false);
    }

    public final InterfaceC4289un l(Activity activity) {
        C0496e c0496e = new C0496e(this, activity);
        Intent intent = activity.getIntent();
        boolean z7 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z7 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            H2.p.d("useClientJar flag not found in activity intent extras.");
        }
        return (InterfaceC4289un) c0496e.d(activity, z7);
    }

    public final InterfaceC2443dp n(Context context, String str, InterfaceC1242Dl interfaceC1242Dl) {
        return (InterfaceC2443dp) new C0490c(this, context, str, interfaceC1242Dl).d(context, false);
    }

    public final InterfaceC3097jq o(Context context, InterfaceC1242Dl interfaceC1242Dl) {
        return (InterfaceC3097jq) new C0508i(this, context, interfaceC1242Dl).d(context, false);
    }
}
