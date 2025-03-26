package i2;

import i2.t;
import java.util.Arrays;

/* loaded from: classes.dex */
final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    private final long f36408a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f36409b;

    /* renamed from: c, reason: collision with root package name */
    private final p f36410c;

    /* renamed from: d, reason: collision with root package name */
    private final long f36411d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f36412e;

    /* renamed from: f, reason: collision with root package name */
    private final String f36413f;

    /* renamed from: g, reason: collision with root package name */
    private final long f36414g;

    /* renamed from: h, reason: collision with root package name */
    private final w f36415h;

    /* renamed from: i, reason: collision with root package name */
    private final q f36416i;

    static final class b extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f36417a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f36418b;

        /* renamed from: c, reason: collision with root package name */
        private p f36419c;

        /* renamed from: d, reason: collision with root package name */
        private Long f36420d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f36421e;

        /* renamed from: f, reason: collision with root package name */
        private String f36422f;

        /* renamed from: g, reason: collision with root package name */
        private Long f36423g;

        /* renamed from: h, reason: collision with root package name */
        private w f36424h;

        /* renamed from: i, reason: collision with root package name */
        private q f36425i;

        b() {
        }

        @Override // i2.t.a
        public t a() {
            String str = "";
            if (this.f36417a == null) {
                str = " eventTimeMs";
            }
            if (this.f36420d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f36423g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f36417a.longValue(), this.f36418b, this.f36419c, this.f36420d.longValue(), this.f36421e, this.f36422f, this.f36423g.longValue(), this.f36424h, this.f36425i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i2.t.a
        public t.a b(p pVar) {
            this.f36419c = pVar;
            return this;
        }

        @Override // i2.t.a
        public t.a c(Integer num) {
            this.f36418b = num;
            return this;
        }

        @Override // i2.t.a
        public t.a d(long j8) {
            this.f36417a = Long.valueOf(j8);
            return this;
        }

        @Override // i2.t.a
        public t.a e(long j8) {
            this.f36420d = Long.valueOf(j8);
            return this;
        }

        @Override // i2.t.a
        public t.a f(q qVar) {
            this.f36425i = qVar;
            return this;
        }

        @Override // i2.t.a
        public t.a g(w wVar) {
            this.f36424h = wVar;
            return this;
        }

        @Override // i2.t.a
        t.a h(byte[] bArr) {
            this.f36421e = bArr;
            return this;
        }

        @Override // i2.t.a
        t.a i(String str) {
            this.f36422f = str;
            return this;
        }

        @Override // i2.t.a
        public t.a j(long j8) {
            this.f36423g = Long.valueOf(j8);
            return this;
        }
    }

    @Override // i2.t
    public p b() {
        return this.f36410c;
    }

    @Override // i2.t
    public Integer c() {
        return this.f36409b;
    }

    @Override // i2.t
    public long d() {
        return this.f36408a;
    }

    @Override // i2.t
    public long e() {
        return this.f36411d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f36408a == tVar.d() && ((num = this.f36409b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f36410c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f36411d == tVar.e()) {
            if (Arrays.equals(this.f36412e, tVar instanceof j ? ((j) tVar).f36412e : tVar.h()) && ((str = this.f36413f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f36414g == tVar.j() && ((wVar = this.f36415h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                q qVar = this.f36416i;
                if (qVar == null) {
                    if (tVar.f() == null) {
                        return true;
                    }
                } else if (qVar.equals(tVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // i2.t
    public q f() {
        return this.f36416i;
    }

    @Override // i2.t
    public w g() {
        return this.f36415h;
    }

    @Override // i2.t
    public byte[] h() {
        return this.f36412e;
    }

    public int hashCode() {
        long j8 = this.f36408a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f36409b;
        int hashCode = (i8 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f36410c;
        int hashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j9 = this.f36411d;
        int hashCode3 = (((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f36412e)) * 1000003;
        String str = this.f36413f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j10 = this.f36414g;
        int i9 = (((hashCode3 ^ hashCode4) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        w wVar = this.f36415h;
        int hashCode5 = (i9 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f36416i;
        return hashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // i2.t
    public String i() {
        return this.f36413f;
    }

    @Override // i2.t
    public long j() {
        return this.f36414g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f36408a + ", eventCode=" + this.f36409b + ", complianceData=" + this.f36410c + ", eventUptimeMs=" + this.f36411d + ", sourceExtension=" + Arrays.toString(this.f36412e) + ", sourceExtensionJsonProto3=" + this.f36413f + ", timezoneOffsetSeconds=" + this.f36414g + ", networkConnectionInfo=" + this.f36415h + ", experimentIds=" + this.f36416i + "}";
    }

    private j(long j8, Integer num, p pVar, long j9, byte[] bArr, String str, long j10, w wVar, q qVar) {
        this.f36408a = j8;
        this.f36409b = num;
        this.f36410c = pVar;
        this.f36411d = j9;
        this.f36412e = bArr;
        this.f36413f = str;
        this.f36414g = j10;
        this.f36415h = wVar;
        this.f36416i = qVar;
    }
}
