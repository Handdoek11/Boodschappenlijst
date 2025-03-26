package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2440dn extends C2548en implements InterfaceC1662Pi {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4410vt f21648c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f21649d;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f21650e;

    /* renamed from: f, reason: collision with root package name */
    private final C1759Se f21651f;

    /* renamed from: g, reason: collision with root package name */
    DisplayMetrics f21652g;

    /* renamed from: h, reason: collision with root package name */
    private float f21653h;

    /* renamed from: i, reason: collision with root package name */
    int f21654i;

    /* renamed from: j, reason: collision with root package name */
    int f21655j;

    /* renamed from: k, reason: collision with root package name */
    private int f21656k;

    /* renamed from: l, reason: collision with root package name */
    int f21657l;

    /* renamed from: m, reason: collision with root package name */
    int f21658m;

    /* renamed from: n, reason: collision with root package name */
    int f21659n;

    /* renamed from: o, reason: collision with root package name */
    int f21660o;

    public C2440dn(InterfaceC4410vt interfaceC4410vt, Context context, C1759Se c1759Se) {
        super(interfaceC4410vt, "");
        this.f21654i = -1;
        this.f21655j = -1;
        this.f21657l = -1;
        this.f21658m = -1;
        this.f21659n = -1;
        this.f21660o = -1;
        this.f21648c = interfaceC4410vt;
        this.f21649d = context;
        this.f21651f = c1759Se;
        this.f21650e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObject;
        this.f21652g = new DisplayMetrics();
        Display defaultDisplay = this.f21650e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f21652g);
        this.f21653h = this.f21652g.density;
        this.f21656k = defaultDisplay.getRotation();
        C0555y.b();
        DisplayMetrics displayMetrics = this.f21652g;
        this.f21654i = H2.g.z(displayMetrics, displayMetrics.widthPixels);
        C0555y.b();
        DisplayMetrics displayMetrics2 = this.f21652g;
        this.f21655j = H2.g.z(displayMetrics2, displayMetrics2.heightPixels);
        Activity f8 = this.f21648c.f();
        if (f8 == null || f8.getWindow() == null) {
            this.f21657l = this.f21654i;
            this.f21658m = this.f21655j;
        } else {
            C2.v.t();
            int[] q8 = G2.D0.q(f8);
            C0555y.b();
            this.f21657l = H2.g.z(this.f21652g, q8[0]);
            C0555y.b();
            this.f21658m = H2.g.z(this.f21652g, q8[1]);
        }
        if (this.f21648c.H().i()) {
            this.f21659n = this.f21654i;
            this.f21660o = this.f21655j;
        } else {
            this.f21648c.measure(0, 0);
        }
        e(this.f21654i, this.f21655j, this.f21657l, this.f21658m, this.f21653h, this.f21656k);
        C2331cn c2331cn = new C2331cn();
        C1759Se c1759Se = this.f21651f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        c2331cn.e(c1759Se.a(intent));
        C1759Se c1759Se2 = this.f21651f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        c2331cn.c(c1759Se2.a(intent2));
        c2331cn.a(this.f21651f.b());
        c2331cn.d(this.f21651f.c());
        c2331cn.b(true);
        boolean z7 = c2331cn.f21284a;
        boolean z8 = c2331cn.f21285b;
        boolean z9 = c2331cn.f21286c;
        boolean z10 = c2331cn.f21287d;
        boolean z11 = c2331cn.f21288e;
        InterfaceC4410vt interfaceC4410vt = this.f21648c;
        try {
            jSONObject = new JSONObject().put("sms", z7).put("tel", z8).put("calendar", z9).put("storePicture", z10).put("inlineVideo", z11);
        } catch (JSONException e8) {
            H2.p.e("Error occurred while obtaining the MRAID capabilities.", e8);
            jSONObject = null;
        }
        interfaceC4410vt.p("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f21648c.getLocationOnScreen(iArr);
        h(C0555y.b().f(this.f21649d, iArr[0]), C0555y.b().f(this.f21649d, iArr[1]));
        if (H2.p.j(2)) {
            H2.p.f("Dispatching Ready Event.");
        }
        d(this.f21648c.l().f2914o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[PHI: r3
  0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0042, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f21649d
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L13
            C2.v.t()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = G2.D0.r(r0)
            r0 = r0[r2]
            goto L14
        L13:
            r0 = r2
        L14:
            com.google.android.gms.internal.ads.vt r1 = r6.f21648c
            com.google.android.gms.internal.ads.ru r1 = r1.H()
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.vt r1 = r6.f21648c
            com.google.android.gms.internal.ads.ru r1 = r1.H()
            boolean r1 = r1.i()
            if (r1 != 0) goto L84
        L28:
            com.google.android.gms.internal.ads.vt r1 = r6.f21648c
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.AbstractC3184kf.f23866d0
            com.google.android.gms.internal.ads.if r5 = D2.A.c()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            if (r3 != 0) goto L58
            com.google.android.gms.internal.ads.vt r3 = r6.f21648c
            com.google.android.gms.internal.ads.ru r3 = r3.H()
            if (r3 == 0) goto L57
            com.google.android.gms.internal.ads.vt r3 = r6.f21648c
            com.google.android.gms.internal.ads.ru r3 = r3.H()
            int r3 = r3.f26240c
            goto L58
        L57:
            r3 = r2
        L58:
            if (r1 != 0) goto L6b
            com.google.android.gms.internal.ads.vt r1 = r6.f21648c
            com.google.android.gms.internal.ads.ru r1 = r1.H()
            if (r1 == 0) goto L6c
            com.google.android.gms.internal.ads.vt r1 = r6.f21648c
            com.google.android.gms.internal.ads.ru r1 = r1.H()
            int r2 = r1.f26239b
            goto L6c
        L6b:
            r2 = r1
        L6c:
            android.content.Context r1 = r6.f21649d
            H2.g r4 = D2.C0555y.b()
            int r1 = r4.f(r1, r3)
            r6.f21659n = r1
            android.content.Context r1 = r6.f21649d
            H2.g r3 = D2.C0555y.b()
            int r1 = r3.f(r1, r2)
            r6.f21660o = r1
        L84:
            int r0 = r8 - r0
            int r1 = r6.f21659n
            int r2 = r6.f21660o
            r6.b(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.vt r0 = r6.f21648c
            com.google.android.gms.internal.ads.pu r0 = r0.L()
            r0.I(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2440dn.h(int, int):void");
    }
}
