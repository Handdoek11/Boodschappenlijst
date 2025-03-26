package p2;

import l2.InterfaceC6171b;
import t2.InterfaceC6791a;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public final class g implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f40145a;

    public g(InterfaceC6894a interfaceC6894a) {
        this.f40145a = interfaceC6894a;
    }

    public static q2.f a(InterfaceC6791a interfaceC6791a) {
        return (q2.f) l2.d.d(f.a(interfaceC6791a));
    }

    public static g b(InterfaceC6894a interfaceC6894a) {
        return new g(interfaceC6894a);
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public q2.f get() {
        return a((InterfaceC6791a) this.f40145a.get());
    }
}
