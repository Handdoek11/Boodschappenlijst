package C3;

import B3.AbstractC0387f;
import B3.InterfaceC0385d;
import B3.InterfaceC0386e;

/* renamed from: C3.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0446n implements InterfaceC0386e.a {

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC0387f.b f1015o;

    public C0446n(AbstractC0387f.b bVar) {
        this.f1015o = bVar;
    }

    @Override // B3.InterfaceC0386e.a
    public final void b(InterfaceC0385d interfaceC0385d) {
        this.f1015o.b(AbstractC0449o.z(interfaceC0385d));
    }

    @Override // B3.InterfaceC0386e.a
    public final void d(InterfaceC0385d interfaceC0385d, int i8, int i9) {
        this.f1015o.a(AbstractC0449o.z(interfaceC0385d), i8, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0446n.class != obj.getClass()) {
            return false;
        }
        return this.f1015o.equals(((C0446n) obj).f1015o);
    }

    @Override // B3.InterfaceC0386e.a
    public final void g(InterfaceC0385d interfaceC0385d, int i8, int i9) {
        this.f1015o.d(AbstractC0449o.z(interfaceC0385d), i8, i9);
    }

    @Override // B3.InterfaceC0386e.a
    public final void h(InterfaceC0385d interfaceC0385d, int i8, int i9) {
        this.f1015o.c(AbstractC0449o.z(interfaceC0385d), i8, i9);
    }

    public final int hashCode() {
        return this.f1015o.hashCode();
    }
}
