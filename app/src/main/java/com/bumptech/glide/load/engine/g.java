package com.bumptech.glide.load.engine;

import P1.n;
import com.bumptech.glide.load.engine.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final List f12679a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f12680b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f12681c;

    /* renamed from: d, reason: collision with root package name */
    private Object f12682d;

    /* renamed from: e, reason: collision with root package name */
    private int f12683e;

    /* renamed from: f, reason: collision with root package name */
    private int f12684f;

    /* renamed from: g, reason: collision with root package name */
    private Class f12685g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f12686h;

    /* renamed from: i, reason: collision with root package name */
    private J1.h f12687i;

    /* renamed from: j, reason: collision with root package name */
    private Map f12688j;

    /* renamed from: k, reason: collision with root package name */
    private Class f12689k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12690l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12691m;

    /* renamed from: n, reason: collision with root package name */
    private J1.e f12692n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f12693o;

    /* renamed from: p, reason: collision with root package name */
    private L1.a f12694p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12695q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f12696r;

    g() {
    }

    void a() {
        this.f12681c = null;
        this.f12682d = null;
        this.f12692n = null;
        this.f12685g = null;
        this.f12689k = null;
        this.f12687i = null;
        this.f12693o = null;
        this.f12688j = null;
        this.f12694p = null;
        this.f12679a.clear();
        this.f12690l = false;
        this.f12680b.clear();
        this.f12691m = false;
    }

    M1.b b() {
        return this.f12681c.b();
    }

    List c() {
        if (!this.f12691m) {
            this.f12691m = true;
            this.f12680b.clear();
            List g8 = g();
            int size = g8.size();
            for (int i8 = 0; i8 < size; i8++) {
                n.a aVar = (n.a) g8.get(i8);
                if (!this.f12680b.contains(aVar.f4351a)) {
                    this.f12680b.add(aVar.f4351a);
                }
                for (int i9 = 0; i9 < aVar.f4352b.size(); i9++) {
                    if (!this.f12680b.contains(aVar.f4352b.get(i9))) {
                        this.f12680b.add(aVar.f4352b.get(i9));
                    }
                }
            }
        }
        return this.f12680b;
    }

    N1.a d() {
        return this.f12686h.a();
    }

    L1.a e() {
        return this.f12694p;
    }

    int f() {
        return this.f12684f;
    }

    List g() {
        if (!this.f12690l) {
            this.f12690l = true;
            this.f12679a.clear();
            List i8 = this.f12681c.i().i(this.f12682d);
            int size = i8.size();
            for (int i9 = 0; i9 < size; i9++) {
                n.a a8 = ((P1.n) i8.get(i9)).a(this.f12682d, this.f12683e, this.f12684f, this.f12687i);
                if (a8 != null) {
                    this.f12679a.add(a8);
                }
            }
        }
        return this.f12679a;
    }

    q h(Class cls) {
        return this.f12681c.i().h(cls, this.f12685g, this.f12689k);
    }

    Class i() {
        return this.f12682d.getClass();
    }

    List j(File file) {
        return this.f12681c.i().i(file);
    }

    J1.h k() {
        return this.f12687i;
    }

    com.bumptech.glide.g l() {
        return this.f12693o;
    }

    List m() {
        return this.f12681c.i().j(this.f12682d.getClass(), this.f12685g, this.f12689k);
    }

    J1.k n(L1.c cVar) {
        return this.f12681c.i().k(cVar);
    }

    com.bumptech.glide.load.data.e o(Object obj) {
        return this.f12681c.i().l(obj);
    }

    J1.e p() {
        return this.f12692n;
    }

    J1.d q(Object obj) {
        return this.f12681c.i().m(obj);
    }

    Class r() {
        return this.f12689k;
    }

    J1.l s(Class cls) {
        J1.l lVar = (J1.l) this.f12688j.get(cls);
        if (lVar == null) {
            Iterator it = this.f12688j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (J1.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f12688j.isEmpty() || !this.f12695q) {
            return R1.n.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f12683e;
    }

    boolean u(Class cls) {
        return h(cls) != null;
    }

    void v(com.bumptech.glide.d dVar, Object obj, J1.e eVar, int i8, int i9, L1.a aVar, Class cls, Class cls2, com.bumptech.glide.g gVar, J1.h hVar, Map map, boolean z7, boolean z8, h.e eVar2) {
        this.f12681c = dVar;
        this.f12682d = obj;
        this.f12692n = eVar;
        this.f12683e = i8;
        this.f12684f = i9;
        this.f12694p = aVar;
        this.f12685g = cls;
        this.f12686h = eVar2;
        this.f12689k = cls2;
        this.f12693o = gVar;
        this.f12687i = hVar;
        this.f12688j = map;
        this.f12695q = z7;
        this.f12696r = z8;
    }

    boolean w(L1.c cVar) {
        return this.f12681c.i().n(cVar);
    }

    boolean x() {
        return this.f12696r;
    }

    boolean y(J1.e eVar) {
        List g8 = g();
        int size = g8.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((n.a) g8.get(i8)).f4351a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
