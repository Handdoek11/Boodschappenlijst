package k7;

import J6.AbstractC0650j;
import y6.AbstractC6980h;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: e, reason: collision with root package name */
    private static final a f38595e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f38596f = new long[0];

    /* renamed from: a, reason: collision with root package name */
    private final i7.f f38597a;

    /* renamed from: b, reason: collision with root package name */
    private final I6.p f38598b;

    /* renamed from: c, reason: collision with root package name */
    private long f38599c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f38600d;

    private static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public E(i7.f fVar, I6.p pVar) {
        J6.r.e(fVar, "descriptor");
        J6.r.e(pVar, "readIfAbsent");
        this.f38597a = fVar;
        this.f38598b = pVar;
        int g8 = fVar.g();
        if (g8 <= 64) {
            this.f38599c = g8 != 64 ? (-1) << g8 : 0L;
            this.f38600d = f38596f;
        } else {
            this.f38599c = 0L;
            this.f38600d = e(g8);
        }
    }

    private final void b(int i8) {
        int i9 = (i8 >>> 6) - 1;
        long[] jArr = this.f38600d;
        jArr[i9] = jArr[i9] | (1 << (i8 & 63));
    }

    private final int c() {
        int length = this.f38600d.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            int i10 = i9 * 64;
            long j8 = this.f38600d[i8];
            while (j8 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                j8 |= 1 << numberOfTrailingZeros;
                int i11 = numberOfTrailingZeros + i10;
                if (((Boolean) this.f38598b.invoke(this.f38597a, Integer.valueOf(i11))).booleanValue()) {
                    this.f38600d[i8] = j8;
                    return i11;
                }
            }
            this.f38600d[i8] = j8;
            i8 = i9;
        }
        return -1;
    }

    private final long[] e(int i8) {
        long[] jArr = new long[(i8 - 1) >>> 6];
        if ((i8 & 63) != 0) {
            jArr[AbstractC6980h.x(jArr)] = (-1) << i8;
        }
        return jArr;
    }

    public final void a(int i8) {
        if (i8 < 64) {
            this.f38599c |= 1 << i8;
        } else {
            b(i8);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int g8 = this.f38597a.g();
        do {
            long j8 = this.f38599c;
            if (j8 == -1) {
                if (g8 > 64) {
                    return c();
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
            this.f38599c |= 1 << numberOfTrailingZeros;
        } while (!((Boolean) this.f38598b.invoke(this.f38597a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
