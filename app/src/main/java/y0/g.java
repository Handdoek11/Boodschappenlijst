package y0;

import J6.r;

/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f44527a;

    /* renamed from: b, reason: collision with root package name */
    private int f44528b;

    public g(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f44527a = new Object[i8];
    }

    private final boolean c(Object obj) {
        int i8 = this.f44528b;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f44527a[i9] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // y0.f
    public boolean a(Object obj) {
        r.e(obj, "instance");
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i8 = this.f44528b;
        Object[] objArr = this.f44527a;
        if (i8 >= objArr.length) {
            return false;
        }
        objArr[i8] = obj;
        this.f44528b = i8 + 1;
        return true;
    }

    @Override // y0.f
    public Object b() {
        int i8 = this.f44528b;
        if (i8 <= 0) {
            return null;
        }
        int i9 = i8 - 1;
        Object obj = this.f44527a[i9];
        r.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f44527a[i9] = null;
        this.f44528b--;
        return obj;
    }
}
