package H;

import J6.AbstractC0650j;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2777d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f2778a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2779b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2780c;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, long j8, int i8, AbstractC0650j abstractC0650j) {
        this(str, j8, i8);
    }

    public final int a() {
        return c.f(this.f2779b);
    }

    public final int b() {
        return this.f2780c;
    }

    public abstract float c(int i8);

    public abstract float d(int i8);

    public final long e() {
        return this.f2779b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2780c == dVar.f2780c && J6.r.a(this.f2778a, dVar.f2778a)) {
            return c.e(this.f2779b, dVar.f2779b);
        }
        return false;
    }

    public final String f() {
        return this.f2778a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f8, float f9, float f10);

    public int hashCode() {
        return (((this.f2778a.hashCode() * 31) + c.g(this.f2779b)) * 31) + this.f2780c;
    }

    public abstract float i(float f8, float f9, float f10);

    public abstract long j(float f8, float f9, float f10, float f11, d dVar);

    public String toString() {
        return this.f2778a + " (id=" + this.f2780c + ", model=" + ((Object) c.h(this.f2779b)) + ')';
    }

    private d(String str, long j8, int i8) {
        this.f2778a = str;
        this.f2779b = j8;
        this.f2780c = i8;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i8 < -1 || i8 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
