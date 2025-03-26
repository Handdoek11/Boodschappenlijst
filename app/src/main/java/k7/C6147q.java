package k7;

import J6.C0646f;

/* renamed from: k7.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6147q extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C6147q f38716c = new C6147q();

    private C6147q() {
        super(h7.a.w(C0646f.f3570a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        J6.r.e(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, C6145p c6145p, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(c6145p, "builder");
        c6145p.e(cVar.k(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C6145p k(char[] cArr) {
        J6.r.e(cArr, "<this>");
        return new C6145p(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(j7.d dVar, char[] cArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(cArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.r(getDescriptor(), i9, cArr[i9]);
        }
    }
}
