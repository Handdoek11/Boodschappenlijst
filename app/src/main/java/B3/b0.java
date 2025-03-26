package B3;

import C3.C0454p1;

/* loaded from: classes2.dex */
final class b0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C0454p1 f455o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f456s;

    b0(E e8, C0454p1 c0454p1) {
        this.f455o = c0454p1;
        this.f456s = e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f456s.f404s.r(this.f455o);
    }
}
