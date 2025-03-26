package m7;

import J6.AbstractC0650j;
import i7.j;
import i7.k;
import k7.AbstractC6132i0;
import kotlin.KotlinNothingValueException;

/* renamed from: m7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC6229c extends AbstractC6132i0 implements l7.g {

    /* renamed from: c, reason: collision with root package name */
    private final l7.a f39446c;

    /* renamed from: d, reason: collision with root package name */
    private final l7.h f39447d;

    /* renamed from: e, reason: collision with root package name */
    protected final l7.f f39448e;

    public /* synthetic */ AbstractC6229c(l7.a aVar, l7.h hVar, AbstractC0650j abstractC0650j) {
        this(aVar, hVar);
    }

    private final l7.o c0(l7.v vVar, String str) {
        l7.o oVar = vVar instanceof l7.o ? (l7.o) vVar : null;
        if (oVar != null) {
            return oVar;
        }
        throw u.d(-1, "Unexpected 'null' when " + str + " was expected");
    }

    private final l7.h e0() {
        l7.h d02;
        String str = (String) T();
        return (str == null || (d02 = d0(str)) == null) ? r0() : d02;
    }

    private final Void s0(String str) {
        throw u.e(-1, "Failed to parse '" + str + '\'', e0().toString());
    }

    @Override // k7.AbstractC6132i0
    protected String Y(String str, String str2) {
        J6.r.e(str, "parentName");
        J6.r.e(str2, "childName");
        return str2;
    }

    @Override // j7.c
    public n7.b a() {
        return b().a();
    }

    @Override // l7.g
    public l7.a b() {
        return this.f39446c;
    }

    public void c(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
    }

    @Override // j7.e
    public j7.c d(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        l7.h e02 = e0();
        i7.j e8 = fVar.e();
        if (J6.r.a(e8, k.b.f36737a) ? true : e8 instanceof i7.d) {
            l7.a b8 = b();
            if (e02 instanceof l7.b) {
                return new A(b8, (l7.b) e02);
            }
            throw u.d(-1, "Expected " + J6.H.b(l7.b.class) + " as the serialized body of " + fVar.a() + ", but had " + J6.H.b(e02.getClass()));
        }
        if (!J6.r.a(e8, k.c.f36738a)) {
            l7.a b9 = b();
            if (e02 instanceof l7.t) {
                return new z(b9, (l7.t) e02, null, null, 12, null);
            }
            throw u.d(-1, "Expected " + J6.H.b(l7.t.class) + " as the serialized body of " + fVar.a() + ", but had " + J6.H.b(e02.getClass()));
        }
        l7.a b10 = b();
        i7.f a8 = N.a(fVar.k(0), b10.a());
        i7.j e9 = a8.e();
        if ((e9 instanceof i7.e) || J6.r.a(e9, j.b.f36735a)) {
            l7.a b11 = b();
            if (e02 instanceof l7.t) {
                return new B(b11, (l7.t) e02);
            }
            throw u.d(-1, "Expected " + J6.H.b(l7.t.class) + " as the serialized body of " + fVar.a() + ", but had " + J6.H.b(e02.getClass()));
        }
        if (!b10.d().b()) {
            throw u.c(a8);
        }
        l7.a b12 = b();
        if (e02 instanceof l7.b) {
            return new A(b12, (l7.b) e02);
        }
        throw u.d(-1, "Expected " + J6.H.b(l7.b.class) + " as the serialized body of " + fVar.a() + ", but had " + J6.H.b(e02.getClass()));
    }

    protected abstract l7.h d0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public boolean I(String str) {
        J6.r.e(str, "tag");
        l7.v q02 = q0(str);
        if (!b().d().l() && c0(q02, "boolean").d()) {
            throw u.e(-1, "Boolean literal for key '" + str + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", e0().toString());
        }
        try {
            Boolean d8 = l7.i.d(q02);
            if (d8 != null) {
                return d8.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            s0("boolean");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public byte J(String str) {
        J6.r.e(str, "tag");
        try {
            int i8 = l7.i.i(q0(str));
            Byte valueOf = (-128 > i8 || i8 > 127) ? null : Byte.valueOf((byte) i8);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            s0("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            s0("byte");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public char K(String str) {
        J6.r.e(str, "tag");
        try {
            return S6.h.B0(q0(str).b());
        } catch (IllegalArgumentException unused) {
            s0("char");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public double L(String str) {
        J6.r.e(str, "tag");
        try {
            double f8 = l7.i.f(q0(str));
            if (b().d().a() || !(Double.isInfinite(f8) || Double.isNaN(f8))) {
                return f8;
            }
            throw u.a(Double.valueOf(f8), str, e0().toString());
        } catch (IllegalArgumentException unused) {
            s0("double");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public int M(String str, i7.f fVar) {
        J6.r.e(str, "tag");
        J6.r.e(fVar, "enumDescriptor");
        return v.f(fVar, b(), q0(str).b(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public float N(String str) {
        J6.r.e(str, "tag");
        try {
            float h8 = l7.i.h(q0(str));
            if (b().d().a() || !(Float.isInfinite(h8) || Float.isNaN(h8))) {
                return h8;
            }
            throw u.a(Float.valueOf(h8), str, e0().toString());
        } catch (IllegalArgumentException unused) {
            s0("float");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public j7.e O(String str, i7.f fVar) {
        J6.r.e(str, "tag");
        J6.r.e(fVar, "inlineDescriptor");
        return I.a(fVar) ? new s(new J(q0(str).b()), b()) : super.O(str, fVar);
    }

    @Override // l7.g
    public l7.h m() {
        return e0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public int P(String str) {
        J6.r.e(str, "tag");
        try {
            return l7.i.i(q0(str));
        } catch (IllegalArgumentException unused) {
            s0("int");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public long Q(String str) {
        J6.r.e(str, "tag");
        try {
            return l7.i.k(q0(str));
        } catch (IllegalArgumentException unused) {
            s0("long");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public short R(String str) {
        J6.r.e(str, "tag");
        try {
            int i8 = l7.i.i(q0(str));
            Short valueOf = (-32768 > i8 || i8 > 32767) ? null : Short.valueOf((short) i8);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            s0("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            s0("short");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public String S(String str) {
        J6.r.e(str, "tag");
        l7.v q02 = q0(str);
        if (b().d().l() || c0(q02, "string").d()) {
            if (q02 instanceof l7.r) {
                throw u.e(-1, "Unexpected 'null' value instead of string literal", e0().toString());
            }
            return q02.b();
        }
        throw u.e(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", e0().toString());
    }

    protected final l7.v q0(String str) {
        J6.r.e(str, "tag");
        l7.h d02 = d0(str);
        l7.v vVar = d02 instanceof l7.v ? (l7.v) d02 : null;
        if (vVar != null) {
            return vVar;
        }
        throw u.e(-1, "Expected JsonPrimitive at " + str + ", found " + d02, e0().toString());
    }

    public abstract l7.h r0();

    @Override // j7.e
    public boolean v() {
        return !(e0() instanceof l7.r);
    }

    @Override // k7.I0, j7.e
    public Object w(g7.a aVar) {
        J6.r.e(aVar, "deserializer");
        return E.d(this, aVar);
    }

    private AbstractC6229c(l7.a aVar, l7.h hVar) {
        this.f39446c = aVar;
        this.f39447d = hVar;
        this.f39448e = b().d();
    }
}
