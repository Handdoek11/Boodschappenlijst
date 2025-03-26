package s3;

/* loaded from: classes2.dex */
final class i extends AbstractC6730g {

    /* renamed from: t, reason: collision with root package name */
    private final k f42719t;

    i(k kVar, int i8) {
        super(kVar.size(), i8);
        this.f42719t = kVar;
    }

    @Override // s3.AbstractC6730g
    protected final Object a(int i8) {
        return this.f42719t.get(i8);
    }
}
