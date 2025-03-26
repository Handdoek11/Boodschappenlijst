package y5;

import A6.g;
import I6.p;
import J6.AbstractC0650j;
import J6.r;

/* loaded from: classes2.dex */
public final class i implements g.b {

    /* renamed from: s, reason: collision with root package name */
    public static final a f44624s = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final A6.g f44625o;

    public static final class a implements g.c {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public i(A6.g gVar) {
        r.e(gVar, "callContext");
        this.f44625o = gVar;
    }

    public final A6.g a() {
        return this.f44625o;
    }

    @Override // A6.g.b, A6.g
    public g.b d(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // A6.g.b, A6.g
    public Object e(Object obj, p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    @Override // A6.g.b, A6.g
    public A6.g f(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // A6.g.b
    public g.c getKey() {
        return f44624s;
    }

    @Override // A6.g
    public A6.g u(A6.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
