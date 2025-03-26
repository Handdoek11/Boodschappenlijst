package net.jpountz.xxhash;

/* loaded from: classes2.dex */
abstract class AbstractStreamingXXHash32Java extends StreamingXXHash32 {
    int memSize;
    final byte[] memory;
    long totalLen;

    /* renamed from: v1, reason: collision with root package name */
    int f39800v1;

    /* renamed from: v2, reason: collision with root package name */
    int f39801v2;

    /* renamed from: v3, reason: collision with root package name */
    int f39802v3;

    /* renamed from: v4, reason: collision with root package name */
    int f39803v4;

    AbstractStreamingXXHash32Java(int i8) {
        super(i8);
        this.memory = new byte[16];
        reset();
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public void reset() {
        int i8 = this.seed;
        this.f39800v1 = 606290984 + i8;
        this.f39801v2 = (-2048144777) + i8;
        this.f39802v3 = i8;
        this.f39803v4 = i8 - (-1640531535);
        this.totalLen = 0L;
        this.memSize = 0;
    }
}
