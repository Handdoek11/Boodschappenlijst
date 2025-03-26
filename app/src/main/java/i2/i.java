package i2;

import i2.s;

/* loaded from: classes.dex */
final class i extends s {

    /* renamed from: a, reason: collision with root package name */
    private final r f36406a;

    static final class b extends s.a {

        /* renamed from: a, reason: collision with root package name */
        private r f36407a;

        b() {
        }

        @Override // i2.s.a
        public s a() {
            return new i(this.f36407a);
        }

        @Override // i2.s.a
        public s.a b(r rVar) {
            this.f36407a = rVar;
            return this;
        }
    }

    @Override // i2.s
    public r b() {
        return this.f36406a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f36406a;
        r b8 = ((s) obj).b();
        return rVar == null ? b8 == null : rVar.equals(b8);
    }

    public int hashCode() {
        r rVar = this.f36406a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f36406a + "}";
    }

    private i(r rVar) {
        this.f36406a = rVar;
    }
}
