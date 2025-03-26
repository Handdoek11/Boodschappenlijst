package A1;

import n.InterfaceC6241a;
import s1.C6722b;
import s1.EnumC6721a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: s, reason: collision with root package name */
    private static final String f93s = s1.j.f("WorkSpec");

    /* renamed from: t, reason: collision with root package name */
    public static final InterfaceC6241a f94t = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f95a;

    /* renamed from: b, reason: collision with root package name */
    public s1.s f96b;

    /* renamed from: c, reason: collision with root package name */
    public String f97c;

    /* renamed from: d, reason: collision with root package name */
    public String f98d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.b f99e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.b f100f;

    /* renamed from: g, reason: collision with root package name */
    public long f101g;

    /* renamed from: h, reason: collision with root package name */
    public long f102h;

    /* renamed from: i, reason: collision with root package name */
    public long f103i;

    /* renamed from: j, reason: collision with root package name */
    public C6722b f104j;

    /* renamed from: k, reason: collision with root package name */
    public int f105k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC6721a f106l;

    /* renamed from: m, reason: collision with root package name */
    public long f107m;

    /* renamed from: n, reason: collision with root package name */
    public long f108n;

    /* renamed from: o, reason: collision with root package name */
    public long f109o;

    /* renamed from: p, reason: collision with root package name */
    public long f110p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f111q;

    /* renamed from: r, reason: collision with root package name */
    public s1.n f112r;

    class a implements InterfaceC6241a {
        a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f113a;

        /* renamed from: b, reason: collision with root package name */
        public s1.s f114b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f114b != bVar.f114b) {
                return false;
            }
            return this.f113a.equals(bVar.f113a);
        }

        public int hashCode() {
            return (this.f113a.hashCode() * 31) + this.f114b.hashCode();
        }
    }

    public p(String str, String str2) {
        this.f96b = s1.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f11820c;
        this.f99e = bVar;
        this.f100f = bVar;
        this.f104j = C6722b.f42654i;
        this.f106l = EnumC6721a.EXPONENTIAL;
        this.f107m = 30000L;
        this.f110p = -1L;
        this.f112r = s1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f95a = str;
        this.f97c = str2;
    }

    public long a() {
        if (c()) {
            return this.f108n + Math.min(18000000L, this.f106l == EnumC6721a.LINEAR ? this.f107m * this.f105k : (long) Math.scalb(this.f107m, this.f105k - 1));
        }
        if (!d()) {
            long j8 = this.f108n;
            if (j8 == 0) {
                j8 = System.currentTimeMillis();
            }
            return j8 + this.f101g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j9 = this.f108n;
        long j10 = j9 == 0 ? currentTimeMillis + this.f101g : j9;
        long j11 = this.f103i;
        long j12 = this.f102h;
        if (j11 != j12) {
            return j10 + j12 + (j9 == 0 ? j11 * (-1) : 0L);
        }
        return j10 + (j9 != 0 ? j12 : 0L);
    }

    public boolean b() {
        return !C6722b.f42654i.equals(this.f104j);
    }

    public boolean c() {
        return this.f96b == s1.s.ENQUEUED && this.f105k > 0;
    }

    public boolean d() {
        return this.f102h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f101g != pVar.f101g || this.f102h != pVar.f102h || this.f103i != pVar.f103i || this.f105k != pVar.f105k || this.f107m != pVar.f107m || this.f108n != pVar.f108n || this.f109o != pVar.f109o || this.f110p != pVar.f110p || this.f111q != pVar.f111q || !this.f95a.equals(pVar.f95a) || this.f96b != pVar.f96b || !this.f97c.equals(pVar.f97c)) {
            return false;
        }
        String str = this.f98d;
        if (str == null ? pVar.f98d == null : str.equals(pVar.f98d)) {
            return this.f99e.equals(pVar.f99e) && this.f100f.equals(pVar.f100f) && this.f104j.equals(pVar.f104j) && this.f106l == pVar.f106l && this.f112r == pVar.f112r;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f95a.hashCode() * 31) + this.f96b.hashCode()) * 31) + this.f97c.hashCode()) * 31;
        String str = this.f98d;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f99e.hashCode()) * 31) + this.f100f.hashCode()) * 31;
        long j8 = this.f101g;
        int i8 = (hashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f102h;
        int i9 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f103i;
        int hashCode3 = (((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f104j.hashCode()) * 31) + this.f105k) * 31) + this.f106l.hashCode()) * 31;
        long j11 = this.f107m;
        int i10 = (hashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f108n;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f109o;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f110p;
        return ((((i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f111q ? 1 : 0)) * 31) + this.f112r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f95a + "}";
    }

    public p(p pVar) {
        this.f96b = s1.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f11820c;
        this.f99e = bVar;
        this.f100f = bVar;
        this.f104j = C6722b.f42654i;
        this.f106l = EnumC6721a.EXPONENTIAL;
        this.f107m = 30000L;
        this.f110p = -1L;
        this.f112r = s1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f95a = pVar.f95a;
        this.f97c = pVar.f97c;
        this.f96b = pVar.f96b;
        this.f98d = pVar.f98d;
        this.f99e = new androidx.work.b(pVar.f99e);
        this.f100f = new androidx.work.b(pVar.f100f);
        this.f101g = pVar.f101g;
        this.f102h = pVar.f102h;
        this.f103i = pVar.f103i;
        this.f104j = new C6722b(pVar.f104j);
        this.f105k = pVar.f105k;
        this.f106l = pVar.f106l;
        this.f107m = pVar.f107m;
        this.f108n = pVar.f108n;
        this.f109o = pVar.f109o;
        this.f110p = pVar.f110p;
        this.f111q = pVar.f111q;
        this.f112r = pVar.f112r;
    }
}
