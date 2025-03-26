package net.jpountz.xxhash;

import net.jpountz.xxhash.StreamingXXHash64;

/* loaded from: classes2.dex */
final class StreamingXXHash64JNI extends StreamingXXHash64 {
    private long state;

    static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        Factory() {
        }

        @Override // net.jpountz.xxhash.StreamingXXHash64.Factory
        public StreamingXXHash64 newStreamingHash(long j8) {
            return new StreamingXXHash64JNI(j8);
        }
    }

    StreamingXXHash64JNI(long j8) {
        super(j8);
        this.state = XXHashJNI.XXH64_init(j8);
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.state != 0) {
            super.close();
            XXHashJNI.XXH64_free(this.state);
            this.state = 0L;
        }
    }

    protected synchronized void finalize() {
        super.finalize();
        long j8 = this.state;
        if (j8 != 0) {
            XXHashJNI.XXH64_free(j8);
            this.state = 0L;
        }
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public synchronized long getValue() {
        checkState();
        return XXHashJNI.XXH64_digest(this.state);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public synchronized void reset() {
        checkState();
        XXHashJNI.XXH64_free(this.state);
        this.state = XXHashJNI.XXH64_init(this.seed);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public synchronized void update(byte[] bArr, int i8, int i9) {
        checkState();
        XXHashJNI.XXH64_update(this.state, bArr, i8, i9);
    }
}
