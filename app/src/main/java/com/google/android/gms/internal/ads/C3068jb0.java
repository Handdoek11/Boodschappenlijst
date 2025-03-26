package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import q1.AbstractC6418e;
import q1.AbstractC6419f;

/* renamed from: com.google.android.gms.internal.ads.jb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3068jb0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3286lb0 f23283a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f23284b;

    /* renamed from: c, reason: collision with root package name */
    private C3179kc0 f23285c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f23286d;

    /* renamed from: e, reason: collision with root package name */
    private final C4484wb0 f23287e;

    private C3068jb0(C3286lb0 c3286lb0, WebView webView, boolean z7) {
        HashMap hashMap = new HashMap();
        this.f23286d = hashMap;
        this.f23287e = new C4484wb0();
        AbstractC1789Tb0.a();
        this.f23283a = c3286lb0;
        this.f23284b = webView;
        if (a() != webView) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((AbstractC1927Xa0) it.next()).d(webView);
            }
            this.f23285c = new C3179kc0(webView);
        }
        if (!AbstractC6419f.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        h();
        AbstractC6418e.a(this.f23284b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new C2852hb0(this));
    }

    public static C3068jb0 b(C3286lb0 c3286lb0, WebView webView, boolean z7) {
        return new C3068jb0(c3286lb0, webView, true);
    }

    static /* bridge */ /* synthetic */ void c(C3068jb0 c3068jb0, String str) {
        AbstractC1927Xa0 abstractC1927Xa0 = (AbstractC1927Xa0) c3068jb0.f23286d.get(str);
        if (abstractC1927Xa0 != null) {
            abstractC1927Xa0.c();
            c3068jb0.f23286d.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ void e(C3068jb0 c3068jb0, String str) {
        EnumC2308cb0 enumC2308cb0 = EnumC2308cb0.DEFINED_BY_JAVASCRIPT;
        EnumC2634fb0 enumC2634fb0 = EnumC2634fb0.DEFINED_BY_JAVASCRIPT;
        EnumC3177kb0 enumC3177kb0 = EnumC3177kb0.JAVASCRIPT;
        C2200bb0 c2200bb0 = new C2200bb0(C1962Ya0.a(enumC2308cb0, enumC2634fb0, enumC3177kb0, enumC3177kb0, false), C1997Za0.b(c3068jb0.f23283a, c3068jb0.f23284b, null, null), str);
        c3068jb0.f23286d.put(str, c2200bb0);
        c2200bb0.d(c3068jb0.a());
        for (C4375vb0 c4375vb0 : c3068jb0.f23287e.a()) {
            c2200bb0.b((View) c4375vb0.b().get(), c4375vb0.a(), c4375vb0.c());
        }
        c2200bb0.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        AbstractC6418e.i(this.f23284b, "omidJsSessionService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final View a() {
        C3179kc0 c3179kc0 = this.f23285c;
        if (c3179kc0 == null) {
            return null;
        }
        return (View) c3179kc0.get();
    }

    public final void f(View view, EnumC2525eb0 enumC2525eb0, String str) {
        Iterator it = this.f23286d.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1927Xa0) it.next()).b(view, enumC2525eb0, "Ad overlay");
        }
        this.f23287e.b(view, enumC2525eb0, "Ad overlay");
    }

    public final void g(C1639Ot c1639Ot) {
        Iterator it = this.f23286d.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1927Xa0) it.next()).c();
        }
        Timer timer = new Timer();
        timer.schedule(new C2743gb0(this, c1639Ot, timer), 1000L);
    }
}
