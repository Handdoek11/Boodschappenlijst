package h2;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5829c {

    /* renamed from: a, reason: collision with root package name */
    private final String f36210a;

    private C5829c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f36210a = str;
    }

    public static C5829c b(String str) {
        return new C5829c(str);
    }

    public String a() {
        return this.f36210a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5829c) {
            return this.f36210a.equals(((C5829c) obj).f36210a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36210a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f36210a + "\"}";
    }
}
