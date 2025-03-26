package T5;

import I6.q;
import J6.L;
import J6.r;
import T5.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class d {
    private volatile /* synthetic */ Object _interceptors;

    /* renamed from: a, reason: collision with root package name */
    private final N5.b f5275a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5276b;

    /* renamed from: c, reason: collision with root package name */
    private int f5277c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5278d;

    /* renamed from: e, reason: collision with root package name */
    private h f5279e;

    public d(h... hVarArr) {
        r.e(hVarArr, "phases");
        this.f5275a = N5.d.a(true);
        this.f5276b = AbstractC6987o.h(Arrays.copyOf(hVarArr, hVarArr.length));
        this._interceptors = null;
    }

    private final List b() {
        int f8;
        int i8 = this.f5277c;
        if (i8 == 0) {
            m(AbstractC6987o.e());
            return AbstractC6987o.e();
        }
        List list = this.f5276b;
        int i9 = 0;
        if (i8 == 1 && (f8 = AbstractC6987o.f(list)) >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = list.get(i10);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && !cVar.h()) {
                    List i11 = cVar.i();
                    p(cVar);
                    return i11;
                }
                if (i10 == f8) {
                    break;
                }
                i10++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int f9 = AbstractC6987o.f(list);
        if (f9 >= 0) {
            while (true) {
                Object obj2 = list.get(i9);
                c cVar2 = obj2 instanceof c ? (c) obj2 : null;
                if (cVar2 != null) {
                    cVar2.b(arrayList);
                }
                if (i9 == f9) {
                    break;
                }
                i9++;
            }
        }
        m(arrayList);
        return arrayList;
    }

    private final e c(Object obj, Object obj2, A6.g gVar) {
        return f.a(obj, q(), obj2, gVar, g());
    }

    private final c e(h hVar) {
        List list = this.f5276b;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj == hVar) {
                c cVar = new c(hVar, i.c.f5285a);
                list.set(i8, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                if (cVar2.e() == hVar) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final int f(h hVar) {
        List list = this.f5276b;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj == hVar || ((obj instanceof c) && ((c) obj).e() == hVar)) {
                return i8;
            }
        }
        return -1;
    }

    private final List h() {
        return (List) this._interceptors;
    }

    private final boolean i(h hVar) {
        List list = this.f5276b;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj == hVar) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).e() == hVar) {
                return true;
            }
        }
        return false;
    }

    private final void m(List list) {
        o(list);
        this.f5278d = false;
        this.f5279e = null;
    }

    private final void n() {
        o(null);
        this.f5278d = false;
        this.f5279e = null;
    }

    private final void o(List list) {
        this._interceptors = list;
    }

    private final void p(c cVar) {
        o(cVar.i());
        this.f5278d = false;
        this.f5279e = cVar.e();
    }

    private final List q() {
        if (h() == null) {
            b();
        }
        this.f5278d = true;
        List h8 = h();
        r.b(h8);
        return h8;
    }

    private final boolean r(h hVar, q qVar) {
        List h8 = h();
        if (this.f5276b.isEmpty() || h8 == null || this.f5278d || !L.j(h8)) {
            return false;
        }
        if (r.a(this.f5279e, hVar)) {
            h8.add(qVar);
            return true;
        }
        if (!r.a(hVar, AbstractC6987o.J(this.f5276b)) && f(hVar) != AbstractC6987o.f(this.f5276b)) {
            return false;
        }
        c e8 = e(hVar);
        r.b(e8);
        e8.a(qVar);
        h8.add(qVar);
        return true;
    }

    public final Object d(Object obj, Object obj2, A6.d dVar) {
        return c(obj, obj2, dVar.getContext()).a(obj2, dVar);
    }

    public abstract boolean g();

    public final void j(h hVar, h hVar2) {
        i f8;
        h a8;
        r.e(hVar, "reference");
        r.e(hVar2, "phase");
        if (i(hVar2)) {
            return;
        }
        int f9 = f(hVar);
        if (f9 == -1) {
            throw new b("Phase " + hVar + " was not registered for this pipeline");
        }
        int i8 = f9 + 1;
        int f10 = AbstractC6987o.f(this.f5276b);
        if (i8 <= f10) {
            while (true) {
                Object obj = this.f5276b.get(i8);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && (f8 = cVar.f()) != null) {
                    i.a aVar = f8 instanceof i.a ? (i.a) f8 : null;
                    if (aVar != null && (a8 = aVar.a()) != null && r.a(a8, hVar)) {
                        f9 = i8;
                    }
                    if (i8 == f10) {
                        break;
                    } else {
                        i8++;
                    }
                } else {
                    break;
                }
            }
        }
        this.f5276b.add(f9 + 1, new c(hVar2, new i.a(hVar)));
    }

    public final void k(h hVar, h hVar2) {
        r.e(hVar, "reference");
        r.e(hVar2, "phase");
        if (i(hVar2)) {
            return;
        }
        int f8 = f(hVar);
        if (f8 != -1) {
            this.f5276b.add(f8, new c(hVar2, new i.b(hVar)));
            return;
        }
        throw new b("Phase " + hVar + " was not registered for this pipeline");
    }

    public final void l(h hVar, q qVar) {
        r.e(hVar, "phase");
        r.e(qVar, "block");
        c e8 = e(hVar);
        if (e8 == null) {
            throw new b("Phase " + hVar + " was not registered for this pipeline");
        }
        if (r(hVar, qVar)) {
            this.f5277c++;
            return;
        }
        e8.a(qVar);
        this.f5277c++;
        n();
        a();
    }

    public void a() {
    }
}
