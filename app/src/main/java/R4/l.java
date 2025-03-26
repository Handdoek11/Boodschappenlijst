package R4;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f4884a;

    public l(String str) {
        this.f4884a = str;
    }

    public final String a() {
        return this.f4884a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && J6.r.a(this.f4884a, ((l) obj).f4884a);
    }

    public int hashCode() {
        String str = this.f4884a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f4884a + ')';
    }
}
