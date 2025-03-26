package k7;

import J6.C0651k;

/* loaded from: classes2.dex */
public final class B extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final B f38587c = new B();

    private B() {
        super(h7.a.x(C0651k.f3579a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        J6.r.e(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, A a8, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(a8, "builder");
        a8.e(cVar.u(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public A k(double[] dArr) {
        J6.r.e(dArr, "<this>");
        return new A(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(j7.d dVar, double[] dArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(dArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.t(getDescriptor(), i9, dArr[i9]);
        }
    }
}
