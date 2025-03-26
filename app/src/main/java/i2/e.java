package i2;

import i2.o;

/* loaded from: classes.dex */
final class e extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.b f36392a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5849a f36393b;

    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.b f36394a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5849a f36395b;

        b() {
        }

        @Override // i2.o.a
        public o a() {
            return new e(this.f36394a, this.f36395b);
        }

        @Override // i2.o.a
        public o.a b(AbstractC5849a abstractC5849a) {
            this.f36395b = abstractC5849a;
            return this;
        }

        @Override // i2.o.a
        public o.a c(o.b bVar) {
            this.f36394a = bVar;
            return this;
        }
    }

    @Override // i2.o
    public AbstractC5849a b() {
        return this.f36393b;
    }

    @Override // i2.o
    public o.b c() {
        return this.f36392a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f36392a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            AbstractC5849a abstractC5849a = this.f36393b;
            if (abstractC5849a == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (abstractC5849a.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f36392a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC5849a abstractC5849a = this.f36393b;
        return hashCode ^ (abstractC5849a != null ? abstractC5849a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f36392a + ", androidClientInfo=" + this.f36393b + "}";
    }

    private e(o.b bVar, AbstractC5849a abstractC5849a) {
        this.f36392a = bVar;
        this.f36393b = abstractC5849a;
    }
}
