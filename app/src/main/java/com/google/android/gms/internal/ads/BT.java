package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class BT {

    /* renamed from: c, reason: collision with root package name */
    private final String f13798c;

    /* renamed from: d, reason: collision with root package name */
    private C4111t60 f13799d = null;

    /* renamed from: e, reason: collision with root package name */
    private C3785q60 f13800e = null;

    /* renamed from: f, reason: collision with root package name */
    private D2.g2 f13801f = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f13797b = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final List f13796a = DesugarCollections.synchronizedList(new ArrayList());

    public BT(String str) {
        this.f13798c = str;
    }

    private static String j(C3785q60 c3785q60) {
        return ((Boolean) D2.A.c().a(AbstractC3184kf.f23690H3)).booleanValue() ? c3785q60.f25809p0 : c3785q60.f25822w;
    }

    private final synchronized void k(C3785q60 c3785q60, int i8) {
        Map map = this.f13797b;
        String j8 = j(c3785q60);
        if (map.containsKey(j8)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = c3785q60.f25820v.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, c3785q60.f25820v.getString(next));
            } catch (JSONException unused) {
            }
        }
        D2.g2 g2Var = new D2.g2(c3785q60.f25756E, 0L, null, bundle, c3785q60.f25757F, c3785q60.f25758G, c3785q60.f25759H, c3785q60.f25760I);
        try {
            this.f13796a.add(i8, g2Var);
        } catch (IndexOutOfBoundsException e8) {
            C2.v.s().x(e8, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f13797b.put(j8, g2Var);
    }

    private final void l(C3785q60 c3785q60, long j8, D2.W0 w02, boolean z7) {
        Map map = this.f13797b;
        String j9 = j(c3785q60);
        if (map.containsKey(j9)) {
            if (this.f13800e == null) {
                this.f13800e = c3785q60;
            }
            D2.g2 g2Var = (D2.g2) this.f13797b.get(j9);
            g2Var.f1270s = j8;
            g2Var.f1271t = w02;
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23661D6)).booleanValue() && z7) {
                this.f13801f = g2Var;
            }
        }
    }

    public final D2.g2 a() {
        return this.f13801f;
    }

    public final BinderC2273cC b() {
        return new BinderC2273cC(this.f13800e, "", this, this.f13799d, this.f13798c);
    }

    public final List c() {
        return this.f13796a;
    }

    public final void d(C3785q60 c3785q60) {
        k(c3785q60, this.f13796a.size());
    }

    public final void e(C3785q60 c3785q60) {
        int indexOf = this.f13796a.indexOf(this.f13797b.get(j(c3785q60)));
        if (indexOf < 0 || indexOf >= this.f13797b.size()) {
            indexOf = this.f13796a.indexOf(this.f13801f);
        }
        if (indexOf < 0 || indexOf >= this.f13797b.size()) {
            return;
        }
        this.f13801f = (D2.g2) this.f13796a.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= this.f13796a.size()) {
                return;
            }
            D2.g2 g2Var = (D2.g2) this.f13796a.get(indexOf);
            g2Var.f1270s = 0L;
            g2Var.f1271t = null;
        }
    }

    public final void f(C3785q60 c3785q60, long j8, D2.W0 w02) {
        l(c3785q60, j8, w02, false);
    }

    public final void g(C3785q60 c3785q60, long j8, D2.W0 w02) {
        l(c3785q60, j8, null, true);
    }

    public final synchronized void h(String str, List list) {
        if (this.f13797b.containsKey(str)) {
            int indexOf = this.f13796a.indexOf((D2.g2) this.f13797b.get(str));
            try {
                this.f13796a.remove(indexOf);
            } catch (IndexOutOfBoundsException e8) {
                C2.v.s().x(e8, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.f13797b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((C3785q60) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void i(C4111t60 c4111t60) {
        this.f13799d = c4111t60;
    }
}
