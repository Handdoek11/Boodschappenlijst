package B;

import B.a;
import c0.n;
import c0.o;
import c0.q;

/* loaded from: classes.dex */
public final class b implements B.a {

    /* renamed from: b, reason: collision with root package name */
    private final float f268b;

    /* renamed from: c, reason: collision with root package name */
    private final float f269c;

    public static final class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        private final float f270a;

        public a(float f8) {
            this.f270a = f8;
        }

        @Override // B.a.b
        public int a(int i8, int i9, q qVar) {
            return L6.a.a(((i9 - i8) / 2.0f) * (1 + (qVar == q.Ltr ? this.f270a : (-1) * this.f270a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f270a, ((a) obj).f270a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f270a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f270a + ')';
        }
    }

    /* renamed from: B.b$b, reason: collision with other inner class name */
    public static final class C0004b implements a.c {

        /* renamed from: a, reason: collision with root package name */
        private final float f271a;

        public C0004b(float f8) {
            this.f271a = f8;
        }

        @Override // B.a.c
        public int a(int i8, int i9) {
            return L6.a.a(((i9 - i8) / 2.0f) * (1 + this.f271a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0004b) && Float.compare(this.f271a, ((C0004b) obj).f271a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f271a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f271a + ')';
        }
    }

    public b(float f8, float f9) {
        this.f268b = f8;
        this.f269c = f9;
    }

    @Override // B.a
    public long a(long j8, long j9, q qVar) {
        float e8 = (o.e(j9) - o.e(j8)) / 2.0f;
        float d8 = (o.d(j9) - o.d(j8)) / 2.0f;
        float f8 = 1;
        return n.a(L6.a.a(e8 * ((qVar == q.Ltr ? this.f268b : (-1) * this.f268b) + f8)), L6.a.a(d8 * (f8 + this.f269c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f268b, bVar.f268b) == 0 && Float.compare(this.f269c, bVar.f269c) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f268b) * 31) + Float.floatToIntBits(this.f269c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f268b + ", verticalBias=" + this.f269c + ')';
    }
}
