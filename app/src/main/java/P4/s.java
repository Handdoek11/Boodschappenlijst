package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class s extends AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b {

    /* renamed from: a, reason: collision with root package name */
    private final long f40766a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40767b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40768c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40769d;

    /* renamed from: e, reason: collision with root package name */
    private final int f40770e;

    static final class b extends AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a {

        /* renamed from: a, reason: collision with root package name */
        private long f40771a;

        /* renamed from: b, reason: collision with root package name */
        private String f40772b;

        /* renamed from: c, reason: collision with root package name */
        private String f40773c;

        /* renamed from: d, reason: collision with root package name */
        private long f40774d;

        /* renamed from: e, reason: collision with root package name */
        private int f40775e;

        /* renamed from: f, reason: collision with root package name */
        private byte f40776f;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a
        public AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b a() {
            String str;
            if (this.f40776f == 7 && (str = this.f40772b) != null) {
                return new s(this.f40771a, str, this.f40773c, this.f40774d, this.f40775e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f40776f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f40772b == null) {
                sb.append(" symbol");
            }
            if ((this.f40776f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f40776f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a
        public AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a b(String str) {
            this.f40773c = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a
        public AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a c(int i8) {
            this.f40775e = i8;
            this.f40776f = (byte) (this.f40776f | 4);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a
        public AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a d(long j8) {
            this.f40774d = j8;
            this.f40776f = (byte) (this.f40776f | 2);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a
        public AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a e(long j8) {
            this.f40771a = j8;
            this.f40776f = (byte) (this.f40776f | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a
        public AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f40772b = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b
    public String b() {
        return this.f40768c;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b
    public int c() {
        return this.f40770e;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b
    public long d() {
        return this.f40769d;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b
    public long e() {
        return this.f40766a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b)) {
            return false;
        }
        AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b abstractC0314b = (AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b) obj;
        return this.f40766a == abstractC0314b.e() && this.f40767b.equals(abstractC0314b.f()) && ((str = this.f40768c) != null ? str.equals(abstractC0314b.b()) : abstractC0314b.b() == null) && this.f40769d == abstractC0314b.d() && this.f40770e == abstractC0314b.c();
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b
    public String f() {
        return this.f40767b;
    }

    public int hashCode() {
        long j8 = this.f40766a;
        int hashCode = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f40767b.hashCode()) * 1000003;
        String str = this.f40768c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j9 = this.f40769d;
        return ((hashCode2 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f40770e;
    }

    public String toString() {
        return "Frame{pc=" + this.f40766a + ", symbol=" + this.f40767b + ", file=" + this.f40768c + ", offset=" + this.f40769d + ", importance=" + this.f40770e + "}";
    }

    private s(long j8, String str, String str2, long j9, int i8) {
        this.f40766a = j8;
        this.f40767b = str;
        this.f40768c = str2;
        this.f40769d = j9;
        this.f40770e = i8;
    }
}
