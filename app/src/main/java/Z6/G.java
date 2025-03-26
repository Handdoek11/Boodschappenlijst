package Z6;

/* loaded from: classes2.dex */
abstract /* synthetic */ class G {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6453a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f6453a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
