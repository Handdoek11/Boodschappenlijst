package B3;

import C3.C0452p;

/* loaded from: classes2.dex */
final class D implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C0452p f401o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f402s;

    D(E e8, C0452p c0452p) {
        this.f401o = c0452p;
        this.f402s = e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f401o.A0(this.f402s.f404s);
        this.f401o.A0(this.f402s.f404s.f490y);
    }
}
