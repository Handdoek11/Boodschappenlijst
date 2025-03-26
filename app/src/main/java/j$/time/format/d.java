package j$.time.format;

/* loaded from: classes3.dex */
final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private final char f37090a;

    d(char c8) {
        this.f37090a = c8;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        sb.append(this.f37090a);
        return true;
    }

    public final String toString() {
        char c8 = this.f37090a;
        if (c8 == '\'') {
            return "''";
        }
        return "'" + c8 + "'";
    }
}
