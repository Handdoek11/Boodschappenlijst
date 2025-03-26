package U6;

import x6.C6916E;
import x6.C6934p;

/* loaded from: classes2.dex */
final class M0 extends B0 {

    /* renamed from: v, reason: collision with root package name */
    private final A6.d f5411v;

    public M0(A6.d dVar) {
        this.f5411v = dVar;
    }

    @Override // I6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Throwable) obj);
        return C6916E.f44463a;
    }

    @Override // U6.E
    public void v(Throwable th) {
        A6.d dVar = this.f5411v;
        C6934p.a aVar = C6934p.f44487s;
        dVar.resumeWith(C6934p.b(C6916E.f44463a));
    }
}
