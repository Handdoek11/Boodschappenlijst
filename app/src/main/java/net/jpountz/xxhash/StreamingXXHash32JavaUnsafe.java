package net.jpountz.xxhash;

import net.jpountz.util.SafeUtils;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.xxhash.StreamingXXHash32;

/* loaded from: classes2.dex */
final class StreamingXXHash32JavaUnsafe extends AbstractStreamingXXHash32Java {

    static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        Factory() {
        }

        @Override // net.jpountz.xxhash.StreamingXXHash32.Factory
        public StreamingXXHash32 newStreamingHash(int i8) {
            return new StreamingXXHash32JavaUnsafe(i8);
        }
    }

    StreamingXXHash32JavaUnsafe(int i8) {
        super(i8);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public int getValue() {
        int rotateLeft = (int) ((this.totalLen >= 16 ? Integer.rotateLeft(this.f39800v1, 1) + Integer.rotateLeft(this.f39801v2, 7) + Integer.rotateLeft(this.f39802v3, 12) + Integer.rotateLeft(this.f39803v4, 18) : this.seed + 374761393) + this.totalLen);
        int i8 = 0;
        while (i8 <= this.memSize - 4) {
            rotateLeft = Integer.rotateLeft(rotateLeft + (UnsafeUtils.readIntLE(this.memory, i8) * (-1028477379)), 17) * 668265263;
            i8 += 4;
        }
        while (i8 < this.memSize) {
            rotateLeft = Integer.rotateLeft(rotateLeft + ((UnsafeUtils.readByte(this.memory, i8) & 255) * 374761393), 11) * (-1640531535);
            i8++;
        }
        int i9 = (rotateLeft ^ (rotateLeft >>> 15)) * (-2048144777);
        int i10 = (i9 ^ (i9 >>> 13)) * (-1028477379);
        return i10 ^ (i10 >>> 16);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public void update(byte[] bArr, int i8, int i9) {
        SafeUtils.checkRange(bArr, i8, i9);
        this.totalLen += i9;
        int i10 = this.memSize;
        if (i10 + i9 < 16) {
            System.arraycopy(bArr, i8, this.memory, i10, i9);
            this.memSize += i9;
            return;
        }
        int i11 = i9 + i8;
        if (i10 > 0) {
            System.arraycopy(bArr, i8, this.memory, i10, 16 - i10);
            int readIntLE = this.f39800v1 + (UnsafeUtils.readIntLE(this.memory, 0) * (-2048144777));
            this.f39800v1 = readIntLE;
            this.f39800v1 = Integer.rotateLeft(readIntLE, 13) * (-1640531535);
            int readIntLE2 = this.f39801v2 + (UnsafeUtils.readIntLE(this.memory, 4) * (-2048144777));
            this.f39801v2 = readIntLE2;
            this.f39801v2 = Integer.rotateLeft(readIntLE2, 13) * (-1640531535);
            int readIntLE3 = this.f39802v3 + (UnsafeUtils.readIntLE(this.memory, 8) * (-2048144777));
            this.f39802v3 = readIntLE3;
            this.f39802v3 = Integer.rotateLeft(readIntLE3, 13) * (-1640531535);
            int readIntLE4 = this.f39803v4 + (UnsafeUtils.readIntLE(this.memory, 12) * (-2048144777));
            this.f39803v4 = readIntLE4;
            this.f39803v4 = Integer.rotateLeft(readIntLE4, 13) * (-1640531535);
            i8 += 16 - this.memSize;
            this.memSize = 0;
        }
        int i12 = i11 - 16;
        int i13 = this.f39800v1;
        int i14 = this.f39801v2;
        int i15 = this.f39802v3;
        int i16 = this.f39803v4;
        while (i8 <= i12) {
            i13 = Integer.rotateLeft(i13 + (UnsafeUtils.readIntLE(bArr, i8) * (-2048144777)), 13) * (-1640531535);
            i14 = Integer.rotateLeft(i14 + (UnsafeUtils.readIntLE(bArr, i8 + 4) * (-2048144777)), 13) * (-1640531535);
            i15 = Integer.rotateLeft(i15 + (UnsafeUtils.readIntLE(bArr, i8 + 8) * (-2048144777)), 13) * (-1640531535);
            i16 = Integer.rotateLeft(i16 + (UnsafeUtils.readIntLE(bArr, i8 + 12) * (-2048144777)), 13) * (-1640531535);
            i8 += 16;
        }
        this.f39800v1 = i13;
        this.f39801v2 = i14;
        this.f39802v3 = i15;
        this.f39803v4 = i16;
        if (i8 < i11) {
            int i17 = i11 - i8;
            System.arraycopy(bArr, i8, this.memory, 0, i17);
            this.memSize = i17;
        }
    }
}
