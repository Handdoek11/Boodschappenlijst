package x6;

import J6.AbstractC0650j;
import java.io.Serializable;

/* renamed from: x6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6934p implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final a f44487s = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final Object f44488o;

    /* renamed from: x6.p$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: x6.p$b */
    public static final class b implements Serializable {

        /* renamed from: o, reason: collision with root package name */
        public final Throwable f44489o;

        public b(Throwable th) {
            J6.r.e(th, "exception");
            this.f44489o = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && J6.r.a(this.f44489o, ((b) obj).f44489o);
        }

        public int hashCode() {
            return this.f44489o.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f44489o + ')';
        }
    }

    private /* synthetic */ C6934p(Object obj) {
        this.f44488o = obj;
    }

    public static final /* synthetic */ C6934p a(Object obj) {
        return new C6934p(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof C6934p) && J6.r.a(obj, ((C6934p) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return J6.r.a(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f44489o;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f44488o, obj);
    }

    public int hashCode() {
        return f(this.f44488o);
    }

    public final /* synthetic */ Object j() {
        return this.f44488o;
    }

    public String toString() {
        return i(this.f44488o);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
