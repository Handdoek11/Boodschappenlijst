package d2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5702d extends InputStream {

    /* renamed from: t, reason: collision with root package name */
    private static final Queue f35212t = AbstractC5710l.f(0);

    /* renamed from: o, reason: collision with root package name */
    private InputStream f35213o;

    /* renamed from: s, reason: collision with root package name */
    private IOException f35214s;

    C5702d() {
    }

    public static C5702d e(InputStream inputStream) {
        C5702d c5702d;
        Queue queue = f35212t;
        synchronized (queue) {
            c5702d = (C5702d) queue.poll();
        }
        if (c5702d == null) {
            c5702d = new C5702d();
        }
        c5702d.g(inputStream);
        return c5702d;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f35213o.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35213o.close();
    }

    public IOException d() {
        return this.f35214s;
    }

    public void f() {
        this.f35214s = null;
        this.f35213o = null;
        Queue queue = f35212t;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void g(InputStream inputStream) {
        this.f35213o = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i8) {
        this.f35213o.mark(i8);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f35213o.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f35213o.read();
        } catch (IOException e8) {
            this.f35214s = e8;
            throw e8;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f35213o.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j8) {
        try {
            return this.f35213o.skip(j8);
        } catch (IOException e8) {
            this.f35214s = e8;
            throw e8;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f35213o.read(bArr);
        } catch (IOException e8) {
            this.f35214s = e8;
            throw e8;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        try {
            return this.f35213o.read(bArr, i8, i9);
        } catch (IOException e8) {
            this.f35214s = e8;
            throw e8;
        }
    }
}
