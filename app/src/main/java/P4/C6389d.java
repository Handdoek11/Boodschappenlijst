package p4;

import p4.AbstractC6384F;

/* renamed from: p4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6389d extends AbstractC6384F.a.AbstractC0302a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40620a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40621b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40622c;

    /* renamed from: p4.d$b */
    static final class b extends AbstractC6384F.a.AbstractC0302a.AbstractC0303a {

        /* renamed from: a, reason: collision with root package name */
        private String f40623a;

        /* renamed from: b, reason: collision with root package name */
        private String f40624b;

        /* renamed from: c, reason: collision with root package name */
        private String f40625c;

        b() {
        }

        @Override // p4.AbstractC6384F.a.AbstractC0302a.AbstractC0303a
        public AbstractC6384F.a.AbstractC0302a a() {
            String str;
            String str2;
            String str3 = this.f40623a;
            if (str3 != null && (str = this.f40624b) != null && (str2 = this.f40625c) != null) {
                return new C6389d(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40623a == null) {
                sb.append(" arch");
            }
            if (this.f40624b == null) {
                sb.append(" libraryName");
            }
            if (this.f40625c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.a.AbstractC0302a.AbstractC0303a
        public AbstractC6384F.a.AbstractC0302a.AbstractC0303a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f40623a = str;
            return this;
        }

        @Override // p4.AbstractC6384F.a.AbstractC0302a.AbstractC0303a
        public AbstractC6384F.a.AbstractC0302a.AbstractC0303a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f40625c = str;
            return this;
        }

        @Override // p4.AbstractC6384F.a.AbstractC0302a.AbstractC0303a
        public AbstractC6384F.a.AbstractC0302a.AbstractC0303a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f40624b = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.a.AbstractC0302a
    public String b() {
        return this.f40620a;
    }

    @Override // p4.AbstractC6384F.a.AbstractC0302a
    public String c() {
        return this.f40622c;
    }

    @Override // p4.AbstractC6384F.a.AbstractC0302a
    public String d() {
        return this.f40621b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.a.AbstractC0302a)) {
            return false;
        }
        AbstractC6384F.a.AbstractC0302a abstractC0302a = (AbstractC6384F.a.AbstractC0302a) obj;
        return this.f40620a.equals(abstractC0302a.b()) && this.f40621b.equals(abstractC0302a.d()) && this.f40622c.equals(abstractC0302a.c());
    }

    public int hashCode() {
        return ((((this.f40620a.hashCode() ^ 1000003) * 1000003) ^ this.f40621b.hashCode()) * 1000003) ^ this.f40622c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f40620a + ", libraryName=" + this.f40621b + ", buildId=" + this.f40622c + "}";
    }

    private C6389d(String str, String str2, String str3) {
        this.f40620a = str;
        this.f40621b = str2;
        this.f40622c = str3;
    }
}
