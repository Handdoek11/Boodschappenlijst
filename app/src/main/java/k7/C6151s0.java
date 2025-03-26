package k7;

import J6.AbstractC0650j;
import i7.f;
import i7.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x6.AbstractC6929k;
import x6.EnumC6932n;
import x6.InterfaceC6928j;
import y6.AbstractC6971J;
import y6.AbstractC6987o;

/* renamed from: k7.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6151s0 implements i7.f, InterfaceC6141n {

    /* renamed from: a, reason: collision with root package name */
    private final String f38720a;

    /* renamed from: b, reason: collision with root package name */
    private final K f38721b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38722c;

    /* renamed from: d, reason: collision with root package name */
    private int f38723d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f38724e;

    /* renamed from: f, reason: collision with root package name */
    private final List[] f38725f;

    /* renamed from: g, reason: collision with root package name */
    private List f38726g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f38727h;

    /* renamed from: i, reason: collision with root package name */
    private Map f38728i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC6928j f38729j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC6928j f38730k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC6928j f38731l;

    /* renamed from: k7.s0$a */
    static final class a extends J6.s implements I6.a {
        a() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            C6151s0 c6151s0 = C6151s0.this;
            return Integer.valueOf(AbstractC6153t0.a(c6151s0, c6151s0.r()));
        }
    }

    /* renamed from: k7.s0$b */
    static final class b extends J6.s implements I6.a {
        b() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g7.b[] invoke() {
            g7.b[] childSerializers;
            K k8 = C6151s0.this.f38721b;
            return (k8 == null || (childSerializers = k8.childSerializers()) == null) ? AbstractC6155u0.f38739a : childSerializers;
        }
    }

    /* renamed from: k7.s0$c */
    static final class c extends J6.s implements I6.l {
        c() {
            super(1);
        }

        public final CharSequence b(int i8) {
            return C6151s0.this.h(i8) + ": " + C6151s0.this.k(i8).a();
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* renamed from: k7.s0$d */
    static final class d extends J6.s implements I6.a {
        d() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i7.f[] invoke() {
            ArrayList arrayList;
            g7.b[] typeParametersSerializers;
            K k8 = C6151s0.this.f38721b;
            if (k8 == null || (typeParametersSerializers = k8.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(typeParametersSerializers.length);
                for (g7.b bVar : typeParametersSerializers) {
                    arrayList.add(bVar.getDescriptor());
                }
            }
            return AbstractC6148q0.b(arrayList);
        }
    }

    public C6151s0(String str, K k8, int i8) {
        J6.r.e(str, "serialName");
        this.f38720a = str;
        this.f38721b = k8;
        this.f38722c = i8;
        this.f38723d = -1;
        String[] strArr = new String[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f38724e = strArr;
        int i10 = this.f38722c;
        this.f38725f = new List[i10];
        this.f38727h = new boolean[i10];
        this.f38728i = AbstractC6971J.e();
        EnumC6932n enumC6932n = EnumC6932n.f44481s;
        this.f38729j = AbstractC6929k.b(enumC6932n, new b());
        this.f38730k = AbstractC6929k.b(enumC6932n, new d());
        this.f38731l = AbstractC6929k.b(enumC6932n, new a());
    }

    public static /* synthetic */ void o(C6151s0 c6151s0, String str, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        c6151s0.n(str, z7);
    }

    private final Map p() {
        HashMap hashMap = new HashMap();
        int length = this.f38724e.length;
        for (int i8 = 0; i8 < length; i8++) {
            hashMap.put(this.f38724e[i8], Integer.valueOf(i8));
        }
        return hashMap;
    }

    private final g7.b[] q() {
        return (g7.b[]) this.f38729j.getValue();
    }

    private final int s() {
        return ((Number) this.f38731l.getValue()).intValue();
    }

    @Override // i7.f
    public String a() {
        return this.f38720a;
    }

    @Override // k7.InterfaceC6141n
    public Set b() {
        return this.f38728i.keySet();
    }

    @Override // i7.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // i7.f
    public int d(String str) {
        J6.r.e(str, "name");
        Integer num = (Integer) this.f38728i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // i7.f
    public i7.j e() {
        return k.a.f36736a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6151s0) {
            i7.f fVar = (i7.f) obj;
            if (J6.r.a(a(), fVar.a()) && Arrays.equals(r(), ((C6151s0) obj).r()) && g() == fVar.g()) {
                int g8 = g();
                for (int i8 = 0; i8 < g8; i8++) {
                    if (J6.r.a(k(i8).a(), fVar.k(i8).a()) && J6.r.a(k(i8).e(), fVar.k(i8).e())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // i7.f
    public List f() {
        List list = this.f38726g;
        return list == null ? AbstractC6987o.e() : list;
    }

    @Override // i7.f
    public final int g() {
        return this.f38722c;
    }

    @Override // i7.f
    public String h(int i8) {
        return this.f38724e[i8];
    }

    public int hashCode() {
        return s();
    }

    @Override // i7.f
    public boolean i() {
        return f.a.b(this);
    }

    @Override // i7.f
    public List j(int i8) {
        List list = this.f38725f[i8];
        return list == null ? AbstractC6987o.e() : list;
    }

    @Override // i7.f
    public i7.f k(int i8) {
        return q()[i8].getDescriptor();
    }

    @Override // i7.f
    public boolean l(int i8) {
        return this.f38727h[i8];
    }

    public final void n(String str, boolean z7) {
        J6.r.e(str, "name");
        String[] strArr = this.f38724e;
        int i8 = this.f38723d + 1;
        this.f38723d = i8;
        strArr[i8] = str;
        this.f38727h[i8] = z7;
        this.f38725f[i8] = null;
        if (i8 == this.f38722c - 1) {
            this.f38728i = p();
        }
    }

    public final i7.f[] r() {
        return (i7.f[]) this.f38730k.getValue();
    }

    public String toString() {
        return AbstractC6987o.I(P6.m.m(0, this.f38722c), ", ", a() + '(', ")", 0, null, new c(), 24, null);
    }

    public /* synthetic */ C6151s0(String str, K k8, int i8, int i9, AbstractC0650j abstractC0650j) {
        this(str, (i9 & 2) != 0 ? null : k8, i8);
    }
}
