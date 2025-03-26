package S;

import J6.AbstractC0650j;
import J6.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4965d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final b f4966e = new b(0.0f, P6.m.b(0.0f, 0.0f), 0, 4, null);

    /* renamed from: a, reason: collision with root package name */
    private final float f4967a;

    /* renamed from: b, reason: collision with root package name */
    private final P6.e f4968b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4969c;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b a() {
            return b.f4966e;
        }

        private a() {
        }
    }

    public b(float f8, P6.e eVar, int i8) {
        this.f4967a = f8;
        this.f4968b = eVar;
        this.f4969c = i8;
        if (Float.isNaN(f8)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f4967a;
    }

    public final P6.e c() {
        return this.f4968b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4967a == bVar.f4967a && r.a(this.f4968b, bVar.f4968b) && this.f4969c == bVar.f4969c;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f4967a) * 31) + this.f4968b.hashCode()) * 31) + this.f4969c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f4967a + ", range=" + this.f4968b + ", steps=" + this.f4969c + ')';
    }

    public /* synthetic */ b(float f8, P6.e eVar, int i8, int i9, AbstractC0650j abstractC0650j) {
        this(f8, eVar, (i9 & 4) != 0 ? 0 : i8);
    }
}
