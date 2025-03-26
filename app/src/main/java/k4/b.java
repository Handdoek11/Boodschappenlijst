package K4;

import K4.f;

/* loaded from: classes2.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f3633a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3634b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f3635c;

    /* renamed from: K4.b$b, reason: collision with other inner class name */
    static final class C0061b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f3636a;

        /* renamed from: b, reason: collision with root package name */
        private Long f3637b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f3638c;

        C0061b() {
        }

        @Override // K4.f.a
        public f a() {
            String str = "";
            if (this.f3637b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f3636a, this.f3637b.longValue(), this.f3638c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // K4.f.a
        public f.a b(f.b bVar) {
            this.f3638c = bVar;
            return this;
        }

        @Override // K4.f.a
        public f.a c(String str) {
            this.f3636a = str;
            return this;
        }

        @Override // K4.f.a
        public f.a d(long j8) {
            this.f3637b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // K4.f
    public f.b b() {
        return this.f3635c;
    }

    @Override // K4.f
    public String c() {
        return this.f3633a;
    }

    @Override // K4.f
    public long d() {
        return this.f3634b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f3633a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f3634b == fVar.d()) {
                f.b bVar = this.f3635c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3633a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j8 = this.f3634b;
        int i8 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        f.b bVar = this.f3635c;
        return i8 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f3633a + ", tokenExpirationTimestamp=" + this.f3634b + ", responseCode=" + this.f3635c + "}";
    }

    private b(String str, long j8, f.b bVar) {
        this.f3633a = str;
        this.f3634b = j8;
        this.f3635c = bVar;
    }
}
