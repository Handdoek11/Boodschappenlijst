package V5;

import J6.AbstractC0650j;
import J6.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5732a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final ByteBuffer f5733b;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final ByteBuffer a() {
            return c.f5733b;
        }

        private a() {
        }
    }

    static {
        ByteBuffer order = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        r.d(order, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f5733b = b(order);
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        r.e(byteBuffer, "buffer");
        return byteBuffer;
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i8, int i9, int i10) {
        r.e(byteBuffer2, "destination");
        if (byteBuffer.hasArray() && byteBuffer2.hasArray() && !byteBuffer.isReadOnly() && !byteBuffer2.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i8, byteBuffer2.array(), byteBuffer2.arrayOffset() + i10, i9);
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i8);
        duplicate.limit(i8 + i9);
        ByteBuffer duplicate2 = byteBuffer2.duplicate();
        duplicate2.position(i10);
        duplicate2.put(duplicate);
    }

    public static final ByteBuffer d(ByteBuffer byteBuffer, int i8, int i9) {
        return b(d.d(byteBuffer, i8, i9));
    }
}
