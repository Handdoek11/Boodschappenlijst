package d2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5699a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f35203a = new AtomicReference();

    /* renamed from: d2.a$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f35206a;

        /* renamed from: b, reason: collision with root package name */
        final int f35207b;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f35208c;

        b(byte[] bArr, int i8, int i9) {
            this.f35208c = bArr;
            this.f35206a = i8;
            this.f35207b = i9;
        }
    }

    public static ByteBuffer a(File file) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return load;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f35203a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                f35203a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private static b c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static byte[] e(ByteBuffer byteBuffer) {
        b c8 = c(byteBuffer);
        if (c8 != null && c8.f35206a == 0 && c8.f35207b == c8.f35208c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        d(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
            fileChannel.write(byteBuffer);
            fileChannel.force(false);
            fileChannel.close();
            randomAccessFile.close();
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    public static InputStream g(ByteBuffer byteBuffer) {
        return new C0248a(byteBuffer);
    }

    /* renamed from: d2.a$a, reason: collision with other inner class name */
    private static class C0248a extends InputStream {

        /* renamed from: o, reason: collision with root package name */
        private final ByteBuffer f35204o;

        /* renamed from: s, reason: collision with root package name */
        private int f35205s = -1;

        C0248a(ByteBuffer byteBuffer) {
            this.f35204o = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f35204o.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i8) {
            this.f35205s = this.f35204o.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f35204o.hasRemaining()) {
                return this.f35204o.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i8 = this.f35205s;
            if (i8 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f35204o.position(i8);
        }

        @Override // java.io.InputStream
        public long skip(long j8) {
            if (!this.f35204o.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j8, available());
            this.f35204o.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            if (!this.f35204o.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i9, available());
            this.f35204o.get(bArr, i8, min);
            return min;
        }
    }
}
