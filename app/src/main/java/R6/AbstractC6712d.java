package r6;

import X2.D;
import d6.InterfaceC5732b;
import g6.EnumC5814b;
import h6.AbstractC5844b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC6805a;

/* renamed from: r6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6712d {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class cls) {
        AbstractC6805a.m(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference atomicReference, InterfaceC5732b interfaceC5732b, Class cls) {
        AbstractC5844b.e(interfaceC5732b, "next is null");
        if (D.a(atomicReference, null, interfaceC5732b)) {
            return true;
        }
        interfaceC5732b.c();
        if (atomicReference.get() == EnumC5814b.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
