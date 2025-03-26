package U6;

/* loaded from: classes2.dex */
public abstract class B0 extends E implements InterfaceC0708c0, InterfaceC0736q0 {

    /* renamed from: u, reason: collision with root package name */
    public C0 f5372u;

    @Override // U6.InterfaceC0708c0
    public void c() {
        w().J0(this);
    }

    @Override // U6.InterfaceC0736q0
    public boolean h() {
        return true;
    }

    @Override // U6.InterfaceC0736q0
    public H0 i() {
        return null;
    }

    @Override // Z6.p
    public String toString() {
        return Q.a(this) + '@' + Q.b(this) + "[job@" + Q.b(w()) + ']';
    }

    public final C0 w() {
        C0 c02 = this.f5372u;
        if (c02 != null) {
            return c02;
        }
        J6.r.p("job");
        return null;
    }

    public final void x(C0 c02) {
        this.f5372u = c02;
    }
}
