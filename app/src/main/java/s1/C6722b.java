package s1;

import android.os.Build;

/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6722b {

    /* renamed from: i, reason: collision with root package name */
    public static final C6722b f42654i = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private k f42655a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42656b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42657c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42658d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42659e;

    /* renamed from: f, reason: collision with root package name */
    private long f42660f;

    /* renamed from: g, reason: collision with root package name */
    private long f42661g;

    /* renamed from: h, reason: collision with root package name */
    private c f42662h;

    /* renamed from: s1.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f42663a = false;

        /* renamed from: b, reason: collision with root package name */
        boolean f42664b = false;

        /* renamed from: c, reason: collision with root package name */
        k f42665c = k.NOT_REQUIRED;

        /* renamed from: d, reason: collision with root package name */
        boolean f42666d = false;

        /* renamed from: e, reason: collision with root package name */
        boolean f42667e = false;

        /* renamed from: f, reason: collision with root package name */
        long f42668f = -1;

        /* renamed from: g, reason: collision with root package name */
        long f42669g = -1;

        /* renamed from: h, reason: collision with root package name */
        c f42670h = new c();

        public C6722b a() {
            return new C6722b(this);
        }

        public a b(k kVar) {
            this.f42665c = kVar;
            return this;
        }
    }

    public C6722b() {
        this.f42655a = k.NOT_REQUIRED;
        this.f42660f = -1L;
        this.f42661g = -1L;
        this.f42662h = new c();
    }

    public c a() {
        return this.f42662h;
    }

    public k b() {
        return this.f42655a;
    }

    public long c() {
        return this.f42660f;
    }

    public long d() {
        return this.f42661g;
    }

    public boolean e() {
        return this.f42662h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6722b.class != obj.getClass()) {
            return false;
        }
        C6722b c6722b = (C6722b) obj;
        if (this.f42656b == c6722b.f42656b && this.f42657c == c6722b.f42657c && this.f42658d == c6722b.f42658d && this.f42659e == c6722b.f42659e && this.f42660f == c6722b.f42660f && this.f42661g == c6722b.f42661g && this.f42655a == c6722b.f42655a) {
            return this.f42662h.equals(c6722b.f42662h);
        }
        return false;
    }

    public boolean f() {
        return this.f42658d;
    }

    public boolean g() {
        return this.f42656b;
    }

    public boolean h() {
        return this.f42657c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f42655a.hashCode() * 31) + (this.f42656b ? 1 : 0)) * 31) + (this.f42657c ? 1 : 0)) * 31) + (this.f42658d ? 1 : 0)) * 31) + (this.f42659e ? 1 : 0)) * 31;
        long j8 = this.f42660f;
        int i8 = (hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f42661g;
        return ((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f42662h.hashCode();
    }

    public boolean i() {
        return this.f42659e;
    }

    public void j(c cVar) {
        this.f42662h = cVar;
    }

    public void k(k kVar) {
        this.f42655a = kVar;
    }

    public void l(boolean z7) {
        this.f42658d = z7;
    }

    public void m(boolean z7) {
        this.f42656b = z7;
    }

    public void n(boolean z7) {
        this.f42657c = z7;
    }

    public void o(boolean z7) {
        this.f42659e = z7;
    }

    public void p(long j8) {
        this.f42660f = j8;
    }

    public void q(long j8) {
        this.f42661g = j8;
    }

    C6722b(a aVar) {
        this.f42655a = k.NOT_REQUIRED;
        this.f42660f = -1L;
        this.f42661g = -1L;
        this.f42662h = new c();
        this.f42656b = aVar.f42663a;
        int i8 = Build.VERSION.SDK_INT;
        this.f42657c = aVar.f42664b;
        this.f42655a = aVar.f42665c;
        this.f42658d = aVar.f42666d;
        this.f42659e = aVar.f42667e;
        if (i8 >= 24) {
            this.f42662h = aVar.f42670h;
            this.f42660f = aVar.f42668f;
            this.f42661g = aVar.f42669g;
        }
    }

    public C6722b(C6722b c6722b) {
        this.f42655a = k.NOT_REQUIRED;
        this.f42660f = -1L;
        this.f42661g = -1L;
        this.f42662h = new c();
        this.f42656b = c6722b.f42656b;
        this.f42657c = c6722b.f42657c;
        this.f42655a = c6722b.f42655a;
        this.f42658d = c6722b.f42658d;
        this.f42659e = c6722b.f42659e;
        this.f42662h = c6722b.f42662h;
    }
}
