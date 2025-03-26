package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class l extends AbstractC6384F.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f40694a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40695b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6384F.e.d.a f40696c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6384F.e.d.c f40697d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC6384F.e.d.AbstractC0317d f40698e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC6384F.e.d.f f40699f;

    static final class b extends AbstractC6384F.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private long f40700a;

        /* renamed from: b, reason: collision with root package name */
        private String f40701b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC6384F.e.d.a f40702c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC6384F.e.d.c f40703d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC6384F.e.d.AbstractC0317d f40704e;

        /* renamed from: f, reason: collision with root package name */
        private AbstractC6384F.e.d.f f40705f;

        /* renamed from: g, reason: collision with root package name */
        private byte f40706g;

        @Override // p4.AbstractC6384F.e.d.b
        public AbstractC6384F.e.d a() {
            String str;
            AbstractC6384F.e.d.a aVar;
            AbstractC6384F.e.d.c cVar;
            if (this.f40706g == 1 && (str = this.f40701b) != null && (aVar = this.f40702c) != null && (cVar = this.f40703d) != null) {
                return new l(this.f40700a, str, aVar, cVar, this.f40704e, this.f40705f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f40706g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f40701b == null) {
                sb.append(" type");
            }
            if (this.f40702c == null) {
                sb.append(" app");
            }
            if (this.f40703d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.b
        public AbstractC6384F.e.d.b b(AbstractC6384F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f40702c = aVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.b
        public AbstractC6384F.e.d.b c(AbstractC6384F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f40703d = cVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.b
        public AbstractC6384F.e.d.b d(AbstractC6384F.e.d.AbstractC0317d abstractC0317d) {
            this.f40704e = abstractC0317d;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.b
        public AbstractC6384F.e.d.b e(AbstractC6384F.e.d.f fVar) {
            this.f40705f = fVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.b
        public AbstractC6384F.e.d.b f(long j8) {
            this.f40700a = j8;
            this.f40706g = (byte) (this.f40706g | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.b
        public AbstractC6384F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f40701b = str;
            return this;
        }

        b() {
        }

        private b(AbstractC6384F.e.d dVar) {
            this.f40700a = dVar.f();
            this.f40701b = dVar.g();
            this.f40702c = dVar.b();
            this.f40703d = dVar.c();
            this.f40704e = dVar.d();
            this.f40705f = dVar.e();
            this.f40706g = (byte) 1;
        }
    }

    @Override // p4.AbstractC6384F.e.d
    public AbstractC6384F.e.d.a b() {
        return this.f40696c;
    }

    @Override // p4.AbstractC6384F.e.d
    public AbstractC6384F.e.d.c c() {
        return this.f40697d;
    }

    @Override // p4.AbstractC6384F.e.d
    public AbstractC6384F.e.d.AbstractC0317d d() {
        return this.f40698e;
    }

    @Override // p4.AbstractC6384F.e.d
    public AbstractC6384F.e.d.f e() {
        return this.f40699f;
    }

    public boolean equals(Object obj) {
        AbstractC6384F.e.d.AbstractC0317d abstractC0317d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d)) {
            return false;
        }
        AbstractC6384F.e.d dVar = (AbstractC6384F.e.d) obj;
        if (this.f40694a == dVar.f() && this.f40695b.equals(dVar.g()) && this.f40696c.equals(dVar.b()) && this.f40697d.equals(dVar.c()) && ((abstractC0317d = this.f40698e) != null ? abstractC0317d.equals(dVar.d()) : dVar.d() == null)) {
            AbstractC6384F.e.d.f fVar = this.f40699f;
            if (fVar == null) {
                if (dVar.e() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // p4.AbstractC6384F.e.d
    public long f() {
        return this.f40694a;
    }

    @Override // p4.AbstractC6384F.e.d
    public String g() {
        return this.f40695b;
    }

    @Override // p4.AbstractC6384F.e.d
    public AbstractC6384F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j8 = this.f40694a;
        int hashCode = (((((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f40695b.hashCode()) * 1000003) ^ this.f40696c.hashCode()) * 1000003) ^ this.f40697d.hashCode()) * 1000003;
        AbstractC6384F.e.d.AbstractC0317d abstractC0317d = this.f40698e;
        int hashCode2 = (hashCode ^ (abstractC0317d == null ? 0 : abstractC0317d.hashCode())) * 1000003;
        AbstractC6384F.e.d.f fVar = this.f40699f;
        return hashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f40694a + ", type=" + this.f40695b + ", app=" + this.f40696c + ", device=" + this.f40697d + ", log=" + this.f40698e + ", rollouts=" + this.f40699f + "}";
    }

    private l(long j8, String str, AbstractC6384F.e.d.a aVar, AbstractC6384F.e.d.c cVar, AbstractC6384F.e.d.AbstractC0317d abstractC0317d, AbstractC6384F.e.d.f fVar) {
        this.f40694a = j8;
        this.f40695b = str;
        this.f40696c = aVar;
        this.f40697d = cVar;
        this.f40698e = abstractC0317d;
        this.f40699f = fVar;
    }
}
