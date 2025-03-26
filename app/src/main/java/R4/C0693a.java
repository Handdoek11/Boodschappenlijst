package R4;

import java.util.List;

/* renamed from: R4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0693a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4811a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4812b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4813c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4814d;

    /* renamed from: e, reason: collision with root package name */
    private final u f4815e;

    /* renamed from: f, reason: collision with root package name */
    private final List f4816f;

    public C0693a(String str, String str2, String str3, String str4, u uVar, List list) {
        J6.r.e(str, "packageName");
        J6.r.e(str2, "versionName");
        J6.r.e(str3, "appBuildVersion");
        J6.r.e(str4, "deviceManufacturer");
        J6.r.e(uVar, "currentProcessDetails");
        J6.r.e(list, "appProcessDetails");
        this.f4811a = str;
        this.f4812b = str2;
        this.f4813c = str3;
        this.f4814d = str4;
        this.f4815e = uVar;
        this.f4816f = list;
    }

    public final String a() {
        return this.f4813c;
    }

    public final List b() {
        return this.f4816f;
    }

    public final u c() {
        return this.f4815e;
    }

    public final String d() {
        return this.f4814d;
    }

    public final String e() {
        return this.f4811a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0693a)) {
            return false;
        }
        C0693a c0693a = (C0693a) obj;
        return J6.r.a(this.f4811a, c0693a.f4811a) && J6.r.a(this.f4812b, c0693a.f4812b) && J6.r.a(this.f4813c, c0693a.f4813c) && J6.r.a(this.f4814d, c0693a.f4814d) && J6.r.a(this.f4815e, c0693a.f4815e) && J6.r.a(this.f4816f, c0693a.f4816f);
    }

    public final String f() {
        return this.f4812b;
    }

    public int hashCode() {
        return (((((((((this.f4811a.hashCode() * 31) + this.f4812b.hashCode()) * 31) + this.f4813c.hashCode()) * 31) + this.f4814d.hashCode()) * 31) + this.f4815e.hashCode()) * 31) + this.f4816f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f4811a + ", versionName=" + this.f4812b + ", appBuildVersion=" + this.f4813c + ", deviceManufacturer=" + this.f4814d + ", currentProcessDetails=" + this.f4815e + ", appProcessDetails=" + this.f4816f + ')';
    }
}
