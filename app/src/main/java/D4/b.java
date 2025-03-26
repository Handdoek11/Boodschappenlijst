package D4;

import java.io.OutputStream;

/* loaded from: classes2.dex */
final class b extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    private long f2072o = 0;

    b() {
    }

    long d() {
        return this.f2072o;
    }

    @Override // java.io.OutputStream
    public void write(int i8) {
        this.f2072o++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f2072o += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        int i10;
        if (i8 >= 0 && i8 <= bArr.length && i9 >= 0 && (i10 = i8 + i9) <= bArr.length && i10 >= 0) {
            this.f2072o += i9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
