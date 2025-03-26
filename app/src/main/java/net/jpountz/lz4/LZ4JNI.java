package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.Native;

/* loaded from: classes2.dex */
enum LZ4JNI {
    ;

    static {
        Native.load();
        init();
    }

    static native int LZ4_compressBound(int i8);

    static native int LZ4_compressHC(byte[] bArr, ByteBuffer byteBuffer, int i8, int i9, byte[] bArr2, ByteBuffer byteBuffer2, int i10, int i11, int i12);

    static native int LZ4_compress_limitedOutput(byte[] bArr, ByteBuffer byteBuffer, int i8, int i9, byte[] bArr2, ByteBuffer byteBuffer2, int i10, int i11);

    static native int LZ4_decompress_fast(byte[] bArr, ByteBuffer byteBuffer, int i8, byte[] bArr2, ByteBuffer byteBuffer2, int i9, int i10);

    static native int LZ4_decompress_safe(byte[] bArr, ByteBuffer byteBuffer, int i8, int i9, byte[] bArr2, ByteBuffer byteBuffer2, int i10, int i11);

    static native void init();
}
