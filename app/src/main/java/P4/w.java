package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class w extends AbstractC6384F.e.d.AbstractC0318e {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6384F.e.d.AbstractC0318e.b f40801a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40802b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40803c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40804d;

    static final class b extends AbstractC6384F.e.d.AbstractC0318e.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC6384F.e.d.AbstractC0318e.b f40805a;

        /* renamed from: b, reason: collision with root package name */
        private String f40806b;

        /* renamed from: c, reason: collision with root package name */
        private String f40807c;

        /* renamed from: d, reason: collision with root package name */
        private long f40808d;

        /* renamed from: e, reason: collision with root package name */
        private byte f40809e;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0318e.a
        public AbstractC6384F.e.d.AbstractC0318e a() {
            AbstractC6384F.e.d.AbstractC0318e.b bVar;
            String str;
            String str2;
            if (this.f40809e == 1 && (bVar = this.f40805a) != null && (str = this.f40806b) != null && (str2 = this.f40807c) != null) {
                return new w(bVar, str, str2, this.f40808d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40805a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f40806b == null) {
                sb.append(" parameterKey");
            }
            if (this.f40807c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f40809e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0318e.a
        public AbstractC6384F.e.d.AbstractC0318e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f40806b = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0318e.a
        public AbstractC6384F.e.d.AbstractC0318e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f40807c = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0318e.a
        public AbstractC6384F.e.d.AbstractC0318e.a d(AbstractC6384F.e.d.AbstractC0318e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f40805a = bVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0318e.a
        public AbstractC6384F.e.d.AbstractC0318e.a e(long j8) {
            this.f40808d = j8;
            this.f40809e = (byte) (this.f40809e | 1);
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.AbstractC0318e
    public String b() {
        return this.f40802b;
    }

    @Override // p4.AbstractC6384F.e.d.AbstractC0318e
    public String c() {
        return this.f40803c;
    }

    @Override // p4.AbstractC6384F.e.d.AbstractC0318e
    public AbstractC6384F.e.d.AbstractC0318e.b d() {
        return this.f40801a;
    }

    @Override // p4.AbstractC6384F.e.d.AbstractC0318e
    public long e() {
        return this.f40804d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.AbstractC0318e)) {
            return false;
        }
        AbstractC6384F.e.d.AbstractC0318e abstractC0318e = (AbstractC6384F.e.d.AbstractC0318e) obj;
        return this.f40801a.equals(abstractC0318e.d()) && this.f40802b.equals(abstractC0318e.b()) && this.f40803c.equals(abstractC0318e.c()) && this.f40804d == abstractC0318e.e();
    }

    public int hashCode() {
        int hashCode = (((((this.f40801a.hashCode() ^ 1000003) * 1000003) ^ this.f40802b.hashCode()) * 1000003) ^ this.f40803c.hashCode()) * 1000003;
        long j8 = this.f40804d;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f40801a + ", parameterKey=" + this.f40802b + ", parameterValue=" + this.f40803c + ", templateVersion=" + this.f40804d + "}";
    }

    private w(AbstractC6384F.e.d.AbstractC0318e.b bVar, String str, String str2, long j8) {
        this.f40801a = bVar;
        this.f40802b = str;
        this.f40803c = str2;
        this.f40804d = j8;
    }
}
