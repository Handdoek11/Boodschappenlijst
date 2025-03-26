package P6;

import J6.AbstractC0650j;
import y6.AbstractC6986n;

/* loaded from: classes2.dex */
public abstract class a implements Iterable, K6.a {

    /* renamed from: u, reason: collision with root package name */
    public static final C0088a f4410u = new C0088a(null);

    /* renamed from: o, reason: collision with root package name */
    private final char f4411o;

    /* renamed from: s, reason: collision with root package name */
    private final char f4412s;

    /* renamed from: t, reason: collision with root package name */
    private final int f4413t;

    /* renamed from: P6.a$a, reason: collision with other inner class name */
    public static final class C0088a {
        public /* synthetic */ C0088a(AbstractC0650j abstractC0650j) {
            this();
        }

        private C0088a() {
        }
    }

    public a(char c8, char c9, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4411o = c8;
        this.f4412s = (char) D6.c.c(c8, c9, i8);
        this.f4413t = i8;
    }

    public final char e() {
        return this.f4411o;
    }

    public final char j() {
        return this.f4412s;
    }

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC6986n iterator() {
        return new b(this.f4411o, this.f4412s, this.f4413t);
    }
}
