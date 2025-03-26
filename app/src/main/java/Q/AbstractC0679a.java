package Q;

import J6.AbstractC0650j;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import x6.C6916E;
import y6.AbstractC6971J;

/* renamed from: Q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0679a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0680b f4506a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4507b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4508c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4509d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4510e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4511f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4512g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC0680b f4513h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f4514i;

    /* renamed from: Q.a$a, reason: collision with other inner class name */
    static final class C0089a extends J6.s implements I6.l {
        C0089a() {
            super(1);
        }

        public final void b(InterfaceC0680b interfaceC0680b) {
            if (interfaceC0680b.p()) {
                if (interfaceC0680b.a().g()) {
                    interfaceC0680b.o();
                }
                Map map = interfaceC0680b.a().f4514i;
                AbstractC0679a abstractC0679a = AbstractC0679a.this;
                for (Map.Entry entry : map.entrySet()) {
                    abstractC0679a.c((O.a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0680b.e());
                }
                B y02 = interfaceC0680b.e().y0();
                J6.r.b(y02);
                while (!J6.r.a(y02, AbstractC0679a.this.f().e())) {
                    Set<O.a> keySet = AbstractC0679a.this.e(y02).keySet();
                    AbstractC0679a abstractC0679a2 = AbstractC0679a.this;
                    for (O.a aVar : keySet) {
                        abstractC0679a2.c(aVar, abstractC0679a2.i(y02, aVar), y02);
                    }
                    y02 = y02.y0();
                    J6.r.b(y02);
                }
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC0680b) obj);
            return C6916E.f44463a;
        }
    }

    public /* synthetic */ AbstractC0679a(InterfaceC0680b interfaceC0680b, AbstractC0650j abstractC0650j) {
        this(interfaceC0680b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(O.a aVar, int i8, B b8) {
        float f8 = i8;
        long a8 = F.e.a(f8, f8);
        while (true) {
            a8 = d(b8, a8);
            b8 = b8.y0();
            J6.r.b(b8);
            if (J6.r.a(b8, this.f4506a.e())) {
                break;
            } else if (e(b8).containsKey(aVar)) {
                float i9 = i(b8, aVar);
                a8 = F.e.a(i9, i9);
            }
        }
        int a9 = aVar instanceof O.c ? L6.a.a(F.d.g(a8)) : L6.a.a(F.d.f(a8));
        Map map = this.f4514i;
        if (map.containsKey(aVar)) {
            a9 = O.b.a(aVar, ((Number) AbstractC6971J.f(this.f4514i, aVar)).intValue(), a9);
        }
        map.put(aVar, Integer.valueOf(a9));
    }

    protected abstract long d(B b8, long j8);

    protected abstract Map e(B b8);

    public final InterfaceC0680b f() {
        return this.f4506a;
    }

    public final boolean g() {
        return this.f4507b;
    }

    public final Map h() {
        return this.f4514i;
    }

    protected abstract int i(B b8, O.a aVar);

    public final boolean j() {
        return this.f4508c || this.f4510e || this.f4511f || this.f4512g;
    }

    public final boolean k() {
        o();
        return this.f4513h != null;
    }

    public final boolean l() {
        return this.f4509d;
    }

    public final void m() {
        this.f4507b = true;
        InterfaceC0680b f8 = this.f4506a.f();
        if (f8 == null) {
            return;
        }
        if (this.f4508c) {
            f8.r();
        } else if (this.f4510e || this.f4509d) {
            f8.requestLayout();
        }
        if (this.f4511f) {
            this.f4506a.r();
        }
        if (this.f4512g) {
            this.f4506a.requestLayout();
        }
        f8.a().m();
    }

    public final void n() {
        this.f4514i.clear();
        this.f4506a.n(new C0089a());
        this.f4514i.putAll(e(this.f4506a.e()));
        this.f4507b = false;
    }

    public final void o() {
        InterfaceC0680b interfaceC0680b;
        AbstractC0679a a8;
        AbstractC0679a a9;
        if (j()) {
            interfaceC0680b = this.f4506a;
        } else {
            InterfaceC0680b f8 = this.f4506a.f();
            if (f8 == null) {
                return;
            }
            interfaceC0680b = f8.a().f4513h;
            if (interfaceC0680b == null || !interfaceC0680b.a().j()) {
                InterfaceC0680b interfaceC0680b2 = this.f4513h;
                if (interfaceC0680b2 == null || interfaceC0680b2.a().j()) {
                    return;
                }
                InterfaceC0680b f9 = interfaceC0680b2.f();
                if (f9 != null && (a9 = f9.a()) != null) {
                    a9.o();
                }
                InterfaceC0680b f10 = interfaceC0680b2.f();
                interfaceC0680b = (f10 == null || (a8 = f10.a()) == null) ? null : a8.f4513h;
            }
        }
        this.f4513h = interfaceC0680b;
    }

    public final void p(boolean z7) {
        this.f4510e = z7;
    }

    public final void q(boolean z7) {
        this.f4512g = z7;
    }

    public final void r(boolean z7) {
        this.f4511f = z7;
    }

    public final void s(boolean z7) {
        this.f4509d = z7;
    }

    public final void t(boolean z7) {
        this.f4508c = z7;
    }

    private AbstractC0679a(InterfaceC0680b interfaceC0680b) {
        this.f4506a = interfaceC0680b;
        this.f4507b = true;
        this.f4514i = new HashMap();
    }
}
