package j$.time;

/* loaded from: classes3.dex */
abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f37137a;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f37137a = iArr;
        try {
            iArr[j$.time.temporal.b.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f37137a[j$.time.temporal.b.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f37137a[j$.time.temporal.b.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f37137a[j$.time.temporal.b.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f37137a[j$.time.temporal.b.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f37137a[j$.time.temporal.b.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f37137a[j$.time.temporal.b.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
