package U6;

import x6.C6916E;
import x6.C6934p;

/* loaded from: classes2.dex */
final class L0 extends B0 {

    /* renamed from: v, reason: collision with root package name */
    private final C0733p f5410v;

    public L0(C0733p c0733p) {
        this.f5410v = c0733p;
    }

    @Override // I6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Throwable) obj);
        return C6916E.f44463a;
    }

    @Override // U6.E
    public void v(Throwable th) {
        Object n02 = w().n0();
        if (n02 instanceof C) {
            C0733p c0733p = this.f5410v;
            C6934p.a aVar = C6934p.f44487s;
            c0733p.resumeWith(C6934p.b(x6.q.a(((C) n02).f5374a)));
        } else {
            C0733p c0733p2 = this.f5410v;
            C6934p.a aVar2 = C6934p.f44487s;
            c0733p2.resumeWith(C6934p.b(D0.h(n02)));
        }
    }
}
