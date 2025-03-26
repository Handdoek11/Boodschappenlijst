package j7;

import J6.H;
import J6.r;
import j7.c;
import j7.e;
import kotlinx.serialization.SerializationException;

/* loaded from: classes2.dex */
public abstract class a implements e, c {
    @Override // j7.c
    public final boolean A(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return f();
    }

    @Override // j7.e
    public int B(i7.f fVar) {
        r.e(fVar, "enumDescriptor");
        Object I7 = I();
        r.c(I7, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) I7).intValue();
    }

    @Override // j7.e
    public abstract byte C();

    @Override // j7.c
    public int D(i7.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // j7.e
    public abstract short E();

    @Override // j7.e
    public float F() {
        Object I7 = I();
        r.c(I7, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) I7).floatValue();
    }

    @Override // j7.e
    public double G() {
        Object I7 = I();
        r.c(I7, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) I7).doubleValue();
    }

    public Object H(g7.a aVar, Object obj) {
        r.e(aVar, "deserializer");
        return w(aVar);
    }

    public Object I() {
        throw new SerializationException(H.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // j7.c
    public void c(i7.f fVar) {
        r.e(fVar, "descriptor");
    }

    @Override // j7.e
    public c d(i7.f fVar) {
        r.e(fVar, "descriptor");
        return this;
    }

    @Override // j7.e
    public boolean f() {
        Object I7 = I();
        r.c(I7, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) I7).booleanValue();
    }

    @Override // j7.c
    public final int g(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return n();
    }

    @Override // j7.e
    public char h() {
        Object I7 = I();
        r.c(I7, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) I7).charValue();
    }

    @Override // j7.c
    public Object i(i7.f fVar, int i8, g7.a aVar, Object obj) {
        r.e(fVar, "descriptor");
        r.e(aVar, "deserializer");
        return H(aVar, obj);
    }

    @Override // j7.e
    public e j(i7.f fVar) {
        r.e(fVar, "descriptor");
        return this;
    }

    @Override // j7.c
    public final char k(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return h();
    }

    @Override // j7.c
    public final short l(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return E();
    }

    @Override // j7.e
    public abstract int n();

    @Override // j7.c
    public final byte o(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return C();
    }

    @Override // j7.c
    public e p(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return j(fVar.k(i8));
    }

    @Override // j7.e
    public Void q() {
        return null;
    }

    @Override // j7.e
    public String r() {
        Object I7 = I();
        r.c(I7, "null cannot be cast to non-null type kotlin.String");
        return (String) I7;
    }

    @Override // j7.c
    public final float s(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return F();
    }

    @Override // j7.e
    public abstract long t();

    @Override // j7.c
    public final double u(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return G();
    }

    @Override // j7.e
    public boolean v() {
        return true;
    }

    @Override // j7.e
    public Object w(g7.a aVar) {
        return e.a.a(this, aVar);
    }

    @Override // j7.c
    public boolean x() {
        return c.a.b(this);
    }

    @Override // j7.c
    public final long y(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return t();
    }

    @Override // j7.c
    public final String z(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return r();
    }
}
