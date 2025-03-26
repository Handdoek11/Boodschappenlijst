package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class k extends AbstractC6384F.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f40675a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40676b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40677c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40678d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40679e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f40680f;

    /* renamed from: g, reason: collision with root package name */
    private final int f40681g;

    /* renamed from: h, reason: collision with root package name */
    private final String f40682h;

    /* renamed from: i, reason: collision with root package name */
    private final String f40683i;

    static final class b extends AbstractC6384F.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f40684a;

        /* renamed from: b, reason: collision with root package name */
        private String f40685b;

        /* renamed from: c, reason: collision with root package name */
        private int f40686c;

        /* renamed from: d, reason: collision with root package name */
        private long f40687d;

        /* renamed from: e, reason: collision with root package name */
        private long f40688e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f40689f;

        /* renamed from: g, reason: collision with root package name */
        private int f40690g;

        /* renamed from: h, reason: collision with root package name */
        private String f40691h;

        /* renamed from: i, reason: collision with root package name */
        private String f40692i;

        /* renamed from: j, reason: collision with root package name */
        private byte f40693j;

        b() {
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f40693j == 63 && (str = this.f40685b) != null && (str2 = this.f40691h) != null && (str3 = this.f40692i) != null) {
                return new k(this.f40684a, str, this.f40686c, this.f40687d, this.f40688e, this.f40689f, this.f40690g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f40693j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f40685b == null) {
                sb.append(" model");
            }
            if ((this.f40693j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f40693j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f40693j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f40693j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f40693j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f40691h == null) {
                sb.append(" manufacturer");
            }
            if (this.f40692i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c.a b(int i8) {
            this.f40684a = i8;
            this.f40693j = (byte) (this.f40693j | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c.a c(int i8) {
            this.f40686c = i8;
            this.f40693j = (byte) (this.f40693j | 2);
            return this;
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c.a d(long j8) {
            this.f40688e = j8;
            this.f40693j = (byte) (this.f40693j | 8);
            return this;
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f40691h = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f40685b = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f40692i = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c.a h(long j8) {
            this.f40687d = j8;
            this.f40693j = (byte) (this.f40693j | 4);
            return this;
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c.a i(boolean z7) {
            this.f40689f = z7;
            this.f40693j = (byte) (this.f40693j | 16);
            return this;
        }

        @Override // p4.AbstractC6384F.e.c.a
        public AbstractC6384F.e.c.a j(int i8) {
            this.f40690g = i8;
            this.f40693j = (byte) (this.f40693j | 32);
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.c
    public int b() {
        return this.f40675a;
    }

    @Override // p4.AbstractC6384F.e.c
    public int c() {
        return this.f40677c;
    }

    @Override // p4.AbstractC6384F.e.c
    public long d() {
        return this.f40679e;
    }

    @Override // p4.AbstractC6384F.e.c
    public String e() {
        return this.f40682h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.c)) {
            return false;
        }
        AbstractC6384F.e.c cVar = (AbstractC6384F.e.c) obj;
        return this.f40675a == cVar.b() && this.f40676b.equals(cVar.f()) && this.f40677c == cVar.c() && this.f40678d == cVar.h() && this.f40679e == cVar.d() && this.f40680f == cVar.j() && this.f40681g == cVar.i() && this.f40682h.equals(cVar.e()) && this.f40683i.equals(cVar.g());
    }

    @Override // p4.AbstractC6384F.e.c
    public String f() {
        return this.f40676b;
    }

    @Override // p4.AbstractC6384F.e.c
    public String g() {
        return this.f40683i;
    }

    @Override // p4.AbstractC6384F.e.c
    public long h() {
        return this.f40678d;
    }

    public int hashCode() {
        int hashCode = (((((this.f40675a ^ 1000003) * 1000003) ^ this.f40676b.hashCode()) * 1000003) ^ this.f40677c) * 1000003;
        long j8 = this.f40678d;
        int i8 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f40679e;
        return ((((((((i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ (this.f40680f ? 1231 : 1237)) * 1000003) ^ this.f40681g) * 1000003) ^ this.f40682h.hashCode()) * 1000003) ^ this.f40683i.hashCode();
    }

    @Override // p4.AbstractC6384F.e.c
    public int i() {
        return this.f40681g;
    }

    @Override // p4.AbstractC6384F.e.c
    public boolean j() {
        return this.f40680f;
    }

    public String toString() {
        return "Device{arch=" + this.f40675a + ", model=" + this.f40676b + ", cores=" + this.f40677c + ", ram=" + this.f40678d + ", diskSpace=" + this.f40679e + ", simulator=" + this.f40680f + ", state=" + this.f40681g + ", manufacturer=" + this.f40682h + ", modelClass=" + this.f40683i + "}";
    }

    private k(int i8, String str, int i9, long j8, long j9, boolean z7, int i10, String str2, String str3) {
        this.f40675a = i8;
        this.f40676b = str;
        this.f40677c = i9;
        this.f40678d = j8;
        this.f40679e = j9;
        this.f40680f = z7;
        this.f40681g = i10;
        this.f40682h = str2;
        this.f40683i = str3;
    }
}
