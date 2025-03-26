package E6;

import J6.r;

/* loaded from: classes2.dex */
public abstract class a extends D6.a {

    /* renamed from: E6.a$a, reason: collision with other inner class name */
    private static final class C0033a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0033a f2208a = new C0033a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f2209b;

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
            f2209b = num;
        }

        private C0033a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0033a.f2209b;
        return num == null || num.intValue() >= i8;
    }

    @Override // D6.a
    public void a(Throwable th, Throwable th2) {
        r.e(th, "cause");
        r.e(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
