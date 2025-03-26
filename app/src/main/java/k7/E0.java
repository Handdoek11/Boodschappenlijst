package k7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class E0 extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f38601a;

    /* renamed from: b, reason: collision with root package name */
    private int f38602b;

    public E0(short[] sArr) {
        J6.r.e(sArr, "bufferWithData");
        this.f38601a = sArr;
        this.f38602b = sArr.length;
        b(10);
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        short[] sArr = this.f38601a;
        if (sArr.length < i8) {
            short[] copyOf = Arrays.copyOf(sArr, P6.m.c(i8, sArr.length * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38601a = copyOf;
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38602b;
    }

    public final void e(short s8) {
        AbstractC6157v0.c(this, 0, 1, null);
        short[] sArr = this.f38601a;
        int d8 = d();
        this.f38602b = d8 + 1;
        sArr[d8] = s8;
    }

    @Override // k7.AbstractC6157v0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f38601a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
