package k7;

import J6.AbstractC0650j;
import i7.f;
import i7.k;
import java.util.List;
import y6.AbstractC6987o;

/* renamed from: k7.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6128g0 implements i7.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f38684a;

    /* renamed from: b, reason: collision with root package name */
    private final i7.f f38685b;

    /* renamed from: c, reason: collision with root package name */
    private final i7.f f38686c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38687d;

    public /* synthetic */ AbstractC6128g0(String str, i7.f fVar, i7.f fVar2, AbstractC0650j abstractC0650j) {
        this(str, fVar, fVar2);
    }

    @Override // i7.f
    public String a() {
        return this.f38684a;
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
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // i7.f
    public i7.j e() {
        return k.c.f36738a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6128g0)) {
            return false;
        }
        AbstractC6128g0 abstractC6128g0 = (AbstractC6128g0) obj;
        return J6.r.a(a(), abstractC6128g0.a()) && J6.r.a(this.f38685b, abstractC6128g0.f38685b) && J6.r.a(this.f38686c, abstractC6128g0.f38686c);
    }

    @Override // i7.f
    public List f() {
        return f.a.a(this);
    }

    @Override // i7.f
    public int g() {
        return this.f38687d;
    }

    @Override // i7.f
    public String h(int i8) {
        return String.valueOf(i8);
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + this.f38685b.hashCode()) * 31) + this.f38686c.hashCode();
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
            int i9 = i8 % 2;
            if (i9 == 0) {
                return this.f38685b;
            }
            if (i9 == 1) {
                return this.f38686c;
            }
            throw new IllegalStateException("Unreached");
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
        return a() + '(' + this.f38685b + ", " + this.f38686c + ')';
    }

    private AbstractC6128g0(String str, i7.f fVar, i7.f fVar2) {
        this.f38684a = str;
        this.f38685b = fVar;
        this.f38686c = fVar2;
        this.f38687d = 2;
    }
}
