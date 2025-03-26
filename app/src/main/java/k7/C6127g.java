package k7;

import java.util.Arrays;

/* renamed from: k7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6127g extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean[] f38682a;

    /* renamed from: b, reason: collision with root package name */
    private int f38683b;

    public C6127g(boolean[] zArr) {
        J6.r.e(zArr, "bufferWithData");
        this.f38682a = zArr;
        this.f38683b = zArr.length;
        b(10);
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        boolean[] zArr = this.f38682a;
        if (zArr.length < i8) {
            boolean[] copyOf = Arrays.copyOf(zArr, P6.m.c(i8, zArr.length * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38682a = copyOf;
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38683b;
    }

    public final void e(boolean z7) {
        AbstractC6157v0.c(this, 0, 1, null);
        boolean[] zArr = this.f38682a;
        int d8 = d();
        this.f38683b = d8 + 1;
        zArr[d8] = z7;
    }

    @Override // k7.AbstractC6157v0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f38682a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
