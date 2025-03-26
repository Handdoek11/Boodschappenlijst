package B3;

import C3.C0434j;

/* loaded from: classes2.dex */
final class A implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C0434j f395o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f396s;

    A(E e8, C0434j c0434j) {
        this.f395o = c0434j;
        this.f396s = e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f396s.f404s.a(this.f395o);
    }
}
