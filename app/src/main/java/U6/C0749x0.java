package U6;

import x6.C6916E;

/* renamed from: U6.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0749x0 extends C0 implements A {

    /* renamed from: t, reason: collision with root package name */
    private final boolean f5487t;

    public C0749x0(InterfaceC0745v0 interfaceC0745v0) {
        super(true);
        q0(interfaceC0745v0);
        this.f5487t = V0();
    }

    private final boolean V0() {
        C0 w7;
        InterfaceC0742u k02 = k0();
        C0744v c0744v = k02 instanceof C0744v ? (C0744v) k02 : null;
        if (c0744v != null && (w7 = c0744v.w()) != null) {
            while (!w7.d0()) {
                InterfaceC0742u k03 = w7.k0();
                C0744v c0744v2 = k03 instanceof C0744v ? (C0744v) k03 : null;
                if (c0744v2 == null || (w7 = c0744v2.w()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // U6.A
    public boolean T() {
        return w0(C6916E.f44463a);
    }

    @Override // U6.C0
    public boolean d0() {
        return this.f5487t;
    }

    @Override // U6.C0
    public boolean f0() {
        return true;
    }

    @Override // U6.A
    public boolean i(Throwable th) {
        return w0(new C(th, false, 2, null));
    }
}
