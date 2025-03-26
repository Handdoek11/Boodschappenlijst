package m4;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final String f39006a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39007b;

    public I(String str, String str2) {
        this.f39006a = str;
        this.f39007b = str2;
    }

    public final String a() {
        return this.f39007b;
    }

    public final String b() {
        return this.f39006a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i8 = (I) obj;
        return J6.r.a(this.f39006a, i8.f39006a) && J6.r.a(this.f39007b, i8.f39007b);
    }

    public int hashCode() {
        String str = this.f39006a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39007b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f39006a + ", authToken=" + this.f39007b + ')';
    }
}
