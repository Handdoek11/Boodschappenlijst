package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2310cc0 implements InterfaceC1224Db0 {

    /* renamed from: i, reason: collision with root package name */
    private static final C2310cc0 f21242i = new C2310cc0();

    /* renamed from: j, reason: collision with root package name */
    private static final Handler f21243j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f21244k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f21245l = new RunnableC2093ac0();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f21246m = new RunnableC2202bc0();

    /* renamed from: b, reason: collision with root package name */
    private int f21248b;

    /* renamed from: h, reason: collision with root package name */
    private long f21254h;

    /* renamed from: a, reason: collision with root package name */
    private final List f21247a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f21249c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List f21250d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final C1929Xb0 f21252f = new C1929Xb0();

    /* renamed from: e, reason: collision with root package name */
    private final C1296Fb0 f21251e = new C1296Fb0();

    /* renamed from: g, reason: collision with root package name */
    private final C1964Yb0 f21253g = new C1964Yb0(new C2636fc0());

    C2310cc0() {
    }

    public static C2310cc0 d() {
        return f21242i;
    }

    static /* bridge */ /* synthetic */ void g(C2310cc0 c2310cc0) {
        c2310cc0.f21248b = 0;
        c2310cc0.f21250d.clear();
        c2310cc0.f21249c = false;
        for (C2200bb0 c2200bb0 : C4048sb0.a().b()) {
        }
        c2310cc0.f21254h = System.nanoTime();
        c2310cc0.f21252f.i();
        long nanoTime = System.nanoTime();
        InterfaceC1260Eb0 a8 = c2310cc0.f21251e.a();
        if (c2310cc0.f21252f.e().size() > 0) {
            Iterator it = c2310cc0.f21252f.e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject b8 = a8.b(null);
                View a9 = c2310cc0.f21252f.a(str);
                InterfaceC1260Eb0 b9 = c2310cc0.f21251e.b();
                String c8 = c2310cc0.f21252f.c(str);
                if (c8 != null) {
                    JSONObject b10 = b9.b(a9);
                    AbstractC1649Pb0.b(b10, str);
                    try {
                        b10.put("notVisibleReason", c8);
                    } catch (JSONException e8) {
                        AbstractC1684Qb0.a("Error with setting not visible reason", e8);
                    }
                    AbstractC1649Pb0.c(b8, b10);
                }
                AbstractC1649Pb0.f(b8);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                c2310cc0.f21253g.c(b8, hashSet, nanoTime);
            }
        }
        if (c2310cc0.f21252f.f().size() > 0) {
            JSONObject b11 = a8.b(null);
            c2310cc0.k(null, a8, b11, 1, false);
            AbstractC1649Pb0.f(b11);
            c2310cc0.f21253g.d(b11, c2310cc0.f21252f.f(), nanoTime);
        } else {
            c2310cc0.f21253g.b();
        }
        c2310cc0.f21252f.g();
        long nanoTime2 = System.nanoTime() - c2310cc0.f21254h;
        if (c2310cc0.f21247a.size() > 0) {
            Iterator it2 = c2310cc0.f21247a.iterator();
            if (it2.hasNext()) {
                androidx.appcompat.app.E.a(it2.next());
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                throw null;
            }
        }
        C1188Cb0.a().c();
    }

    private final void k(View view, InterfaceC1260Eb0 interfaceC1260Eb0, JSONObject jSONObject, int i8, boolean z7) {
        interfaceC1260Eb0.a(view, jSONObject, this, i8 == 1, z7);
    }

    private static final void l() {
        Handler handler = f21244k;
        if (handler != null) {
            handler.removeCallbacks(f21246m);
            f21244k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1224Db0
    public final void a(View view, InterfaceC1260Eb0 interfaceC1260Eb0, JSONObject jSONObject, boolean z7) {
        int l8;
        boolean z8;
        if (AbstractC1824Ub0.a(view) != null || (l8 = this.f21252f.l(view)) == 3) {
            return;
        }
        JSONObject b8 = interfaceC1260Eb0.b(view);
        AbstractC1649Pb0.c(jSONObject, b8);
        String d8 = this.f21252f.d(view);
        if (d8 != null) {
            AbstractC1649Pb0.b(b8, d8);
            try {
                b8.put("hasWindowFocus", Boolean.valueOf(this.f21252f.k(view)));
            } catch (JSONException e8) {
                AbstractC1684Qb0.a("Error with setting has window focus", e8);
            }
            boolean j8 = this.f21252f.j(d8);
            Object valueOf = Boolean.valueOf(j8);
            if (j8) {
                try {
                    b8.put("isPipActive", valueOf);
                } catch (JSONException e9) {
                    AbstractC1684Qb0.a("Error with setting is picture-in-picture active", e9);
                }
            }
            this.f21252f.h();
        } else {
            C1859Vb0 b9 = this.f21252f.b(view);
            if (b9 != null) {
                C4375vb0 a8 = b9.a();
                JSONArray jSONArray = new JSONArray();
                ArrayList b10 = b9.b();
                int size = b10.size();
                for (int i8 = 0; i8 < size; i8++) {
                    jSONArray.put((String) b10.get(i8));
                }
                try {
                    b8.put("isFriendlyObstructionFor", jSONArray);
                    b8.put("friendlyObstructionClass", a8.d());
                    b8.put("friendlyObstructionPurpose", a8.a());
                    b8.put("friendlyObstructionReason", a8.c());
                } catch (JSONException e10) {
                    AbstractC1684Qb0.a("Error with setting friendly obstruction", e10);
                }
                z8 = true;
            } else {
                z8 = false;
            }
            k(view, interfaceC1260Eb0, b8, l8, z7 || z8);
        }
        this.f21248b++;
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (f21244k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21244k = handler;
            handler.post(f21245l);
            f21244k.postDelayed(f21246m, 200L);
        }
    }

    public final void j() {
        l();
        this.f21247a.clear();
        f21243j.post(new RunnableC1999Zb0(this));
    }
}
