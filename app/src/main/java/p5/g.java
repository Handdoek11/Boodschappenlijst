package p5;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f40843a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40844b;

    public g(String str, String str2) {
        this.f40843a = str;
        this.f40844b = str2;
    }

    public String a() {
        return this.f40843a;
    }

    public String b() {
        return this.f40844b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f40843a.equals(gVar.f40843a)) {
            return this.f40844b.equals(gVar.f40844b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f40843a.hashCode() * 31) + this.f40844b.hashCode();
    }

    public String toString() {
        return "NoteItem{mId='" + this.f40843a + "', mText='" + this.f40844b + "'}";
    }
}
