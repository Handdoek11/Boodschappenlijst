package T6;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f5301a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f5302b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i8 = 0; i8 < 4; i8++) {
            threadLocalArr[i8] = new ThreadLocal();
        }
        f5302b = threadLocalArr;
    }

    public static final boolean a() {
        return f5301a;
    }
}
