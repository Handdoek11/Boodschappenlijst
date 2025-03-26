package I5;

import I5.x;
import java.util.List;
import java.util.Set;
import y6.P;

/* renamed from: I5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0632f implements x {

    /* renamed from: c, reason: collision with root package name */
    public static final C0632f f3259c = new C0632f();

    private C0632f() {
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

    public boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).isEmpty();
    }

    @Override // N5.r
    public void f(I6.p pVar) {
        x.b.a(this, pVar);
    }

    @Override // N5.r
    public boolean isEmpty() {
        return true;
    }

    @Override // N5.r
    public Set names() {
        return P.b();
    }

    public String toString() {
        return "Parameters " + b();
    }
}
