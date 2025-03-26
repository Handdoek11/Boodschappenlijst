package com.google.firebase.installations;

import com.google.firebase.installations.f;

/* loaded from: classes2.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f32803a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32804b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32805c;

    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f32806a;

        /* renamed from: b, reason: collision with root package name */
        private Long f32807b;

        /* renamed from: c, reason: collision with root package name */
        private Long f32808c;

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f32806a == null) {
                str = " token";
            }
            if (this.f32807b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f32808c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f32806a, this.f32807b.longValue(), this.f32808c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f32806a = str;
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j8) {
            this.f32808c = Long.valueOf(j8);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j8) {
            this.f32807b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f32803a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f32805c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f32804b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f32803a.equals(fVar.b()) && this.f32804b == fVar.d() && this.f32805c == fVar.c();
    }

    public int hashCode() {
        int hashCode = (this.f32803a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f32804b;
        long j9 = this.f32805c;
        return ((hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f32803a + ", tokenExpirationTimestamp=" + this.f32804b + ", tokenCreationTimestamp=" + this.f32805c + "}";
    }

    private a(String str, long j8, long j9) {
        this.f32803a = str;
        this.f32804b = j8;
        this.f32805c = j9;
    }
}
