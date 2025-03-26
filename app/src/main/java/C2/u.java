package C2;

import D2.C0492c1;
import D2.C0521m0;
import D2.C0555y;
import D2.E;
import D2.H;
import D2.InterfaceC0485a0;
import D2.InterfaceC0509i0;
import D2.InterfaceC0530p0;
import D2.K;
import D2.N0;
import D2.Q1;
import D2.U;
import D2.U0;
import D2.X1;
import D2.Y0;
import D2.c2;
import D2.i2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC1901Wf;
import com.google.android.gms.internal.ads.InterfaceC1244Dn;
import com.google.android.gms.internal.ads.InterfaceC1303Ff;
import com.google.android.gms.internal.ads.InterfaceC1352Gn;
import com.google.android.gms.internal.ads.InterfaceC1704Qo;
import com.google.android.gms.internal.ads.InterfaceC4376vc;
import com.google.android.gms.internal.ads.N9;
import com.google.android.gms.internal.ads.zzavb;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class u extends U {

    /* renamed from: o, reason: collision with root package name */
    private final H2.a f806o;

    /* renamed from: s, reason: collision with root package name */
    private final c2 f807s;

    /* renamed from: t, reason: collision with root package name */
    private final Future f808t = AbstractC1497Kq.f16644a.p0(new q(this));

    /* renamed from: u, reason: collision with root package name */
    private final Context f809u;

    /* renamed from: v, reason: collision with root package name */
    private final s f810v;

    /* renamed from: w, reason: collision with root package name */
    private WebView f811w;

    /* renamed from: x, reason: collision with root package name */
    private H f812x;

    /* renamed from: y, reason: collision with root package name */
    private N9 f813y;

    /* renamed from: z, reason: collision with root package name */
    private AsyncTask f814z;

    public u(Context context, c2 c2Var, String str, H2.a aVar) {
        this.f809u = context;
        this.f806o = aVar;
        this.f807s = c2Var;
        this.f811w = new WebView(context);
        this.f810v = new s(context, str);
        t7(0);
        this.f811w.setVerticalScrollBarEnabled(false);
        this.f811w.getSettings().setJavaScriptEnabled(true);
        this.f811w.setWebViewClient(new o(this));
        this.f811w.setOnTouchListener(new p(this));
    }

    static /* bridge */ /* synthetic */ void C7(u uVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        uVar.f809u.startActivity(intent);
    }

    static /* bridge */ /* synthetic */ String z7(u uVar, String str) {
        if (uVar.f813y == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = uVar.f813y.a(parse, uVar.f809u, null, null);
        } catch (zzavb e8) {
            H2.p.h("Unable to process ad data", e8);
        }
        return parse.toString();
    }

    @Override // D2.V
    public final void B() {
        Z2.r.e("destroy must be called on the main UI thread.");
        this.f814z.cancel(true);
        this.f808t.cancel(false);
        this.f811w.destroy();
        this.f811w = null;
    }

    @Override // D2.V
    public final void B6(InterfaceC4376vc interfaceC4376vc) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final boolean F0() {
        return false;
    }

    @Override // D2.V
    public final boolean G6() {
        return false;
    }

    @Override // D2.V
    public final void H2(E e8) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void I() {
        Z2.r.e("pause must be called on the main UI thread.");
    }

    @Override // D2.V
    public final void I5(boolean z7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void J5(H h8) {
        this.f812x = h8;
    }

    @Override // D2.V
    public final void M2(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void Q5(C0492c1 c0492c1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void S1(InterfaceC0485a0 interfaceC0485a0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final boolean T3(X1 x12) {
        Z2.r.m(this.f811w, "This Search Ad has already been torn down");
        this.f810v.f(x12, this.f806o);
        this.f814z = new r(this, null).execute(new Void[0]);
        return true;
    }

    @Override // D2.V
    public final void V0(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void Y() {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void a1(C0521m0 c0521m0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void c0() {
        Z2.r.e("resume must be called on the main UI thread.");
    }

    @Override // D2.V
    public final Bundle d() {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final boolean e0() {
        return false;
    }

    @Override // D2.V
    public final void e3(InterfaceC1303Ff interfaceC1303Ff) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final H f() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // D2.V
    public final void f0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final c2 g() {
        return this.f807s;
    }

    @Override // D2.V
    public final InterfaceC0509i0 h() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // D2.V
    public final void h6(InterfaceC0509i0 interfaceC0509i0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final U0 i() {
        return null;
    }

    @Override // D2.V
    public final Y0 j() {
        return null;
    }

    @Override // D2.V
    public final void k2(InterfaceC1352Gn interfaceC1352Gn, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final InterfaceC5852a l() {
        Z2.r.e("getAdFrame must be called on the main UI thread.");
        return BinderC5853b.p2(this.f811w);
    }

    @Override // D2.V
    public final void l2(InterfaceC1704Qo interfaceC1704Qo) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void m5(c2 c2Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    final String p() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) AbstractC1901Wf.f19825d.e());
        builder.appendQueryParameter("query", this.f810v.d());
        builder.appendQueryParameter("pubId", this.f810v.c());
        builder.appendQueryParameter("mappver", this.f810v.a());
        Map e8 = this.f810v.e();
        for (String str : e8.keySet()) {
            builder.appendQueryParameter(str, (String) e8.get(str));
        }
        Uri build = builder.build();
        N9 n9 = this.f813y;
        if (n9 != null) {
            try {
                build = n9.b(build, this.f809u);
            } catch (zzavb e9) {
                H2.p.h("Unable to process ad data", e9);
            }
        }
        return q() + "#" + build.getEncodedQuery();
    }

    final String q() {
        String b8 = this.f810v.b();
        if (true == TextUtils.isEmpty(b8)) {
            b8 = "www.google.com";
        }
        return "https://" + b8 + ((String) AbstractC1901Wf.f19825d.e());
    }

    @Override // D2.V
    public final String r() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // D2.V
    public final void r6(Q1 q12) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final String s() {
        return null;
    }

    @Override // D2.V
    public final String t() {
        return null;
    }

    final void t7(int i8) {
        if (this.f811w == null) {
            return;
        }
        this.f811w.setLayoutParams(new ViewGroup.LayoutParams(-1, i8));
    }

    final int v(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C0555y.b();
            return H2.g.B(this.f809u, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // D2.V
    public final void y3(InterfaceC1244Dn interfaceC1244Dn) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void y4(i2 i2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // D2.V
    public final void S5(InterfaceC5852a interfaceC5852a) {
    }

    @Override // D2.V
    public final void f7(boolean z7) {
    }

    @Override // D2.V
    public final void i3(N0 n02) {
    }

    @Override // D2.V
    public final void v4(InterfaceC0530p0 interfaceC0530p0) {
    }

    @Override // D2.V
    public final void R4(X1 x12, K k8) {
    }
}
