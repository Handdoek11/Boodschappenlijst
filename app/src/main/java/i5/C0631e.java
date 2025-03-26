package I5;

import I5.InterfaceC0637k;
import java.util.List;
import java.util.Set;
import y6.P;

/* renamed from: I5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0631e implements InterfaceC0637k {

    /* renamed from: c, reason: collision with root package name */
    public static final C0631e f3258c = new C0631e();

    private C0631e() {
    }

    @Override // N5.r
    public Set b() {
        return P.b();
    }

    @Override // N5.r
    public boolean c() {
        return true;
    }

    @Override // N5.r
    public List d(String str) {
        J6.r.e(str, "name");
        return null;
    }

    @Override // N5.r
    public String e(String str) {
        return InterfaceC0637k.b.b(this, str);
    }

    @Override // N5.r
    public void f(I6.p pVar) {
        InterfaceC0637k.b.a(this, pVar);
    }

    @Override // N5.r
    public Set names() {
        return P.b();
    }

    public String toString() {
        return "Headers " + b();
    }
}
