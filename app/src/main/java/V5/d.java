package V5;

import J6.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class d {
    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i8) {
        r.e(byteBuffer, "$this$copyTo");
        r.e(byteBuffer2, "destination");
        int remaining = byteBuffer2.remaining();
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly() && byteBuffer2.hasArray() && !byteBuffer2.isReadOnly()) {
            int position = byteBuffer2.position();
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i8, byteBuffer2.array(), byteBuffer2.arrayOffset() + position, remaining);
            byteBuffer2.position(position + remaining);
        } else {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(remaining + i8);
            duplicate.position(i8);
            byteBuffer2.put(duplicate);
        }
    }

    public static final void b(ByteBuffer byteBuffer, byte[] bArr, int i8, int i9, int i10) {
        r.e(byteBuffer, "$this$copyTo");
        r.e(bArr, "destination");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            byteBuffer.duplicate().get(bArr, i10, i9);
        } else {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i8, bArr, i10, i9);
        }
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i8) {
        r.e(byteBuffer, "$this$copyTo");
        r.e(byteBuffer2, "destination");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            d(byteBuffer2, i8, byteBuffer.remaining()).put(byteBuffer);
            return;
        }
        byte[] array = byteBuffer.array();
        r.d(array, "array()");
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining();
        ByteBuffer order = ByteBuffer.wrap(array, arrayOffset, remaining).slice().order(ByteOrder.BIG_ENDIAN);
        r.d(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        c.c(c.b(order), byteBuffer2, 0, remaining, i8);
        byteBuffer.position(byteBuffer.limit());
    }

    public static final ByteBuffer d(ByteBuffer byteBuffer, int i8, int i9) {
        r.e(byteBuffer, "<this>");
        ByteBuffer duplicate = byteBuffer.duplicate();
        r.d(duplicate, "myDuplicate$lambda$1");
        duplicate.position(i8);
        duplicate.limit(i8 + i9);
        ByteBuffer slice = duplicate.slice();
        r.d(slice, "mySlice$lambda$2");
        return slice;
    }
}
