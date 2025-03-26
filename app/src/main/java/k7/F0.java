package k7;

/* loaded from: classes2.dex */
public final class F0 extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final F0 f38608c = new F0();

    private F0() {
        super(h7.a.B(J6.J.f3550a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        J6.r.e(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, E0 e02, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(e02, "builder");
        e02.e(cVar.l(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public E0 k(short[] sArr) {
        J6.r.e(sArr, "<this>");
        return new E0(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(j7.d dVar, short[] sArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(sArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.y(getDescriptor(), i9, sArr[i9]);
        }
    }
}
