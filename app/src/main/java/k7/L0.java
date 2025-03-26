package k7;

import J6.AbstractC0650j;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class L0 extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f38634a;

    /* renamed from: b, reason: collision with root package name */
    private int f38635b;

    public /* synthetic */ L0(byte[] bArr, AbstractC0650j abstractC0650j) {
        this(bArr);
    }

    @Override // k7.AbstractC6157v0
    public /* bridge */ /* synthetic */ Object a() {
        return x6.w.b(f());
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        if (x6.w.s(this.f38634a) < i8) {
            byte[] bArr = this.f38634a;
            byte[] copyOf = Arrays.copyOf(bArr, P6.m.c(i8, x6.w.s(bArr) * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38634a = x6.w.e(copyOf);
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38635b;
    }

    public final void e(byte b8) {
        AbstractC6157v0.c(this, 0, 1, null);
        byte[] bArr = this.f38634a;
        int d8 = d();
        this.f38635b = d8 + 1;
        x6.w.x(bArr, d8, b8);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f38634a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return x6.w.e(copyOf);
    }

    private L0(byte[] bArr) {
        this.f38634a = bArr;
        this.f38635b = x6.w.s(bArr);
        b(10);
    }
}
