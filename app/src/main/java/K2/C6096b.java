package k2;

import k2.g;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6096b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f38494a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38495b;

    C6096b(g.a aVar, long j8) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f38494a = aVar;
        this.f38495b = j8;
    }

    @Override // k2.g
    public long b() {
        return this.f38495b;
    }

    @Override // k2.g
    public g.a c() {
        return this.f38494a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f38494a.equals(gVar.c()) && this.f38495b == gVar.b();
    }

    public int hashCode() {
        int hashCode = (this.f38494a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f38495b;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f38494a + ", nextRequestWaitMillis=" + this.f38495b + "}";
    }
}
