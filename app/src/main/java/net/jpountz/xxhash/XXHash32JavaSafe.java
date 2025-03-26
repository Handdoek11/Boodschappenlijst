package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes2.dex */
final class XXHash32JavaSafe extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JavaSafe();

    XXHash32JavaSafe() {
    }

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(byte[] bArr, int i8, int i9, int i10) {
        int i11;
        SafeUtils.checkRange(bArr, i8, i9);
        int i12 = i8 + i9;
        if (i9 >= 16) {
            int i13 = i12 - 16;
            int i14 = 606290984 + i10;
            int i15 = i10 - 2048144777;
            int i16 = i10 - (-1640531535);
            do {
                i14 = Integer.rotateLeft(i14 + (SafeUtils.readIntLE(bArr, i8) * (-2048144777)), 13) * (-1640531535);
                i15 = Integer.rotateLeft(i15 + (SafeUtils.readIntLE(bArr, i8 + 4) * (-2048144777)), 13) * (-1640531535);
                i10 = Integer.rotateLeft(i10 + (SafeUtils.readIntLE(bArr, i8 + 8) * (-2048144777)), 13) * (-1640531535);
                i16 = Integer.rotateLeft(i16 + (SafeUtils.readIntLE(bArr, i8 + 12) * (-2048144777)), 13) * (-1640531535);
                i8 += 16;
            } while (i8 <= i13);
            i11 = Integer.rotateLeft(i14, 1) + Integer.rotateLeft(i15, 7) + Integer.rotateLeft(i10, 12) + Integer.rotateLeft(i16, 18);
        } else {
            i11 = i10 + 374761393;
        }
        int i17 = i11 + i9;
        while (i8 <= i12 - 4) {
            i17 = Integer.rotateLeft(i17 + (SafeUtils.readIntLE(bArr, i8) * (-1028477379)), 17) * 668265263;
            i8 += 4;
        }
        while (i8 < i12) {
            i17 = Integer.rotateLeft(i17 + ((SafeUtils.readByte(bArr, i8) & 255) * 374761393), 11) * (-1640531535);
            i8++;
        }
        int i18 = ((i17 >>> 15) ^ i17) * (-2048144777);
        int i19 = (i18 ^ (i18 >>> 13)) * (-1028477379);
        return i19 ^ (i19 >>> 16);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(ByteBuffer byteBuffer, int i8, int i9, int i10) {
        int i11;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i8 + byteBuffer.arrayOffset(), i9, i10);
        }
        ByteBufferUtils.checkRange(byteBuffer, i8, i9);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i12 = i8 + i9;
        if (i9 >= 16) {
            int i13 = i12 - 16;
            int i14 = 606290984 + i10;
            int i15 = i10 - 2048144777;
            int i16 = i10 - (-1640531535);
            do {
                i14 = Integer.rotateLeft(i14 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i8) * (-2048144777)), 13) * (-1640531535);
                i15 = Integer.rotateLeft(i15 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i8 + 4) * (-2048144777)), 13) * (-1640531535);
                i10 = Integer.rotateLeft(i10 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i8 + 8) * (-2048144777)), 13) * (-1640531535);
                i16 = Integer.rotateLeft(i16 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i8 + 12) * (-2048144777)), 13) * (-1640531535);
                i8 += 16;
            } while (i8 <= i13);
            i11 = Integer.rotateLeft(i14, 1) + Integer.rotateLeft(i15, 7) + Integer.rotateLeft(i10, 12) + Integer.rotateLeft(i16, 18);
        } else {
            i11 = i10 + 374761393;
        }
        int i17 = i11 + i9;
        while (i8 <= i12 - 4) {
            i17 = Integer.rotateLeft(i17 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i8) * (-1028477379)), 17) * 668265263;
            i8 += 4;
        }
        while (i8 < i12) {
            i17 = Integer.rotateLeft(i17 + ((ByteBufferUtils.readByte(inLittleEndianOrder, i8) & 255) * 374761393), 11) * (-1640531535);
            i8++;
        }
        int i18 = ((i17 >>> 15) ^ i17) * (-2048144777);
        int i19 = (i18 ^ (i18 >>> 13)) * (-1028477379);
        return i19 ^ (i19 >>> 16);
    }
}
