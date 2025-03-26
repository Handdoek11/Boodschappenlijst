package M2;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.BN;
import com.google.android.gms.internal.ads.NN;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: h, reason: collision with root package name */
    private final NN f3941h;

    /* renamed from: i, reason: collision with root package name */
    private Map f3942i;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f3939f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f3940g = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    private final int f3934a = ((Integer) D2.A.c().a(AbstractC3184kf.f23717K6)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private final long f3935b = ((Long) D2.A.c().a(AbstractC3184kf.f23725L6)).longValue();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3936c = ((Boolean) D2.A.c().a(AbstractC3184kf.f23757P6)).booleanValue();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3937d = ((Boolean) D2.A.c().a(AbstractC3184kf.f23749O6)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final Map f3938e = DesugarCollections.synchronizedMap(new q0(this));

    public s0(NN nn) {
        this.f3941h = nn;
    }

    private final synchronized void i(final BN bn) {
        if (this.f3936c) {
            ArrayDeque arrayDeque = this.f3940g;
            final ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f3939f;
            final ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: M2.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3917o.e(bn, clone, clone2);
                }
            });
        }
    }

    private final void j(BN bn, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(bn.b());
            this.f3942i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f3942i.put("e_r", str);
            this.f3942i.put("e_id", (String) pair2.first);
            if (this.f3937d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(AbstractC0656c.b(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                l(this.f3942i, "e_type", (String) pair.first);
                l(this.f3942i, "e_agent", (String) pair.second);
            }
            this.f3941h.g(this.f3942i);
        }
    }

    private final synchronized void k() {
        long a8 = C2.v.c().a();
        try {
            Iterator it = this.f3938e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a8 - ((r0) entry.getValue()).f3926a.longValue() <= this.f3935b) {
                    break;
                }
                this.f3940g.add(new Pair((String) entry.getKey(), ((r0) entry.getValue()).f3927b));
                it.remove();
            }
        } catch (ConcurrentModificationException e8) {
            C2.v.s().x(e8, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void l(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String b(String str, BN bn) {
        r0 r0Var = (r0) this.f3938e.get(str);
        bn.b().put("request_id", str);
        if (r0Var == null) {
            bn.b().put("mhit", "false");
            return null;
        }
        bn.b().put("mhit", "true");
        return r0Var.f3927b;
    }

    public final synchronized void d(String str, String str2, BN bn) {
        this.f3938e.put(str, new r0(Long.valueOf(C2.v.c().a()), str2, new HashSet()));
        k();
        i(bn);
    }

    final /* synthetic */ void e(BN bn, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        j(bn, arrayDeque, "to");
        j(bn, arrayDeque2, "of");
    }

    public final synchronized void f(String str) {
        this.f3938e.remove(str);
    }

    public final synchronized boolean g(String str, String str2, int i8) {
        r0 r0Var = (r0) this.f3938e.get(str);
        if (r0Var == null) {
            return false;
        }
        r0Var.f3928c.add(str2);
        return r0Var.f3928c.size() < i8;
    }

    public final synchronized boolean h(String str, String str2) {
        r0 r0Var = (r0) this.f3938e.get(str);
        if (r0Var != null) {
            if (r0Var.f3928c.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
