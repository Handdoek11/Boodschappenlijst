package C3;

import B3.AbstractC0383b;
import B3.InterfaceC0384c;

/* renamed from: C3.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0428h implements AbstractC0383b.a {

    /* renamed from: o, reason: collision with root package name */
    final AbstractC0383b.a f969o;

    /* renamed from: s, reason: collision with root package name */
    final String f970s;

    C0428h(AbstractC0383b.a aVar, String str) {
        this.f969o = aVar;
        this.f970s = str;
    }

    @Override // B3.AbstractC0383b.a, B3.InterfaceC0382a.InterfaceC0007a
    public final void a(InterfaceC0384c interfaceC0384c) {
        this.f969o.a(interfaceC0384c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0428h.class != obj.getClass()) {
            return false;
        }
        C0428h c0428h = (C0428h) obj;
        if (this.f969o.equals(c0428h.f969o)) {
            return this.f970s.equals(c0428h.f970s);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f969o.hashCode() * 31) + this.f970s.hashCode();
    }
}
