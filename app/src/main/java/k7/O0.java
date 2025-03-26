package k7;

import J6.AbstractC0650j;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class O0 extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f38641a;

    /* renamed from: b, reason: collision with root package name */
    private int f38642b;

    public /* synthetic */ O0(int[] iArr, AbstractC0650j abstractC0650j) {
        this(iArr);
    }

    @Override // k7.AbstractC6157v0
    public /* bridge */ /* synthetic */ Object a() {
        return x6.y.b(f());
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        if (x6.y.s(this.f38641a) < i8) {
            int[] iArr = this.f38641a;
            int[] copyOf = Arrays.copyOf(iArr, P6.m.c(i8, x6.y.s(iArr) * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38641a = x6.y.e(copyOf);
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38642b;
    }

    public final void e(int i8) {
        AbstractC6157v0.c(this, 0, 1, null);
        int[] iArr = this.f38641a;
        int d8 = d();
        this.f38642b = d8 + 1;
        x6.y.x(iArr, d8, i8);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f38641a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return x6.y.e(copyOf);
    }

    private O0(int[] iArr) {
        this.f38641a = iArr;
        this.f38642b = x6.y.s(iArr);
        b(10);
    }
}
