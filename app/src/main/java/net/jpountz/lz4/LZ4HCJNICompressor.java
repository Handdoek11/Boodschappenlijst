package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes2.dex */
final class LZ4HCJNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;
    private final int compressionLevel;

    LZ4HCJNICompressor() {
        this(9);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11) {
        SafeUtils.checkRange(bArr, i8, i9);
        SafeUtils.checkRange(bArr2, i10, i11);
        int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, null, i8, i9, bArr2, null, i10, i11, this.compressionLevel);
        if (LZ4_compressHC > 0) {
            return LZ4_compressHC;
        }
        throw new LZ4Exception();
    }

    LZ4HCJNICompressor(int i8) {
        this.compressionLevel = i8;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i8, int i9, ByteBuffer byteBuffer2, int i10, int i11) {
        ByteBuffer byteBuffer3;
        int i12;
        byte[] bArr;
        ByteBuffer byteBuffer4;
        int i13;
        byte[] bArr2;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i8, i9);
        ByteBufferUtils.checkRange(byteBuffer2, i10, i11);
        if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
            LZ4Compressor lZ4Compressor = SAFE_INSTANCE;
            if (lZ4Compressor == null) {
                lZ4Compressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
                SAFE_INSTANCE = lZ4Compressor;
            }
            return lZ4Compressor.compress(byteBuffer, i8, i9, byteBuffer2, i10, i11);
        }
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            byteBuffer3 = null;
            i12 = byteBuffer.arrayOffset() + i8;
        } else {
            byteBuffer3 = byteBuffer;
            i12 = i8;
            bArr = null;
        }
        if (byteBuffer2.hasArray()) {
            bArr2 = byteBuffer2.array();
            byteBuffer4 = null;
            i13 = i10 + byteBuffer2.arrayOffset();
        } else {
            byteBuffer4 = byteBuffer2;
            i13 = i10;
            bArr2 = null;
        }
        int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, byteBuffer3, i12, i9, bArr2, byteBuffer4, i13, i11, this.compressionLevel);
        if (LZ4_compressHC > 0) {
            return LZ4_compressHC;
        }
        throw new LZ4Exception();
    }
}
