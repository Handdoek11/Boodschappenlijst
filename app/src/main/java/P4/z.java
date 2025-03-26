package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class z extends AbstractC6384F.e.AbstractC0319e {

    /* renamed from: a, reason: collision with root package name */
    private final int f40816a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40817b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40818c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f40819d;

    static final class b extends AbstractC6384F.e.AbstractC0319e.a {

        /* renamed from: a, reason: collision with root package name */
        private int f40820a;

        /* renamed from: b, reason: collision with root package name */
        private String f40821b;

        /* renamed from: c, reason: collision with root package name */
        private String f40822c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f40823d;

        /* renamed from: e, reason: collision with root package name */
        private byte f40824e;

        b() {
        }

        @Override // p4.AbstractC6384F.e.AbstractC0319e.a
        public AbstractC6384F.e.AbstractC0319e a() {
            String str;
            String str2;
            if (this.f40824e == 3 && (str = this.f40821b) != null && (str2 = this.f40822c) != null) {
                return new z(this.f40820a, str, str2, this.f40823d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f40824e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f40821b == null) {
                sb.append(" version");
            }
            if (this.f40822c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f40824e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.AbstractC0319e.a
        public AbstractC6384F.e.AbstractC0319e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f40822c = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.AbstractC0319e.a
        public AbstractC6384F.e.AbstractC0319e.a c(boolean z7) {
            this.f40823d = z7;
            this.f40824e = (byte) (this.f40824e | 2);
            return this;
        }

        @Override // p4.AbstractC6384F.e.AbstractC0319e.a
        public AbstractC6384F.e.AbstractC0319e.a d(int i8) {
            this.f40820a = i8;
            this.f40824e = (byte) (this.f40824e | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.AbstractC0319e.a
        public AbstractC6384F.e.AbstractC0319e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f40821b = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.AbstractC0319e
    public String b() {
        return this.f40818c;
    }

    @Override // p4.AbstractC6384F.e.AbstractC0319e
    public int c() {
        return this.f40816a;
    }

    @Override // p4.AbstractC6384F.e.AbstractC0319e
    public String d() {
        return this.f40817b;
    }

    @Override // p4.AbstractC6384F.e.AbstractC0319e
    public boolean e() {
        return this.f40819d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.AbstractC0319e)) {
            return false;
        }
        AbstractC6384F.e.AbstractC0319e abstractC0319e = (AbstractC6384F.e.AbstractC0319e) obj;
        return this.f40816a == abstractC0319e.c() && this.f40817b.equals(abstractC0319e.d()) && this.f40818c.equals(abstractC0319e.b()) && this.f40819d == abstractC0319e.e();
    }

    public int hashCode() {
        return ((((((this.f40816a ^ 1000003) * 1000003) ^ this.f40817b.hashCode()) * 1000003) ^ this.f40818c.hashCode()) * 1000003) ^ (this.f40819d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f40816a + ", version=" + this.f40817b + ", buildVersion=" + this.f40818c + ", jailbroken=" + this.f40819d + "}";
    }

    private z(int i8, String str, String str2, boolean z7) {
        this.f40816a = i8;
        this.f40817b = str;
        this.f40818c = str2;
        this.f40819d = z7;
    }
}
