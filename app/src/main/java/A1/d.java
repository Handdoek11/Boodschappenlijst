package A1;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f67a;

    /* renamed from: b, reason: collision with root package name */
    public Long f68b;

    public d(String str, boolean z7) {
        this(str, z7 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f67a.equals(dVar.f67a)) {
            return false;
        }
        Long l8 = this.f68b;
        Long l9 = dVar.f68b;
        return l8 != null ? l8.equals(l9) : l9 == null;
    }

    public int hashCode() {
        int hashCode = this.f67a.hashCode() * 31;
        Long l8 = this.f68b;
        return hashCode + (l8 != null ? l8.hashCode() : 0);
    }

    public d(String str, long j8) {
        this.f67a = str;
        this.f68b = Long.valueOf(j8);
    }
}
