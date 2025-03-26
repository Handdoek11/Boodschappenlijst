package K4;

import K4.d;

/* loaded from: classes2.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f3623a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3624b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3625c;

    /* renamed from: d, reason: collision with root package name */
    private final f f3626d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f3627e;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f3628a;

        /* renamed from: b, reason: collision with root package name */
        private String f3629b;

        /* renamed from: c, reason: collision with root package name */
        private String f3630c;

        /* renamed from: d, reason: collision with root package name */
        private f f3631d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f3632e;

        b() {
        }

        @Override // K4.d.a
        public d a() {
            return new a(this.f3628a, this.f3629b, this.f3630c, this.f3631d, this.f3632e);
        }

        @Override // K4.d.a
        public d.a b(f fVar) {
            this.f3631d = fVar;
            return this;
        }

        @Override // K4.d.a
        public d.a c(String str) {
            this.f3629b = str;
            return this;
        }

        @Override // K4.d.a
        public d.a d(String str) {
            this.f3630c = str;
            return this;
        }

        @Override // K4.d.a
        public d.a e(d.b bVar) {
            this.f3632e = bVar;
            return this;
        }

        @Override // K4.d.a
        public d.a f(String str) {
            this.f3628a = str;
            return this;
        }
    }

    @Override // K4.d
    public f b() {
        return this.f3626d;
    }

    @Override // K4.d
    public String c() {
        return this.f3624b;
    }

    @Override // K4.d
    public String d() {
        return this.f3625c;
    }

    @Override // K4.d
    public d.b e() {
        return this.f3627e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f3623a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f3624b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f3625c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f3626d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f3627e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // K4.d
    public String f() {
        return this.f3623a;
    }

    public int hashCode() {
        String str = this.f3623a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f3624b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3625c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f3626d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f3627e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f3623a + ", fid=" + this.f3624b + ", refreshToken=" + this.f3625c + ", authToken=" + this.f3626d + ", responseCode=" + this.f3627e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f3623a = str;
        this.f3624b = str2;
        this.f3625c = str3;
        this.f3626d = fVar;
        this.f3627e = bVar;
    }
}
