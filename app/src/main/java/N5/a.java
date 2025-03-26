package N5;

import J6.H;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4155a;

    public a(String str) {
        J6.r.e(str, "name");
        this.f4155a = str;
        if (str.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && J6.r.a(H.b(a.class), H.b(obj.getClass())) && J6.r.a(this.f4155a, ((a) obj).f4155a);
    }

    public int hashCode() {
        return this.f4155a.hashCode();
    }

    public String toString() {
        return "AttributeKey: " + this.f4155a;
    }
}
