package N6;

import J6.AbstractC0650j;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: o, reason: collision with root package name */
    public static final a f4202o = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private static final c f4203s = D6.b.f2124a.b();

    public static final class a extends c implements Serializable {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        @Override // N6.c
        public int b(int i8) {
            return c.f4203s.b(i8);
        }

        @Override // N6.c
        public int c() {
            return c.f4203s.c();
        }

        @Override // N6.c
        public int d(int i8) {
            return c.f4203s.d(i8);
        }

        @Override // N6.c
        public long e() {
            return c.f4203s.e();
        }

        @Override // N6.c
        public long f(long j8) {
            return c.f4203s.f(j8);
        }

        @Override // N6.c
        public long g(long j8, long j9) {
            return c.f4203s.g(j8, j9);
        }

        private a() {
        }
    }

    public abstract int b(int i8);

    public abstract int c();

    public abstract int d(int i8);

    public abstract long e();

    public long f(long j8) {
        return g(0L, j8);
    }

    public long g(long j8, long j9) {
        long e8;
        long j10;
        long j11;
        int c8;
        d.b(j8, j9);
        long j12 = j9 - j8;
        if (j12 > 0) {
            if (((-j12) & j12) == j12) {
                int i8 = (int) j12;
                int i9 = (int) (j12 >>> 32);
                if (i8 != 0) {
                    c8 = b(d.c(i8));
                } else if (i9 == 1) {
                    c8 = c();
                } else {
                    j11 = (b(d.c(i9)) << 32) + (c() & 4294967295L);
                }
                j11 = c8 & 4294967295L;
            } else {
                do {
                    e8 = e() >>> 1;
                    j10 = e8 % j12;
                } while ((e8 - j10) + (j12 - 1) < 0);
                j11 = j10;
            }
            return j8 + j11;
        }
        while (true) {
            long e9 = e();
            if (j8 <= e9 && e9 < j9) {
                return e9;
            }
        }
    }
}
