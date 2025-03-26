package x6;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class x implements Comparable {

    /* renamed from: s, reason: collision with root package name */
    public static final a f44506s = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final int f44507o;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ x(int i8) {
        this.f44507o = i8;
    }

    public static final /* synthetic */ x a(int i8) {
        return new x(i8);
    }

    public static boolean f(int i8, Object obj) {
        return (obj instanceof x) && i8 == ((x) obj).i();
    }

    public static String h(int i8) {
        return String.valueOf(i8 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC6918G.a(i(), ((x) obj).i());
    }

    public boolean equals(Object obj) {
        return f(this.f44507o, obj);
    }

    public int hashCode() {
        return g(this.f44507o);
    }

    public final /* synthetic */ int i() {
        return this.f44507o;
    }

    public String toString() {
        return h(this.f44507o);
    }

    public static int c(int i8) {
        return i8;
    }

    public static int g(int i8) {
        return i8;
    }
}
