package J4;

import J4.c;
import J4.d;

/* loaded from: classes2.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f3512b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f3513c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3514d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3515e;

    /* renamed from: f, reason: collision with root package name */
    private final long f3516f;

    /* renamed from: g, reason: collision with root package name */
    private final long f3517g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3518h;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f3519a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f3520b;

        /* renamed from: c, reason: collision with root package name */
        private String f3521c;

        /* renamed from: d, reason: collision with root package name */
        private String f3522d;

        /* renamed from: e, reason: collision with root package name */
        private Long f3523e;

        /* renamed from: f, reason: collision with root package name */
        private Long f3524f;

        /* renamed from: g, reason: collision with root package name */
        private String f3525g;

        @Override // J4.d.a
        public d a() {
            String str = "";
            if (this.f3520b == null) {
                str = " registrationStatus";
            }
            if (this.f3523e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f3524f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f3519a, this.f3520b, this.f3521c, this.f3522d, this.f3523e.longValue(), this.f3524f.longValue(), this.f3525g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J4.d.a
        public d.a b(String str) {
            this.f3521c = str;
            return this;
        }

        @Override // J4.d.a
        public d.a c(long j8) {
            this.f3523e = Long.valueOf(j8);
            return this;
        }

        @Override // J4.d.a
        public d.a d(String str) {
            this.f3519a = str;
            return this;
        }

        @Override // J4.d.a
        public d.a e(String str) {
            this.f3525g = str;
            return this;
        }

        @Override // J4.d.a
        public d.a f(String str) {
            this.f3522d = str;
            return this;
        }

        @Override // J4.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f3520b = aVar;
            return this;
        }

        @Override // J4.d.a
        public d.a h(long j8) {
            this.f3524f = Long.valueOf(j8);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f3519a = dVar.d();
            this.f3520b = dVar.g();
            this.f3521c = dVar.b();
            this.f3522d = dVar.f();
            this.f3523e = Long.valueOf(dVar.c());
            this.f3524f = Long.valueOf(dVar.h());
            this.f3525g = dVar.e();
        }
    }

    @Override // J4.d
    public String b() {
        return this.f3514d;
    }

    @Override // J4.d
    public long c() {
        return this.f3516f;
    }

    @Override // J4.d
    public String d() {
        return this.f3512b;
    }

    @Override // J4.d
    public String e() {
        return this.f3518h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f3512b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f3513c.equals(dVar.g()) && ((str = this.f3514d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f3515e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f3516f == dVar.c() && this.f3517g == dVar.h()) {
                String str4 = this.f3518h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // J4.d
    public String f() {
        return this.f3515e;
    }

    @Override // J4.d
    public c.a g() {
        return this.f3513c;
    }

    @Override // J4.d
    public long h() {
        return this.f3517g;
    }

    public int hashCode() {
        String str = this.f3512b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f3513c.hashCode()) * 1000003;
        String str2 = this.f3514d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3515e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j8 = this.f3516f;
        int i8 = (hashCode3 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f3517g;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str4 = this.f3518h;
        return i9 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // J4.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f3512b + ", registrationStatus=" + this.f3513c + ", authToken=" + this.f3514d + ", refreshToken=" + this.f3515e + ", expiresInSecs=" + this.f3516f + ", tokenCreationEpochInSecs=" + this.f3517g + ", fisError=" + this.f3518h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j8, long j9, String str4) {
        this.f3512b = str;
        this.f3513c = aVar;
        this.f3514d = str2;
        this.f3515e = str3;
        this.f3516f = j8;
        this.f3517g = j9;
        this.f3518h = str4;
    }
}
