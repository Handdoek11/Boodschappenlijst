package Z6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class H {
    public static final int a(String str, int i8, int i9, int i10) {
        return (int) F.c(str, i8, i9, i10);
    }

    public static final long b(String str, long j8, long j9, long j10) {
        String d8 = F.d(str);
        if (d8 == null) {
            return j8;
        }
        Long m8 = S6.h.m(d8);
        if (m8 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d8 + '\'').toString());
        }
        long longValue = m8.longValue();
        if (j9 <= longValue && longValue <= j10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + ", but is '" + longValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String d8 = F.d(str);
        return d8 == null ? str2 : d8;
    }

    public static final boolean d(String str, boolean z7) {
        String d8 = F.d(str);
        return d8 != null ? Boolean.parseBoolean(d8) : z7;
    }

    public static /* synthetic */ int e(String str, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i9 = 1;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return F.b(str, i8, i9, i10);
    }

    public static /* synthetic */ long f(String str, long j8, long j9, long j10, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j9 = 1;
        }
        long j11 = j9;
        if ((i8 & 8) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return F.c(str, j8, j11, j10);
    }
}
