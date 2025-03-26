package com.google.android.gms.internal.ads;

import G2.AbstractC0585e;
import G2.AbstractC0608p0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class RN {

    /* renamed from: a, reason: collision with root package name */
    protected final Map f18637a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f18638b;

    /* renamed from: c, reason: collision with root package name */
    protected final Executor f18639c;

    /* renamed from: d, reason: collision with root package name */
    protected final H2.u f18640d;

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f18641e;

    /* renamed from: f, reason: collision with root package name */
    private final N2.c f18642f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f18643g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f18644h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f18645i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference f18646j;

    protected RN(Executor executor, H2.u uVar, N2.c cVar, Context context) {
        this.f18637a = new HashMap();
        this.f18645i = new AtomicBoolean();
        this.f18646j = new AtomicReference(new Bundle());
        this.f18639c = executor;
        this.f18640d = uVar;
        this.f18641e = ((Boolean) D2.A.c().a(AbstractC3184kf.f23886f2)).booleanValue();
        this.f18642f = cVar;
        this.f18643g = ((Boolean) D2.A.c().a(AbstractC3184kf.f23913i2)).booleanValue();
        this.f18644h = ((Boolean) D2.A.c().a(AbstractC3184kf.f23741N6)).booleanValue();
        this.f18638b = context;
    }

    private final void a(Map map) {
        if (map == null || map.isEmpty()) {
            H2.p.b("Empty or null paramMap.");
            return;
        }
        if (!this.f18645i.getAndSet(true)) {
            final String str = (String) D2.A.c().a(AbstractC3184kf.ta);
            this.f18646j.set(AbstractC0585e.a(this.f18638b, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.PN
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    this.f18182o.d(str, sharedPreferences, str2);
                }
            }));
        }
        Bundle bundle = (Bundle) this.f18646j.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    private final void h(Map map, boolean z7) {
        if (map.isEmpty()) {
            H2.p.b("Empty paramMap.");
            return;
        }
        a(map);
        final String a8 = this.f18642f.a(map);
        AbstractC0608p0.k(a8);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f18641e) {
            if (!z7 || this.f18643g) {
                if (!parseBoolean || this.f18644h) {
                    this.f18639c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ON
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f17880o.f18640d.n(a8);
                        }
                    });
                }
            }
        }
    }

    protected final String b(Map map) {
        return this.f18642f.a(map);
    }

    public final ConcurrentHashMap c() {
        return new ConcurrentHashMap(this.f18637a);
    }

    final /* synthetic */ void d(String str, SharedPreferences sharedPreferences, String str2) {
        this.f18646j.set(AbstractC0585e.b(this.f18638b, str));
    }

    public final void e(Map map) {
        if (map.isEmpty()) {
            H2.p.b("Empty paramMap.");
            return;
        }
        a(map);
        final String a8 = this.f18642f.a(map);
        AbstractC0608p0.k(a8);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Yc)).booleanValue() || this.f18641e) {
            this.f18639c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.QN
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18454o.f18640d.n(a8);
                }
            });
        }
    }

    public final void f(Map map) {
        h(map, true);
    }

    public final void g(Map map) {
        h(map, false);
    }
}
