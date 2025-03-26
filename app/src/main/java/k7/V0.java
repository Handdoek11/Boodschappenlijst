package k7;

import x6.C6914C;
import x6.C6915D;

/* loaded from: classes2.dex */
public final class V0 extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final V0 f38660c = new V0();

    private V0() {
        super(h7.a.H(C6914C.f44458s));
    }

    @Override // k7.AbstractC6115a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((C6915D) obj).C());
    }

    @Override // k7.AbstractC6115a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((C6915D) obj).C());
    }

    @Override // k7.AbstractC6161x0
    public /* bridge */ /* synthetic */ Object r() {
        return C6915D.b(w());
    }

    @Override // k7.AbstractC6161x0
    public /* bridge */ /* synthetic */ void u(j7.d dVar, Object obj, int i8) {
        z(dVar, ((C6915D) obj).C(), i8);
    }

    protected int v(short[] sArr) {
        J6.r.e(sArr, "$this$collectionSize");
        return C6915D.s(sArr);
    }

    protected short[] w() {
        return C6915D.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, U0 u02, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(u02, "builder");
        u02.e(C6914C.c(cVar.p(getDescriptor(), i8).E()));
    }

    protected U0 y(short[] sArr) {
        J6.r.e(sArr, "$this$toBuilder");
        return new U0(sArr, null);
    }

    protected void z(j7.d dVar, short[] sArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(sArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.B(getDescriptor(), i9).j(C6915D.q(sArr, i9));
        }
    }
}
