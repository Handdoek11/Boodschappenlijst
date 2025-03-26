package x6;

import J6.AbstractC0650j;

/* renamed from: x6.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6914C implements Comparable {

    /* renamed from: s, reason: collision with root package name */
    public static final a f44458s = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final short f44459o;

    /* renamed from: x6.C$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C6914C(short s8) {
        this.f44459o = s8;
    }

    public static final /* synthetic */ C6914C a(short s8) {
        return new C6914C(s8);
    }

    public static boolean f(short s8, Object obj) {
        return (obj instanceof C6914C) && s8 == ((C6914C) obj).i();
    }

    public static String h(short s8) {
        return String.valueOf(s8 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return J6.r.f(i() & 65535, ((C6914C) obj).i() & 65535);
    }

    public boolean equals(Object obj) {
        return f(this.f44459o, obj);
    }

    public int hashCode() {
        return g(this.f44459o);
    }

    public final /* synthetic */ short i() {
        return this.f44459o;
    }

    public String toString() {
        return h(this.f44459o);
    }

    public static short c(short s8) {
        return s8;
    }

    public static int g(short s8) {
        return s8;
    }
}
