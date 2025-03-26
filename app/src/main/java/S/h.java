package S;

import B.e;
import J6.s;
import Q.AbstractC0682d;
import Q.B;
import Q.D;
import Q.InterfaceC0681c;
import Q.L;
import Q.M;
import Q.p;
import java.util.ArrayList;
import java.util.List;
import u.C6807b;
import x6.C6916E;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final e.c f5012a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5013b;

    /* renamed from: c, reason: collision with root package name */
    private final p f5014c;

    /* renamed from: d, reason: collision with root package name */
    private final S.e f5015d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5016e;

    /* renamed from: f, reason: collision with root package name */
    private h f5017f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5018g;

    static final class a extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ S.c f5019o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S.c cVar) {
            super(1);
            this.f5019o = cVar;
        }

        public final void b(o oVar) {
            m.d(oVar, this.f5019o.i());
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o) obj);
            return C6916E.f44463a;
        }
    }

    static final class b extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f5020o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f5020o = str;
        }

        public final void b(o oVar) {
            m.c(oVar, this.f5020o);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o) obj);
            return C6916E.f44463a;
        }
    }

    public static final class c extends e.c implements M {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ I6.l f5021h;

        c(I6.l lVar) {
            this.f5021h = lVar;
        }

        @Override // Q.M
        public /* synthetic */ boolean b() {
            return L.a(this);
        }

        @Override // Q.M
        public void e(o oVar) {
            this.f5021h.invoke(oVar);
        }

        @Override // Q.M
        public /* synthetic */ boolean h() {
            return L.b(this);
        }
    }

    static final class d extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final d f5022o = new d();

        d() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p pVar) {
            S.e j8 = pVar.j();
            boolean z7 = false;
            if (j8 != null && j8.p()) {
                z7 = true;
            }
            return Boolean.valueOf(z7);
        }
    }

    static final class e extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final e f5023o = new e();

        e() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p pVar) {
            S.e j8 = pVar.j();
            boolean z7 = false;
            if (j8 != null && j8.p()) {
                z7 = true;
            }
            return Boolean.valueOf(z7);
        }
    }

    static final class f extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final f f5024o = new f();

        f() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p pVar) {
            return Boolean.valueOf(pVar.B().g(D.a(8)));
        }
    }

    public h(e.c cVar, boolean z7, p pVar, S.e eVar) {
        this.f5012a = cVar;
        this.f5013b = z7;
        this.f5014c = pVar;
        this.f5015d = eVar;
        this.f5018g = pVar.G();
    }

    private final void a(List list) {
        S.c h8 = i.h(this);
        if (h8 != null && this.f5015d.p() && !list.isEmpty()) {
            list.add(b(h8, new a(h8)));
        }
        S.e eVar = this.f5015d;
        k kVar = k.f5032a;
        if (eVar.d(kVar.c()) && !list.isEmpty() && this.f5015d.p()) {
            List list2 = (List) S.f.a(this.f5015d, kVar.c());
            String str = list2 != null ? (String) AbstractC6987o.D(list2) : null;
            if (str != null) {
                list.add(0, b(null, new b(str)));
            }
        }
    }

    private final h b(S.c cVar, I6.l lVar) {
        S.e eVar = new S.e();
        eVar.s(false);
        eVar.r(false);
        lVar.invoke(eVar);
        h hVar = new h(new c(lVar), false, new p(true, cVar != null ? i.i(this) : i.e(this)), eVar);
        hVar.f5016e = true;
        hVar.f5017f = this;
        return hVar;
    }

    private final void c(p pVar, List list) {
        C6807b J7 = pVar.J();
        int q8 = J7.q();
        if (q8 > 0) {
            Object[] p8 = J7.p();
            int i8 = 0;
            do {
                p pVar2 = (p) p8[i8];
                if (pVar2.Q()) {
                    if (pVar2.B().g(D.a(8))) {
                        list.add(i.a(pVar2, this.f5013b));
                    } else {
                        c(pVar2, list);
                    }
                }
                i8++;
            } while (i8 < q8);
        }
    }

    private final List e(List list) {
        List v7 = v(this, false, 1, null);
        int size = v7.size();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = (h) v7.get(i8);
            if (hVar.q()) {
                list.add(hVar);
            } else if (!hVar.f5015d.o()) {
                hVar.e(list);
            }
        }
        return list;
    }

    static /* synthetic */ List f(h hVar, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = new ArrayList();
        }
        return hVar.e(list);
    }

    private final List i(boolean z7, boolean z8) {
        return (z7 || !this.f5015d.o()) ? q() ? f(this, null, 1, null) : u(z8) : AbstractC6987o.e();
    }

    private final boolean q() {
        return this.f5013b && this.f5015d.p();
    }

    private final void t(S.e eVar) {
        if (this.f5015d.o()) {
            return;
        }
        List v7 = v(this, false, 1, null);
        int size = v7.size();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = (h) v7.get(i8);
            if (!hVar.q()) {
                eVar.q(hVar.f5015d);
                hVar.t(eVar);
            }
        }
    }

    public static /* synthetic */ List v(h hVar, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return hVar.u(z7);
    }

    public final B d() {
        if (this.f5016e) {
            h n8 = n();
            if (n8 != null) {
                return n8.d();
            }
            return null;
        }
        InterfaceC0681c g8 = i.g(this.f5014c);
        if (g8 == null) {
            g8 = this.f5012a;
        }
        return AbstractC0682d.d(g8, D.a(8));
    }

    public final F.f g() {
        F.f b8;
        B d8 = d();
        if (d8 != null) {
            if (!d8.g()) {
                d8 = null;
            }
            if (d8 != null && (b8 = O.f.b(d8)) != null) {
                return b8;
            }
        }
        return F.f.f2218e.a();
    }

    public final List h() {
        return i(!this.f5013b, false);
    }

    public final S.e j() {
        if (!q()) {
            return this.f5015d;
        }
        S.e e8 = this.f5015d.e();
        t(e8);
        return e8;
    }

    public final int k() {
        return this.f5018g;
    }

    public final O.g l() {
        return this.f5014c;
    }

    public final p m() {
        return this.f5014c;
    }

    public final h n() {
        h hVar = this.f5017f;
        if (hVar != null) {
            return hVar;
        }
        p f8 = this.f5013b ? i.f(this.f5014c, e.f5023o) : null;
        if (f8 == null) {
            f8 = i.f(this.f5014c, f.f5024o);
        }
        if (f8 == null) {
            return null;
        }
        return i.a(f8, this.f5013b);
    }

    public final List o() {
        return i(false, true);
    }

    public final S.e p() {
        return this.f5015d;
    }

    public final boolean r() {
        B d8 = d();
        if (d8 != null) {
            return d8.J0();
        }
        return false;
    }

    public final boolean s() {
        return !this.f5016e && o().isEmpty() && i.f(this.f5014c, d.f5022o) == null;
    }

    public final List u(boolean z7) {
        if (this.f5016e) {
            return AbstractC6987o.e();
        }
        ArrayList arrayList = new ArrayList();
        c(this.f5014c, arrayList);
        if (z7) {
            a(arrayList);
        }
        return arrayList;
    }
}
