package p5;

import j$.util.Objects;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f40841a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40842b;

    public f(String str, String str2) {
        this.f40841a = str;
        this.f40842b = str2;
    }

    public String a() {
        return this.f40841a;
    }

    public String b() {
        return this.f40842b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f40841a, fVar.f40841a) && Objects.equals(this.f40842b, fVar.f40842b);
    }

    public int hashCode() {
        return Objects.hash(this.f40841a, this.f40842b);
    }
}
