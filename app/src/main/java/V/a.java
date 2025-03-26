package V;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5488a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f5489b = new Object[0];

    public static final int a(int[] iArr, int i8, int i9) {
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i9) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i9) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }
}
