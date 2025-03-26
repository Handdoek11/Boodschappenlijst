package S4;

import J6.r;

/* loaded from: classes2.dex */
public interface b {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: S4.b$b, reason: collision with other inner class name */
    public static final class C0102b {

        /* renamed from: a, reason: collision with root package name */
        private final String f5128a;

        public C0102b(String str) {
            r.e(str, "sessionId");
            this.f5128a = str;
        }

        public final String a() {
            return this.f5128a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0102b) && r.a(this.f5128a, ((C0102b) obj).f5128a);
        }

        public int hashCode() {
            return this.f5128a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f5128a + ')';
        }
    }

    void a(C0102b c0102b);

    boolean b();

    a c();
}
