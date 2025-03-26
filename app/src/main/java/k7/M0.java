package k7;

/* loaded from: classes2.dex */
public final class M0 extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final M0 f38637c = new M0();

    private M0() {
        super(h7.a.E(x6.v.f44501s));
    }

    @Override // k7.AbstractC6115a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((x6.w) obj).C());
    }

    @Override // k7.AbstractC6115a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((x6.w) obj).C());
    }

    @Override // k7.AbstractC6161x0
    public /* bridge */ /* synthetic */ Object r() {
        return x6.w.b(w());
    }

    @Override // k7.AbstractC6161x0
    public /* bridge */ /* synthetic */ void u(j7.d dVar, Object obj, int i8) {
        z(dVar, ((x6.w) obj).C(), i8);
    }

    protected int v(byte[] bArr) {
        J6.r.e(bArr, "$this$collectionSize");
        return x6.w.s(bArr);
    }

    protected byte[] w() {
        return x6.w.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, L0 l02, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(l02, "builder");
        l02.e(x6.v.c(cVar.p(getDescriptor(), i8).C()));
    }

    protected L0 y(byte[] bArr) {
        J6.r.e(bArr, "$this$toBuilder");
        return new L0(bArr, null);
    }

    protected void z(j7.d dVar, byte[] bArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(bArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.B(getDescriptor(), i9).l(x6.w.q(bArr, i9));
        }
    }
}
