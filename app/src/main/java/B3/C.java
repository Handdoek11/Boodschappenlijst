package B3;

import C3.W1;

/* loaded from: classes2.dex */
final class C implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ W1 f399o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f400s;

    C(E e8, W1 w12) {
        this.f399o = w12;
        this.f400s = e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f400s.f404s.m(this.f399o);
    }
}
