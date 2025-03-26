package P6;

import J6.AbstractC0650j;
import y6.AbstractC6968G;

/* loaded from: classes2.dex */
public class g implements Iterable, K6.a {

    /* renamed from: u, reason: collision with root package name */
    public static final a f4422u = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final int f4423o;

    /* renamed from: s, reason: collision with root package name */
    private final int f4424s;

    /* renamed from: t, reason: collision with root package name */
    private final int f4425t;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final g a(int i8, int i9, int i10) {
            return new g(i8, i9, i10);
        }

        private a() {
        }
    }

    public g(int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4423o = i8;
        this.f4424s = D6.c.c(i8, i9, i10);
        this.f4425t = i10;
    }

    public final int e() {
        return this.f4423o;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f4423o != gVar.f4423o || this.f4424s != gVar.f4424s || this.f4425t != gVar.f4425t) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f4423o * 31) + this.f4424s) * 31) + this.f4425t;
    }

    public boolean isEmpty() {
        if (this.f4425t > 0) {
            if (this.f4423o <= this.f4424s) {
                return false;
            }
        } else if (this.f4423o >= this.f4424s) {
            return false;
        }
        return true;
    }

    public final int j() {
        return this.f4424s;
    }

    public final int n() {
        return this.f4425t;
    }

    @Override // java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC6968G iterator() {
        return new h(this.f4423o, this.f4424s, this.f4425t);
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.f4425t > 0) {
            sb = new StringBuilder();
            sb.append(this.f4423o);
            sb.append("..");
            sb.append(this.f4424s);
            sb.append(" step ");
            i8 = this.f4425t;
        } else {
            sb = new StringBuilder();
            sb.append(this.f4423o);
            sb.append(" downTo ");
            sb.append(this.f4424s);
            sb.append(" step ");
            i8 = -this.f4425t;
        }
        sb.append(i8);
        return sb.toString();
    }
}
