package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.Native;

/* loaded from: classes2.dex */
enum XXHashJNI {
    ;

    static {
        Native.load();
        init();
    }

    static native int XXH32(byte[] bArr, int i8, int i9, int i10);

    static native int XXH32BB(ByteBuffer byteBuffer, int i8, int i9, int i10);

    static native int XXH32_digest(long j8);

    static native void XXH32_free(long j8);

    static native long XXH32_init(int i8);

    static native void XXH32_update(long j8, byte[] bArr, int i8, int i9);

    static native long XXH64(byte[] bArr, int i8, int i9, long j8);

    static native long XXH64BB(ByteBuffer byteBuffer, int i8, int i9, long j8);

    static native long XXH64_digest(long j8);

    static native void XXH64_free(long j8);

    static native long XXH64_init(long j8);

    static native void XXH64_update(long j8, byte[] bArr, int i8, int i9);

    private static native void init();
}
