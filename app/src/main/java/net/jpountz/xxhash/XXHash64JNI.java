package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes2.dex */
final class XXHash64JNI extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JNI();
    private static XXHash64 SAFE_INSTANCE;

    XXHash64JNI() {
    }

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(byte[] bArr, int i8, int i9, long j8) {
        SafeUtils.checkRange(bArr, i8, i9);
        return XXHashJNI.XXH64(bArr, i8, i9, j8);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(ByteBuffer byteBuffer, int i8, int i9, long j8) {
        if (byteBuffer.isDirect()) {
            ByteBufferUtils.checkRange(byteBuffer, i8, i9);
            return XXHashJNI.XXH64BB(byteBuffer, i8, i9, j8);
        }
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i8 + byteBuffer.arrayOffset(), i9, j8);
        }
        XXHash64 xXHash64 = SAFE_INSTANCE;
        if (xXHash64 == null) {
            xXHash64 = XXHashFactory.safeInstance().hash64();
            SAFE_INSTANCE = xXHash64;
        }
        return xXHash64.hash(byteBuffer, i8, i9, j8);
    }
}
