package W;

import J6.AbstractC0650j;
import W.g;
import t.M;

/* loaded from: classes.dex */
public final class h implements g.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f5749a;

    /* renamed from: b, reason: collision with root package name */
    private final r f5750b;

    /* renamed from: c, reason: collision with root package name */
    private final y f5751c;

    /* renamed from: d, reason: collision with root package name */
    private final k f5752d;

    /* renamed from: e, reason: collision with root package name */
    private final p f5753e;

    /* renamed from: f, reason: collision with root package name */
    private final I6.l f5754f;

    static final class a extends J6.s implements I6.l {
        a() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(x xVar) {
            return h.this.f(x.b(xVar, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    static final class b extends J6.s implements I6.l {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ x f5757s;

        b(x xVar) {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z invoke(I6.l lVar) {
            z a8 = h.this.f5752d.a(this.f5757s, h.this.e(), lVar, h.this.f5754f);
            if (a8 == null && (a8 = h.this.f5753e.a(this.f5757s, h.this.e(), lVar, h.this.f5754f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return a8;
        }
    }

    public h(q qVar, r rVar, y yVar, k kVar, p pVar) {
        this.f5749a = qVar;
        this.f5750b = rVar;
        this.f5751c = yVar;
        this.f5752d = kVar;
        this.f5753e = pVar;
        this.f5754f = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M f(x xVar) {
        return this.f5751c.c(xVar, new b(xVar));
    }

    public final q e() {
        return this.f5749a;
    }

    public /* synthetic */ h(q qVar, r rVar, y yVar, k kVar, p pVar, int i8, AbstractC0650j abstractC0650j) {
        this(qVar, (i8 & 2) != 0 ? r.f5791a.a() : rVar, (i8 & 4) != 0 ? i.b() : yVar, (i8 & 8) != 0 ? new k(i.a(), null, 2, 0 == true ? 1 : 0) : kVar, (i8 & 16) != 0 ? new p() : pVar);
    }
}
