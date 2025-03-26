package p4;

import p4.AbstractC6384F;

/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6387b extends AbstractC6384F {

    /* renamed from: b, reason: collision with root package name */
    private final String f40576b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40577c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40578d;

    /* renamed from: e, reason: collision with root package name */
    private final String f40579e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40580f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40581g;

    /* renamed from: h, reason: collision with root package name */
    private final String f40582h;

    /* renamed from: i, reason: collision with root package name */
    private final String f40583i;

    /* renamed from: j, reason: collision with root package name */
    private final String f40584j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC6384F.e f40585k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC6384F.d f40586l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC6384F.a f40587m;

    /* renamed from: p4.b$b, reason: collision with other inner class name */
    static final class C0321b extends AbstractC6384F.b {

        /* renamed from: a, reason: collision with root package name */
        private String f40588a;

        /* renamed from: b, reason: collision with root package name */
        private String f40589b;

        /* renamed from: c, reason: collision with root package name */
        private int f40590c;

        /* renamed from: d, reason: collision with root package name */
        private String f40591d;

        /* renamed from: e, reason: collision with root package name */
        private String f40592e;

        /* renamed from: f, reason: collision with root package name */
        private String f40593f;

        /* renamed from: g, reason: collision with root package name */
        private String f40594g;

        /* renamed from: h, reason: collision with root package name */
        private String f40595h;

        /* renamed from: i, reason: collision with root package name */
        private String f40596i;

        /* renamed from: j, reason: collision with root package name */
        private AbstractC6384F.e f40597j;

        /* renamed from: k, reason: collision with root package name */
        private AbstractC6384F.d f40598k;

        /* renamed from: l, reason: collision with root package name */
        private AbstractC6384F.a f40599l;

        /* renamed from: m, reason: collision with root package name */
        private byte f40600m;

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F a() {
            if (this.f40600m == 1 && this.f40588a != null && this.f40589b != null && this.f40591d != null && this.f40595h != null && this.f40596i != null) {
                return new C6387b(this.f40588a, this.f40589b, this.f40590c, this.f40591d, this.f40592e, this.f40593f, this.f40594g, this.f40595h, this.f40596i, this.f40597j, this.f40598k, this.f40599l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40588a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f40589b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f40600m) == 0) {
                sb.append(" platform");
            }
            if (this.f40591d == null) {
                sb.append(" installationUuid");
            }
            if (this.f40595h == null) {
                sb.append(" buildVersion");
            }
            if (this.f40596i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b b(AbstractC6384F.a aVar) {
            this.f40599l = aVar;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b c(String str) {
            this.f40594g = str;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f40595h = str;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f40596i = str;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b f(String str) {
            this.f40593f = str;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b g(String str) {
            this.f40592e = str;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f40589b = str;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f40591d = str;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b j(AbstractC6384F.d dVar) {
            this.f40598k = dVar;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b k(int i8) {
            this.f40590c = i8;
            this.f40600m = (byte) (this.f40600m | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f40588a = str;
            return this;
        }

        @Override // p4.AbstractC6384F.b
        public AbstractC6384F.b m(AbstractC6384F.e eVar) {
            this.f40597j = eVar;
            return this;
        }

        C0321b() {
        }

        private C0321b(AbstractC6384F abstractC6384F) {
            this.f40588a = abstractC6384F.m();
            this.f40589b = abstractC6384F.i();
            this.f40590c = abstractC6384F.l();
            this.f40591d = abstractC6384F.j();
            this.f40592e = abstractC6384F.h();
            this.f40593f = abstractC6384F.g();
            this.f40594g = abstractC6384F.d();
            this.f40595h = abstractC6384F.e();
            this.f40596i = abstractC6384F.f();
            this.f40597j = abstractC6384F.n();
            this.f40598k = abstractC6384F.k();
            this.f40599l = abstractC6384F.c();
            this.f40600m = (byte) 1;
        }
    }

    @Override // p4.AbstractC6384F
    public AbstractC6384F.a c() {
        return this.f40587m;
    }

    @Override // p4.AbstractC6384F
    public String d() {
        return this.f40582h;
    }

    @Override // p4.AbstractC6384F
    public String e() {
        return this.f40583i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        AbstractC6384F.e eVar;
        AbstractC6384F.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F)) {
            return false;
        }
        AbstractC6384F abstractC6384F = (AbstractC6384F) obj;
        if (this.f40576b.equals(abstractC6384F.m()) && this.f40577c.equals(abstractC6384F.i()) && this.f40578d == abstractC6384F.l() && this.f40579e.equals(abstractC6384F.j()) && ((str = this.f40580f) != null ? str.equals(abstractC6384F.h()) : abstractC6384F.h() == null) && ((str2 = this.f40581g) != null ? str2.equals(abstractC6384F.g()) : abstractC6384F.g() == null) && ((str3 = this.f40582h) != null ? str3.equals(abstractC6384F.d()) : abstractC6384F.d() == null) && this.f40583i.equals(abstractC6384F.e()) && this.f40584j.equals(abstractC6384F.f()) && ((eVar = this.f40585k) != null ? eVar.equals(abstractC6384F.n()) : abstractC6384F.n() == null) && ((dVar = this.f40586l) != null ? dVar.equals(abstractC6384F.k()) : abstractC6384F.k() == null)) {
            AbstractC6384F.a aVar = this.f40587m;
            if (aVar == null) {
                if (abstractC6384F.c() == null) {
                    return true;
                }
            } else if (aVar.equals(abstractC6384F.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // p4.AbstractC6384F
    public String f() {
        return this.f40584j;
    }

    @Override // p4.AbstractC6384F
    public String g() {
        return this.f40581g;
    }

    @Override // p4.AbstractC6384F
    public String h() {
        return this.f40580f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f40576b.hashCode() ^ 1000003) * 1000003) ^ this.f40577c.hashCode()) * 1000003) ^ this.f40578d) * 1000003) ^ this.f40579e.hashCode()) * 1000003;
        String str = this.f40580f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f40581g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f40582h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f40583i.hashCode()) * 1000003) ^ this.f40584j.hashCode()) * 1000003;
        AbstractC6384F.e eVar = this.f40585k;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC6384F.d dVar = this.f40586l;
        int hashCode6 = (hashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        AbstractC6384F.a aVar = this.f40587m;
        return hashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // p4.AbstractC6384F
    public String i() {
        return this.f40577c;
    }

    @Override // p4.AbstractC6384F
    public String j() {
        return this.f40579e;
    }

    @Override // p4.AbstractC6384F
    public AbstractC6384F.d k() {
        return this.f40586l;
    }

    @Override // p4.AbstractC6384F
    public int l() {
        return this.f40578d;
    }

    @Override // p4.AbstractC6384F
    public String m() {
        return this.f40576b;
    }

    @Override // p4.AbstractC6384F
    public AbstractC6384F.e n() {
        return this.f40585k;
    }

    @Override // p4.AbstractC6384F
    protected AbstractC6384F.b o() {
        return new C0321b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f40576b + ", gmpAppId=" + this.f40577c + ", platform=" + this.f40578d + ", installationUuid=" + this.f40579e + ", firebaseInstallationId=" + this.f40580f + ", firebaseAuthenticationToken=" + this.f40581g + ", appQualitySessionId=" + this.f40582h + ", buildVersion=" + this.f40583i + ", displayVersion=" + this.f40584j + ", session=" + this.f40585k + ", ndkPayload=" + this.f40586l + ", appExitInfo=" + this.f40587m + "}";
    }

    private C6387b(String str, String str2, int i8, String str3, String str4, String str5, String str6, String str7, String str8, AbstractC6384F.e eVar, AbstractC6384F.d dVar, AbstractC6384F.a aVar) {
        this.f40576b = str;
        this.f40577c = str2;
        this.f40578d = i8;
        this.f40579e = str3;
        this.f40580f = str4;
        this.f40581g = str5;
        this.f40582h = str6;
        this.f40583i = str7;
        this.f40584j = str8;
        this.f40585k = eVar;
        this.f40586l = dVar;
        this.f40587m = aVar;
    }
}
