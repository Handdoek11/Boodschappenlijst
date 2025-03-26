package net.jpountz.lz4;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class LZ4FastDecompressor implements LZ4Decompressor {
    public abstract int decompress(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, int i10);

    @Override // net.jpountz.lz4.LZ4Decompressor
    public abstract int decompress(byte[] bArr, int i8, byte[] bArr2, int i9, int i10);

    public final int decompress(byte[] bArr, byte[] bArr2, int i8) {
        return decompress(bArr, 0, bArr2, 0, i8);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public final int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, bArr2, bArr2.length);
    }

    public final byte[] decompress(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        decompress(bArr, i8, bArr2, 0, i9);
        return bArr2;
    }

    public final byte[] decompress(byte[] bArr, int i8) {
        return decompress(bArr, 0, i8);
    }

    public final void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int decompress = decompress(byteBuffer, byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + decompress);
    }
}
