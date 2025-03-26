package X5;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class i {
    private static final int a(k kVar, ByteBuffer byteBuffer, int i8) {
        while (byteBuffer.hasRemaining()) {
            Y5.a m02 = kVar.m0(1);
            if (m02 == null) {
                return i8;
            }
            int remaining = byteBuffer.remaining();
            int k8 = m02.k() - m02.i();
            if (remaining < k8) {
                g.a(m02, byteBuffer, remaining);
                kVar.D0(m02.i());
                return i8 + remaining;
            }
            g.a(m02, byteBuffer, k8);
            kVar.C0(m02);
            i8 += k8;
        }
        return i8;
    }

    public static final int b(k kVar, ByteBuffer byteBuffer) {
        J6.r.e(kVar, "<this>");
        J6.r.e(byteBuffer, "dst");
        int a8 = a(kVar, byteBuffer, 0);
        if (!byteBuffer.hasRemaining()) {
            return a8;
        }
        throw new EOFException("Not enough data in packet to fill buffer: " + byteBuffer.remaining() + " more bytes required");
    }
}
