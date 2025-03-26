package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes2.dex */
final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    private static LZ4FastDecompressor SAFE_INSTANCE;

    LZ4JNIFastDecompressor() {
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public final int decompress(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        SafeUtils.checkRange(bArr, i8);
        SafeUtils.checkRange(bArr2, i9, i10);
        int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i8, bArr2, null, i9, i10);
        if (LZ4_decompress_fast >= 0) {
            return LZ4_decompress_fast;
        }
        throw new LZ4Exception("Error decoding offset " + (i8 - LZ4_decompress_fast) + " of input buffer");
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, int i10) {
        ByteBuffer byteBuffer3;
        byte[] bArr;
        ByteBuffer byteBuffer4;
        int i11;
        byte[] bArr2;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i8);
        ByteBufferUtils.checkRange(byteBuffer2, i9, i10);
        if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
            LZ4FastDecompressor lZ4FastDecompressor = SAFE_INSTANCE;
            if (lZ4FastDecompressor == null) {
                lZ4FastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
                SAFE_INSTANCE = lZ4FastDecompressor;
            }
            return lZ4FastDecompressor.decompress(byteBuffer, i8, byteBuffer2, i9, i10);
        }
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            i8 += byteBuffer.arrayOffset();
            bArr = array;
            byteBuffer3 = null;
        } else {
            byteBuffer3 = byteBuffer;
            bArr = null;
        }
        if (byteBuffer2.hasArray()) {
            bArr2 = byteBuffer2.array();
            i11 = i9 + byteBuffer2.arrayOffset();
            byteBuffer4 = null;
        } else {
            byteBuffer4 = byteBuffer2;
            i11 = i9;
            bArr2 = null;
        }
        int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, byteBuffer3, i8, bArr2, byteBuffer4, i11, i10);
        if (LZ4_decompress_fast >= 0) {
            return LZ4_decompress_fast;
        }
        throw new LZ4Exception("Error decoding offset " + (i8 - LZ4_decompress_fast) + " of input buffer");
    }
}
