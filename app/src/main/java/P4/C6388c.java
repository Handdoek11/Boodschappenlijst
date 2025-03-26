package p4;

import java.util.List;
import p4.AbstractC6384F;

/* renamed from: p4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6388c extends AbstractC6384F.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f40601a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40602b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40603c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40604d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40605e;

    /* renamed from: f, reason: collision with root package name */
    private final long f40606f;

    /* renamed from: g, reason: collision with root package name */
    private final long f40607g;

    /* renamed from: h, reason: collision with root package name */
    private final String f40608h;

    /* renamed from: i, reason: collision with root package name */
    private final List f40609i;

    /* renamed from: p4.c$b */
    static final class b extends AbstractC6384F.a.b {

        /* renamed from: a, reason: collision with root package name */
        private int f40610a;

        /* renamed from: b, reason: collision with root package name */
        private String f40611b;

        /* renamed from: c, reason: collision with root package name */
        private int f40612c;

        /* renamed from: d, reason: collision with root package name */
        private int f40613d;

        /* renamed from: e, reason: collision with root package name */
        private long f40614e;

        /* renamed from: f, reason: collision with root package name */
        private long f40615f;

        /* renamed from: g, reason: collision with root package name */
        private long f40616g;

        /* renamed from: h, reason: collision with root package name */
        private String f40617h;

        /* renamed from: i, reason: collision with root package name */
        private List f40618i;

        /* renamed from: j, reason: collision with root package name */
        private byte f40619j;

        b() {
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a a() {
            String str;
            if (this.f40619j == 63 && (str = this.f40611b) != null) {
                return new C6388c(this.f40610a, str, this.f40612c, this.f40613d, this.f40614e, this.f40615f, this.f40616g, this.f40617h, this.f40618i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f40619j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f40611b == null) {
                sb.append(" processName");
            }
            if ((this.f40619j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f40619j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f40619j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f40619j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f40619j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a.b b(List list) {
            this.f40618i = list;
            return this;
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a.b c(int i8) {
            this.f40613d = i8;
            this.f40619j = (byte) (this.f40619j | 4);
            return this;
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a.b d(int i8) {
            this.f40610a = i8;
            this.f40619j = (byte) (this.f40619j | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f40611b = str;
            return this;
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a.b f(long j8) {
            this.f40614e = j8;
            this.f40619j = (byte) (this.f40619j | 8);
            return this;
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a.b g(int i8) {
            this.f40612c = i8;
            this.f40619j = (byte) (this.f40619j | 2);
            return this;
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a.b h(long j8) {
            this.f40615f = j8;
            this.f40619j = (byte) (this.f40619j | 16);
            return this;
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a.b i(long j8) {
            this.f40616g = j8;
            this.f40619j = (byte) (this.f40619j | 32);
            return this;
        }

        @Override // p4.AbstractC6384F.a.b
        public AbstractC6384F.a.b j(String str) {
            this.f40617h = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.a
    public List b() {
        return this.f40609i;
    }

    @Override // p4.AbstractC6384F.a
    public int c() {
        return this.f40604d;
    }

    @Override // p4.AbstractC6384F.a
    public int d() {
        return this.f40601a;
    }

    @Override // p4.AbstractC6384F.a
    public String e() {
        return this.f40602b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.a)) {
            return false;
        }
        AbstractC6384F.a aVar = (AbstractC6384F.a) obj;
        if (this.f40601a == aVar.d() && this.f40602b.equals(aVar.e()) && this.f40603c == aVar.g() && this.f40604d == aVar.c() && this.f40605e == aVar.f() && this.f40606f == aVar.h() && this.f40607g == aVar.i() && ((str = this.f40608h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List list = this.f40609i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p4.AbstractC6384F.a
    public long f() {
        return this.f40605e;
    }

    @Override // p4.AbstractC6384F.a
    public int g() {
        return this.f40603c;
    }

    @Override // p4.AbstractC6384F.a
    public long h() {
        return this.f40606f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f40601a ^ 1000003) * 1000003) ^ this.f40602b.hashCode()) * 1000003) ^ this.f40603c) * 1000003) ^ this.f40604d) * 1000003;
        long j8 = this.f40605e;
        int i8 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f40606f;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f40607g;
        int i10 = (i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str = this.f40608h;
        int hashCode2 = (i10 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f40609i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // p4.AbstractC6384F.a
    public long i() {
        return this.f40607g;
    }

    @Override // p4.AbstractC6384F.a
    public String j() {
        return this.f40608h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f40601a + ", processName=" + this.f40602b + ", reasonCode=" + this.f40603c + ", importance=" + this.f40604d + ", pss=" + this.f40605e + ", rss=" + this.f40606f + ", timestamp=" + this.f40607g + ", traceFile=" + this.f40608h + ", buildIdMappingForArch=" + this.f40609i + "}";
    }

    private C6388c(int i8, String str, int i9, int i10, long j8, long j9, long j10, String str2, List list) {
        this.f40601a = i8;
        this.f40602b = str;
        this.f40603c = i9;
        this.f40604d = i10;
        this.f40605e = j8;
        this.f40606f = j9;
        this.f40607g = j10;
        this.f40608h = str2;
        this.f40609i = list;
    }
}
