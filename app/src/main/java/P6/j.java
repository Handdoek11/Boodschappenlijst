package P6;

import J6.AbstractC0650j;
import y6.AbstractC6969H;

/* loaded from: classes2.dex */
public abstract class j implements Iterable, K6.a {

    /* renamed from: u, reason: collision with root package name */
    public static final a f4432u = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final long f4433o;

    /* renamed from: s, reason: collision with root package name */
    private final long f4434s;

    /* renamed from: t, reason: collision with root package name */
    private final long f4435t;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public j(long j8, long j9, long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j10 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4433o = j8;
        this.f4434s = D6.c.d(j8, j9, j10);
        this.f4435t = j10;
    }

    public final long e() {
        return this.f4433o;
    }

    public final long j() {
        return this.f4434s;
    }

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC6969H iterator() {
        return new k(this.f4433o, this.f4434s, this.f4435t);
    }
}
