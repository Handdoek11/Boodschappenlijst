package i7;

import I6.l;
import J6.r;
import J6.s;
import P6.m;
import i7.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k7.AbstractC6148q0;
import k7.AbstractC6153t0;
import k7.InterfaceC6141n;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;
import x6.u;
import y6.AbstractC6971J;
import y6.AbstractC6980h;
import y6.AbstractC6987o;
import y6.C6965D;

/* loaded from: classes2.dex */
public final class g implements f, InterfaceC6141n {

    /* renamed from: a, reason: collision with root package name */
    private final String f36713a;

    /* renamed from: b, reason: collision with root package name */
    private final j f36714b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36715c;

    /* renamed from: d, reason: collision with root package name */
    private final List f36716d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f36717e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f36718f;

    /* renamed from: g, reason: collision with root package name */
    private final f[] f36719g;

    /* renamed from: h, reason: collision with root package name */
    private final List[] f36720h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f36721i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f36722j;

    /* renamed from: k, reason: collision with root package name */
    private final f[] f36723k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC6928j f36724l;

    static final class a extends s implements I6.a {
        a() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(AbstractC6153t0.a(gVar, gVar.f36723k));
        }
    }

    static final class b extends s implements l {
        b() {
            super(1);
        }

        public final CharSequence b(int i8) {
            return g.this.h(i8) + ": " + g.this.k(i8).a();
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    public g(String str, j jVar, int i8, List list, i7.a aVar) {
        r.e(str, "serialName");
        r.e(jVar, "kind");
        r.e(list, "typeParameters");
        r.e(aVar, "builder");
        this.f36713a = str;
        this.f36714b = jVar;
        this.f36715c = i8;
        this.f36716d = aVar.c();
        this.f36717e = AbstractC6987o.Y(aVar.f());
        Object[] array = aVar.f().toArray(new String[0]);
        r.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        this.f36718f = strArr;
        this.f36719g = AbstractC6148q0.b(aVar.e());
        Object[] array2 = aVar.d().toArray(new List[0]);
        r.c(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f36720h = (List[]) array2;
        this.f36721i = AbstractC6987o.W(aVar.g());
        Iterable<C6965D> P7 = AbstractC6980h.P(strArr);
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(P7, 10));
        for (C6965D c6965d : P7) {
            arrayList.add(u.a(c6965d.b(), Integer.valueOf(c6965d.a())));
        }
        this.f36722j = AbstractC6971J.k(arrayList);
        this.f36723k = AbstractC6148q0.b(list);
        this.f36724l = AbstractC6929k.a(new a());
    }

    private final int n() {
        return ((Number) this.f36724l.getValue()).intValue();
    }

    @Override // i7.f
    public String a() {
        return this.f36713a;
    }

    @Override // k7.InterfaceC6141n
    public Set b() {
        return this.f36717e;
    }

    @Override // i7.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // i7.f
    public int d(String str) {
        r.e(str, "name");
        Integer num = (Integer) this.f36722j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // i7.f
    public j e() {
        return this.f36714b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (r.a(a(), fVar.a()) && Arrays.equals(this.f36723k, ((g) obj).f36723k) && g() == fVar.g()) {
                int g8 = g();
                for (int i8 = 0; i8 < g8; i8++) {
                    if (r.a(k(i8).a(), fVar.k(i8).a()) && r.a(k(i8).e(), fVar.k(i8).e())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // i7.f
    public List f() {
        return this.f36716d;
    }

    @Override // i7.f
    public int g() {
        return this.f36715c;
    }

    @Override // i7.f
    public String h(int i8) {
        return this.f36718f[i8];
    }

    public int hashCode() {
        return n();
    }

    @Override // i7.f
    public boolean i() {
        return f.a.b(this);
    }

    @Override // i7.f
    public List j(int i8) {
        return this.f36720h[i8];
    }

    @Override // i7.f
    public f k(int i8) {
        return this.f36719g[i8];
    }

    @Override // i7.f
    public boolean l(int i8) {
        return this.f36721i[i8];
    }

    public String toString() {
        return AbstractC6987o.I(m.m(0, g()), ", ", a() + '(', ")", 0, null, new b(), 24, null);
    }
}
