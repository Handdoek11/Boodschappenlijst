package i2;

import i2.p;

/* loaded from: classes.dex */
final class f extends p {

    /* renamed from: a, reason: collision with root package name */
    private final s f36396a;

    /* renamed from: b, reason: collision with root package name */
    private final p.b f36397b;

    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private s f36398a;

        /* renamed from: b, reason: collision with root package name */
        private p.b f36399b;

        b() {
        }

        @Override // i2.p.a
        public p a() {
            return new f(this.f36398a, this.f36399b);
        }

        @Override // i2.p.a
        public p.a b(s sVar) {
            this.f36398a = sVar;
            return this;
        }

        @Override // i2.p.a
        public p.a c(p.b bVar) {
            this.f36399b = bVar;
            return this;
        }
    }

    @Override // i2.p
    public s b() {
        return this.f36396a;
    }

    @Override // i2.p
    public p.b c() {
        return this.f36397b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.f36396a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            p.b bVar = this.f36397b;
            if (bVar == null) {
                if (pVar.c() == null) {
                    return true;
                }
            } else if (bVar.equals(pVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f36396a;
        int hashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f36397b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f36396a + ", productIdOrigin=" + this.f36397b + "}";
    }

    private f(s sVar, p.b bVar) {
        this.f36396a = sVar;
        this.f36397b = bVar;
    }
}
