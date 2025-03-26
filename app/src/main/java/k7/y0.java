package k7;

import i7.f;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class y0 implements i7.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f38747a;

    /* renamed from: b, reason: collision with root package name */
    private final i7.e f38748b;

    public y0(String str, i7.e eVar) {
        J6.r.e(str, "serialName");
        J6.r.e(eVar, "kind");
        this.f38747a = str;
        this.f38748b = eVar;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // i7.f
    public String a() {
        return this.f38747a;
    }

    @Override // i7.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // i7.f
    public int d(String str) {
        J6.r.e(str, "name");
        b();
        throw new KotlinNothingValueException();
    }

    @Override // i7.f
    public List f() {
        return f.a.a(this);
    }

    @Override // i7.f
    public int g() {
        return 0;
    }

    @Override // i7.f
    public String h(int i8) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // i7.f
    public boolean i() {
        return f.a.b(this);
    }

    @Override // i7.f
    public List j(int i8) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // i7.f
    public i7.f k(int i8) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // i7.f
    public boolean l(int i8) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // i7.f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public i7.e e() {
        return this.f38748b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
