package i2;

import i2.u;
import java.util.List;

/* loaded from: classes.dex */
final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    private final long f36426a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36427b;

    /* renamed from: c, reason: collision with root package name */
    private final o f36428c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f36429d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36430e;

    /* renamed from: f, reason: collision with root package name */
    private final List f36431f;

    /* renamed from: g, reason: collision with root package name */
    private final x f36432g;

    static final class b extends u.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f36433a;

        /* renamed from: b, reason: collision with root package name */
        private Long f36434b;

        /* renamed from: c, reason: collision with root package name */
        private o f36435c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f36436d;

        /* renamed from: e, reason: collision with root package name */
        private String f36437e;

        /* renamed from: f, reason: collision with root package name */
        private List f36438f;

        /* renamed from: g, reason: collision with root package name */
        private x f36439g;

        b() {
        }

        @Override // i2.u.a
        public u a() {
            String str = "";
            if (this.f36433a == null) {
                str = " requestTimeMs";
            }
            if (this.f36434b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f36433a.longValue(), this.f36434b.longValue(), this.f36435c, this.f36436d, this.f36437e, this.f36438f, this.f36439g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i2.u.a
        public u.a b(o oVar) {
            this.f36435c = oVar;
            return this;
        }

        @Override // i2.u.a
        public u.a c(List list) {
            this.f36438f = list;
            return this;
        }

        @Override // i2.u.a
        u.a d(Integer num) {
            this.f36436d = num;
            return this;
        }

        @Override // i2.u.a
        u.a e(String str) {
            this.f36437e = str;
            return this;
        }

        @Override // i2.u.a
        public u.a f(x xVar) {
            this.f36439g = xVar;
            return this;
        }

        @Override // i2.u.a
        public u.a g(long j8) {
            this.f36433a = Long.valueOf(j8);
            return this;
        }

        @Override // i2.u.a
        public u.a h(long j8) {
            this.f36434b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // i2.u
    public o b() {
        return this.f36428c;
    }

    @Override // i2.u
    public List c() {
        return this.f36431f;
    }

    @Override // i2.u
    public Integer d() {
        return this.f36429d;
    }

    @Override // i2.u
    public String e() {
        return this.f36430e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f36426a == uVar.g() && this.f36427b == uVar.h() && ((oVar = this.f36428c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f36429d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f36430e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f36431f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            x xVar = this.f36432g;
            if (xVar == null) {
                if (uVar.f() == null) {
                    return true;
                }
            } else if (xVar.equals(uVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.u
    public x f() {
        return this.f36432g;
    }

    @Override // i2.u
    public long g() {
        return this.f36426a;
    }

    @Override // i2.u
    public long h() {
        return this.f36427b;
    }

    public int hashCode() {
        long j8 = this.f36426a;
        long j9 = this.f36427b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        o oVar = this.f36428c;
        int hashCode = (i8 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f36429d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f36430e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f36431f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f36432g;
        return hashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f36426a + ", requestUptimeMs=" + this.f36427b + ", clientInfo=" + this.f36428c + ", logSource=" + this.f36429d + ", logSourceName=" + this.f36430e + ", logEvents=" + this.f36431f + ", qosTier=" + this.f36432g + "}";
    }

    private k(long j8, long j9, o oVar, Integer num, String str, List list, x xVar) {
        this.f36426a = j8;
        this.f36427b = j9;
        this.f36428c = oVar;
        this.f36429d = num;
        this.f36430e = str;
        this.f36431f = list;
        this.f36432g = xVar;
    }
}
