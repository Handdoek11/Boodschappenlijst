package q3;

/* loaded from: classes.dex */
final class O5 extends I2 {

    /* renamed from: t, reason: collision with root package name */
    private final P6 f41400t;

    O5(P6 p62, int i8) {
        super(p62.size(), i8);
        this.f41400t = p62;
    }

    @Override // q3.I2
    protected final Object a(int i8) {
        return this.f41400t.get(i8);
    }
}
