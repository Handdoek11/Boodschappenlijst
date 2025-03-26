package S;

import J6.r;
import x6.InterfaceC6925g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4963a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6925g f4964b;

    public a(String str, InterfaceC6925g interfaceC6925g) {
        this.f4963a = str;
        this.f4964b = interfaceC6925g;
    }

    public final InterfaceC6925g a() {
        return this.f4964b;
    }

    public final String b() {
        return this.f4963a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.a(this.f4963a, aVar.f4963a) && r.a(this.f4964b, aVar.f4964b);
    }

    public int hashCode() {
        String str = this.f4963a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC6925g interfaceC6925g = this.f4964b;
        return hashCode + (interfaceC6925g != null ? interfaceC6925g.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f4963a + ", action=" + this.f4964b + ')';
    }
}
