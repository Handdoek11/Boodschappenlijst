package p4;

import p4.AbstractC6384F;

/* renamed from: p4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6394i extends AbstractC6384F.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40663a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40664b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40665c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40666d;

    /* renamed from: e, reason: collision with root package name */
    private final String f40667e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40668f;

    /* renamed from: p4.i$b */
    static final class b extends AbstractC6384F.e.a.AbstractC0304a {

        /* renamed from: a, reason: collision with root package name */
        private String f40669a;

        /* renamed from: b, reason: collision with root package name */
        private String f40670b;

        /* renamed from: c, reason: collision with root package name */
        private String f40671c;

        /* renamed from: d, reason: collision with root package name */
        private String f40672d;

        /* renamed from: e, reason: collision with root package name */
        private String f40673e;

        /* renamed from: f, reason: collision with root package name */
        private String f40674f;

        b() {
        }

        @Override // p4.AbstractC6384F.e.a.AbstractC0304a
        public AbstractC6384F.e.a a() {
            String str;
            String str2 = this.f40669a;
            if (str2 != null && (str = this.f40670b) != null) {
                return new C6394i(str2, str, this.f40671c, null, this.f40672d, this.f40673e, this.f40674f);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40669a == null) {
                sb.append(" identifier");
            }
            if (this.f40670b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.a.AbstractC0304a
        public AbstractC6384F.e.a.AbstractC0304a b(String str) {
            this.f40673e = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.a.AbstractC0304a
        public AbstractC6384F.e.a.AbstractC0304a c(String str) {
            this.f40674f = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.a.AbstractC0304a
        public AbstractC6384F.e.a.AbstractC0304a d(String str) {
            this.f40671c = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.a.AbstractC0304a
        public AbstractC6384F.e.a.AbstractC0304a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f40669a = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.a.AbstractC0304a
        public AbstractC6384F.e.a.AbstractC0304a f(String str) {
            this.f40672d = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.a.AbstractC0304a
        public AbstractC6384F.e.a.AbstractC0304a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f40670b = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.a
    public String b() {
        return this.f40667e;
    }

    @Override // p4.AbstractC6384F.e.a
    public String c() {
        return this.f40668f;
    }

    @Override // p4.AbstractC6384F.e.a
    public String d() {
        return this.f40665c;
    }

    @Override // p4.AbstractC6384F.e.a
    public String e() {
        return this.f40663a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.a)) {
            return false;
        }
        AbstractC6384F.e.a aVar = (AbstractC6384F.e.a) obj;
        if (this.f40663a.equals(aVar.e()) && this.f40664b.equals(aVar.h()) && ((str = this.f40665c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            String str2 = this.f40666d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                String str3 = this.f40667e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    String str4 = this.f40668f;
                    if (str4 == null) {
                        if (aVar.c() == null) {
                            return true;
                        }
                    } else if (str4.equals(aVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p4.AbstractC6384F.e.a
    public String f() {
        return this.f40666d;
    }

    @Override // p4.AbstractC6384F.e.a
    public AbstractC6384F.e.a.b g() {
        return null;
    }

    @Override // p4.AbstractC6384F.e.a
    public String h() {
        return this.f40664b;
    }

    public int hashCode() {
        int hashCode = (((this.f40663a.hashCode() ^ 1000003) * 1000003) ^ this.f40664b.hashCode()) * 1000003;
        String str = this.f40665c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f40666d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f40667e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f40668f;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f40663a + ", version=" + this.f40664b + ", displayVersion=" + this.f40665c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f40666d + ", developmentPlatform=" + this.f40667e + ", developmentPlatformVersion=" + this.f40668f + "}";
    }

    private C6394i(String str, String str2, String str3, AbstractC6384F.e.a.b bVar, String str4, String str5, String str6) {
        this.f40663a = str;
        this.f40664b = str2;
        this.f40665c = str3;
        this.f40666d = str4;
        this.f40667e = str5;
        this.f40668f = str6;
    }
}
