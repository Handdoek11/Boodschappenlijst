package R4;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC0701i f4940a;

    /* renamed from: b, reason: collision with root package name */
    private final C f4941b;

    /* renamed from: c, reason: collision with root package name */
    private final C0694b f4942c;

    public z(EnumC0701i enumC0701i, C c8, C0694b c0694b) {
        J6.r.e(enumC0701i, "eventType");
        J6.r.e(c8, "sessionData");
        J6.r.e(c0694b, "applicationInfo");
        this.f4940a = enumC0701i;
        this.f4941b = c8;
        this.f4942c = c0694b;
    }

    public final C0694b a() {
        return this.f4942c;
    }

    public final EnumC0701i b() {
        return this.f4940a;
    }

    public final C c() {
        return this.f4941b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f4940a == zVar.f4940a && J6.r.a(this.f4941b, zVar.f4941b) && J6.r.a(this.f4942c, zVar.f4942c);
    }

    public int hashCode() {
        return (((this.f4940a.hashCode() * 31) + this.f4941b.hashCode()) * 31) + this.f4942c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f4940a + ", sessionData=" + this.f4941b + ", applicationInfo=" + this.f4942c + ')';
    }
}
