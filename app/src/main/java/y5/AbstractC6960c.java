package y5;

import U6.AbstractC0726l0;
import U6.I;
import java.io.Closeable;

/* renamed from: y5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6960c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(I i8) {
        try {
            if (i8 instanceof AbstractC0726l0) {
                ((AbstractC0726l0) i8).close();
            } else if (i8 instanceof Closeable) {
                ((Closeable) i8).close();
            }
        } catch (Throwable unused) {
        }
    }
}
