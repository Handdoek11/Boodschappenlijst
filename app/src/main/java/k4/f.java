package K4;

import K4.b;

/* loaded from: classes2.dex */
public abstract class f {

    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j8);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new b.C0061b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
