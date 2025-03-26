package J6;

import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class M implements Q6.k {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3552e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Q6.c f3553a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3554b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.k f3555c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3556d;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static final class b extends s implements I6.l {
        b() {
            super(1);
        }

        public final CharSequence b(Q6.l lVar) {
            r.e(lVar, "it");
            return M.this.e(lVar);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            androidx.appcompat.app.E.a(obj);
            return b(null);
        }
    }

    public M(Q6.c cVar, List list, Q6.k kVar, int i8) {
        r.e(cVar, "classifier");
        r.e(list, "arguments");
        this.f3553a = cVar;
        this.f3554b = list;
        this.f3555c = kVar;
        this.f3556d = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(Q6.l lVar) {
        throw null;
    }

    private final String f(boolean z7) {
        String name;
        Q6.c c8 = c();
        Q6.b bVar = c8 instanceof Q6.b ? (Q6.b) c8 : null;
        Class a8 = bVar != null ? H6.a.a(bVar) : null;
        if (a8 == null) {
            name = c().toString();
        } else if ((this.f3556d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (a8.isArray()) {
            name = g(a8);
        } else if (z7 && a8.isPrimitive()) {
            Q6.c c9 = c();
            r.c(c9, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = H6.a.b((Q6.b) c9).getName();
        } else {
            name = a8.getName();
        }
        String str = name + (b().isEmpty() ? "" : AbstractC6987o.I(b(), ", ", "<", ">", 0, null, new b(), 24, null)) + (a() ? "?" : "");
        Q6.k kVar = this.f3555c;
        if (!(kVar instanceof M)) {
            return str;
        }
        String f8 = ((M) kVar).f(true);
        if (r.a(f8, str)) {
            return str;
        }
        if (r.a(f8, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + f8 + ')';
    }

    private final String g(Class cls) {
        return r.a(cls, boolean[].class) ? "kotlin.BooleanArray" : r.a(cls, char[].class) ? "kotlin.CharArray" : r.a(cls, byte[].class) ? "kotlin.ByteArray" : r.a(cls, short[].class) ? "kotlin.ShortArray" : r.a(cls, int[].class) ? "kotlin.IntArray" : r.a(cls, float[].class) ? "kotlin.FloatArray" : r.a(cls, long[].class) ? "kotlin.LongArray" : r.a(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override // Q6.k
    public boolean a() {
        return (this.f3556d & 1) != 0;
    }

    @Override // Q6.k
    public List b() {
        return this.f3554b;
    }

    @Override // Q6.k
    public Q6.c c() {
        return this.f3553a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof M) {
            M m8 = (M) obj;
            if (r.a(c(), m8.c()) && r.a(b(), m8.b()) && r.a(this.f3555c, m8.f3555c) && this.f3556d == m8.f3556d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((c().hashCode() * 31) + b().hashCode()) * 31) + this.f3556d;
    }

    public String toString() {
        return f(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public M(Q6.c cVar, List list, boolean z7) {
        this(cVar, list, null, z7 ? 1 : 0);
        r.e(cVar, "classifier");
        r.e(list, "arguments");
    }
}
