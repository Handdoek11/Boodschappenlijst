package com.bumptech.glide;

import N1.a;
import N1.i;
import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.manager.n;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q.C6397a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f12521c;

    /* renamed from: d, reason: collision with root package name */
    private M1.d f12522d;

    /* renamed from: e, reason: collision with root package name */
    private M1.b f12523e;

    /* renamed from: f, reason: collision with root package name */
    private N1.h f12524f;

    /* renamed from: g, reason: collision with root package name */
    private O1.a f12525g;

    /* renamed from: h, reason: collision with root package name */
    private O1.a f12526h;

    /* renamed from: i, reason: collision with root package name */
    private a.InterfaceC0073a f12527i;

    /* renamed from: j, reason: collision with root package name */
    private N1.i f12528j;

    /* renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.manager.c f12529k;

    /* renamed from: n, reason: collision with root package name */
    private n.b f12532n;

    /* renamed from: o, reason: collision with root package name */
    private O1.a f12533o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12534p;

    /* renamed from: q, reason: collision with root package name */
    private List f12535q;

    /* renamed from: a, reason: collision with root package name */
    private final Map f12519a = new C6397a();

    /* renamed from: b, reason: collision with root package name */
    private final e.a f12520b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    private int f12530l = 4;

    /* renamed from: m, reason: collision with root package name */
    private b.a f12531m = new a();

    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public Z1.f a() {
            return new Z1.f();
        }
    }

    static final class b {
    }

    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    public static final class C0216c {
    }

    com.bumptech.glide.b a(Context context, List list, X1.a aVar) {
        if (this.f12525g == null) {
            this.f12525g = O1.a.h();
        }
        if (this.f12526h == null) {
            this.f12526h = O1.a.f();
        }
        if (this.f12533o == null) {
            this.f12533o = O1.a.d();
        }
        if (this.f12528j == null) {
            this.f12528j = new i.a(context).a();
        }
        if (this.f12529k == null) {
            this.f12529k = new com.bumptech.glide.manager.e();
        }
        if (this.f12522d == null) {
            int b8 = this.f12528j.b();
            if (b8 > 0) {
                this.f12522d = new M1.k(b8);
            } else {
                this.f12522d = new M1.e();
            }
        }
        if (this.f12523e == null) {
            this.f12523e = new M1.i(this.f12528j.a());
        }
        if (this.f12524f == null) {
            this.f12524f = new N1.g(this.f12528j.d());
        }
        if (this.f12527i == null) {
            this.f12527i = new N1.f(context);
        }
        if (this.f12521c == null) {
            this.f12521c = new com.bumptech.glide.load.engine.j(this.f12524f, this.f12527i, this.f12526h, this.f12525g, O1.a.i(), this.f12533o, this.f12534p);
        }
        List list2 = this.f12535q;
        if (list2 == null) {
            this.f12535q = Collections.emptyList();
        } else {
            this.f12535q = DesugarCollections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f12521c, this.f12524f, this.f12522d, this.f12523e, new n(this.f12532n), this.f12529k, this.f12530l, this.f12531m, this.f12519a, this.f12535q, list, aVar, this.f12520b.b());
    }

    void b(n.b bVar) {
        this.f12532n = bVar;
    }
}
