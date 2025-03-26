package y;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f44519a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f44520b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f44521c;

    public f(int i8, long[] jArr, Object[] objArr) {
        this.f44519a = i8;
        this.f44520b = jArr;
        this.f44521c = objArr;
    }

    private final int a(long j8) {
        int i8 = this.f44519a - 1;
        if (i8 == -1) {
            return -1;
        }
        int i9 = 0;
        if (i8 == 0) {
            long j9 = this.f44520b[0];
            if (j9 == j8) {
                return 0;
            }
            return j9 > j8 ? -2 : -1;
        }
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j10 = this.f44520b[i10] - j8;
            if (j10 < 0) {
                i9 = i10 + 1;
            } else {
                if (j10 <= 0) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public final Object b(long j8) {
        int a8 = a(j8);
        if (a8 >= 0) {
            return this.f44521c[a8];
        }
        return null;
    }

    public final f c(long j8, Object obj) {
        int i8 = this.f44519a;
        int i9 = 0;
        int i10 = 0;
        for (Object obj2 : this.f44521c) {
            if (obj2 != null) {
                i10++;
            }
        }
        int i11 = i10 + 1;
        long[] jArr = new long[i11];
        Object[] objArr = new Object[i11];
        if (i11 > 1) {
            int i12 = 0;
            while (true) {
                if (i9 >= i11 || i12 >= i8) {
                    break;
                }
                long j9 = this.f44520b[i12];
                Object obj3 = this.f44521c[i12];
                if (j9 > j8) {
                    jArr[i9] = j8;
                    objArr[i9] = obj;
                    i9++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i9] = j9;
                    objArr[i9] = obj3;
                    i9++;
                }
                i12++;
            }
            if (i12 == i8) {
                jArr[i10] = j8;
                objArr[i10] = obj;
            } else {
                while (i9 < i11) {
                    long j10 = this.f44520b[i12];
                    Object obj4 = this.f44521c[i12];
                    if (obj4 != null) {
                        jArr[i9] = j10;
                        objArr[i9] = obj4;
                        i9++;
                    }
                    i12++;
                }
            }
        } else {
            jArr[0] = j8;
            objArr[0] = obj;
        }
        return new f(i11, jArr, objArr);
    }

    public final boolean d(long j8, Object obj) {
        int a8 = a(j8);
        if (a8 < 0) {
            return false;
        }
        this.f44521c[a8] = obj;
        return true;
    }
}
