package net.jpountz.xxhash;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class XXHash64 {
    public abstract long hash(ByteBuffer byteBuffer, int i8, int i9, long j8);

    public final long hash(ByteBuffer byteBuffer, long j8) {
        long hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), j8);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }

    public abstract long hash(byte[] bArr, int i8, int i9, long j8);

    public String toString() {
        return getClass().getSimpleName();
    }
}
