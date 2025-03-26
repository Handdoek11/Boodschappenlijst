package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes2.dex */
final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    LZ4JNISafeDecompressor() {
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11) {
        SafeUtils.checkRange(bArr, i8, i9);
        SafeUtils.checkRange(bArr2, i10, i11);
        int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i8, i9, bArr2, null, i10, i11);
        if (LZ4_decompress_safe >= 0) {
            return LZ4_decompress_safe;
        }
        throw new LZ4Exception("Error decoding offset " + (i8 - LZ4_decompress_safe) + " of input buffer");
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i8, int i9, ByteBuffer byteBuffer2, int i10, int i11) {
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
            LZ4SafeDecompressor lZ4SafeDecompressor = SAFE_INSTANCE;
            if (lZ4SafeDecompressor == null) {
                lZ4SafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
                SAFE_INSTANCE = lZ4SafeDecompressor;
            }
            return lZ4SafeDecompressor.decompress(byteBuffer, i8, i9, byteBuffer2, i10, i11);
        }
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            i12 = byteBuffer.arrayOffset() + i8;
            bArr = array;
            byteBuffer3 = null;
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
        int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, byteBuffer3, i12, i9, bArr2, byteBuffer4, i13, i11);
        if (LZ4_decompress_safe >= 0) {
            return LZ4_decompress_safe;
        }
        throw new LZ4Exception("Error decoding offset " + (i12 - LZ4_decompress_safe) + " of input buffer");
    }
}
