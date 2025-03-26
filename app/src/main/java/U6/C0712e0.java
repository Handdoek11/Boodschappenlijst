package U6;

/* renamed from: U6.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0712e0 implements InterfaceC0736q0 {

    /* renamed from: o, reason: collision with root package name */
    private final boolean f5448o;

    public C0712e0(boolean z7) {
        this.f5448o = z7;
    }

    @Override // U6.InterfaceC0736q0
    public boolean h() {
        return this.f5448o;
    }

    @Override // U6.InterfaceC0736q0
    public H0 i() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(h() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
