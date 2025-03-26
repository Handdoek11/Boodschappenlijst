package net.jpountz.lz4;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class LZ4DecompressorWithLength {
    private final LZ4FastDecompressor fastDecompressor;
    private final LZ4SafeDecompressor safeDecompressor;

    public LZ4DecompressorWithLength(LZ4FastDecompressor lZ4FastDecompressor) {
        this.fastDecompressor = lZ4FastDecompressor;
        this.safeDecompressor = null;
    }

    public static int getDecompressedLength(byte[] bArr) {
        return getDecompressedLength(bArr, 0);
    }

    public int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, 0, bArr2, 0);
    }

    public static int getDecompressedLength(byte[] bArr, int i8) {
        return (bArr[i8 + 3] << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    public int decompress(byte[] bArr, int i8, byte[] bArr2, int i9) {
        if (this.safeDecompressor != null) {
            return decompress(bArr, i8, bArr.length - i8, bArr2, i9);
        }
        return this.fastDecompressor.decompress(bArr, i8 + 4, bArr2, i9, getDecompressedLength(bArr, i8)) + 4;
    }

    public static int getDecompressedLength(ByteBuffer byteBuffer) {
        return getDecompressedLength(byteBuffer, byteBuffer.position());
    }

    public LZ4DecompressorWithLength(LZ4SafeDecompressor lZ4SafeDecompressor) {
        this.fastDecompressor = null;
        this.safeDecompressor = lZ4SafeDecompressor;
    }

    public static int getDecompressedLength(ByteBuffer byteBuffer, int i8) {
        return (byteBuffer.get(i8 + 3) << 24) | (byteBuffer.get(i8) & 255) | ((byteBuffer.get(i8 + 1) & 255) << 8) | ((byteBuffer.get(i8 + 2) & 255) << 16);
    }

    public int decompress(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        if (this.safeDecompressor == null) {
            return decompress(bArr, i8, bArr2, i10);
        }
        return this.safeDecompressor.decompress(bArr, i8 + 4, i9 - 4, bArr2, i10, getDecompressedLength(bArr, i8));
    }

    public byte[] decompress(byte[] bArr) {
        return decompress(bArr, 0);
    }

    public byte[] decompress(byte[] bArr, int i8) {
        if (this.safeDecompressor != null) {
            return decompress(bArr, i8, bArr.length - i8);
        }
        return this.fastDecompressor.decompress(bArr, i8 + 4, getDecompressedLength(bArr, i8));
    }

    public byte[] decompress(byte[] bArr, int i8, int i9) {
        if (this.safeDecompressor == null) {
            return decompress(bArr, i8);
        }
        return this.safeDecompressor.decompress(bArr, i8 + 4, i9 - 4, getDecompressedLength(bArr, i8));
    }

    public void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int decompressedLength = getDecompressedLength(byteBuffer, byteBuffer.position());
        LZ4SafeDecompressor lZ4SafeDecompressor = this.safeDecompressor;
        if (lZ4SafeDecompressor == null) {
            byteBuffer.position(byteBuffer.position() + 4 + this.fastDecompressor.decompress(byteBuffer, byteBuffer.position() + 4, byteBuffer2, byteBuffer2.position(), decompressedLength));
            byteBuffer2.position(byteBuffer2.position() + decompressedLength);
        } else {
            int decompress = lZ4SafeDecompressor.decompress(byteBuffer, byteBuffer.position() + 4, byteBuffer.remaining() - 4, byteBuffer2, byteBuffer2.position(), decompressedLength);
            byteBuffer.position(byteBuffer.limit());
            byteBuffer2.position(byteBuffer2.position() + decompress);
        }
    }

    public int decompress(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9) {
        if (this.safeDecompressor != null) {
            return decompress(byteBuffer, i8, byteBuffer.remaining() - i8, byteBuffer2, i9);
        }
        return this.fastDecompressor.decompress(byteBuffer, i8 + 4, byteBuffer2, i9, getDecompressedLength(byteBuffer, i8)) + 4;
    }

    public int decompress(ByteBuffer byteBuffer, int i8, int i9, ByteBuffer byteBuffer2, int i10) {
        if (this.safeDecompressor == null) {
            return decompress(byteBuffer, i8, byteBuffer2, i10);
        }
        return this.safeDecompressor.decompress(byteBuffer, i8 + 4, i9 - 4, byteBuffer2, i10, getDecompressedLength(byteBuffer, i8));
    }
}
