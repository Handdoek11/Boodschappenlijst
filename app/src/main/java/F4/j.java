package F4;

/* loaded from: classes2.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: o, reason: collision with root package name */
        private final int f2381o;

        a(int i8) {
            this.f2381o = i8;
        }

        public int c() {
            return this.f2381o;
        }
    }

    a b(String str);
}
