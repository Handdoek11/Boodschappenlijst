package net.jpountz.xxhash;

import java.io.Closeable;
import java.util.zip.Checksum;

/* loaded from: classes2.dex */
public abstract class StreamingXXHash32 implements Closeable {
    final int seed;

    interface Factory {
        StreamingXXHash32 newStreamingHash(int i8);
    }

    StreamingXXHash32(int i8) {
        this.seed = i8;
    }

    public final Checksum asChecksum() {
        return new Checksum() { // from class: net.jpountz.xxhash.StreamingXXHash32.1
            @Override // java.util.zip.Checksum
            public long getValue() {
                return StreamingXXHash32.this.getValue() & 268435455;
            }

            @Override // java.util.zip.Checksum
            public void reset() {
                StreamingXXHash32.this.reset();
            }

            public String toString() {
                return StreamingXXHash32.this.toString();
            }

            @Override // java.util.zip.Checksum
            public void update(int i8) {
                StreamingXXHash32.this.update(new byte[]{(byte) i8}, 0, 1);
            }

            @Override // java.util.zip.Checksum
            public void update(byte[] bArr, int i8, int i9) {
                StreamingXXHash32.this.update(bArr, i8, i9);
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract int getValue();

    public abstract void reset();

    public String toString() {
        return getClass().getSimpleName() + "(seed=" + this.seed + ")";
    }

    public abstract void update(byte[] bArr, int i8, int i9);
}
