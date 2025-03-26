package k7;

import x6.C6912A;

/* loaded from: classes2.dex */
public final class S0 extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final S0 f38652c = new S0();

    private S0() {
        super(h7.a.G(x6.z.f44511s));
    }

    @Override // k7.AbstractC6115a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((C6912A) obj).C());
    }

    @Override // k7.AbstractC6115a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((C6912A) obj).C());
    }

    @Override // k7.AbstractC6161x0
    public /* bridge */ /* synthetic */ Object r() {
        return C6912A.b(w());
    }

    @Override // k7.AbstractC6161x0
    public /* bridge */ /* synthetic */ void u(j7.d dVar, Object obj, int i8) {
        z(dVar, ((C6912A) obj).C(), i8);
    }

    protected int v(long[] jArr) {
        J6.r.e(jArr, "$this$collectionSize");
        return C6912A.s(jArr);
    }

    protected long[] w() {
        return C6912A.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, R0 r02, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(r02, "builder");
        r02.e(x6.z.c(cVar.p(getDescriptor(), i8).t()));
    }

    protected R0 y(long[] jArr) {
        J6.r.e(jArr, "$this$toBuilder");
        return new R0(jArr, null);
    }

    protected void z(j7.d dVar, long[] jArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(jArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.B(getDescriptor(), i9).C(C6912A.q(jArr, i9));
        }
    }
}
