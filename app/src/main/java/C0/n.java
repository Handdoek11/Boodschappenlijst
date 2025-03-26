package c0;

/* loaded from: classes.dex */
public abstract class n {
    public static final long a(int i8, int i9) {
        return m.c((i9 & 4294967295L) | (i8 << 32));
    }

    public static final long b(long j8, long j9) {
        return F.e.a(F.d.f(j8) - m.f(j9), F.d.g(j8) - m.g(j9));
    }

    public static final long c(long j8, long j9) {
        return F.e.a(F.d.f(j8) + m.f(j9), F.d.g(j8) + m.g(j9));
    }
}
