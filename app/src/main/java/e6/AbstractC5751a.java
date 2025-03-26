package e6;

import r6.AbstractC6714f;

/* renamed from: e6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5751a {
    public static RuntimeException a(Throwable th) {
        throw AbstractC6714f.c(th);
    }

    public static void b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
