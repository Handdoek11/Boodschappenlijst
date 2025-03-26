package q2;

import java.util.Set;
import q2.f;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6422c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f40935a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40936b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f40937c;

    /* renamed from: q2.c$b */
    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f40938a;

        /* renamed from: b, reason: collision with root package name */
        private Long f40939b;

        /* renamed from: c, reason: collision with root package name */
        private Set f40940c;

        b() {
        }

        @Override // q2.f.b.a
        public f.b a() {
            String str = "";
            if (this.f40938a == null) {
                str = " delta";
            }
            if (this.f40939b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f40940c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C6422c(this.f40938a.longValue(), this.f40939b.longValue(), this.f40940c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // q2.f.b.a
        public f.b.a b(long j8) {
            this.f40938a = Long.valueOf(j8);
            return this;
        }

        @Override // q2.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f40940c = set;
            return this;
        }

        @Override // q2.f.b.a
        public f.b.a d(long j8) {
            this.f40939b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // q2.f.b
    long b() {
        return this.f40935a;
    }

    @Override // q2.f.b
    Set c() {
        return this.f40937c;
    }

    @Override // q2.f.b
    long d() {
        return this.f40936b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f40935a == bVar.b() && this.f40936b == bVar.d() && this.f40937c.equals(bVar.c());
    }

    public int hashCode() {
        long j8 = this.f40935a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f40936b;
        return ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f40937c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f40935a + ", maxAllowedDelay=" + this.f40936b + ", flags=" + this.f40937c + "}";
    }

    private C6422c(long j8, long j9, Set set) {
        this.f40935a = j8;
        this.f40936b = j9;
        this.f40937c = set;
    }
}
