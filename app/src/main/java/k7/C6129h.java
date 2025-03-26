package k7;

import J6.C0643c;

/* renamed from: k7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6129h extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C6129h f38688c = new C6129h();

    private C6129h() {
        super(h7.a.u(C0643c.f3560a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(boolean[] zArr) {
        J6.r.e(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] r() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, C6127g c6127g, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(c6127g, "builder");
        c6127g.e(cVar.A(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C6127g k(boolean[] zArr) {
        J6.r.e(zArr, "<this>");
        return new C6127g(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(j7.d dVar, boolean[] zArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(zArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.A(getDescriptor(), i9, zArr[i9]);
        }
    }
}
