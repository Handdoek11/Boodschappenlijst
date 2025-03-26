package io.ktor.utils.io;

/* loaded from: classes2.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Void b(Throwable th) {
        Throwable th2;
        try {
            th2 = n.e(th, th);
        } catch (Throwable unused) {
            th2 = null;
        }
        if (th2 == null) {
            throw th;
        }
        throw th2;
    }
}
