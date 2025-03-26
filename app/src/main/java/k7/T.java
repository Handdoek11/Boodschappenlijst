package k7;

/* loaded from: classes2.dex */
public final class T extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final T f38653c = new T();

    private T() {
        super(h7.a.z(J6.q.f3583a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        J6.r.e(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, S s8, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(s8, "builder");
        s8.e(cVar.g(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public S k(int[] iArr) {
        J6.r.e(iArr, "<this>");
        return new S(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(j7.d dVar, int[] iArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(iArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.h(getDescriptor(), i9, iArr[i9]);
        }
    }
}
