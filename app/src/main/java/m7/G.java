package m7;

import i7.j;
import k7.AbstractC6117b;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.MissingFieldException;

/* loaded from: classes2.dex */
public class G extends j7.a implements l7.g {

    /* renamed from: a, reason: collision with root package name */
    private final l7.a f39412a;

    /* renamed from: b, reason: collision with root package name */
    private final M f39413b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC6227a f39414c;

    /* renamed from: d, reason: collision with root package name */
    private final n7.b f39415d;

    /* renamed from: e, reason: collision with root package name */
    private int f39416e;

    /* renamed from: f, reason: collision with root package name */
    private a f39417f;

    /* renamed from: g, reason: collision with root package name */
    private final l7.f f39418g;

    /* renamed from: h, reason: collision with root package name */
    private final t f39419h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f39420a;

        public a(String str) {
            this.f39420a = str;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39421a;

        static {
            int[] iArr = new int[M.values().length];
            try {
                iArr[M.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[M.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[M.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[M.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39421a = iArr;
        }
    }

    public G(l7.a aVar, M m8, AbstractC6227a abstractC6227a, i7.f fVar, a aVar2) {
        J6.r.e(aVar, "json");
        J6.r.e(m8, "mode");
        J6.r.e(abstractC6227a, "lexer");
        J6.r.e(fVar, "descriptor");
        this.f39412a = aVar;
        this.f39413b = m8;
        this.f39414c = abstractC6227a;
        this.f39415d = aVar.a();
        this.f39416e = -1;
        this.f39417f = aVar2;
        l7.f d8 = aVar.d();
        this.f39418g = d8;
        this.f39419h = d8.f() ? null : new t(fVar);
    }

    private final void J() {
        if (this.f39414c.E() != 4) {
            return;
        }
        AbstractC6227a.y(this.f39414c, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean K(i7.f fVar, int i8) {
        String F7;
        l7.a aVar = this.f39412a;
        i7.f k8 = fVar.k(i8);
        if (!k8.c() && !this.f39414c.M()) {
            return true;
        }
        if (!J6.r.a(k8.e(), j.b.f36735a) || (F7 = this.f39414c.F(this.f39418g.l())) == null || v.d(k8, aVar, F7) != -3) {
            return false;
        }
        this.f39414c.q();
        return true;
    }

    private final int L() {
        boolean L7 = this.f39414c.L();
        if (!this.f39414c.f()) {
            if (!L7) {
                return -1;
            }
            AbstractC6227a.y(this.f39414c, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i8 = this.f39416e;
        if (i8 != -1 && !L7) {
            AbstractC6227a.y(this.f39414c, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i9 = i8 + 1;
        this.f39416e = i9;
        return i9;
    }

    private final int M() {
        int i8 = this.f39416e;
        boolean z7 = false;
        boolean z8 = i8 % 2 != 0;
        if (!z8) {
            this.f39414c.o(':');
        } else if (i8 != -1) {
            z7 = this.f39414c.L();
        }
        if (!this.f39414c.f()) {
            if (!z7) {
                return -1;
            }
            AbstractC6227a.y(this.f39414c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z8) {
            if (this.f39416e == -1) {
                AbstractC6227a abstractC6227a = this.f39414c;
                int i9 = abstractC6227a.f39442a;
                if (z7) {
                    AbstractC6227a.y(abstractC6227a, "Unexpected trailing comma", i9, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                AbstractC6227a abstractC6227a2 = this.f39414c;
                int i10 = abstractC6227a2.f39442a;
                if (!z7) {
                    AbstractC6227a.y(abstractC6227a2, "Expected comma after the key-value pair", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i11 = this.f39416e + 1;
        this.f39416e = i11;
        return i11;
    }

    private final int N(i7.f fVar) {
        boolean z7;
        boolean L7 = this.f39414c.L();
        while (this.f39414c.f()) {
            String O7 = O();
            this.f39414c.o(':');
            int d8 = v.d(fVar, this.f39412a, O7);
            boolean z8 = false;
            if (d8 == -3) {
                z8 = true;
                z7 = false;
            } else {
                if (!this.f39418g.d() || !K(fVar, d8)) {
                    t tVar = this.f39419h;
                    if (tVar != null) {
                        tVar.c(d8);
                    }
                    return d8;
                }
                z7 = this.f39414c.L();
            }
            L7 = z8 ? P(O7) : z7;
        }
        if (L7) {
            AbstractC6227a.y(this.f39414c, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        t tVar2 = this.f39419h;
        if (tVar2 != null) {
            return tVar2.d();
        }
        return -1;
    }

    private final String O() {
        return this.f39418g.l() ? this.f39414c.t() : this.f39414c.k();
    }

    private final boolean P(String str) {
        if (this.f39418g.g() || R(this.f39417f, str)) {
            this.f39414c.H(this.f39418g.l());
        } else {
            this.f39414c.A(str);
        }
        return this.f39414c.L();
    }

    private final void Q(i7.f fVar) {
        while (e(fVar) != -1) {
        }
    }

    private final boolean R(a aVar, String str) {
        if (aVar == null || !J6.r.a(aVar.f39420a, str)) {
            return false;
        }
        aVar.f39420a = null;
        return true;
    }

    @Override // j7.a, j7.e
    public int B(i7.f fVar) {
        J6.r.e(fVar, "enumDescriptor");
        return v.e(fVar, this.f39412a, r(), " at path " + this.f39414c.f39443b.a());
    }

    @Override // j7.a, j7.e
    public byte C() {
        long p8 = this.f39414c.p();
        byte b8 = (byte) p8;
        if (p8 == b8) {
            return b8;
        }
        AbstractC6227a.y(this.f39414c, "Failed to parse byte for input '" + p8 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // j7.a, j7.e
    public short E() {
        long p8 = this.f39414c.p();
        short s8 = (short) p8;
        if (p8 == s8) {
            return s8;
        }
        AbstractC6227a.y(this.f39414c, "Failed to parse short for input '" + p8 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // j7.a, j7.e
    public float F() {
        AbstractC6227a abstractC6227a = this.f39414c;
        String s8 = abstractC6227a.s();
        try {
            float parseFloat = Float.parseFloat(s8);
            if (this.f39412a.d().a() || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            u.i(this.f39414c, Float.valueOf(parseFloat));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractC6227a.y(abstractC6227a, "Failed to parse type 'float' for input '" + s8 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // j7.a, j7.e
    public double G() {
        AbstractC6227a abstractC6227a = this.f39414c;
        String s8 = abstractC6227a.s();
        try {
            double parseDouble = Double.parseDouble(s8);
            if (this.f39412a.d().a() || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            u.i(this.f39414c, Double.valueOf(parseDouble));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractC6227a.y(abstractC6227a, "Failed to parse type 'double' for input '" + s8 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // j7.c
    public n7.b a() {
        return this.f39415d;
    }

    @Override // l7.g
    public final l7.a b() {
        return this.f39412a;
    }

    @Override // j7.a, j7.c
    public void c(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        if (this.f39412a.d().g() && fVar.g() == 0) {
            Q(fVar);
        }
        this.f39414c.o(this.f39413b.f39441s);
        this.f39414c.f39443b.b();
    }

    @Override // j7.a, j7.e
    public j7.c d(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        M b8 = N.b(this.f39412a, fVar);
        this.f39414c.f39443b.c(fVar);
        this.f39414c.o(b8.f39440o);
        J();
        int i8 = b.f39421a[b8.ordinal()];
        return (i8 == 1 || i8 == 2 || i8 == 3) ? new G(this.f39412a, b8, this.f39414c, fVar, this.f39417f) : (this.f39413b == b8 && this.f39412a.d().f()) ? this : new G(this.f39412a, b8, this.f39414c, fVar, this.f39417f);
    }

    @Override // j7.c
    public int e(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        int i8 = b.f39421a[this.f39413b.ordinal()];
        int L7 = i8 != 2 ? i8 != 4 ? L() : N(fVar) : M();
        if (this.f39413b != M.MAP) {
            this.f39414c.f39443b.g(L7);
        }
        return L7;
    }

    @Override // j7.a, j7.e
    public boolean f() {
        return this.f39418g.l() ? this.f39414c.i() : this.f39414c.g();
    }

    @Override // j7.a, j7.e
    public char h() {
        String s8 = this.f39414c.s();
        if (s8.length() == 1) {
            return s8.charAt(0);
        }
        AbstractC6227a.y(this.f39414c, "Expected single char, but got '" + s8 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // j7.a, j7.c
    public Object i(i7.f fVar, int i8, g7.a aVar, Object obj) {
        J6.r.e(fVar, "descriptor");
        J6.r.e(aVar, "deserializer");
        boolean z7 = this.f39413b == M.MAP && (i8 & 1) == 0;
        if (z7) {
            this.f39414c.f39443b.d();
        }
        Object i9 = super.i(fVar, i8, aVar, obj);
        if (z7) {
            this.f39414c.f39443b.f(i9);
        }
        return i9;
    }

    @Override // j7.a, j7.e
    public j7.e j(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        return I.a(fVar) ? new s(this.f39414c, this.f39412a) : super.j(fVar);
    }

    @Override // l7.g
    public l7.h m() {
        return new C(this.f39412a.d(), this.f39414c).e();
    }

    @Override // j7.a, j7.e
    public int n() {
        long p8 = this.f39414c.p();
        int i8 = (int) p8;
        if (p8 == i8) {
            return i8;
        }
        AbstractC6227a.y(this.f39414c, "Failed to parse int for input '" + p8 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // j7.a, j7.e
    public Void q() {
        return null;
    }

    @Override // j7.a, j7.e
    public String r() {
        return this.f39418g.l() ? this.f39414c.t() : this.f39414c.q();
    }

    @Override // j7.a, j7.e
    public long t() {
        return this.f39414c.p();
    }

    @Override // j7.a, j7.e
    public boolean v() {
        t tVar = this.f39419h;
        return !(tVar != null ? tVar.b() : false) && this.f39414c.M();
    }

    @Override // j7.a, j7.e
    public Object w(g7.a aVar) {
        J6.r.e(aVar, "deserializer");
        try {
            if ((aVar instanceof AbstractC6117b) && !this.f39412a.d().k()) {
                String c8 = E.c(aVar.getDescriptor(), this.f39412a);
                String l8 = this.f39414c.l(c8, this.f39418g.l());
                g7.a c9 = l8 != null ? ((AbstractC6117b) aVar).c(this, l8) : null;
                if (c9 == null) {
                    return E.d(this, aVar);
                }
                this.f39417f = new a(c8);
                return c9.deserialize(this);
            }
            return aVar.deserialize(this);
        } catch (MissingFieldException e8) {
            throw new MissingFieldException(e8.a(), e8.getMessage() + " at path: " + this.f39414c.f39443b.a(), e8);
        }
    }
}
