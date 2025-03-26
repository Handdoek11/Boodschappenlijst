package k7;

/* loaded from: classes2.dex */
public final class P0 extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final P0 f38644c = new P0();

    private P0() {
        super(h7.a.F(x6.x.f44506s));
    }

    @Override // k7.AbstractC6115a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((x6.y) obj).C());
    }

    @Override // k7.AbstractC6115a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((x6.y) obj).C());
    }

    @Override // k7.AbstractC6161x0
    public /* bridge */ /* synthetic */ Object r() {
        return x6.y.b(w());
    }

    @Override // k7.AbstractC6161x0
    public /* bridge */ /* synthetic */ void u(j7.d dVar, Object obj, int i8) {
        z(dVar, ((x6.y) obj).C(), i8);
    }

    protected int v(int[] iArr) {
        J6.r.e(iArr, "$this$collectionSize");
        return x6.y.s(iArr);
    }

    protected int[] w() {
        return x6.y.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, O0 o02, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(o02, "builder");
        o02.e(x6.x.c(cVar.p(getDescriptor(), i8).n()));
    }

    protected O0 y(int[] iArr) {
        J6.r.e(iArr, "$this$toBuilder");
        return new O0(iArr, null);
    }

    protected void z(j7.d dVar, int[] iArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(iArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.B(getDescriptor(), i9).z(x6.y.q(iArr, i9));
        }
    }
}
