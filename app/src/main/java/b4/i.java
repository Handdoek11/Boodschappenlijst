package b4;

/* loaded from: classes2.dex */
final class i extends g {

    /* renamed from: o, reason: collision with root package name */
    private final Object f12003o;

    i(Object obj) {
        this.f12003o = obj;
    }

    @Override // b4.g
    public Object b() {
        return this.f12003o;
    }

    @Override // b4.g
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f12003o.equals(((i) obj).f12003o);
        }
        return false;
    }

    public int hashCode() {
        return this.f12003o.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f12003o);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
