package net.jpountz.xxhash;

import net.jpountz.util.SafeUtils;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.xxhash.StreamingXXHash64;

/* loaded from: classes2.dex */
final class StreamingXXHash64JavaUnsafe extends AbstractStreamingXXHash64Java {

    static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        Factory() {
        }

        @Override // net.jpountz.xxhash.StreamingXXHash64.Factory
        public StreamingXXHash64 newStreamingHash(long j8) {
            return new StreamingXXHash64JavaUnsafe(j8);
        }
    }

    StreamingXXHash64JavaUnsafe(long j8) {
        super(j8);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public long getValue() {
        long j8;
        int i8;
        if (this.totalLen >= 32) {
            long j9 = this.f39804v1;
            long j10 = this.f39805v2;
            long j11 = this.f39806v3;
            j8 = ((((((Long.rotateLeft(j11 * (-4417276706812531889L), 31) * (-7046029288634856825L)) ^ (((((((((Long.rotateLeft(j9, 1) + Long.rotateLeft(j10, 7)) + Long.rotateLeft(j11, 12)) + Long.rotateLeft(r4, 18)) ^ (Long.rotateLeft(j9 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(j10 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L)) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(this.f39807v4 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            j8 = this.seed + 2870177450012600261L;
        }
        long j12 = j8 + this.totalLen;
        int i9 = 0;
        while (true) {
            i8 = this.memSize;
            if (i9 > i8 - 8) {
                break;
            }
            j12 = (Long.rotateLeft(j12 ^ (Long.rotateLeft(UnsafeUtils.readLongLE(this.memory, i9) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i9 += 8;
        }
        if (i9 <= i8 - 4) {
            j12 = (Long.rotateLeft(j12 ^ ((UnsafeUtils.readIntLE(this.memory, i9) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i9 += 4;
        }
        while (i9 < this.memSize) {
            j12 = Long.rotateLeft(j12 ^ ((this.memory[i9] & 255) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i9++;
        }
        long j13 = (j12 ^ (j12 >>> 33)) * (-4417276706812531889L);
        long j14 = (j13 ^ (j13 >>> 29)) * 1609587929392839161L;
        return j14 ^ (j14 >>> 32);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public void update(byte[] bArr, int i8, int i9) {
        int i10 = i8;
        SafeUtils.checkRange(bArr, i8, i9);
        this.totalLen += i9;
        int i11 = this.memSize;
        if (i11 + i9 < 32) {
            System.arraycopy(bArr, i10, this.memory, i11, i9);
            this.memSize += i9;
            return;
        }
        int i12 = i9 + i10;
        int i13 = 31;
        if (i11 > 0) {
            System.arraycopy(bArr, i10, this.memory, i11, 32 - i11);
            long readLongLE = this.f39804v1 + (UnsafeUtils.readLongLE(this.memory, 0) * (-4417276706812531889L));
            this.f39804v1 = readLongLE;
            this.f39804v1 = Long.rotateLeft(readLongLE, 31) * (-7046029288634856825L);
            long readLongLE2 = this.f39805v2 + (UnsafeUtils.readLongLE(this.memory, 8) * (-4417276706812531889L));
            this.f39805v2 = readLongLE2;
            this.f39805v2 = Long.rotateLeft(readLongLE2, 31) * (-7046029288634856825L);
            long readLongLE3 = this.f39806v3 + (UnsafeUtils.readLongLE(this.memory, 16) * (-4417276706812531889L));
            this.f39806v3 = readLongLE3;
            this.f39806v3 = Long.rotateLeft(readLongLE3, 31) * (-7046029288634856825L);
            long readLongLE4 = this.f39807v4 + (UnsafeUtils.readLongLE(this.memory, 24) * (-4417276706812531889L));
            this.f39807v4 = readLongLE4;
            this.f39807v4 = Long.rotateLeft(readLongLE4, 31) * (-7046029288634856825L);
            i10 += 32 - this.memSize;
            this.memSize = 0;
        }
        int i14 = i12 - 32;
        long j8 = this.f39804v1;
        long j9 = this.f39805v2;
        long j10 = this.f39806v3;
        long j11 = this.f39807v4;
        while (i10 <= i14) {
            j8 = Long.rotateLeft(j8 + (UnsafeUtils.readLongLE(bArr, i10) * (-4417276706812531889L)), i13) * (-7046029288634856825L);
            j9 = Long.rotateLeft(j9 + (UnsafeUtils.readLongLE(bArr, i10 + 8) * (-4417276706812531889L)), 31) * (-7046029288634856825L);
            j10 = Long.rotateLeft(j10 + (UnsafeUtils.readLongLE(bArr, i10 + 16) * (-4417276706812531889L)), 31) * (-7046029288634856825L);
            i13 = 31;
            j11 = Long.rotateLeft(j11 + (UnsafeUtils.readLongLE(bArr, i10 + 24) * (-4417276706812531889L)), 31) * (-7046029288634856825L);
            i10 += 32;
        }
        this.f39804v1 = j8;
        this.f39805v2 = j9;
        this.f39806v3 = j10;
        this.f39807v4 = j11;
        if (i10 < i12) {
            int i15 = i12 - i10;
            System.arraycopy(bArr, i10, this.memory, 0, i15);
            this.memSize = i15;
        }
    }
}
