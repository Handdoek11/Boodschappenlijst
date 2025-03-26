package r3;

/* renamed from: r3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6693k extends AbstractC6687e {

    /* renamed from: t, reason: collision with root package name */
    private final AbstractC6695m f42574t;

    C6693k(AbstractC6695m abstractC6695m, int i8) {
        super(abstractC6695m.size(), i8);
        this.f42574t = abstractC6695m;
    }

    @Override // r3.AbstractC6687e
    protected final Object a(int i8) {
        return this.f42574t.get(i8);
    }
}
