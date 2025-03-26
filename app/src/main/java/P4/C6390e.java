package p4;

import p4.AbstractC6384F;

/* renamed from: p4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6390e extends AbstractC6384F.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f40626a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40627b;

    /* renamed from: p4.e$b */
    static final class b extends AbstractC6384F.c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f40628a;

        /* renamed from: b, reason: collision with root package name */
        private String f40629b;

        b() {
        }

        @Override // p4.AbstractC6384F.c.a
        public AbstractC6384F.c a() {
            String str;
            String str2 = this.f40628a;
            if (str2 != null && (str = this.f40629b) != null) {
                return new C6390e(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40628a == null) {
                sb.append(" key");
            }
            if (this.f40629b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.c.a
        public AbstractC6384F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f40628a = str;
            return this;
        }

        @Override // p4.AbstractC6384F.c.a
        public AbstractC6384F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f40629b = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.c
    public String b() {
        return this.f40626a;
    }

    @Override // p4.AbstractC6384F.c
    public String c() {
        return this.f40627b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.c)) {
            return false;
        }
        AbstractC6384F.c cVar = (AbstractC6384F.c) obj;
        return this.f40626a.equals(cVar.b()) && this.f40627b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f40626a.hashCode() ^ 1000003) * 1000003) ^ this.f40627b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f40626a + ", value=" + this.f40627b + "}";
    }

    private C6390e(String str, String str2) {
        this.f40626a = str;
        this.f40627b = str2;
    }
}
