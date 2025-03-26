package R4;

import H.AbstractC0626b;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final String f4785a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4786b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4787c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4788d;

    /* renamed from: e, reason: collision with root package name */
    private final C0697e f4789e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4790f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4791g;

    public C(String str, String str2, int i8, long j8, C0697e c0697e, String str3, String str4) {
        J6.r.e(str, "sessionId");
        J6.r.e(str2, "firstSessionId");
        J6.r.e(c0697e, "dataCollectionStatus");
        J6.r.e(str3, "firebaseInstallationId");
        J6.r.e(str4, "firebaseAuthenticationToken");
        this.f4785a = str;
        this.f4786b = str2;
        this.f4787c = i8;
        this.f4788d = j8;
        this.f4789e = c0697e;
        this.f4790f = str3;
        this.f4791g = str4;
    }

    public final C0697e a() {
        return this.f4789e;
    }

    public final long b() {
        return this.f4788d;
    }

    public final String c() {
        return this.f4791g;
    }

    public final String d() {
        return this.f4790f;
    }

    public final String e() {
        return this.f4786b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        return J6.r.a(this.f4785a, c8.f4785a) && J6.r.a(this.f4786b, c8.f4786b) && this.f4787c == c8.f4787c && this.f4788d == c8.f4788d && J6.r.a(this.f4789e, c8.f4789e) && J6.r.a(this.f4790f, c8.f4790f) && J6.r.a(this.f4791g, c8.f4791g);
    }

    public final String f() {
        return this.f4785a;
    }

    public final int g() {
        return this.f4787c;
    }

    public int hashCode() {
        return (((((((((((this.f4785a.hashCode() * 31) + this.f4786b.hashCode()) * 31) + this.f4787c) * 31) + AbstractC0626b.a(this.f4788d)) * 31) + this.f4789e.hashCode()) * 31) + this.f4790f.hashCode()) * 31) + this.f4791g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f4785a + ", firstSessionId=" + this.f4786b + ", sessionIndex=" + this.f4787c + ", eventTimestampUs=" + this.f4788d + ", dataCollectionStatus=" + this.f4789e + ", firebaseInstallationId=" + this.f4790f + ", firebaseAuthenticationToken=" + this.f4791g + ')';
    }
}
