package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class q extends AbstractC6384F.e.d.a.b.AbstractC0310d {

    /* renamed from: a, reason: collision with root package name */
    private final String f40752a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40753b;

    /* renamed from: c, reason: collision with root package name */
    private final long f40754c;

    static final class b extends AbstractC6384F.e.d.a.b.AbstractC0310d.AbstractC0311a {

        /* renamed from: a, reason: collision with root package name */
        private String f40755a;

        /* renamed from: b, reason: collision with root package name */
        private String f40756b;

        /* renamed from: c, reason: collision with root package name */
        private long f40757c;

        /* renamed from: d, reason: collision with root package name */
        private byte f40758d;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0310d.AbstractC0311a
        public AbstractC6384F.e.d.a.b.AbstractC0310d a() {
            String str;
            String str2;
            if (this.f40758d == 1 && (str = this.f40755a) != null && (str2 = this.f40756b) != null) {
                return new q(str, str2, this.f40757c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40755a == null) {
                sb.append(" name");
            }
            if (this.f40756b == null) {
                sb.append(" code");
            }
            if ((1 & this.f40758d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0310d.AbstractC0311a
        public AbstractC6384F.e.d.a.b.AbstractC0310d.AbstractC0311a b(long j8) {
            this.f40757c = j8;
            this.f40758d = (byte) (this.f40758d | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0310d.AbstractC0311a
        public AbstractC6384F.e.d.a.b.AbstractC0310d.AbstractC0311a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f40756b = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0310d.AbstractC0311a
        public AbstractC6384F.e.d.a.b.AbstractC0310d.AbstractC0311a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f40755a = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0310d
    public long b() {
        return this.f40754c;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0310d
    public String c() {
        return this.f40753b;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0310d
    public String d() {
        return this.f40752a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.a.b.AbstractC0310d)) {
            return false;
        }
        AbstractC6384F.e.d.a.b.AbstractC0310d abstractC0310d = (AbstractC6384F.e.d.a.b.AbstractC0310d) obj;
        return this.f40752a.equals(abstractC0310d.d()) && this.f40753b.equals(abstractC0310d.c()) && this.f40754c == abstractC0310d.b();
    }

    public int hashCode() {
        int hashCode = (((this.f40752a.hashCode() ^ 1000003) * 1000003) ^ this.f40753b.hashCode()) * 1000003;
        long j8 = this.f40754c;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f40752a + ", code=" + this.f40753b + ", address=" + this.f40754c + "}";
    }

    private q(String str, String str2, long j8) {
        this.f40752a = str;
        this.f40753b = str2;
        this.f40754c = j8;
    }
}
