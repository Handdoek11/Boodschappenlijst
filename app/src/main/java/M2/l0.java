package M2;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC3840qg;
import com.google.android.gms.internal.ads.NN;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import w2.C6881g;
import w2.EnumC6877c;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f3895a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f3896b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Context f3897c;

    /* renamed from: d, reason: collision with root package name */
    private final NN f3898d;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f3899e;

    l0(Context context, NN nn, ExecutorService executorService) {
        this.f3897c = context;
        this.f3898d = nn;
        this.f3899e = executorService;
    }

    private final void h(final boolean z7) {
        Map map = this.f3896b;
        Boolean valueOf = Boolean.valueOf(z7);
        if (map.containsKey(valueOf)) {
            return;
        }
        this.f3896b.put(valueOf, new ArrayList());
        this.f3899e.submit(new Runnable() { // from class: M2.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3888o.c(z7);
            }
        });
    }

    private final void i(n0 n0Var, Pair pair, boolean z7) {
        n0Var.d();
        O2.a b8 = n0Var.b();
        if (b8 != null) {
            ((O2.b) pair.first).b(b8);
        } else {
            ((O2.b) pair.first).a(n0Var.c());
        }
        AbstractC0656c.d(this.f3898d, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", EnumC6877c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(C2.v.c().a() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z7)), new Pair("sgpc_rs", Boolean.toString(n0Var.b() != null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(boolean z7, boolean z8) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z7);
            Map map = this.f3895a;
            Boolean valueOf = Boolean.valueOf(z7);
            n0 n0Var = (n0) map.get(valueOf);
            int i8 = 0;
            if (z8 && n0Var != null) {
                i8 = n0Var.a() + 1;
            }
            int i9 = i8;
            n0 n0Var2 = (n0) this.f3895a.get(valueOf);
            final m0 m0Var = new m0(this, z7, i9, n0Var2 == null ? null : Boolean.valueOf(n0Var2.f()), this.f3898d);
            final C6881g g8 = ((C6881g.a) new C6881g.a().b(AdMobAdapter.class, bundle)).g();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Wa)).booleanValue()) {
                this.f3899e.submit(new Callable() { // from class: M2.k0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f3891o.a(g8, m0Var);
                    }
                });
            } else {
                O2.a.a(this.f3897c, EnumC6877c.BANNER, g8, m0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ Object a(C6881g c6881g, m0 m0Var) {
        O2.a.a(this.f3897c, EnumC6877c.BANNER, c6881g, m0Var);
        return Boolean.TRUE;
    }

    public final synchronized void b() {
        h(true);
        h(false);
    }

    final /* synthetic */ void c(boolean z7) {
        d(z7, false);
    }

    final /* synthetic */ void e(Object obj, Pair pair) {
        boolean z7 = false;
        if (obj instanceof WebView) {
            CookieManager a8 = C2.v.u().a(this.f3897c);
            if (a8 != null) {
                z7 = a8.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.f3895a;
        Boolean valueOf = Boolean.valueOf(z7);
        n0 n0Var = (n0) map.get(valueOf);
        if (n0Var != null && !n0Var.e()) {
            i(n0Var, pair, true);
            return;
        }
        List list = (List) this.f3896b.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            this.f3896b.put(valueOf, list);
        }
        list.add(pair);
    }

    final synchronized void f(final boolean z7, n0 n0Var) {
        try {
            Map map = this.f3895a;
            Boolean valueOf = Boolean.valueOf(z7);
            n0 n0Var2 = (n0) map.get(valueOf);
            if (n0Var2 == null || n0Var2.e() || n0Var2.b() == null || n0Var.b() != null) {
                this.f3895a.put(valueOf, n0Var);
            }
            long longValue = (n0Var.b() != null ? (Long) AbstractC3840qg.f25982d.e() : (Long) AbstractC3840qg.f25983e.e()).longValue();
            final boolean z8 = n0Var.b() == null;
            AbstractC1497Kq.f16647d.schedule(new Runnable() { // from class: M2.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3882o.d(z7, z8);
                }
            }, longValue, TimeUnit.SECONDS);
            List list = (List) this.f3896b.get(valueOf);
            this.f3896b.put(valueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i(n0Var, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final synchronized void g(final Object obj, O2.b bVar) {
        final Pair pair = new Pair(bVar, Long.valueOf(C2.v.c().a()));
        AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: M2.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3877o.e(obj, pair);
            }
        });
    }
}
