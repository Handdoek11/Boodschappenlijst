package X5;

import java.io.EOFException;
import java.nio.ByteBuffer;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class f {
    public static final void a(a aVar, byte[] bArr, int i8, int i9) {
        J6.r.e(aVar, "<this>");
        J6.r.e(bArr, "destination");
        ByteBuffer h8 = aVar.h();
        int i10 = aVar.i();
        if (aVar.k() - i10 >= i9) {
            V5.d.b(h8, bArr, i10, i9, i8);
            C6916E c6916e = C6916E.f44463a;
            aVar.c(i9);
        } else {
            throw new EOFException("Not enough bytes to read a byte array of size " + i9 + '.');
        }
    }
}
