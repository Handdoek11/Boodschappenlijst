package k7;

import java.util.Arrays;

/* renamed from: k7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6133j extends AbstractC6157v0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f38693a;

    /* renamed from: b, reason: collision with root package name */
    private int f38694b;

    public C6133j(byte[] bArr) {
        J6.r.e(bArr, "bufferWithData");
        this.f38693a = bArr;
        this.f38694b = bArr.length;
        b(10);
    }

    @Override // k7.AbstractC6157v0
    public void b(int i8) {
        byte[] bArr = this.f38693a;
        if (bArr.length < i8) {
            byte[] copyOf = Arrays.copyOf(bArr, P6.m.c(i8, bArr.length * 2));
            J6.r.d(copyOf, "copyOf(this, newSize)");
            this.f38693a = copyOf;
        }
    }

    @Override // k7.AbstractC6157v0
    public int d() {
        return this.f38694b;
    }

    public final void e(byte b8) {
        AbstractC6157v0.c(this, 0, 1, null);
        byte[] bArr = this.f38693a;
        int d8 = d();
        this.f38694b = d8 + 1;
        bArr[d8] = b8;
    }

    @Override // k7.AbstractC6157v0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f38693a, d());
        J6.r.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
