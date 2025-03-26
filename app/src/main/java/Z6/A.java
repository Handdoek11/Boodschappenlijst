package Z6;

import U6.AbstractC0703a;

/* loaded from: classes2.dex */
public class A extends AbstractC0703a implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: u, reason: collision with root package name */
    public final A6.d f6446u;

    public A(A6.g gVar, A6.d dVar) {
        super(gVar, true, true);
        this.f6446u = dVar;
    }

    @Override // U6.AbstractC0703a
    protected void V0(Object obj) {
        A6.d dVar = this.f6446u;
        dVar.resumeWith(U6.F.a(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        A6.d dVar = this.f6446u;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // U6.C0
    protected final boolean s0() {
        return true;
    }

    @Override // U6.C0
    protected void v(Object obj) {
        AbstractC0796j.c(B6.b.c(this.f6446u), U6.F.a(obj, this.f6446u), null, 2, null);
    }
}
