package m4;

import m4.K;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6197c extends K.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f39042a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39043b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39044c;

    C6197c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f39042a = str;
        this.f39043b = str2;
        this.f39044c = str3;
    }

    @Override // m4.K.a
    public String c() {
        return this.f39042a;
    }

    @Override // m4.K.a
    public String d() {
        return this.f39044c;
    }

    @Override // m4.K.a
    public String e() {
        return this.f39043b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K.a)) {
            return false;
        }
        K.a aVar = (K.a) obj;
        if (this.f39042a.equals(aVar.c()) && ((str = this.f39043b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f39044c;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f39042a.hashCode() ^ 1000003) * 1000003;
        String str = this.f39043b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f39044c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f39042a + ", firebaseInstallationId=" + this.f39043b + ", firebaseAuthenticationToken=" + this.f39044c + "}";
    }
}
