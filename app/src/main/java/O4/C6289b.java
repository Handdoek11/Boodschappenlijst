package o4;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6289b extends i {

    /* renamed from: b, reason: collision with root package name */
    private final String f39823b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39824c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39825d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39826e;

    /* renamed from: f, reason: collision with root package name */
    private final long f39827f;

    C6289b(String str, String str2, String str3, String str4, long j8) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f39823b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f39824c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f39825d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f39826e = str4;
        this.f39827f = j8;
    }

    @Override // o4.i
    public String c() {
        return this.f39824c;
    }

    @Override // o4.i
    public String d() {
        return this.f39825d;
    }

    @Override // o4.i
    public String e() {
        return this.f39823b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f39823b.equals(iVar.e()) && this.f39824c.equals(iVar.c()) && this.f39825d.equals(iVar.d()) && this.f39826e.equals(iVar.g()) && this.f39827f == iVar.f();
    }

    @Override // o4.i
    public long f() {
        return this.f39827f;
    }

    @Override // o4.i
    public String g() {
        return this.f39826e;
    }

    public int hashCode() {
        int hashCode = (((((((this.f39823b.hashCode() ^ 1000003) * 1000003) ^ this.f39824c.hashCode()) * 1000003) ^ this.f39825d.hashCode()) * 1000003) ^ this.f39826e.hashCode()) * 1000003;
        long j8 = this.f39827f;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f39823b + ", parameterKey=" + this.f39824c + ", parameterValue=" + this.f39825d + ", variantId=" + this.f39826e + ", templateVersion=" + this.f39827f + "}";
    }
}
