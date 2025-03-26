package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class LZ4CompressorWithLength {
    private final LZ4Compressor compressor;

    public LZ4CompressorWithLength(LZ4Compressor lZ4Compressor) {
        this.compressor = lZ4Compressor;
    }

    private void putOriginalLength(byte[] bArr, int i8, int i9) {
        bArr[i8] = (byte) i9;
        bArr[i8 + 1] = (byte) (i9 >> 8);
        bArr[i8 + 2] = (byte) (i9 >> 16);
        bArr[i8 + 3] = (byte) (i9 >> 24);
    }

    public byte[] compress(byte[] bArr) {
        return compress(bArr, 0, bArr.length);
    }

    public int maxCompressedLength(int i8) {
        return this.compressor.maxCompressedLength(i8) + 4;
    }

    public byte[] compress(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[maxCompressedLength(i9)];
        return Arrays.copyOf(bArr2, compress(bArr, i8, i9, bArr2, 0));
    }

    private void putOriginalLength(ByteBuffer byteBuffer, int i8, int i9) {
        byteBuffer.put(i8, (byte) i9);
        byteBuffer.put(i8 + 1, (byte) (i9 >> 8));
        byteBuffer.put(i8 + 2, (byte) (i9 >> 16));
        byteBuffer.put(i8 + 3, (byte) (i9 >> 24));
    }

    public int compress(byte[] bArr, byte[] bArr2) {
        return compress(bArr, 0, bArr.length, bArr2, 0);
    }

    public int compress(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        return compress(bArr, i8, i9, bArr2, i10, bArr2.length - i10);
    }

    public int compress(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11) {
        int compress = this.compressor.compress(bArr, i8, i9, bArr2, i10 + 4, i11 - 4);
        putOriginalLength(bArr2, i10, i9);
        return compress + 4;
    }

    public void compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int compress = compress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + compress);
    }

    public int compress(ByteBuffer byteBuffer, int i8, int i9, ByteBuffer byteBuffer2, int i10, int i11) {
        int compress = this.compressor.compress(byteBuffer, i8, i9, byteBuffer2, i10 + 4, i11 - 4);
        putOriginalLength(byteBuffer2, i10, i9);
        return compress + 4;
    }
}
