package i2;

import i2.r;

/* loaded from: classes.dex */
final class h extends r {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f36404a;

    static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f36405a;

        b() {
        }

        @Override // i2.r.a
        public r a() {
            return new h(this.f36405a);
        }

        @Override // i2.r.a
        public r.a b(Integer num) {
            this.f36405a = num;
            return this;
        }
    }

    @Override // i2.r
    public Integer b() {
        return this.f36404a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f36404a;
        Integer b8 = ((r) obj).b();
        return num == null ? b8 == null : num.equals(b8);
    }

    public int hashCode() {
        Integer num = this.f36404a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f36404a + "}";
    }

    private h(Integer num) {
        this.f36404a = num;
    }
}
