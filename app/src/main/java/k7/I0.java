package k7;

import j7.c;
import java.util.ArrayList;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public abstract class I0 implements j7.e, j7.c {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f38621a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f38622b;

    static final class a extends J6.s implements I6.a {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ g7.a f38624s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f38625t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g7.a aVar, Object obj) {
            super(0);
            this.f38624s = aVar;
            this.f38625t = obj;
        }

        @Override // I6.a
        public final Object invoke() {
            return I0.this.H(this.f38624s, this.f38625t);
        }
    }

    private final Object X(Object obj, I6.a aVar) {
        W(obj);
        Object invoke = aVar.invoke();
        if (!this.f38622b) {
            V();
        }
        this.f38622b = false;
        return invoke;
    }

    @Override // j7.c
    public final boolean A(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return I(U(fVar, i8));
    }

    @Override // j7.e
    public final int B(i7.f fVar) {
        J6.r.e(fVar, "enumDescriptor");
        return M(V(), fVar);
    }

    @Override // j7.e
    public final byte C() {
        return J(V());
    }

    @Override // j7.c
    public int D(i7.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // j7.e
    public final short E() {
        return R(V());
    }

    @Override // j7.e
    public final float F() {
        return N(V());
    }

    @Override // j7.e
    public final double G() {
        return L(V());
    }

    protected Object H(g7.a aVar, Object obj) {
        J6.r.e(aVar, "deserializer");
        return w(aVar);
    }

    protected abstract boolean I(Object obj);

    protected abstract byte J(Object obj);

    protected abstract char K(Object obj);

    protected abstract double L(Object obj);

    protected abstract int M(Object obj, i7.f fVar);

    protected abstract float N(Object obj);

    protected j7.e O(Object obj, i7.f fVar) {
        J6.r.e(fVar, "inlineDescriptor");
        W(obj);
        return this;
    }

    protected abstract int P(Object obj);

    protected abstract long Q(Object obj);

    protected abstract short R(Object obj);

    protected abstract String S(Object obj);

    protected final Object T() {
        return AbstractC6987o.K(this.f38621a);
    }

    protected abstract Object U(i7.f fVar, int i8);

    protected final Object V() {
        ArrayList arrayList = this.f38621a;
        Object remove = arrayList.remove(AbstractC6987o.f(arrayList));
        this.f38622b = true;
        return remove;
    }

    protected final void W(Object obj) {
        this.f38621a.add(obj);
    }

    @Override // j7.e
    public final boolean f() {
        return I(V());
    }

    @Override // j7.c
    public final int g(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return P(U(fVar, i8));
    }

    @Override // j7.e
    public final char h() {
        return K(V());
    }

    @Override // j7.c
    public final Object i(i7.f fVar, int i8, g7.a aVar, Object obj) {
        J6.r.e(fVar, "descriptor");
        J6.r.e(aVar, "deserializer");
        return X(U(fVar, i8), new a(aVar, obj));
    }

    @Override // j7.e
    public final j7.e j(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        return O(V(), fVar);
    }

    @Override // j7.c
    public final char k(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return K(U(fVar, i8));
    }

    @Override // j7.c
    public final short l(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return R(U(fVar, i8));
    }

    @Override // j7.e
    public final int n() {
        return P(V());
    }

    @Override // j7.c
    public final byte o(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return J(U(fVar, i8));
    }

    @Override // j7.c
    public final j7.e p(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return O(U(fVar, i8), fVar.k(i8));
    }

    @Override // j7.e
    public final Void q() {
        return null;
    }

    @Override // j7.e
    public final String r() {
        return S(V());
    }

    @Override // j7.c
    public final float s(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return N(U(fVar, i8));
    }

    @Override // j7.e
    public final long t() {
        return Q(V());
    }

    @Override // j7.c
    public final double u(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return L(U(fVar, i8));
    }

    @Override // j7.e
    public abstract Object w(g7.a aVar);

    @Override // j7.c
    public boolean x() {
        return c.a.b(this);
    }

    @Override // j7.c
    public final long y(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return Q(U(fVar, i8));
    }

    @Override // j7.c
    public final String z(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return S(U(fVar, i8));
    }
}
