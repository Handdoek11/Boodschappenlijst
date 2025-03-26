package d2;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: d2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5707i extends FilterInputStream {

    /* renamed from: o, reason: collision with root package name */
    private int f35226o;

    public C5707i(InputStream inputStream) {
        super(inputStream);
        this.f35226o = Integer.MIN_VALUE;
    }

    private long d(long j8) {
        int i8 = this.f35226o;
        if (i8 == 0) {
            return -1L;
        }
        return (i8 == Integer.MIN_VALUE || j8 <= ((long) i8)) ? j8 : i8;
    }

    private void e(long j8) {
        int i8 = this.f35226o;
        if (i8 == Integer.MIN_VALUE || j8 == -1) {
            return;
        }
        this.f35226o = (int) (i8 - j8);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i8 = this.f35226o;
        return i8 == Integer.MIN_VALUE ? super.available() : Math.min(i8, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i8) {
        super.mark(i8);
        this.f35226o = i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (d(1L) == -1) {
            return -1;
        }
        int read = super.read();
        e(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f35226o = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) {
        long d8 = d(j8);
        if (d8 == -1) {
            return 0L;
        }
        long skip = super.skip(d8);
        e(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        int d8 = (int) d(i9);
        if (d8 == -1) {
            return -1;
        }
        int read = super.read(bArr, i8, d8);
        e(read);
        return read;
    }
}
