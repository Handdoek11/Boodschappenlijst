package k7;

import J6.AbstractC0650j;
import i7.f;
import i7.k;
import java.util.List;
import y6.AbstractC6987o;

/* renamed from: k7.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6118b0 implements i7.f {

    /* renamed from: a, reason: collision with root package name */
    private final i7.f f38669a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38670b;

    public /* synthetic */ AbstractC6118b0(i7.f fVar, AbstractC0650j abstractC0650j) {
        this(fVar);
    }

    @Override // i7.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // i7.f
    public int d(String str) {
        J6.r.e(str, "name");
        Integer k8 = S6.h.k(str);
        if (k8 != null) {
            return k8.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    @Override // i7.f
    public i7.j e() {
        return k.b.f36737a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6118b0)) {
            return false;
        }
        AbstractC6118b0 abstractC6118b0 = (AbstractC6118b0) obj;
        return J6.r.a(this.f38669a, abstractC6118b0.f38669a) && J6.r.a(a(), abstractC6118b0.a());
    }

    @Override // i7.f
    public List f() {
        return f.a.a(this);
    }

    @Override // i7.f
    public int g() {
        return this.f38670b;
    }

    @Override // i7.f
    public String h(int i8) {
        return String.valueOf(i8);
    }

    public int hashCode() {
        return (this.f38669a.hashCode() * 31) + a().hashCode();
    }

    @Override // i7.f
    public boolean i() {
        return f.a.b(this);
    }

    @Override // i7.f
    public List j(int i8) {
        if (i8 >= 0) {
            return AbstractC6987o.e();
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // i7.f
    public i7.f k(int i8) {
        if (i8 >= 0) {
            return this.f38669a;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // i7.f
    public boolean l(int i8) {
        if (i8 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return a() + '(' + this.f38669a + ')';
    }

    private AbstractC6118b0(i7.f fVar) {
        this.f38669a = fVar;
        this.f38670b = 1;
    }
}
