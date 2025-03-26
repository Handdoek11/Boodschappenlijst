package com.google.android.gms.internal.ads;

import D2.InterfaceC0491c0;
import G2.AbstractC0608p0;
import android.content.Context;
import android.net.ConnectivityManager;
import f3.InterfaceC5781e;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import w2.EnumC6877c;

/* renamed from: com.google.android.gms.internal.ads.Ca0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1186Ca0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f14192a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f14193b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final C1682Qa0 f14194c;

    /* renamed from: d, reason: collision with root package name */
    private final C4482wa0 f14195d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f14196e;

    /* renamed from: f, reason: collision with root package name */
    private volatile ConnectivityManager f14197f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC5781e f14198g;

    /* renamed from: h, reason: collision with root package name */
    private AtomicInteger f14199h;

    C1186Ca0(C1682Qa0 c1682Qa0, C4482wa0 c4482wa0, Context context, InterfaceC5781e interfaceC5781e) {
        this.f14194c = c1682Qa0;
        this.f14195d = c4482wa0;
        this.f14196e = context;
        this.f14198g = interfaceC5781e;
    }

    static String d(String str, EnumC6877c enumC6877c) {
        return str + "#" + (enumC6877c == null ? "NULL" : enumC6877c.name());
    }

    private final synchronized AbstractC1647Pa0 n(String str, EnumC6877c enumC6877c) {
        return (AbstractC1647Pa0) this.f14192a.get(d(str, enumC6877c));
    }

    private final synchronized List o(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                D2.I1 i12 = (D2.I1) it.next();
                String d8 = d(i12.f1147o, EnumC6877c.a(i12.f1148s));
                hashSet.add(d8);
                AbstractC1647Pa0 abstractC1647Pa0 = (AbstractC1647Pa0) this.f14192a.get(d8);
                if (abstractC1647Pa0 != null) {
                    if (abstractC1647Pa0.f18211e.equals(i12)) {
                        abstractC1647Pa0.w(i12.f1150u);
                    } else {
                        this.f14193b.put(d8, abstractC1647Pa0);
                        this.f14192a.remove(d8);
                    }
                } else if (this.f14193b.containsKey(d8)) {
                    AbstractC1647Pa0 abstractC1647Pa02 = (AbstractC1647Pa0) this.f14193b.get(d8);
                    if (abstractC1647Pa02.f18211e.equals(i12)) {
                        abstractC1647Pa02.w(i12.f1150u);
                        abstractC1647Pa02.t();
                        this.f14192a.put(d8, abstractC1647Pa02);
                        this.f14193b.remove(d8);
                    }
                } else {
                    arrayList.add(i12);
                }
            }
            Iterator it2 = this.f14192a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f14193b.put((String) entry.getKey(), (AbstractC1647Pa0) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f14193b.entrySet().iterator();
            while (it3.hasNext()) {
                AbstractC1647Pa0 abstractC1647Pa03 = (AbstractC1647Pa0) ((Map.Entry) it3.next()).getValue();
                abstractC1647Pa03.v();
                if (!abstractC1647Pa03.x()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized Optional p(final Class cls, String str, final EnumC6877c enumC6877c) {
        this.f14195d.d(enumC6877c, this.f14198g.a());
        AbstractC1647Pa0 n8 = n(str, enumC6877c);
        if (n8 == null) {
            return Optional.empty();
        }
        try {
            final Optional j8 = n8.j();
            Optional ofNullable = Optional.ofNullable(n8.i());
            Objects.requireNonNull(cls);
            Optional map = ofNullable.map(new Function() { // from class: com.google.android.gms.internal.ads.ya0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cls.cast(obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            map.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.za0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f28659a.g(enumC6877c, j8, obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return map;
        } catch (ClassCastException e8) {
            C2.v.s().x(e8, "PreloadAdManager.pollAd");
            AbstractC0608p0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e8);
            return Optional.empty();
        }
    }

    private final synchronized void q(String str, AbstractC1647Pa0 abstractC1647Pa0) {
        abstractC1647Pa0.g();
        this.f14192a.put(str, abstractC1647Pa0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void r(boolean z7) {
        try {
            if (z7) {
                Iterator it = this.f14192a.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC1647Pa0) it.next()).t();
                }
            } else {
                Iterator it2 = this.f14192a.values().iterator();
                while (it2.hasNext()) {
                    ((AbstractC1647Pa0) it2.next()).f18212f.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void s(boolean z7) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f24009t)).booleanValue()) {
            r(z7);
        }
    }

    private final synchronized boolean t(String str, EnumC6877c enumC6877c) {
        boolean z7;
        try {
            long a8 = this.f14198g.a();
            AbstractC1647Pa0 n8 = n(str, enumC6877c);
            z7 = false;
            if (n8 != null && n8.x()) {
                z7 = true;
            }
            this.f14195d.a(enumC6877c, a8, z7 ? Optional.of(Long.valueOf(this.f14198g.a())) : Optional.empty(), n8 == null ? Optional.empty() : n8.j());
        } catch (Throwable th) {
            throw th;
        }
        return z7;
    }

    public final synchronized InterfaceC4049sc a(String str) {
        return (InterfaceC4049sc) p(InterfaceC4049sc.class, str, EnumC6877c.APP_OPEN_AD).orElse(null);
    }

    public final synchronized D2.V b(String str) {
        return (D2.V) p(D2.V.class, str, EnumC6877c.INTERSTITIAL).orElse(null);
    }

    public final synchronized InterfaceC2443dp c(String str) {
        return (InterfaceC2443dp) p(InterfaceC2443dp.class, str, EnumC6877c.REWARDED).orElse(null);
    }

    final /* synthetic */ void g(EnumC6877c enumC6877c, Optional optional, Object obj) {
        this.f14195d.e(enumC6877c, this.f14198g.a(), optional);
    }

    public final void h() {
        if (this.f14197f == null) {
            synchronized (this) {
                if (this.f14197f == null) {
                    try {
                        this.f14197f = (ConnectivityManager) this.f14196e.getSystemService("connectivity");
                    } catch (ClassCastException e8) {
                        H2.p.h("Failed to get connectivity manager", e8);
                    }
                }
            }
        }
        if (!f3.m.i() || this.f14197f == null) {
            this.f14199h = new AtomicInteger(((Integer) D2.A.c().a(AbstractC3184kf.f24049y)).intValue());
            return;
        }
        try {
            this.f14197f.registerDefaultNetworkCallback(new C1150Ba0(this));
        } catch (RuntimeException e9) {
            H2.p.h("Failed to register network callback", e9);
            this.f14199h = new AtomicInteger(((Integer) D2.A.c().a(AbstractC3184kf.f24049y)).intValue());
        }
    }

    public final void i(InterfaceC1242Dl interfaceC1242Dl) {
        this.f14194c.b(interfaceC1242Dl);
    }

    public final synchronized void j(List list, InterfaceC0491c0 interfaceC0491c0) {
        try {
            List<D2.I1> o8 = o(list);
            EnumMap enumMap = new EnumMap(EnumC6877c.class);
            for (D2.I1 i12 : o8) {
                String str = i12.f1147o;
                EnumC6877c a8 = EnumC6877c.a(i12.f1148s);
                AbstractC1647Pa0 a9 = this.f14194c.a(i12, interfaceC0491c0);
                if (a8 != null && a9 != null) {
                    AtomicInteger atomicInteger = this.f14199h;
                    if (atomicInteger != null) {
                        a9.s(atomicInteger.get());
                    }
                    a9.u(this.f14195d);
                    q(d(str, a8), a9);
                    enumMap.put((EnumMap) a8, (EnumC6877c) Integer.valueOf(((Integer) Map.EL.getOrDefault(enumMap, a8, 0)).intValue() + 1));
                }
            }
            this.f14195d.f(enumMap, this.f14198g.a());
            C2.v.e().c(new C1114Aa0(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean k(String str) {
        return t(str, EnumC6877c.APP_OPEN_AD);
    }

    public final synchronized boolean l(String str) {
        return t(str, EnumC6877c.INTERSTITIAL);
    }

    public final synchronized boolean m(String str) {
        return t(str, EnumC6877c.REWARDED);
    }
}
