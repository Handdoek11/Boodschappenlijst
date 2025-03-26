package R4;

/* renamed from: R4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0694b {

    /* renamed from: a, reason: collision with root package name */
    private final String f4817a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4818b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4819c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4820d;

    /* renamed from: e, reason: collision with root package name */
    private final t f4821e;

    /* renamed from: f, reason: collision with root package name */
    private final C0693a f4822f;

    public C0694b(String str, String str2, String str3, String str4, t tVar, C0693a c0693a) {
        J6.r.e(str, "appId");
        J6.r.e(str2, "deviceModel");
        J6.r.e(str3, "sessionSdkVersion");
        J6.r.e(str4, "osVersion");
        J6.r.e(tVar, "logEnvironment");
        J6.r.e(c0693a, "androidAppInfo");
        this.f4817a = str;
        this.f4818b = str2;
        this.f4819c = str3;
        this.f4820d = str4;
        this.f4821e = tVar;
        this.f4822f = c0693a;
    }

    public final C0693a a() {
        return this.f4822f;
    }

    public final String b() {
        return this.f4817a;
    }

    public final String c() {
        return this.f4818b;
    }

    public final t d() {
        return this.f4821e;
    }

    public final String e() {
        return this.f4820d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0694b)) {
            return false;
        }
        C0694b c0694b = (C0694b) obj;
        return J6.r.a(this.f4817a, c0694b.f4817a) && J6.r.a(this.f4818b, c0694b.f4818b) && J6.r.a(this.f4819c, c0694b.f4819c) && J6.r.a(this.f4820d, c0694b.f4820d) && this.f4821e == c0694b.f4821e && J6.r.a(this.f4822f, c0694b.f4822f);
    }

    public final String f() {
        return this.f4819c;
    }

    public int hashCode() {
        return (((((((((this.f4817a.hashCode() * 31) + this.f4818b.hashCode()) * 31) + this.f4819c.hashCode()) * 31) + this.f4820d.hashCode()) * 31) + this.f4821e.hashCode()) * 31) + this.f4822f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f4817a + ", deviceModel=" + this.f4818b + ", sessionSdkVersion=" + this.f4819c + ", osVersion=" + this.f4820d + ", logEnvironment=" + this.f4821e + ", androidAppInfo=" + this.f4822f + ')';
    }
}
