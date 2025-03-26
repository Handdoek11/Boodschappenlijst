package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes2.dex */
final class XXHash64JavaSafe extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JavaSafe();

    XXHash64JavaSafe() {
    }

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(byte[] bArr, int i8, int i9, long j8) {
        int i10;
        int i11;
        long j9;
        long rotateLeft;
        long rotateLeft2;
        long rotateLeft3;
        long rotateLeft4;
        long j10;
        SafeUtils.checkRange(bArr, i8, i9);
        int i12 = i8 + i9;
        long j11 = -4417276706812531889L;
        long j12 = -7046029288634856825L;
        if (i9 >= 32) {
            int i13 = i12 - 32;
            long j13 = j8 - (-7046029288634856825L);
            long j14 = j8 - 4417276706812531889L;
            long j15 = j8 + 6983438078262162902L;
            i11 = i8;
            long j16 = j8;
            while (true) {
                rotateLeft = Long.rotateLeft(j15 + (SafeUtils.readLongLE(bArr, i11) * j11), 31) * j12;
                i10 = i12;
                rotateLeft2 = Long.rotateLeft(j14 + (SafeUtils.readLongLE(bArr, i11 + 8) * j11), 31) * j12;
                rotateLeft3 = Long.rotateLeft((SafeUtils.readLongLE(bArr, i11 + 16) * (-4417276706812531889L)) + j16, 31) * (-7046029288634856825L);
                rotateLeft4 = Long.rotateLeft(j13 + (SafeUtils.readLongLE(bArr, i11 + 24) * (-4417276706812531889L)), 31);
                j10 = rotateLeft4 * (-7046029288634856825L);
                i11 += 32;
                if (i11 > i13) {
                    break;
                }
                j14 = rotateLeft2;
                j13 = j10;
                j15 = rotateLeft;
                j16 = rotateLeft3;
                i12 = i10;
                j11 = -4417276706812531889L;
                j12 = -7046029288634856825L;
            }
            j9 = (((Long.rotateLeft(rotateLeft4 * (-2381459717836149591L), 31) * (-7046029288634856825L)) ^ ((((((((((Long.rotateLeft(r3 * (-2381459717836149591L), 31) * (-7046029288634856825L)) ^ (((Long.rotateLeft(rotateLeft, 1) + Long.rotateLeft(rotateLeft2, 7)) + Long.rotateLeft(rotateLeft3, 12)) + Long.rotateLeft(j10, 18))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(r7 * (-2381459717836149591L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(r10 * (-2381459717836149591L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L)) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            i10 = i12;
            i11 = i8;
            j9 = j8 + 2870177450012600261L;
        }
        long j17 = j9 + i9;
        while (i11 <= i10 - 8) {
            j17 = (Long.rotateLeft(j17 ^ (Long.rotateLeft(SafeUtils.readLongLE(bArr, i11) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i11 += 8;
        }
        if (i11 <= i10 - 4) {
            j17 = (Long.rotateLeft(j17 ^ ((SafeUtils.readIntLE(bArr, i11) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i11 += 4;
        }
        int i14 = i10;
        while (i11 < i14) {
            j17 = Long.rotateLeft(j17 ^ ((SafeUtils.readByte(bArr, i11) & 255) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i11++;
        }
        long j18 = (j17 ^ (j17 >>> 33)) * (-4417276706812531889L);
        long j19 = (j18 ^ (j18 >>> 29)) * 1609587929392839161L;
        return j19 ^ (j19 >>> 32);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(ByteBuffer byteBuffer, int i8, int i9, long j8) {
        int i10;
        int i11;
        long j9;
        long rotateLeft;
        long rotateLeft2;
        long j10;
        long rotateLeft3;
        long rotateLeft4;
        long j11;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i8 + byteBuffer.arrayOffset(), i9, j8);
        }
        ByteBufferUtils.checkRange(byteBuffer, i8, i9);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i12 = i8 + i9;
        long j12 = -4417276706812531889L;
        long j13 = -7046029288634856825L;
        if (i9 >= 32) {
            int i13 = i12 - 32;
            long j14 = j8 - (-7046029288634856825L);
            long j15 = j8 - 4417276706812531889L;
            long j16 = j8 + 6983438078262162902L;
            i11 = i8;
            long j17 = j8;
            while (true) {
                rotateLeft = Long.rotateLeft(j16 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i11) * j12), 31) * j13;
                rotateLeft2 = Long.rotateLeft(j15 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i11 + 8) * j12), 31);
                i10 = i12;
                j10 = rotateLeft2 * j13;
                rotateLeft3 = Long.rotateLeft((ByteBufferUtils.readLongLE(inLittleEndianOrder, i11 + 16) * (-4417276706812531889L)) + j17, 31) * (-7046029288634856825L);
                rotateLeft4 = Long.rotateLeft(j14 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i11 + 24) * (-4417276706812531889L)), 31);
                j11 = rotateLeft4 * (-7046029288634856825L);
                i11 += 32;
                if (i11 > i13) {
                    break;
                }
                j14 = j11;
                j16 = rotateLeft;
                j17 = rotateLeft3;
                j12 = -4417276706812531889L;
                j13 = -7046029288634856825L;
                i12 = i10;
                j15 = j10;
            }
            j9 = (((Long.rotateLeft(rotateLeft4 * (-2381459717836149591L), 31) * (-7046029288634856825L)) ^ ((((((((((Long.rotateLeft(r4 * (-2381459717836149591L), 31) * (-7046029288634856825L)) ^ (((Long.rotateLeft(rotateLeft, 1) + Long.rotateLeft(j10, 7)) + Long.rotateLeft(rotateLeft3, 12)) + Long.rotateLeft(j11, 18))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(rotateLeft2 * (-2381459717836149591L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(r11 * (-2381459717836149591L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L)) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            i10 = i12;
            i11 = i8;
            j9 = j8 + 2870177450012600261L;
        }
        long j18 = j9 + i9;
        while (i11 <= i10 - 8) {
            j18 = (Long.rotateLeft(j18 ^ (Long.rotateLeft(ByteBufferUtils.readLongLE(inLittleEndianOrder, i11) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i11 += 8;
        }
        if (i11 <= i10 - 4) {
            j18 = (Long.rotateLeft(j18 ^ ((ByteBufferUtils.readIntLE(inLittleEndianOrder, i11) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i11 += 4;
        }
        int i14 = i10;
        while (i11 < i14) {
            j18 = Long.rotateLeft(j18 ^ ((ByteBufferUtils.readByte(inLittleEndianOrder, i11) & 255) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i11++;
        }
        long j19 = (j18 ^ (j18 >>> 33)) * (-4417276706812531889L);
        long j20 = (j19 ^ (j19 >>> 29)) * 1609587929392839161L;
        return j20 ^ (j20 >>> 32);
    }
}
