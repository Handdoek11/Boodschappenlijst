package R4;

import H.AbstractC0626b;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final String f4936a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4937b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4938c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4939d;

    public y(String str, String str2, int i8, long j8) {
        J6.r.e(str, "sessionId");
        J6.r.e(str2, "firstSessionId");
        this.f4936a = str;
        this.f4937b = str2;
        this.f4938c = i8;
        this.f4939d = j8;
    }

    public final String a() {
        return this.f4937b;
    }

    public final String b() {
        return this.f4936a;
    }

    public final int c() {
        return this.f4938c;
    }

    public final long d() {
        return this.f4939d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return J6.r.a(this.f4936a, yVar.f4936a) && J6.r.a(this.f4937b, yVar.f4937b) && this.f4938c == yVar.f4938c && this.f4939d == yVar.f4939d;
    }

    public int hashCode() {
        return (((((this.f4936a.hashCode() * 31) + this.f4937b.hashCode()) * 31) + this.f4938c) * 31) + AbstractC0626b.a(this.f4939d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f4936a + ", firstSessionId=" + this.f4937b + ", sessionIndex=" + this.f4938c + ", sessionStartTimestampUs=" + this.f4939d + ')';
    }
}
