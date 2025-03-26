package k7;

import J6.C0652l;

/* loaded from: classes2.dex */
public final class I extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final I f38620c = new I();

    private I() {
        super(h7.a.y(C0652l.f3580a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        J6.r.e(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, H h8, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(h8, "builder");
        h8.e(cVar.s(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public H k(float[] fArr) {
        J6.r.e(fArr, "<this>");
        return new H(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(j7.d dVar, float[] fArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(fArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.w(getDescriptor(), i9, fArr[i9]);
        }
    }
}
