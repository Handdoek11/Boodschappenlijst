package i2;

import java.util.List;

/* loaded from: classes.dex */
final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    private final List f36391a;

    d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f36391a = list;
    }

    @Override // i2.n
    public List c() {
        return this.f36391a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f36391a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f36391a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f36391a + "}";
    }
}
