package F4;

import java.util.List;

/* loaded from: classes2.dex */
final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    private final String f2364a;

    /* renamed from: b, reason: collision with root package name */
    private final List f2365b;

    a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f2364a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f2365b = list;
    }

    @Override // F4.l
    public List b() {
        return this.f2365b;
    }

    @Override // F4.l
    public String c() {
        return this.f2364a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f2364a.equals(lVar.c()) && this.f2365b.equals(lVar.b());
    }

    public int hashCode() {
        return ((this.f2364a.hashCode() ^ 1000003) * 1000003) ^ this.f2365b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f2364a + ", usedDates=" + this.f2365b + "}";
    }
}
