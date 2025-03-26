package U6;

import java.util.concurrent.CancellationException;

/* renamed from: U6.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0724k0 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
