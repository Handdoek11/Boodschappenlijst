package m5;

import com.adadapted.android.sdk.core.atl.AddToListContent;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
final class y extends n {

    /* renamed from: e, reason: collision with root package name */
    private final n f39231e;

    /* renamed from: f, reason: collision with root package name */
    private final n f39232f;

    /* renamed from: g, reason: collision with root package name */
    private final k f39233g;

    /* renamed from: h, reason: collision with root package name */
    private final k f39234h;

    /* renamed from: i, reason: collision with root package name */
    private n f39235i;

    /* renamed from: j, reason: collision with root package name */
    private j f39236j;

    class a implements k {
        a() {
        }

        @Override // m5.k
        public void a(AddToListContent addToListContent) {
            if (y.this.f39235i == y.this.f39231e) {
                y.this.f39205c.a(addToListContent);
            }
        }

        @Override // m5.k
        public void b() {
            if (y.this.f39235i != y.this.f39231e || y.this.t()) {
                return;
            }
            y.this.f39205c.b();
        }
    }

    class b implements k {
        b() {
        }

        @Override // m5.k
        public void a(AddToListContent addToListContent) {
            if (y.this.f39235i == y.this.f39232f) {
                y.this.f39205c.a(addToListContent);
            }
        }

        @Override // m5.k
        public void b() {
            if (y.this.f39235i == y.this.f39232f) {
                y.this.f39205c.b();
            }
        }
    }

    private y(k kVar, n nVar, n nVar2) {
        super(null, null, kVar, null);
        a aVar = new a();
        this.f39233g = aVar;
        b bVar = new b();
        this.f39234h = bVar;
        this.f39236j = null;
        this.f39231e = nVar;
        this.f39232f = nVar2;
        this.f39235i = nVar;
        nVar.n(aVar);
        nVar2.n(bVar);
    }

    public static n s(k kVar, n nVar, n nVar2) {
        return nVar == null ? nVar2 : nVar2 == null ? nVar : new y(kVar, nVar, nVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        if (this.f39235i != this.f39231e) {
            return false;
        }
        AbstractC6635a.d("OG-MediationAdProvider", "Switching from " + this.f39231e.getClass().getSimpleName() + " to " + this.f39232f.getClass().getSimpleName());
        this.f39235i.j();
        this.f39235i.b();
        n nVar = this.f39232f;
        this.f39235i = nVar;
        if (!nVar.c()) {
            return false;
        }
        this.f39235i.i();
        this.f39235i.h();
        j jVar = this.f39236j;
        if (jVar == null) {
            return true;
        }
        this.f39235i.m(jVar);
        return true;
    }

    @Override // m5.n
    public void b() {
        this.f39235i.b();
    }

    @Override // m5.n
    public boolean c() {
        boolean c8 = this.f39235i.c();
        return (c8 || this.f39235i != this.f39231e) ? c8 : t();
    }

    @Override // m5.n
    public void e() {
        this.f39231e.e();
        this.f39232f.e();
    }

    @Override // m5.n
    public void g() {
        this.f39235i.g();
    }

    @Override // m5.n
    public void h() {
        this.f39235i.h();
    }

    @Override // m5.n
    public void i() {
        this.f39235i.i();
    }

    @Override // m5.n
    public void j() {
        this.f39235i.j();
    }

    @Override // m5.n
    public void l(String str) {
        this.f39235i.l(str);
    }

    @Override // m5.n
    public void m(j jVar) {
        this.f39236j = jVar;
        this.f39235i.m(jVar);
    }
}
