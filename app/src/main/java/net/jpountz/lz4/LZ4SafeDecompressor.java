package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class LZ4SafeDecompressor implements LZ4UnknownSizeDecompressor {
    public abstract int decompress(ByteBuffer byteBuffer, int i8, int i9, ByteBuffer byteBuffer2, int i10, int i11);

    @Override // net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        return decompress(bArr, i8, i9, bArr2, i10, bArr2.length - i10);
    }

    @Override // net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public abstract int decompress(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11);

    public String toString() {
        return getClass().getSimpleName();
    }

    public final int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, 0, bArr.length, bArr2, 0);
    }

    public final byte[] decompress(byte[] bArr, int i8, int i9, int i10) {
        byte[] bArr2 = new byte[i10];
        int decompress = decompress(bArr, i8, i9, bArr2, 0, i10);
        return decompress != i10 ? Arrays.copyOf(bArr2, decompress) : bArr2;
    }

    public final byte[] decompress(byte[] bArr, int i8) {
        return decompress(bArr, 0, bArr.length, i8);
    }

    public final void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int decompress = decompress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + decompress);
    }
}
