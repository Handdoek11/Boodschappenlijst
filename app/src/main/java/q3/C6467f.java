package q3;

import java.io.OutputStream;

/* renamed from: q3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6467f extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    private long f41658o = 0;

    C6467f() {
    }

    final long d() {
        return this.f41658o;
    }

    @Override // java.io.OutputStream
    public final void write(int i8) {
        this.f41658o++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f41658o += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i8, int i9) {
        int length;
        int i10;
        if (i8 >= 0 && i8 <= (length = bArr.length) && i9 >= 0 && (i10 = i8 + i9) <= length && i10 >= 0) {
            this.f41658o += i9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
