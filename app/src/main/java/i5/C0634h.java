package I5;

import java.util.Locale;

/* renamed from: I5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0634h {

    /* renamed from: a, reason: collision with root package name */
    private final String f3263a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3264b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3265c;

    public C0634h(String str, String str2, boolean z7) {
        J6.r.e(str, "name");
        J6.r.e(str2, "value");
        this.f3263a = str;
        this.f3264b = str2;
        this.f3265c = z7;
    }

    public final String a() {
        return this.f3263a;
    }

    public final String b() {
        return this.f3264b;
    }

    public final String c() {
        return this.f3263a;
    }

    public final String d() {
        return this.f3264b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0634h) {
            C0634h c0634h = (C0634h) obj;
            if (S6.h.s(c0634h.f3263a, this.f3263a, true) && S6.h.s(c0634h.f3264b, this.f3264b, true)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3263a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        J6.r.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f3264b.toLowerCase(locale);
        J6.r.d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode();
    }

    public String toString() {
        return "HeaderValueParam(name=" + this.f3263a + ", value=" + this.f3264b + ", escapeValue=" + this.f3265c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0634h(String str, String str2) {
        this(str, str2, false);
        J6.r.e(str, "name");
        J6.r.e(str2, "value");
    }
}
