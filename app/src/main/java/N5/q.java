package N5;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f4191b = false;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f4193d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f4194e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f4195f;

    /* renamed from: a, reason: collision with root package name */
    public static final q f4190a = new q();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f4192c = true;

    static {
        String property = System.getProperty("io.ktor.development");
        boolean z7 = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z7 = true;
        }
        f4194e = z7;
        f4195f = true;
    }

    private q() {
    }

    public final boolean a() {
        return f4191b;
    }

    public final boolean b() {
        return f4194e;
    }

    public final boolean c() {
        return f4193d;
    }
}
