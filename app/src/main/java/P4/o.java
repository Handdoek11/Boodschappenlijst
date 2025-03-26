package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class o extends AbstractC6384F.e.d.a.b.AbstractC0306a {

    /* renamed from: a, reason: collision with root package name */
    private final long f40732a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40733b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40734c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40735d;

    static final class b extends AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a {

        /* renamed from: a, reason: collision with root package name */
        private long f40736a;

        /* renamed from: b, reason: collision with root package name */
        private long f40737b;

        /* renamed from: c, reason: collision with root package name */
        private String f40738c;

        /* renamed from: d, reason: collision with root package name */
        private String f40739d;

        /* renamed from: e, reason: collision with root package name */
        private byte f40740e;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a
        public AbstractC6384F.e.d.a.b.AbstractC0306a a() {
            String str;
            if (this.f40740e == 3 && (str = this.f40738c) != null) {
                return new o(this.f40736a, this.f40737b, str, this.f40739d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f40740e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f40740e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f40738c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a
        public AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a b(long j8) {
            this.f40736a = j8;
            this.f40740e = (byte) (this.f40740e | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a
        public AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f40738c = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a
        public AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a d(long j8) {
            this.f40737b = j8;
            this.f40740e = (byte) (this.f40740e | 2);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a
        public AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a e(String str) {
            this.f40739d = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0306a
    public long b() {
        return this.f40732a;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0306a
    public String c() {
        return this.f40734c;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0306a
    public long d() {
        return this.f40733b;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0306a
    public String e() {
        return this.f40735d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.a.b.AbstractC0306a)) {
            return false;
        }
        AbstractC6384F.e.d.a.b.AbstractC0306a abstractC0306a = (AbstractC6384F.e.d.a.b.AbstractC0306a) obj;
        if (this.f40732a == abstractC0306a.b() && this.f40733b == abstractC0306a.d() && this.f40734c.equals(abstractC0306a.c())) {
            String str = this.f40735d;
            if (str == null) {
                if (abstractC0306a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0306a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f40732a;
        long j9 = this.f40733b;
        int hashCode = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f40734c.hashCode()) * 1000003;
        String str = this.f40735d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f40732a + ", size=" + this.f40733b + ", name=" + this.f40734c + ", uuid=" + this.f40735d + "}";
    }

    private o(long j8, long j9, String str, String str2) {
        this.f40732a = j8;
        this.f40733b = j9;
        this.f40734c = str;
        this.f40735d = str2;
    }
}
