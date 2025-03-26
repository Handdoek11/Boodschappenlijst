package net.jpountz.xxhash;

import net.jpountz.xxhash.StreamingXXHash32;

/* loaded from: classes2.dex */
final class StreamingXXHash32JNI extends StreamingXXHash32 {
    private long state;

    static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        Factory() {
        }

        @Override // net.jpountz.xxhash.StreamingXXHash32.Factory
        public StreamingXXHash32 newStreamingHash(int i8) {
            return new StreamingXXHash32JNI(i8);
        }
    }

    StreamingXXHash32JNI(int i8) {
        super(i8);
        this.state = XXHashJNI.XXH32_init(i8);
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.state != 0) {
            super.close();
            XXHashJNI.XXH32_free(this.state);
            this.state = 0L;
        }
    }

    protected synchronized void finalize() {
        super.finalize();
        long j8 = this.state;
        if (j8 != 0) {
            XXHashJNI.XXH32_free(j8);
            this.state = 0L;
        }
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public synchronized int getValue() {
        checkState();
        return XXHashJNI.XXH32_digest(this.state);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public synchronized void reset() {
        checkState();
        XXHashJNI.XXH32_free(this.state);
        this.state = XXHashJNI.XXH32_init(this.seed);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public synchronized void update(byte[] bArr, int i8, int i9) {
        checkState();
        XXHashJNI.XXH32_update(this.state, bArr, i8, i9);
    }
}
