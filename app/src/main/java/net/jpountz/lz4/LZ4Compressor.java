package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class LZ4Compressor {
    public abstract int compress(ByteBuffer byteBuffer, int i8, int i9, ByteBuffer byteBuffer2, int i10, int i11);

    public final int compress(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        return compress(bArr, i8, i9, bArr2, i10, bArr2.length - i10);
    }

    public abstract int compress(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11);

    public final int maxCompressedLength(int i8) {
        return LZ4Utils.maxCompressedLength(i8);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public final int compress(byte[] bArr, byte[] bArr2) {
        return compress(bArr, 0, bArr.length, bArr2, 0);
    }

    public final byte[] compress(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[maxCompressedLength(i9)];
        return Arrays.copyOf(bArr2, compress(bArr, i8, i9, bArr2, 0));
    }

    public final byte[] compress(byte[] bArr) {
        return compress(bArr, 0, bArr.length);
    }

    public final void compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int compress = compress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + compress);
    }
}
