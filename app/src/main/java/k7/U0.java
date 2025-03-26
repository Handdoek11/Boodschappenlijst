package k7;

import J6.AbstractC0650j;
import java.util.Arrays;
import x6.C6915D;

/* loaded from: classes2.dex */
public final class U0 extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f38658a;

    /* renamed from: b, reason: collision with root package name */
    private int f38659b;

    public /* synthetic */ U0(short[] sArr, AbstractC0650j abstractC0650j) {
        this(sArr);
    }

    @Override // k7.AbstractC6157v0
    public /* bridge */ /* synthetic */ Object a() {
        return C6915D.b(f());
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        if (C6915D.s(this.f38658a) < i8) {
            short[] sArr = this.f38658a;
            short[] copyOf = Arrays.copyOf(sArr, P6.m.c(i8, C6915D.s(sArr) * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38658a = C6915D.e(copyOf);
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38659b;
    }

    public final void e(short s8) {
        AbstractC6157v0.c(this, 0, 1, null);
        short[] sArr = this.f38658a;
        int d8 = d();
        this.f38659b = d8 + 1;
        C6915D.x(sArr, d8, s8);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.f38658a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return C6915D.e(copyOf);
    }

    private U0(short[] sArr) {
        this.f38658a = sArr;
        this.f38659b = C6915D.s(sArr);
        b(10);
    }
}
