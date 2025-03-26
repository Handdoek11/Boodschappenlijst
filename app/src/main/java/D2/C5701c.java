package d2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5701c extends FilterInputStream {

    /* renamed from: o, reason: collision with root package name */
    private final long f35210o;

    /* renamed from: s, reason: collision with root package name */
    private int f35211s;

    private C5701c(InputStream inputStream, long j8) {
        super(inputStream);
        this.f35210o = j8;
    }

    private int d(int i8) {
        if (i8 >= 0) {
            this.f35211s += i8;
        } else if (this.f35210o - this.f35211s > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f35210o + ", but read: " + this.f35211s);
        }
        return i8;
    }

    public static InputStream e(InputStream inputStream, long j8) {
        return new C5701c(inputStream, j8);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f35210o - this.f35211s, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        d(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i8, int i9) {
        return d(super.read(bArr, i8, i9));
    }
}
