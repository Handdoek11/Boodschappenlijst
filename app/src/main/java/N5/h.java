package N5;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f4178a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4179b;

    public h(String str) {
        J6.r.e(str, "content");
        this.f4178a = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        J6.r.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f4179b = lowerCase.hashCode();
    }

    public final String a() {
        return this.f4178a;
    }

    public boolean equals(Object obj) {
        String str;
        h hVar = obj instanceof h ? (h) obj : null;
        return (hVar == null || (str = hVar.f4178a) == null || !S6.h.s(str, this.f4178a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f4179b;
    }

    public String toString() {
        return this.f4178a;
    }
}
