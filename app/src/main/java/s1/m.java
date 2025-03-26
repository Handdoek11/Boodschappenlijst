package s1;

/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f42693a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0327b f42694b;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f42695a;

            public a(Throwable th) {
                this.f42695a = th;
            }

            public Throwable a() {
                return this.f42695a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f42695a.getMessage());
            }
        }

        /* renamed from: s1.m$b$b, reason: collision with other inner class name */
        public static final class C0327b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0327b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f42693a = new b.c();
        f42694b = new b.C0327b();
    }
}
