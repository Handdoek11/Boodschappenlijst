package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class u extends AbstractC6384F.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f40786a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40787b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40788c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40789d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40790e;

    /* renamed from: f, reason: collision with root package name */
    private final long f40791f;

    static final class b extends AbstractC6384F.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f40792a;

        /* renamed from: b, reason: collision with root package name */
        private int f40793b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f40794c;

        /* renamed from: d, reason: collision with root package name */
        private int f40795d;

        /* renamed from: e, reason: collision with root package name */
        private long f40796e;

        /* renamed from: f, reason: collision with root package name */
        private long f40797f;

        /* renamed from: g, reason: collision with root package name */
        private byte f40798g;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.c.a
        public AbstractC6384F.e.d.c a() {
            if (this.f40798g == 31) {
                return new u(this.f40792a, this.f40793b, this.f40794c, this.f40795d, this.f40796e, this.f40797f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f40798g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f40798g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f40798g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f40798g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f40798g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.c.a
        public AbstractC6384F.e.d.c.a b(Double d8) {
            this.f40792a = d8;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.c.a
        public AbstractC6384F.e.d.c.a c(int i8) {
            this.f40793b = i8;
            this.f40798g = (byte) (this.f40798g | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.c.a
        public AbstractC6384F.e.d.c.a d(long j8) {
            this.f40797f = j8;
            this.f40798g = (byte) (this.f40798g | 16);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.c.a
        public AbstractC6384F.e.d.c.a e(int i8) {
            this.f40795d = i8;
            this.f40798g = (byte) (this.f40798g | 4);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.c.a
        public AbstractC6384F.e.d.c.a f(boolean z7) {
            this.f40794c = z7;
            this.f40798g = (byte) (this.f40798g | 2);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.c.a
        public AbstractC6384F.e.d.c.a g(long j8) {
            this.f40796e = j8;
            this.f40798g = (byte) (this.f40798g | 8);
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.c
    public Double b() {
        return this.f40786a;
    }

    @Override // p4.AbstractC6384F.e.d.c
    public int c() {
        return this.f40787b;
    }

    @Override // p4.AbstractC6384F.e.d.c
    public long d() {
        return this.f40791f;
    }

    @Override // p4.AbstractC6384F.e.d.c
    public int e() {
        return this.f40789d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.c)) {
            return false;
        }
        AbstractC6384F.e.d.c cVar = (AbstractC6384F.e.d.c) obj;
        Double d8 = this.f40786a;
        if (d8 != null ? d8.equals(cVar.b()) : cVar.b() == null) {
            if (this.f40787b == cVar.c() && this.f40788c == cVar.g() && this.f40789d == cVar.e() && this.f40790e == cVar.f() && this.f40791f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // p4.AbstractC6384F.e.d.c
    public long f() {
        return this.f40790e;
    }

    @Override // p4.AbstractC6384F.e.d.c
    public boolean g() {
        return this.f40788c;
    }

    public int hashCode() {
        Double d8 = this.f40786a;
        int hashCode = ((((((((d8 == null ? 0 : d8.hashCode()) ^ 1000003) * 1000003) ^ this.f40787b) * 1000003) ^ (this.f40788c ? 1231 : 1237)) * 1000003) ^ this.f40789d) * 1000003;
        long j8 = this.f40790e;
        long j9 = this.f40791f;
        return ((hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f40786a + ", batteryVelocity=" + this.f40787b + ", proximityOn=" + this.f40788c + ", orientation=" + this.f40789d + ", ramUsed=" + this.f40790e + ", diskUsed=" + this.f40791f + "}";
    }

    private u(Double d8, int i8, boolean z7, int i9, long j8, long j9) {
        this.f40786a = d8;
        this.f40787b = i8;
        this.f40788c = z7;
        this.f40789d = i9;
        this.f40790e = j8;
        this.f40791f = j9;
    }
}
