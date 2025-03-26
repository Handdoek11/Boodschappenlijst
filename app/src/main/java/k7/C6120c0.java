package k7;

import java.util.Arrays;

/* renamed from: k7.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6120c0 extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f38671a;

    /* renamed from: b, reason: collision with root package name */
    private int f38672b;

    public C6120c0(long[] jArr) {
        J6.r.e(jArr, "bufferWithData");
        this.f38671a = jArr;
        this.f38672b = jArr.length;
        b(10);
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        long[] jArr = this.f38671a;
        if (jArr.length < i8) {
            long[] copyOf = Arrays.copyOf(jArr, P6.m.c(i8, jArr.length * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38671a = copyOf;
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38672b;
    }

    public final void e(long j8) {
        AbstractC6157v0.c(this, 0, 1, null);
        long[] jArr = this.f38671a;
        int d8 = d();
        this.f38672b = d8 + 1;
        jArr[d8] = j8;
    }

    @Override // k7.AbstractC6157v0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f38671a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
