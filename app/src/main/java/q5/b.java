package Q5;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;

/* loaded from: classes2.dex */
public final class b implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public static final a f4706A = new a(null);

    /* renamed from: B, reason: collision with root package name */
    private static final b f4707B = Q5.a.a(0L);

    /* renamed from: o, reason: collision with root package name */
    private final int f4708o;

    /* renamed from: s, reason: collision with root package name */
    private final int f4709s;

    /* renamed from: t, reason: collision with root package name */
    private final int f4710t;

    /* renamed from: u, reason: collision with root package name */
    private final d f4711u;

    /* renamed from: v, reason: collision with root package name */
    private final int f4712v;

    /* renamed from: w, reason: collision with root package name */
    private final int f4713w;

    /* renamed from: x, reason: collision with root package name */
    private final c f4714x;

    /* renamed from: y, reason: collision with root package name */
    private final int f4715y;

    /* renamed from: z, reason: collision with root package name */
    private final long f4716z;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public b(int i8, int i9, int i10, d dVar, int i11, int i12, c cVar, int i13, long j8) {
        r.e(dVar, "dayOfWeek");
        r.e(cVar, "month");
        this.f4708o = i8;
        this.f4709s = i9;
        this.f4710t = i10;
        this.f4711u = dVar;
        this.f4712v = i11;
        this.f4713w = i12;
        this.f4714x = cVar;
        this.f4715y = i13;
        this.f4716z = j8;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        r.e(bVar, "other");
        return r.g(this.f4716z, bVar.f4716z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4708o == bVar.f4708o && this.f4709s == bVar.f4709s && this.f4710t == bVar.f4710t && this.f4711u == bVar.f4711u && this.f4712v == bVar.f4712v && this.f4713w == bVar.f4713w && this.f4714x == bVar.f4714x && this.f4715y == bVar.f4715y && this.f4716z == bVar.f4716z;
    }

    public int hashCode() {
        return (((((((((((((((this.f4708o * 31) + this.f4709s) * 31) + this.f4710t) * 31) + this.f4711u.hashCode()) * 31) + this.f4712v) * 31) + this.f4713w) * 31) + this.f4714x.hashCode()) * 31) + this.f4715y) * 31) + AbstractC0626b.a(this.f4716z);
    }

    public String toString() {
        return "GMTDate(seconds=" + this.f4708o + ", minutes=" + this.f4709s + ", hours=" + this.f4710t + ", dayOfWeek=" + this.f4711u + ", dayOfMonth=" + this.f4712v + ", dayOfYear=" + this.f4713w + ", month=" + this.f4714x + ", year=" + this.f4715y + ", timestamp=" + this.f4716z + ')';
    }
}
