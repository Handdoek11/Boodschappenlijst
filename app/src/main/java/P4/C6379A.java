package p4;

import p4.AbstractC6384F;

/* renamed from: p4.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6379A extends AbstractC6384F.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f40405a;

    /* renamed from: p4.A$b */
    static final class b extends AbstractC6384F.e.f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f40406a;

        b() {
        }

        @Override // p4.AbstractC6384F.e.f.a
        public AbstractC6384F.e.f a() {
            String str = this.f40406a;
            if (str != null) {
                return new C6379A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // p4.AbstractC6384F.e.f.a
        public AbstractC6384F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f40406a = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.f
    public String b() {
        return this.f40405a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6384F.e.f) {
            return this.f40405a.equals(((AbstractC6384F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f40405a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f40405a + "}";
    }

    private C6379A(String str) {
        this.f40405a = str;
    }
}
