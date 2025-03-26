package i2;

/* loaded from: classes.dex */
final class l extends v {

    /* renamed from: a, reason: collision with root package name */
    private final long f36440a;

    l(long j8) {
        this.f36440a = j8;
    }

    @Override // i2.v
    public long c() {
        return this.f36440a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f36440a == ((v) obj).c();
    }

    public int hashCode() {
        long j8 = this.f36440a;
        return ((int) (j8 ^ (j8 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f36440a + "}";
    }
}
