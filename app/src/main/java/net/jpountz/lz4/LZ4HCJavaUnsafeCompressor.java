package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.lz4.LZ4Utils;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

/* loaded from: classes2.dex */
final class LZ4HCJavaUnsafeCompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaUnsafeCompressor();
    final int compressionLevel;
    private final int maxAttempts;

    LZ4HCJavaUnsafeCompressor() {
        this(9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ff, code lost:
    
        r3 = r16;
        r16 = r9;
        r6 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r22, r3, r9.start, r9.ref, r9.len, r25, r17, r10);
        r3 = r16.end();
        r8 = r0;
        r2 = r3;
        r7 = r11;
        r9 = r16;
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compress(byte[] r22, int r23, int r24, byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaUnsafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    private class HashTable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final int MASK = 65535;
        private final int base;
        private final short[] chainTable;
        private final int[] hashTable;
        int nextToUpdate;

        HashTable(int i8) {
            this.base = i8;
            this.nextToUpdate = i8;
            int[] iArr = new int[32768];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
            this.chainTable = new short[65536];
        }

        private void addHash(byte[] bArr, int i8) {
            addHash(UnsafeUtils.readInt(bArr, i8), i8);
        }

        private int hashPointer(byte[] bArr, int i8) {
            return hashPointer(UnsafeUtils.readInt(bArr, i8));
        }

        private int next(int i8) {
            return i8 - (this.chainTable[i8 & MASK] & MASK);
        }

        void insert(int i8, byte[] bArr) {
            while (true) {
                int i9 = this.nextToUpdate;
                if (i9 >= i8) {
                    return;
                }
                addHash(bArr, i9);
                this.nextToUpdate++;
            }
        }

        boolean insertAndFindBestMatch(byte[] bArr, int i8, int i9, LZ4Utils.Match match) {
            int i10;
            int i11;
            int commonBytes;
            match.start = i8;
            match.len = 0;
            insert(i8, bArr);
            int hashPointer = hashPointer(bArr, i8);
            if (hashPointer < i8 - 4 || hashPointer > i8 || hashPointer < this.base) {
                i10 = 0;
                i11 = 0;
            } else {
                if (LZ4UnsafeUtils.readIntEquals(bArr, hashPointer, i8)) {
                    i10 = i8 - hashPointer;
                    i11 = LZ4UnsafeUtils.commonBytes(bArr, hashPointer + 4, i8 + 4, i9) + 4;
                    match.len = i11;
                    match.ref = hashPointer;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i12 = 0; i12 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, i8 - MASK) && hashPointer <= i8; i12++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, hashPointer, i8) && (commonBytes = LZ4UnsafeUtils.commonBytes(bArr, hashPointer + 4, i8 + 4, i9) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i11 != 0) {
                int i13 = (i11 + i8) - 3;
                while (i8 < i13 - i10) {
                    this.chainTable[i8 & MASK] = (short) i10;
                    i8++;
                }
                do {
                    this.chainTable[i8 & MASK] = (short) i10;
                    this.hashTable[LZ4Utils.hashHC(UnsafeUtils.readInt(bArr, i8))] = i8;
                    i8++;
                } while (i8 < i13);
                this.nextToUpdate = i13;
            }
            if (match.len != 0) {
                return true;
            }
            return $assertionsDisabled;
        }

        boolean insertAndFindWiderMatch(byte[] bArr, int i8, int i9, int i10, int i11, LZ4Utils.Match match) {
            match.len = i11;
            insert(i8, bArr);
            int hashPointer = hashPointer(bArr, i8);
            for (int i12 = 0; i12 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, i8 - MASK) && hashPointer <= i8; i12++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, hashPointer, i8)) {
                    int commonBytes = LZ4UnsafeUtils.commonBytes(bArr, hashPointer + 4, i8 + 4, i10) + 4;
                    int commonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, hashPointer, i8, this.base, i9);
                    int i13 = commonBytes + commonBytesBackward;
                    if (i13 > match.len) {
                        match.len = i13;
                        match.ref = hashPointer - commonBytesBackward;
                        match.start = i8 - commonBytesBackward;
                    }
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i11) {
                return true;
            }
            return $assertionsDisabled;
        }

        private void addHash(ByteBuffer byteBuffer, int i8) {
            addHash(ByteBufferUtils.readInt(byteBuffer, i8), i8);
        }

        private int hashPointer(ByteBuffer byteBuffer, int i8) {
            return hashPointer(ByteBufferUtils.readInt(byteBuffer, i8));
        }

        void insert(int i8, ByteBuffer byteBuffer) {
            while (true) {
                int i9 = this.nextToUpdate;
                if (i9 >= i8) {
                    return;
                }
                addHash(byteBuffer, i9);
                this.nextToUpdate++;
            }
        }

        private void addHash(int i8, int i9) {
            int hashHC = LZ4Utils.hashHC(i8);
            int[] iArr = this.hashTable;
            int i10 = i9 - iArr[hashHC];
            if (i10 >= 65536) {
                i10 = MASK;
            }
            this.chainTable[MASK & i9] = (short) i10;
            iArr[hashHC] = i9;
        }

        private int hashPointer(int i8) {
            return this.hashTable[LZ4Utils.hashHC(i8)];
        }

        boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i8, int i9, int i10, int i11, LZ4Utils.Match match) {
            match.len = i11;
            insert(i8, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i8);
            for (int i12 = 0; i12 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, i8 - MASK) && hashPointer <= i8; i12++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i8)) {
                    int commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i8 + 4, i10) + 4;
                    int commonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, hashPointer, i8, this.base, i9);
                    int i13 = commonBytes + commonBytesBackward;
                    if (i13 > match.len) {
                        match.len = i13;
                        match.ref = hashPointer - commonBytesBackward;
                        match.start = i8 - commonBytesBackward;
                    }
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i11) {
                return true;
            }
            return $assertionsDisabled;
        }

        boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i8, int i9, LZ4Utils.Match match) {
            int i10;
            int i11;
            int commonBytes;
            match.start = i8;
            match.len = 0;
            insert(i8, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i8);
            if (hashPointer < i8 - 4 || hashPointer > i8 || hashPointer < this.base) {
                i10 = 0;
                i11 = 0;
            } else {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i8)) {
                    i10 = i8 - hashPointer;
                    i11 = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i8 + 4, i9) + 4;
                    match.len = i11;
                    match.ref = hashPointer;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i12 = 0; i12 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, i8 - MASK) && hashPointer <= i8; i12++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i8) && (commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i8 + 4, i9) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i11 != 0) {
                int i13 = (i11 + i8) - 3;
                while (i8 < i13 - i10) {
                    this.chainTable[i8 & MASK] = (short) i10;
                    i8++;
                }
                do {
                    this.chainTable[i8 & MASK] = (short) i10;
                    this.hashTable[LZ4Utils.hashHC(ByteBufferUtils.readInt(byteBuffer, i8))] = i8;
                    i8++;
                } while (i8 < i13);
                this.nextToUpdate = i13;
            }
            if (match.len != 0) {
                return true;
            }
            return $assertionsDisabled;
        }
    }

    LZ4HCJavaUnsafeCompressor(int i8) {
        this.maxAttempts = 1 << (i8 - 1);
        this.compressionLevel = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x026a, code lost:
    
        r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r10, r0, r1.start, r1.ref, r1.len, r11, r16, r13);
        r3 = r1.end();
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compress(java.nio.ByteBuffer r22, int r23, int r24, java.nio.ByteBuffer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaUnsafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
