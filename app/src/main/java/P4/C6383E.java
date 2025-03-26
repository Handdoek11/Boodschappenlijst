package p4;

import p4.AbstractC6385G;

/* renamed from: p4.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6383E extends AbstractC6385G.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f40425a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40426b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40427c;

    C6383E(String str, String str2, boolean z7) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f40425a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f40426b = str2;
        this.f40427c = z7;
    }

    @Override // p4.AbstractC6385G.c
    public boolean b() {
        return this.f40427c;
    }

    @Override // p4.AbstractC6385G.c
    public String c() {
        return this.f40426b;
    }

    @Override // p4.AbstractC6385G.c
    public String d() {
        return this.f40425a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6385G.c)) {
            return false;
        }
        AbstractC6385G.c cVar = (AbstractC6385G.c) obj;
        return this.f40425a.equals(cVar.d()) && this.f40426b.equals(cVar.c()) && this.f40427c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f40425a.hashCode() ^ 1000003) * 1000003) ^ this.f40426b.hashCode()) * 1000003) ^ (this.f40427c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f40425a + ", osCodeName=" + this.f40426b + ", isRooted=" + this.f40427c + "}";
    }
}
