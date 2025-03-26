package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class x extends AbstractC6384F.e.d.AbstractC0318e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f40810a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40811b;

    static final class b extends AbstractC6384F.e.d.AbstractC0318e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f40812a;

        /* renamed from: b, reason: collision with root package name */
        private String f40813b;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0318e.b.a
        public AbstractC6384F.e.d.AbstractC0318e.b a() {
            String str;
            String str2 = this.f40812a;
            if (str2 != null && (str = this.f40813b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40812a == null) {
                sb.append(" rolloutId");
            }
            if (this.f40813b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0318e.b.a
        public AbstractC6384F.e.d.AbstractC0318e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f40812a = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0318e.b.a
        public AbstractC6384F.e.d.AbstractC0318e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f40813b = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.AbstractC0318e.b
    public String b() {
        return this.f40810a;
    }

    @Override // p4.AbstractC6384F.e.d.AbstractC0318e.b
    public String c() {
        return this.f40811b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.AbstractC0318e.b)) {
            return false;
        }
        AbstractC6384F.e.d.AbstractC0318e.b bVar = (AbstractC6384F.e.d.AbstractC0318e.b) obj;
        return this.f40810a.equals(bVar.b()) && this.f40811b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f40810a.hashCode() ^ 1000003) * 1000003) ^ this.f40811b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f40810a + ", variantId=" + this.f40811b + "}";
    }

    private x(String str, String str2) {
        this.f40810a = str;
        this.f40811b = str2;
    }
}
