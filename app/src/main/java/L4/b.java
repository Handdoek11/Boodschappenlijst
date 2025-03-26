package L4;

/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static b f3701a;

    private b() {
    }

    public static b b() {
        if (f3701a == null) {
            f3701a = new b();
        }
        return f3701a;
    }

    @Override // L4.a
    public long a() {
        return System.currentTimeMillis();
    }
}
