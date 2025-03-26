package x6;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class v implements Comparable {

    /* renamed from: s, reason: collision with root package name */
    public static final a f44501s = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final byte f44502o;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ v(byte b8) {
        this.f44502o = b8;
    }

    public static final /* synthetic */ v a(byte b8) {
        return new v(b8);
    }

    public static boolean f(byte b8, Object obj) {
        return (obj instanceof v) && b8 == ((v) obj).i();
    }

    public static String h(byte b8) {
        return String.valueOf(b8 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return J6.r.f(i() & 255, ((v) obj).i() & 255);
    }

    public boolean equals(Object obj) {
        return f(this.f44502o, obj);
    }

    public int hashCode() {
        return g(this.f44502o);
    }

    public final /* synthetic */ byte i() {
        return this.f44502o;
    }

    public String toString() {
        return h(this.f44502o);
    }

    public static byte c(byte b8) {
        return b8;
    }

    public static int g(byte b8) {
        return b8;
    }
}
