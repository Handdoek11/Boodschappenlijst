package U6;

import x6.C6916E;

/* loaded from: classes2.dex */
final class N0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final I f5412o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC0731o f5413s;

    public N0(I i8, InterfaceC0731o interfaceC0731o) {
        this.f5412o = i8;
        this.f5413s = interfaceC0731o;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5413s.o(this.f5412o, C6916E.f44463a);
    }
}
