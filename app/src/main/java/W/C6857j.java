package w;

import J6.AbstractC0650j;
import J6.r;
import x.AbstractC6896b;

/* renamed from: w.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6857j {

    /* renamed from: d, reason: collision with root package name */
    public static final a f44174d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f44175e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static final C6857j f44176f = new C6857j(0, 0, new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    private int f44177a;

    /* renamed from: b, reason: collision with root package name */
    private int f44178b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f44179c;

    /* renamed from: w.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final C6857j a() {
            return C6857j.f44176f;
        }

        private a() {
        }
    }

    public C6857j(int i8, int i9, Object[] objArr, AbstractC6896b abstractC6896b) {
        this.f44177a = i8;
        this.f44178b = i9;
        this.f44179c = objArr;
    }

    private final boolean b(Object obj) {
        P6.g l8 = P6.m.l(P6.m.m(0, this.f44179c.length), 2);
        int e8 = l8.e();
        int j8 = l8.j();
        int n8 = l8.n();
        if ((n8 > 0 && e8 <= j8) || (n8 < 0 && j8 <= e8)) {
            while (!r.a(obj, this.f44179c[e8])) {
                if (e8 != j8) {
                    e8 += n8;
                }
            }
            return true;
        }
        return false;
    }

    private final Object c(Object obj) {
        P6.g l8 = P6.m.l(P6.m.m(0, this.f44179c.length), 2);
        int e8 = l8.e();
        int j8 = l8.j();
        int n8 = l8.n();
        if ((n8 <= 0 || e8 > j8) && (n8 >= 0 || j8 > e8)) {
            return null;
        }
        while (!r.a(obj, k(e8))) {
            if (e8 == j8) {
                return null;
            }
            e8 += n8;
        }
        return n(e8);
    }

    private final boolean j(int i8) {
        return (i8 & this.f44178b) != 0;
    }

    private final Object k(int i8) {
        return this.f44179c[i8];
    }

    private final Object n(int i8) {
        return this.f44179c[i8 + 1];
    }

    public final boolean d(int i8, Object obj, int i9) {
        int a8 = 1 << AbstractC6861n.a(i8, i9);
        if (i(a8)) {
            return r.a(obj, k(f(a8)));
        }
        if (!j(a8)) {
            return false;
        }
        C6857j l8 = l(m(a8));
        return i9 == 30 ? l8.b(obj) : l8.d(i8, obj, i9 + 5);
    }

    public final int e() {
        return Integer.bitCount(this.f44177a);
    }

    public final int f(int i8) {
        return Integer.bitCount((i8 - 1) & this.f44177a) * 2;
    }

    public final Object g(int i8, Object obj, int i9) {
        int a8 = 1 << AbstractC6861n.a(i8, i9);
        if (i(a8)) {
            int f8 = f(a8);
            if (r.a(obj, k(f8))) {
                return n(f8);
            }
            return null;
        }
        if (!j(a8)) {
            return null;
        }
        C6857j l8 = l(m(a8));
        return i9 == 30 ? l8.c(obj) : l8.g(i8, obj, i9 + 5);
    }

    public final Object[] h() {
        return this.f44179c;
    }

    public final boolean i(int i8) {
        return (i8 & this.f44177a) != 0;
    }

    public final C6857j l(int i8) {
        Object obj = this.f44179c[i8];
        r.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C6857j) obj;
    }

    public final int m(int i8) {
        return (this.f44179c.length - 1) - Integer.bitCount((i8 - 1) & this.f44178b);
    }

    public C6857j(int i8, int i9, Object[] objArr) {
        this(i8, i9, objArr, null);
    }
}
