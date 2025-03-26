package B3;

import C3.k2;

/* loaded from: classes2.dex */
final class B implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ k2 f397o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f398s;

    B(E e8, k2 k2Var) {
        this.f397o = k2Var;
        this.f398s = e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f398s.f404s.p(this.f397o);
    }
}
