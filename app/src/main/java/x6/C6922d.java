package x6;

import J6.L;
import x6.C6934p;

/* renamed from: x6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6922d extends AbstractC6921c implements A6.d {

    /* renamed from: o, reason: collision with root package name */
    private I6.q f44468o;

    /* renamed from: s, reason: collision with root package name */
    private Object f44469s;

    /* renamed from: t, reason: collision with root package name */
    private A6.d f44470t;

    /* renamed from: u, reason: collision with root package name */
    private Object f44471u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6922d(I6.q qVar, Object obj) {
        super(null);
        J6.r.e(qVar, "block");
        this.f44468o = qVar;
        this.f44469s = obj;
        J6.r.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f44470t = this;
        this.f44471u = AbstractC6920b.f44467a;
    }

    @Override // x6.AbstractC6921c
    public Object a(Object obj, A6.d dVar) {
        J6.r.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f44470t = dVar;
        this.f44469s = obj;
        Object e8 = B6.b.e();
        if (e8 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e8;
    }

    public final Object c() {
        while (true) {
            Object obj = this.f44471u;
            A6.d dVar = this.f44470t;
            if (dVar == null) {
                q.b(obj);
                return obj;
            }
            if (C6934p.d(AbstractC6920b.f44467a, obj)) {
                try {
                    I6.q qVar = this.f44468o;
                    Object obj2 = this.f44469s;
                    Object d8 = !(qVar instanceof kotlin.coroutines.jvm.internal.a) ? B6.b.d(qVar, this, obj2, dVar) : ((I6.q) L.d(qVar, 3)).d(this, obj2, dVar);
                    if (d8 != B6.b.e()) {
                        dVar.resumeWith(C6934p.b(d8));
                    }
                } catch (Throwable th) {
                    C6934p.a aVar = C6934p.f44487s;
                    dVar.resumeWith(C6934p.b(q.a(th)));
                }
            } else {
                this.f44471u = AbstractC6920b.f44467a;
                dVar.resumeWith(obj);
            }
        }
    }

    @Override // A6.d
    public A6.g getContext() {
        return A6.h.f250o;
    }

    @Override // A6.d
    public void resumeWith(Object obj) {
        this.f44470t = null;
        this.f44471u = obj;
    }
}
