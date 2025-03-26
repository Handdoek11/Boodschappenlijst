package G6;

import java.io.Closeable;
import x6.AbstractC6923e;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC6923e.a(th, th2);
            }
        }
    }
}
