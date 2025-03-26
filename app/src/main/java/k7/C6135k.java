package k7;

import J6.C0644d;

/* renamed from: k7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6135k extends AbstractC6161x0 implements g7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C6135k f38697c = new C6135k();

    private C6135k() {
        super(h7.a.v(C0644d.f3561a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(byte[] bArr) {
        J6.r.e(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public byte[] r() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w, k7.AbstractC6115a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(j7.c cVar, int i8, C6133j c6133j, boolean z7) {
        J6.r.e(cVar, "decoder");
        J6.r.e(c6133j, "builder");
        c6133j.e(cVar.o(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C6133j k(byte[] bArr) {
        J6.r.e(bArr, "<this>");
        return new C6133j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6161x0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(j7.d dVar, byte[] bArr, int i8) {
        J6.r.e(dVar, "encoder");
        J6.r.e(bArr, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.v(getDescriptor(), i9, bArr[i9]);
        }
    }
}
