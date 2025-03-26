package p4;

import p4.AbstractC6385G;

/* renamed from: p4.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6381C extends AbstractC6385G.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40410a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40411b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40412c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40413d;

    /* renamed from: e, reason: collision with root package name */
    private final int f40414e;

    /* renamed from: f, reason: collision with root package name */
    private final j4.f f40415f;

    C6381C(String str, String str2, String str3, String str4, int i8, j4.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f40410a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f40411b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f40412c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f40413d = str4;
        this.f40414e = i8;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f40415f = fVar;
    }

    @Override // p4.AbstractC6385G.a
    public String a() {
        return this.f40410a;
    }

    @Override // p4.AbstractC6385G.a
    public int c() {
        return this.f40414e;
    }

    @Override // p4.AbstractC6385G.a
    public j4.f d() {
        return this.f40415f;
    }

    @Override // p4.AbstractC6385G.a
    public String e() {
        return this.f40413d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6385G.a)) {
            return false;
        }
        AbstractC6385G.a aVar = (AbstractC6385G.a) obj;
        return this.f40410a.equals(aVar.a()) && this.f40411b.equals(aVar.f()) && this.f40412c.equals(aVar.g()) && this.f40413d.equals(aVar.e()) && this.f40414e == aVar.c() && this.f40415f.equals(aVar.d());
    }

    @Override // p4.AbstractC6385G.a
    public String f() {
        return this.f40411b;
    }

    @Override // p4.AbstractC6385G.a
    public String g() {
        return this.f40412c;
    }

    public int hashCode() {
        return ((((((((((this.f40410a.hashCode() ^ 1000003) * 1000003) ^ this.f40411b.hashCode()) * 1000003) ^ this.f40412c.hashCode()) * 1000003) ^ this.f40413d.hashCode()) * 1000003) ^ this.f40414e) * 1000003) ^ this.f40415f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f40410a + ", versionCode=" + this.f40411b + ", versionName=" + this.f40412c + ", installUuid=" + this.f40413d + ", deliveryMechanism=" + this.f40414e + ", developmentPlatformProvider=" + this.f40415f + "}";
    }
}
