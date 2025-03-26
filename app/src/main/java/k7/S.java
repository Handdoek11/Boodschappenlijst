package k7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class S extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f38650a;

    /* renamed from: b, reason: collision with root package name */
    private int f38651b;

    public S(int[] iArr) {
        J6.r.e(iArr, "bufferWithData");
        this.f38650a = iArr;
        this.f38651b = iArr.length;
        b(10);
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        int[] iArr = this.f38650a;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, P6.m.c(i8, iArr.length * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38650a = copyOf;
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38651b;
    }

    public final void e(int i8) {
        AbstractC6157v0.c(this, 0, 1, null);
        int[] iArr = this.f38650a;
        int d8 = d();
        this.f38651b = d8 + 1;
        iArr[d8] = i8;
    }

    @Override // k7.AbstractC6157v0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f38650a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
