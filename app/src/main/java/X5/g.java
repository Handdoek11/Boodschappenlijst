package X5;

import java.io.EOFException;
import java.nio.ByteBuffer;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class g {
    public static final void a(a aVar, ByteBuffer byteBuffer, int i8) {
        J6.r.e(aVar, "<this>");
        J6.r.e(byteBuffer, "dst");
        ByteBuffer h8 = aVar.h();
        int i9 = aVar.i();
        if (aVar.k() - i9 < i8) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i8 + '.');
        }
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i8);
            V5.d.a(h8, byteBuffer, i9);
            byteBuffer.limit(limit);
            C6916E c6916e = C6916E.f44463a;
            aVar.c(i8);
        } catch (Throwable th) {
            byteBuffer.limit(limit);
            throw th;
        }
    }
}
