package p4;

import java.util.List;
import p4.AbstractC6384F;

/* renamed from: p4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6393h extends AbstractC6384F.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f40638a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40639b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40640c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40641d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f40642e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f40643f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC6384F.e.a f40644g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC6384F.e.f f40645h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC6384F.e.AbstractC0319e f40646i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC6384F.e.c f40647j;

    /* renamed from: k, reason: collision with root package name */
    private final List f40648k;

    /* renamed from: l, reason: collision with root package name */
    private final int f40649l;

    /* renamed from: p4.h$b */
    static final class b extends AbstractC6384F.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f40650a;

        /* renamed from: b, reason: collision with root package name */
        private String f40651b;

        /* renamed from: c, reason: collision with root package name */
        private String f40652c;

        /* renamed from: d, reason: collision with root package name */
        private long f40653d;

        /* renamed from: e, reason: collision with root package name */
        private Long f40654e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f40655f;

        /* renamed from: g, reason: collision with root package name */
        private AbstractC6384F.e.a f40656g;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC6384F.e.f f40657h;

        /* renamed from: i, reason: collision with root package name */
        private AbstractC6384F.e.AbstractC0319e f40658i;

        /* renamed from: j, reason: collision with root package name */
        private AbstractC6384F.e.c f40659j;

        /* renamed from: k, reason: collision with root package name */
        private List f40660k;

        /* renamed from: l, reason: collision with root package name */
        private int f40661l;

        /* renamed from: m, reason: collision with root package name */
        private byte f40662m;

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e a() {
            String str;
            String str2;
            AbstractC6384F.e.a aVar;
            if (this.f40662m == 7 && (str = this.f40650a) != null && (str2 = this.f40651b) != null && (aVar = this.f40656g) != null) {
                return new C6393h(str, str2, this.f40652c, this.f40653d, this.f40654e, this.f40655f, aVar, this.f40657h, this.f40658i, this.f40659j, this.f40660k, this.f40661l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40650a == null) {
                sb.append(" generator");
            }
            if (this.f40651b == null) {
                sb.append(" identifier");
            }
            if ((this.f40662m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f40662m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f40656g == null) {
                sb.append(" app");
            }
            if ((this.f40662m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b b(AbstractC6384F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f40656g = aVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b c(String str) {
            this.f40652c = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b d(boolean z7) {
            this.f40655f = z7;
            this.f40662m = (byte) (this.f40662m | 2);
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b e(AbstractC6384F.e.c cVar) {
            this.f40659j = cVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b f(Long l8) {
            this.f40654e = l8;
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b g(List list) {
            this.f40660k = list;
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f40650a = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b i(int i8) {
            this.f40661l = i8;
            this.f40662m = (byte) (this.f40662m | 4);
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f40651b = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b l(AbstractC6384F.e.AbstractC0319e abstractC0319e) {
            this.f40658i = abstractC0319e;
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b m(long j8) {
            this.f40653d = j8;
            this.f40662m = (byte) (this.f40662m | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.b
        public AbstractC6384F.e.b n(AbstractC6384F.e.f fVar) {
            this.f40657h = fVar;
            return this;
        }

        b() {
        }

        private b(AbstractC6384F.e eVar) {
            this.f40650a = eVar.g();
            this.f40651b = eVar.i();
            this.f40652c = eVar.c();
            this.f40653d = eVar.l();
            this.f40654e = eVar.e();
            this.f40655f = eVar.n();
            this.f40656g = eVar.b();
            this.f40657h = eVar.m();
            this.f40658i = eVar.k();
            this.f40659j = eVar.d();
            this.f40660k = eVar.f();
            this.f40661l = eVar.h();
            this.f40662m = (byte) 7;
        }
    }

    @Override // p4.AbstractC6384F.e
    public AbstractC6384F.e.a b() {
        return this.f40644g;
    }

    @Override // p4.AbstractC6384F.e
    public String c() {
        return this.f40640c;
    }

    @Override // p4.AbstractC6384F.e
    public AbstractC6384F.e.c d() {
        return this.f40647j;
    }

    @Override // p4.AbstractC6384F.e
    public Long e() {
        return this.f40642e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l8;
        AbstractC6384F.e.f fVar;
        AbstractC6384F.e.AbstractC0319e abstractC0319e;
        AbstractC6384F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e)) {
            return false;
        }
        AbstractC6384F.e eVar = (AbstractC6384F.e) obj;
        return this.f40638a.equals(eVar.g()) && this.f40639b.equals(eVar.i()) && ((str = this.f40640c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f40641d == eVar.l() && ((l8 = this.f40642e) != null ? l8.equals(eVar.e()) : eVar.e() == null) && this.f40643f == eVar.n() && this.f40644g.equals(eVar.b()) && ((fVar = this.f40645h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0319e = this.f40646i) != null ? abstractC0319e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f40647j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f40648k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f40649l == eVar.h();
    }

    @Override // p4.AbstractC6384F.e
    public List f() {
        return this.f40648k;
    }

    @Override // p4.AbstractC6384F.e
    public String g() {
        return this.f40638a;
    }

    @Override // p4.AbstractC6384F.e
    public int h() {
        return this.f40649l;
    }

    public int hashCode() {
        int hashCode = (((this.f40638a.hashCode() ^ 1000003) * 1000003) ^ this.f40639b.hashCode()) * 1000003;
        String str = this.f40640c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j8 = this.f40641d;
        int i8 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        Long l8 = this.f40642e;
        int hashCode3 = (((((i8 ^ (l8 == null ? 0 : l8.hashCode())) * 1000003) ^ (this.f40643f ? 1231 : 1237)) * 1000003) ^ this.f40644g.hashCode()) * 1000003;
        AbstractC6384F.e.f fVar = this.f40645h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC6384F.e.AbstractC0319e abstractC0319e = this.f40646i;
        int hashCode5 = (hashCode4 ^ (abstractC0319e == null ? 0 : abstractC0319e.hashCode())) * 1000003;
        AbstractC6384F.e.c cVar = this.f40647j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.f40648k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f40649l;
    }

    @Override // p4.AbstractC6384F.e
    public String i() {
        return this.f40639b;
    }

    @Override // p4.AbstractC6384F.e
    public AbstractC6384F.e.AbstractC0319e k() {
        return this.f40646i;
    }

    @Override // p4.AbstractC6384F.e
    public long l() {
        return this.f40641d;
    }

    @Override // p4.AbstractC6384F.e
    public AbstractC6384F.e.f m() {
        return this.f40645h;
    }

    @Override // p4.AbstractC6384F.e
    public boolean n() {
        return this.f40643f;
    }

    @Override // p4.AbstractC6384F.e
    public AbstractC6384F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f40638a + ", identifier=" + this.f40639b + ", appQualitySessionId=" + this.f40640c + ", startedAt=" + this.f40641d + ", endedAt=" + this.f40642e + ", crashed=" + this.f40643f + ", app=" + this.f40644g + ", user=" + this.f40645h + ", os=" + this.f40646i + ", device=" + this.f40647j + ", events=" + this.f40648k + ", generatorType=" + this.f40649l + "}";
    }

    private C6393h(String str, String str2, String str3, long j8, Long l8, boolean z7, AbstractC6384F.e.a aVar, AbstractC6384F.e.f fVar, AbstractC6384F.e.AbstractC0319e abstractC0319e, AbstractC6384F.e.c cVar, List list, int i8) {
        this.f40638a = str;
        this.f40639b = str2;
        this.f40640c = str3;
        this.f40641d = j8;
        this.f40642e = l8;
        this.f40643f = z7;
        this.f40644g = aVar;
        this.f40645h = fVar;
        this.f40646i = abstractC0319e;
        this.f40647j = cVar;
        this.f40648k = list;
        this.f40649l = i8;
    }
}
