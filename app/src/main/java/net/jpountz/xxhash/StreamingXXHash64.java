package net.jpountz.xxhash;

import java.io.Closeable;
import java.util.zip.Checksum;

/* loaded from: classes2.dex */
public abstract class StreamingXXHash64 implements Closeable {
    final long seed;

    interface Factory {
        StreamingXXHash64 newStreamingHash(long j8);
    }

    StreamingXXHash64(long j8) {
        this.seed = j8;
    }

    public final Checksum asChecksum() {
        return new Checksum() { // from class: net.jpountz.xxhash.StreamingXXHash64.1
            @Override // java.util.zip.Checksum
            public long getValue() {
                return StreamingXXHash64.this.getValue();
            }

            @Override // java.util.zip.Checksum
            public void reset() {
                StreamingXXHash64.this.reset();
            }

            public String toString() {
                return StreamingXXHash64.this.toString();
            }

            @Override // java.util.zip.Checksum
            public void update(int i8) {
                StreamingXXHash64.this.update(new byte[]{(byte) i8}, 0, 1);
            }

            @Override // java.util.zip.Checksum
            public void update(byte[] bArr, int i8, int i9) {
                StreamingXXHash64.this.update(bArr, i8, i9);
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract long getValue();

    public abstract void reset();

    public String toString() {
        return getClass().getSimpleName() + "(seed=" + this.seed + ")";
    }

    public abstract void update(byte[] bArr, int i8, int i9);
}
