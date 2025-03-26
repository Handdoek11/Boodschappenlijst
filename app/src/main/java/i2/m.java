package i2;

import i2.w;

/* loaded from: classes.dex */
final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    private final w.c f36441a;

    /* renamed from: b, reason: collision with root package name */
    private final w.b f36442b;

    static final class b extends w.a {

        /* renamed from: a, reason: collision with root package name */
        private w.c f36443a;

        /* renamed from: b, reason: collision with root package name */
        private w.b f36444b;

        b() {
        }

        @Override // i2.w.a
        public w a() {
            return new m(this.f36443a, this.f36444b);
        }

        @Override // i2.w.a
        public w.a b(w.b bVar) {
            this.f36444b = bVar;
            return this;
        }

        @Override // i2.w.a
        public w.a c(w.c cVar) {
            this.f36443a = cVar;
            return this;
        }
    }

    @Override // i2.w
    public w.b b() {
        return this.f36442b;
    }

    @Override // i2.w
    public w.c c() {
        return this.f36441a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.c cVar = this.f36441a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            w.b bVar = this.f36442b;
            if (bVar == null) {
                if (wVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f36441a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f36442b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f36441a + ", mobileSubtype=" + this.f36442b + "}";
    }

    private m(w.c cVar, w.b bVar) {
        this.f36441a = cVar;
        this.f36442b = bVar;
    }
}
