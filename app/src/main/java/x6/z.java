package x6;

import H.AbstractC0626b;
import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class z implements Comparable {

    /* renamed from: s, reason: collision with root package name */
    public static final a f44511s = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final long f44512o;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ z(long j8) {
        this.f44512o = j8;
    }

    public static final /* synthetic */ z a(long j8) {
        return new z(j8);
    }

    public static boolean f(long j8, Object obj) {
        return (obj instanceof z) && j8 == ((z) obj).k();
    }

    public static final boolean g(long j8, long j9) {
        return j8 == j9;
    }

    public static int h(long j8) {
        return AbstractC0626b.a(j8);
    }

    public static String i(long j8) {
        return AbstractC6918G.d(j8);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC6918G.b(k(), ((z) obj).k());
    }

    public boolean equals(Object obj) {
        return f(this.f44512o, obj);
    }

    public int hashCode() {
        return h(this.f44512o);
    }

    public final /* synthetic */ long k() {
        return this.f44512o;
    }

    public String toString() {
        return i(this.f44512o);
    }

    public static long c(long j8) {
        return j8;
    }
}
