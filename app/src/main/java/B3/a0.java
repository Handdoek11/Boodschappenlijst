package B3;

import C3.C0436j1;

/* loaded from: classes2.dex */
final class a0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C0436j1 f453o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f454s;

    a0(E e8, C0436j1 c0436j1) {
        this.f453o = c0436j1;
        this.f454s = e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f454s.f404s.f(this.f453o);
    }
}
