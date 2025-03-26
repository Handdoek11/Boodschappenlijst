package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class Q implements c0 {

    /* renamed from: a, reason: collision with root package name */
    private final M f9329a;

    /* renamed from: b, reason: collision with root package name */
    private final i0 f9330b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9331c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC0891o f9332d;

    private Q(i0 i0Var, AbstractC0891o abstractC0891o, M m8) {
        this.f9330b = i0Var;
        this.f9331c = abstractC0891o.e(m8);
        this.f9332d = abstractC0891o;
        this.f9329a = m8;
    }

    private int j(i0 i0Var, Object obj) {
        return i0Var.i(i0Var.g(obj));
    }

    private void k(i0 i0Var, AbstractC0891o abstractC0891o, Object obj, b0 b0Var, C0890n c0890n) {
        Object f8 = i0Var.f(obj);
        r d8 = abstractC0891o.d(obj);
        while (b0Var.y() != Integer.MAX_VALUE) {
            try {
                if (!m(b0Var, c0890n, abstractC0891o, d8, i0Var, f8)) {
                    return;
                }
            } finally {
                i0Var.o(obj, f8);
            }
        }
    }

    static Q l(i0 i0Var, AbstractC0891o abstractC0891o, M m8) {
        return new Q(i0Var, abstractC0891o, m8);
    }

    private boolean m(b0 b0Var, C0890n c0890n, AbstractC0891o abstractC0891o, r rVar, i0 i0Var, Object obj) {
        int a8 = b0Var.a();
        if (a8 != o0.f9464a) {
            if (o0.b(a8) != 2) {
                return b0Var.F();
            }
            Object b8 = abstractC0891o.b(c0890n, this.f9329a, o0.a(a8));
            if (b8 == null) {
                return i0Var.m(obj, b0Var);
            }
            abstractC0891o.h(b0Var, b8, c0890n, rVar);
            return true;
        }
        Object obj2 = null;
        int i8 = 0;
        AbstractC0883g abstractC0883g = null;
        while (b0Var.y() != Integer.MAX_VALUE) {
            int a9 = b0Var.a();
            if (a9 == o0.f9466c) {
                i8 = b0Var.m();
                obj2 = abstractC0891o.b(c0890n, this.f9329a, i8);
            } else if (a9 == o0.f9467d) {
                if (obj2 != null) {
                    abstractC0891o.h(b0Var, obj2, c0890n, rVar);
                } else {
                    abstractC0883g = b0Var.B();
                }
            } else if (!b0Var.F()) {
                break;
            }
        }
        if (b0Var.a() != o0.f9465b) {
            throw InvalidProtocolBufferException.a();
        }
        if (abstractC0883g != null) {
            if (obj2 != null) {
                abstractC0891o.i(abstractC0883g, obj2, c0890n, rVar);
            } else {
                i0Var.d(obj, i8, abstractC0883g);
            }
        }
        return true;
    }

    private void n(i0 i0Var, Object obj, p0 p0Var) {
        i0Var.s(i0Var.g(obj), p0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void a(Object obj, Object obj2) {
        e0.F(this.f9330b, obj, obj2);
        if (this.f9331c) {
            e0.D(this.f9332d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void b(Object obj, b0 b0Var, C0890n c0890n) {
        k(this.f9330b, this.f9332d, obj, b0Var, c0890n);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void c(Object obj) {
        this.f9330b.j(obj);
        this.f9332d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final boolean d(Object obj) {
        return this.f9332d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void e(Object obj, p0 p0Var) {
        Iterator n8 = this.f9332d.c(obj).n();
        if (n8.hasNext()) {
            androidx.appcompat.app.E.a(((Map.Entry) n8.next()).getKey());
            throw null;
        }
        n(this.f9330b, obj, p0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean f(Object obj, Object obj2) {
        if (!this.f9330b.g(obj).equals(this.f9330b.g(obj2))) {
            return false;
        }
        if (this.f9331c) {
            return this.f9332d.c(obj).equals(this.f9332d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int g(Object obj) {
        int j8 = j(this.f9330b, obj);
        return this.f9331c ? j8 + this.f9332d.c(obj).f() : j8;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public Object h() {
        return this.f9329a.i().j();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int i(Object obj) {
        int hashCode = this.f9330b.g(obj).hashCode();
        return this.f9331c ? (hashCode * 53) + this.f9332d.c(obj).hashCode() : hashCode;
    }
}
