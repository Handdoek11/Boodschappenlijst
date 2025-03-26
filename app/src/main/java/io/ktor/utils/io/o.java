package io.ktor.utils.io;

import J6.r;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public abstract class o {
    public static final Throwable a(Throwable th) {
        r.e(th, "<this>");
        Throwable th2 = th;
        while (th2 instanceof CancellationException) {
            if (r.a(th2, th2.getCause())) {
                return th;
            }
            Throwable cause = th2.getCause();
            if (cause == null) {
                return th2;
            }
            th2 = cause;
        }
        return th2;
    }
}
