package N4;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    private static final a f4104p = new C0074a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f4105a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4106b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4107c;

    /* renamed from: d, reason: collision with root package name */
    private final c f4108d;

    /* renamed from: e, reason: collision with root package name */
    private final d f4109e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4110f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4111g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4112h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4113i;

    /* renamed from: j, reason: collision with root package name */
    private final String f4114j;

    /* renamed from: k, reason: collision with root package name */
    private final long f4115k;

    /* renamed from: l, reason: collision with root package name */
    private final b f4116l;

    /* renamed from: m, reason: collision with root package name */
    private final String f4117m;

    /* renamed from: n, reason: collision with root package name */
    private final long f4118n;

    /* renamed from: o, reason: collision with root package name */
    private final String f4119o;

    /* renamed from: N4.a$a, reason: collision with other inner class name */
    public static final class C0074a {

        /* renamed from: a, reason: collision with root package name */
        private long f4120a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f4121b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f4122c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f4123d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f4124e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f4125f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f4126g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f4127h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f4128i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f4129j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f4130k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f4131l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f4132m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f4133n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f4134o = "";

        C0074a() {
        }

        public a a() {
            return new a(this.f4120a, this.f4121b, this.f4122c, this.f4123d, this.f4124e, this.f4125f, this.f4126g, this.f4127h, this.f4128i, this.f4129j, this.f4130k, this.f4131l, this.f4132m, this.f4133n, this.f4134o);
        }

        public C0074a b(String str) {
            this.f4132m = str;
            return this;
        }

        public C0074a c(String str) {
            this.f4126g = str;
            return this;
        }

        public C0074a d(String str) {
            this.f4134o = str;
            return this;
        }

        public C0074a e(b bVar) {
            this.f4131l = bVar;
            return this;
        }

        public C0074a f(String str) {
            this.f4122c = str;
            return this;
        }

        public C0074a g(String str) {
            this.f4121b = str;
            return this;
        }

        public C0074a h(c cVar) {
            this.f4123d = cVar;
            return this;
        }

        public C0074a i(String str) {
            this.f4125f = str;
            return this;
        }

        public C0074a j(int i8) {
            this.f4127h = i8;
            return this;
        }

        public C0074a k(long j8) {
            this.f4120a = j8;
            return this;
        }

        public C0074a l(d dVar) {
            this.f4124e = dVar;
            return this;
        }

        public C0074a m(String str) {
            this.f4129j = str;
            return this;
        }

        public C0074a n(int i8) {
            this.f4128i = i8;
            return this;
        }
    }

    public enum b implements D4.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: o, reason: collision with root package name */
        private final int f4139o;

        b(int i8) {
            this.f4139o = i8;
        }

        @Override // D4.c
        public int e() {
            return this.f4139o;
        }
    }

    public enum c implements D4.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: o, reason: collision with root package name */
        private final int f4145o;

        c(int i8) {
            this.f4145o = i8;
        }

        @Override // D4.c
        public int e() {
            return this.f4145o;
        }
    }

    public enum d implements D4.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: o, reason: collision with root package name */
        private final int f4151o;

        d(int i8) {
            this.f4151o = i8;
        }

        @Override // D4.c
        public int e() {
            return this.f4151o;
        }
    }

    a(long j8, String str, String str2, c cVar, d dVar, String str3, String str4, int i8, int i9, String str5, long j9, b bVar, String str6, long j10, String str7) {
        this.f4105a = j8;
        this.f4106b = str;
        this.f4107c = str2;
        this.f4108d = cVar;
        this.f4109e = dVar;
        this.f4110f = str3;
        this.f4111g = str4;
        this.f4112h = i8;
        this.f4113i = i9;
        this.f4114j = str5;
        this.f4115k = j9;
        this.f4116l = bVar;
        this.f4117m = str6;
        this.f4118n = j10;
        this.f4119o = str7;
    }

    public static C0074a p() {
        return new C0074a();
    }

    public String a() {
        return this.f4117m;
    }

    public long b() {
        return this.f4115k;
    }

    public long c() {
        return this.f4118n;
    }

    public String d() {
        return this.f4111g;
    }

    public String e() {
        return this.f4119o;
    }

    public b f() {
        return this.f4116l;
    }

    public String g() {
        return this.f4107c;
    }

    public String h() {
        return this.f4106b;
    }

    public c i() {
        return this.f4108d;
    }

    public String j() {
        return this.f4110f;
    }

    public int k() {
        return this.f4112h;
    }

    public long l() {
        return this.f4105a;
    }

    public d m() {
        return this.f4109e;
    }

    public String n() {
        return this.f4114j;
    }

    public int o() {
        return this.f4113i;
    }
}
