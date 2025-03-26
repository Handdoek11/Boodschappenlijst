package t;

import A6.g;
import U6.AbstractC0719i;
import U6.C0706b0;
import android.view.Choreographer;
import t.u;
import x6.C6916E;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6774l implements u {

    /* renamed from: o, reason: collision with root package name */
    public static final C6774l f43776o = new C6774l();

    /* renamed from: s, reason: collision with root package name */
    private static final Choreographer f43777s = (Choreographer) AbstractC0719i.e(C0706b0.c().A0(), new a(null));

    /* renamed from: t.l$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f43778o;

        a(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return new a(dVar);
        }

        @Override // I6.p
        public final Object invoke(U6.M m8, A6.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            B6.b.e();
            if (this.f43778o != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x6.q.b(obj);
            return Choreographer.getInstance();
        }
    }

    private C6774l() {
    }

    @Override // A6.g.b, A6.g
    public g.b d(g.c cVar) {
        return u.a.b(this, cVar);
    }

    @Override // A6.g.b, A6.g
    public Object e(Object obj, I6.p pVar) {
        return u.a.a(this, obj, pVar);
    }

    @Override // A6.g.b, A6.g
    public A6.g f(g.c cVar) {
        return u.a.c(this, cVar);
    }

    @Override // A6.g.b
    public /* synthetic */ g.c getKey() {
        return t.a(this);
    }

    @Override // A6.g
    public A6.g u(A6.g gVar) {
        return u.a.d(this, gVar);
    }
}
