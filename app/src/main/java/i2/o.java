package i2;

import i2.e;

/* loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(AbstractC5849a abstractC5849a);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: o, reason: collision with root package name */
        private final int f36448o;

        b(int i8) {
            this.f36448o = i8;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract AbstractC5849a b();

    public abstract b c();
}
