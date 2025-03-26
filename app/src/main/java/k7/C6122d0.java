package k7;

/* renamed from: k7.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6122d0 extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C6122d0 f38673c = new C6122d0();

    private C6122d0() {
        super(h7.a.A(J6.t.f3584a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(long[] jArr) {
        J6.r.e(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] r() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, C6120c0 c6120c0, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(c6120c0, "builder");
        c6120c0.e(cVar.y(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C6120c0 k(long[] jArr) {
        J6.r.e(jArr, "<this>");
        return new C6120c0(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(j7.d dVar, long[] jArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(jArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.u(getDescriptor(), i9, jArr[i9]);
        }
    }
}
