package p5;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f40831a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40832b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40833c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f40834d;

    private c(String str, String str2, boolean z7, boolean z8) {
        this.f40831a = str;
        this.f40832b = str2;
        this.f40833c = z7;
        this.f40834d = z8;
    }

    public static c a(String str, String str2) {
        return new c(str, str2, false, true);
    }

    public static c f(String str, String str2) {
        return new c(str, str2, true, false);
    }

    public static c g(String str, String str2) {
        return new c(str, str2, false, false);
    }

    public String b() {
        return this.f40831a;
    }

    public String c() {
        return this.f40832b;
    }

    public boolean d() {
        return this.f40834d;
    }

    public boolean e() {
        return this.f40833c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f40833c == cVar.f40833c && this.f40831a.equals(cVar.f40831a) && Objects.equals(this.f40832b, cVar.f40832b);
    }

    public int hashCode() {
        return Objects.hash(this.f40831a, this.f40832b, Boolean.valueOf(this.f40833c));
    }

    public String toString() {
        return "HeaderItem{mId='" + this.f40831a + "', mText='" + this.f40832b + "', mMajor=" + this.f40833c + '}';
    }
}
