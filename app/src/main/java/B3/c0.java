package B3;

import C3.C0454p1;

/* loaded from: classes2.dex */
final class c0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C0454p1 f457o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f458s;

    c0(E e8, C0454p1 c0454p1) {
        this.f457o = c0454p1;
        this.f458s = e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f458s.f404s.s(this.f457o);
    }
}
