package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class v extends AbstractC6384F.e.d.AbstractC0317d {

    /* renamed from: a, reason: collision with root package name */
    private final String f40799a;

    static final class b extends AbstractC6384F.e.d.AbstractC0317d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f40800a;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0317d.a
        public AbstractC6384F.e.d.AbstractC0317d a() {
            String str = this.f40800a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // p4.AbstractC6384F.e.d.AbstractC0317d.a
        public AbstractC6384F.e.d.AbstractC0317d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f40800a = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.AbstractC0317d
    public String b() {
        return this.f40799a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6384F.e.d.AbstractC0317d) {
            return this.f40799a.equals(((AbstractC6384F.e.d.AbstractC0317d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f40799a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f40799a + "}";
    }

    private v(String str) {
        this.f40799a = str;
    }
}
