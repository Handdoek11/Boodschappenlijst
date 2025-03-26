package j$.time.chrono;

/* renamed from: j$.time.chrono.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC5892l {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f37045a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f37045a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f37045a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
