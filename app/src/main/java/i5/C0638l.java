package I5;

import J6.AbstractC0650j;

/* renamed from: I5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0638l extends N5.t {
    public C0638l(int i8) {
        super(true, i8);
    }

    @Override // N5.t
    protected void m(String str) {
        J6.r.e(str, "name");
        super.m(str);
        o.f3324a.a(str);
    }

    @Override // N5.t
    protected void n(String str) {
        J6.r.e(str, "value");
        super.n(str);
        o.f3324a.b(str);
    }

    public InterfaceC0637k o() {
        return new C0639m(j());
    }

    public /* synthetic */ C0638l(int i8, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? 8 : i8);
    }
}
