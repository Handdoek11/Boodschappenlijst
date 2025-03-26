package P4;

/* loaded from: classes2.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f4401a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4402b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f4401a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f4402b = str2;
    }

    @Override // P4.f
    public String b() {
        return this.f4401a;
    }

    @Override // P4.f
    public String c() {
        return this.f4402b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4401a.equals(fVar.b()) && this.f4402b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f4401a.hashCode() ^ 1000003) * 1000003) ^ this.f4402b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4401a + ", version=" + this.f4402b + "}";
    }
}
