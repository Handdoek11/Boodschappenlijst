package b4;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0963a extends g {

    /* renamed from: o, reason: collision with root package name */
    static final C0963a f11994o = new C0963a();

    private C0963a() {
    }

    static g e() {
        return f11994o;
    }

    @Override // b4.g
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // b4.g
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
