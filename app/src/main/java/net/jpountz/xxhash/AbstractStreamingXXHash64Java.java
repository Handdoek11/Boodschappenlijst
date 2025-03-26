package net.jpountz.xxhash;

/* loaded from: classes2.dex */
abstract class AbstractStreamingXXHash64Java extends StreamingXXHash64 {
    int memSize;
    final byte[] memory;
    long totalLen;

    /* renamed from: v1, reason: collision with root package name */
    long f39804v1;

    /* renamed from: v2, reason: collision with root package name */
    long f39805v2;

    /* renamed from: v3, reason: collision with root package name */
    long f39806v3;

    /* renamed from: v4, reason: collision with root package name */
    long f39807v4;

    AbstractStreamingXXHash64Java(long j8) {
        super(j8);
        this.memory = new byte[32];
        reset();
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public void reset() {
        long j8 = this.seed;
        this.f39804v1 = 6983438078262162902L + j8;
        this.f39805v2 = (-4417276706812531889L) + j8;
        this.f39806v3 = j8;
        this.f39807v4 = j8 - (-7046029288634856825L);
        this.totalLen = 0L;
        this.memSize = 0;
    }
}
