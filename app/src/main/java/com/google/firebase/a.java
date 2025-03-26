package com.google.firebase;

/* loaded from: classes2.dex */
final class a extends o {

    /* renamed from: a, reason: collision with root package name */
    private final long f32700a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32701b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32702c;

    a(long j8, long j9, long j10) {
        this.f32700a = j8;
        this.f32701b = j9;
        this.f32702c = j10;
    }

    @Override // com.google.firebase.o
    public long b() {
        return this.f32701b;
    }

    @Override // com.google.firebase.o
    public long c() {
        return this.f32700a;
    }

    @Override // com.google.firebase.o
    public long d() {
        return this.f32702c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f32700a == oVar.c() && this.f32701b == oVar.b() && this.f32702c == oVar.d();
    }

    public int hashCode() {
        long j8 = this.f32700a;
        long j9 = this.f32701b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f32702c;
        return i8 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f32700a + ", elapsedRealtime=" + this.f32701b + ", uptimeMillis=" + this.f32702c + "}";
    }
}
