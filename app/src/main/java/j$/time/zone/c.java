package j$.time.zone;

/* loaded from: classes3.dex */
abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f37215a;

    static {
        int[] iArr = new int[d.values().length];
        f37215a = iArr;
        try {
            iArr[d.UTC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f37215a[d.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
