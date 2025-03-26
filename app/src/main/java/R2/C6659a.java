package r2;

import r2.AbstractC6663e;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6659a extends AbstractC6663e {

    /* renamed from: b, reason: collision with root package name */
    private final long f42500b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42501c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42502d;

    /* renamed from: e, reason: collision with root package name */
    private final long f42503e;

    /* renamed from: f, reason: collision with root package name */
    private final int f42504f;

    /* renamed from: r2.a$b */
    static final class b extends AbstractC6663e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f42505a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f42506b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f42507c;

        /* renamed from: d, reason: collision with root package name */
        private Long f42508d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f42509e;

        b() {
        }

        @Override // r2.AbstractC6663e.a
        AbstractC6663e a() {
            String str = "";
            if (this.f42505a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f42506b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f42507c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f42508d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f42509e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C6659a(this.f42505a.longValue(), this.f42506b.intValue(), this.f42507c.intValue(), this.f42508d.longValue(), this.f42509e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r2.AbstractC6663e.a
        AbstractC6663e.a b(int i8) {
            this.f42507c = Integer.valueOf(i8);
            return this;
        }

        @Override // r2.AbstractC6663e.a
        AbstractC6663e.a c(long j8) {
            this.f42508d = Long.valueOf(j8);
            return this;
        }

        @Override // r2.AbstractC6663e.a
        AbstractC6663e.a d(int i8) {
            this.f42506b = Integer.valueOf(i8);
            return this;
        }

        @Override // r2.AbstractC6663e.a
        AbstractC6663e.a e(int i8) {
            this.f42509e = Integer.valueOf(i8);
            return this;
        }

        @Override // r2.AbstractC6663e.a
        AbstractC6663e.a f(long j8) {
            this.f42505a = Long.valueOf(j8);
            return this;
        }
    }

    @Override // r2.AbstractC6663e
    int b() {
        return this.f42502d;
    }

    @Override // r2.AbstractC6663e
    long c() {
        return this.f42503e;
    }

    @Override // r2.AbstractC6663e
    int d() {
        return this.f42501c;
    }

    @Override // r2.AbstractC6663e
    int e() {
        return this.f42504f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6663e)) {
            return false;
        }
        AbstractC6663e abstractC6663e = (AbstractC6663e) obj;
        return this.f42500b == abstractC6663e.f() && this.f42501c == abstractC6663e.d() && this.f42502d == abstractC6663e.b() && this.f42503e == abstractC6663e.c() && this.f42504f == abstractC6663e.e();
    }

    @Override // r2.AbstractC6663e
    long f() {
        return this.f42500b;
    }

    public int hashCode() {
        long j8 = this.f42500b;
        int i8 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f42501c) * 1000003) ^ this.f42502d) * 1000003;
        long j9 = this.f42503e;
        return ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f42504f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f42500b + ", loadBatchSize=" + this.f42501c + ", criticalSectionEnterTimeoutMs=" + this.f42502d + ", eventCleanUpAge=" + this.f42503e + ", maxBlobByteSizePerRow=" + this.f42504f + "}";
    }

    private C6659a(long j8, int i8, int i9, long j9, int i10) {
        this.f42500b = j8;
        this.f42501c = i8;
        this.f42502d = i9;
        this.f42503e = j9;
        this.f42504f = i10;
    }
}
