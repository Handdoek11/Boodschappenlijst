package F6;

import N6.c;

/* loaded from: classes2.dex */
public class a extends E6.a {

    /* renamed from: F6.a$a, reason: collision with other inner class name */
    private static final class C0039a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0039a f2424a = new C0039a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f2425b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f2425b = num;
        }

        private C0039a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0039a.f2425b;
        return num == null || num.intValue() >= i8;
    }

    @Override // D6.a
    public c b() {
        return c(34) ? new O6.a() : super.b();
    }
}
