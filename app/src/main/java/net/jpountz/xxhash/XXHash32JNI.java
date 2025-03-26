package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes2.dex */
final class XXHash32JNI extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JNI();
    private static XXHash32 SAFE_INSTANCE;

    XXHash32JNI() {
    }

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(byte[] bArr, int i8, int i9, int i10) {
        SafeUtils.checkRange(bArr, i8, i9);
        return XXHashJNI.XXH32(bArr, i8, i9, i10);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(ByteBuffer byteBuffer, int i8, int i9, int i10) {
        if (byteBuffer.isDirect()) {
            ByteBufferUtils.checkRange(byteBuffer, i8, i9);
            return XXHashJNI.XXH32BB(byteBuffer, i8, i9, i10);
        }
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i8 + byteBuffer.arrayOffset(), i9, i10);
        }
        XXHash32 xXHash32 = SAFE_INSTANCE;
        if (xXHash32 == null) {
            xXHash32 = XXHashFactory.safeInstance().hash32();
            SAFE_INSTANCE = xXHash32;
        }
        return xXHash32.hash(byteBuffer, i8, i9, i10);
    }
}
