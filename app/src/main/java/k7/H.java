package k7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class H extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private float[] f38616a;

    /* renamed from: b, reason: collision with root package name */
    private int f38617b;

    public H(float[] fArr) {
        J6.r.e(fArr, "bufferWithData");
        this.f38616a = fArr;
        this.f38617b = fArr.length;
        b(10);
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        float[] fArr = this.f38616a;
        if (fArr.length < i8) {
            float[] copyOf = Arrays.copyOf(fArr, P6.m.c(i8, fArr.length * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38616a = copyOf;
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38617b;
    }

    public final void e(float f8) {
        AbstractC6157v0.c(this, 0, 1, null);
        float[] fArr = this.f38616a;
        int d8 = d();
        this.f38617b = d8 + 1;
        fArr[d8] = f8;
    }

    @Override // k7.AbstractC6157v0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f38616a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
