package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class OB0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1945Xk f17848a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC4169th0 f17849b = AbstractC4169th0.w();

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4496wh0 f17850c = AbstractC4496wh0.e();

    /* renamed from: d, reason: collision with root package name */
    private GG0 f17851d;

    /* renamed from: e, reason: collision with root package name */
    private GG0 f17852e;

    /* renamed from: f, reason: collision with root package name */
    private GG0 f17853f;

    public OB0(C1945Xk c1945Xk) {
        this.f17848a = c1945Xk;
    }

    private static GG0 j(InterfaceC2106aj interfaceC2106aj, AbstractC4169th0 abstractC4169th0, GG0 gg0, C1945Xk c1945Xk) {
        AbstractC1981Yl l8 = interfaceC2106aj.l();
        int b8 = interfaceC2106aj.b();
        Object f8 = l8.o() ? null : l8.f(b8);
        int c8 = (interfaceC2106aj.w() || l8.o()) ? -1 : l8.d(b8, c1945Xk, false).c(AbstractC2301cW.K(interfaceC2106aj.i()));
        for (int i8 = 0; i8 < abstractC4169th0.size(); i8++) {
            GG0 gg02 = (GG0) abstractC4169th0.get(i8);
            if (m(gg02, f8, interfaceC2106aj.w(), interfaceC2106aj.zzb(), interfaceC2106aj.a(), c8)) {
                return gg02;
            }
        }
        if (abstractC4169th0.isEmpty() && gg0 != null) {
            if (m(gg0, f8, interfaceC2106aj.w(), interfaceC2106aj.zzb(), interfaceC2106aj.a(), c8)) {
                return gg0;
            }
        }
        return null;
    }

    private final void k(C4387vh0 c4387vh0, GG0 gg0, AbstractC1981Yl abstractC1981Yl) {
        if (gg0 == null) {
            return;
        }
        if (abstractC1981Yl.a(gg0.f15340a) != -1) {
            c4387vh0.a(gg0, abstractC1981Yl);
            return;
        }
        AbstractC1981Yl abstractC1981Yl2 = (AbstractC1981Yl) this.f17850c.get(gg0);
        if (abstractC1981Yl2 != null) {
            c4387vh0.a(gg0, abstractC1981Yl2);
        }
    }

    private final void l(AbstractC1981Yl abstractC1981Yl) {
        C4387vh0 c4387vh0 = new C4387vh0();
        if (this.f17849b.isEmpty()) {
            k(c4387vh0, this.f17852e, abstractC1981Yl);
            if (!AbstractC1657Pf0.a(this.f17853f, this.f17852e)) {
                k(c4387vh0, this.f17853f, abstractC1981Yl);
            }
            if (!AbstractC1657Pf0.a(this.f17851d, this.f17852e) && !AbstractC1657Pf0.a(this.f17851d, this.f17853f)) {
                k(c4387vh0, this.f17851d, abstractC1981Yl);
            }
        } else {
            for (int i8 = 0; i8 < this.f17849b.size(); i8++) {
                k(c4387vh0, (GG0) this.f17849b.get(i8), abstractC1981Yl);
            }
            if (!this.f17849b.contains(this.f17851d)) {
                k(c4387vh0, this.f17851d, abstractC1981Yl);
            }
        }
        this.f17850c = c4387vh0.c();
    }

    private static boolean m(GG0 gg0, Object obj, boolean z7, int i8, int i9, int i10) {
        if (!gg0.f15340a.equals(obj)) {
            return false;
        }
        if (z7) {
            if (gg0.f15341b != i8 || gg0.f15342c != i9) {
                return false;
            }
        } else if (gg0.f15341b != -1 || gg0.f15344e != i10) {
            return false;
        }
        return true;
    }

    public final AbstractC1981Yl a(GG0 gg0) {
        return (AbstractC1981Yl) this.f17850c.get(gg0);
    }

    public final GG0 b() {
        return this.f17851d;
    }

    public final GG0 c() {
        Object next;
        Object obj;
        if (this.f17849b.isEmpty()) {
            return null;
        }
        AbstractC4169th0 abstractC4169th0 = this.f17849b;
        if (!(abstractC4169th0 instanceof List)) {
            Iterator<E> it = abstractC4169th0.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (abstractC4169th0.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = abstractC4169th0.get(abstractC4169th0.size() - 1);
        }
        return (GG0) obj;
    }

    public final GG0 d() {
        return this.f17852e;
    }

    public final GG0 e() {
        return this.f17853f;
    }

    public final void g(InterfaceC2106aj interfaceC2106aj) {
        this.f17851d = j(interfaceC2106aj, this.f17849b, this.f17852e, this.f17848a);
    }

    public final void h(List list, GG0 gg0, InterfaceC2106aj interfaceC2106aj) {
        this.f17849b = AbstractC4169th0.t(list);
        if (!list.isEmpty()) {
            this.f17852e = (GG0) list.get(0);
            gg0.getClass();
            this.f17853f = gg0;
        }
        if (this.f17851d == null) {
            this.f17851d = j(interfaceC2106aj, this.f17849b, this.f17852e, this.f17848a);
        }
        l(interfaceC2106aj.l());
    }

    public final void i(InterfaceC2106aj interfaceC2106aj) {
        this.f17851d = j(interfaceC2106aj, this.f17849b, this.f17852e, this.f17848a);
        l(interfaceC2106aj.l());
    }
}
