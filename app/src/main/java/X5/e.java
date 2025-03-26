package X5;

import io.ktor.utils.io.core.InsufficientSpaceException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class e {
    public static final void a(a aVar, ByteBuffer byteBuffer) {
        J6.r.e(aVar, "<this>");
        J6.r.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        ByteBuffer h8 = aVar.h();
        int k8 = aVar.k();
        int g8 = aVar.g() - k8;
        if (g8 < remaining) {
            throw new InsufficientSpaceException("buffer content", remaining, g8);
        }
        V5.d.c(byteBuffer, h8, k8);
        aVar.a(remaining);
    }
}
