package k7;

/* renamed from: k7.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6157v0 {
    public static /* synthetic */ void c(AbstractC6157v0 abstractC6157v0, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i9 & 1) != 0) {
            i8 = abstractC6157v0.d() + 1;
        }
        abstractC6157v0.b(i8);
    }

    public abstract Object a();

    public abstract void b(int i8);

    public abstract int d();
}
