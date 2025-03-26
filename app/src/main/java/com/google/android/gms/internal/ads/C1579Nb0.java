package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1579Nb0 extends AbstractC1440Jb0 {

    /* renamed from: e, reason: collision with root package name */
    private WebView f17571e;

    /* renamed from: f, reason: collision with root package name */
    private Long f17572f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f17573g;

    public C1579Nb0(String str, Map map, String str2) {
        super(str);
        this.f17572f = null;
        this.f17573g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1440Jb0
    public final void c() {
        super.c();
        new Handler().postDelayed(new RunnableC1544Mb0(this), Math.max(4000 - (this.f17572f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f17572f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f17571e = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1440Jb0
    public final void i(C2200bb0 c2200bb0, C1997Za0 c1997Za0) {
        JSONObject jSONObject = new JSONObject();
        Map i8 = c1997Za0.i();
        Iterator it = i8.keySet().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.E.a(i8.get((String) it.next()));
            throw null;
        }
        j(c2200bb0, c1997Za0, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1440Jb0
    public final void o() {
        WebView webView = new WebView(C4593xb0.b().a());
        this.f17571e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f17571e.getSettings().setAllowContentAccess(false);
        this.f17571e.getSettings().setAllowFileAccess(false);
        this.f17571e.setWebViewClient(new C1510Lb0(this));
        n(this.f17571e);
        C4811zb0.k(this.f17571e, null);
        Iterator it = this.f17573g.keySet().iterator();
        if (!it.hasNext()) {
            this.f17572f = Long.valueOf(System.nanoTime());
        } else {
            androidx.appcompat.app.E.a(this.f17573g.get((String) it.next()));
            throw null;
        }
    }
}
