package net.jpountz.xxhash;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class XXHash32 {
    public final int hash(ByteBuffer byteBuffer, int i8) {
        int hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), i8);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }

    public abstract int hash(ByteBuffer byteBuffer, int i8, int i9, int i10);

    public abstract int hash(byte[] bArr, int i8, int i9, int i10);

    public String toString() {
        return getClass().getSimpleName();
    }
}
