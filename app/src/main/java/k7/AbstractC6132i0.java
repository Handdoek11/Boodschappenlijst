package k7;

/* renamed from: k7.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6132i0 extends I0 {
    protected abstract String Y(String str, String str2);

    protected abstract String Z(i7.f fVar, int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.I0
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final String U(i7.f fVar, int i8) {
        J6.r.e(fVar, "<this>");
        return b0(Z(fVar, i8));
    }

    protected final String b0(String str) {
        J6.r.e(str, "nestedName");
        String str2 = (String) T();
        if (str2 == null) {
            str2 = "";
        }
        return Y(str2, str);
    }
}
