package g6;

import X2.D;
import d6.InterfaceC5732b;
import h6.AbstractC5844b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC6805a;

/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5814b implements InterfaceC5732b {
    DISPOSED;

    public static boolean a(AtomicReference atomicReference) {
        InterfaceC5732b interfaceC5732b;
        InterfaceC5732b interfaceC5732b2 = (InterfaceC5732b) atomicReference.get();
        EnumC5814b enumC5814b = DISPOSED;
        if (interfaceC5732b2 == enumC5814b || (interfaceC5732b = (InterfaceC5732b) atomicReference.getAndSet(enumC5814b)) == enumC5814b) {
            return false;
        }
        if (interfaceC5732b == null) {
            return true;
        }
        interfaceC5732b.c();
        return true;
    }

    public static boolean f(InterfaceC5732b interfaceC5732b) {
        return interfaceC5732b == DISPOSED;
    }

    public static boolean g(AtomicReference atomicReference, InterfaceC5732b interfaceC5732b) {
        InterfaceC5732b interfaceC5732b2;
        do {
            interfaceC5732b2 = (InterfaceC5732b) atomicReference.get();
            if (interfaceC5732b2 == DISPOSED) {
                if (interfaceC5732b == null) {
                    return false;
                }
                interfaceC5732b.c();
                return false;
            }
        } while (!D.a(atomicReference, interfaceC5732b2, interfaceC5732b));
        return true;
    }

    public static void h() {
        AbstractC6805a.m(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean i(AtomicReference atomicReference, InterfaceC5732b interfaceC5732b) {
        AbstractC5844b.e(interfaceC5732b, "d is null");
        if (D.a(atomicReference, null, interfaceC5732b)) {
            return true;
        }
        interfaceC5732b.c();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        h();
        return false;
    }

    public static boolean k(AtomicReference atomicReference, InterfaceC5732b interfaceC5732b) {
        if (D.a(atomicReference, null, interfaceC5732b)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        interfaceC5732b.c();
        return false;
    }

    public static boolean l(InterfaceC5732b interfaceC5732b, InterfaceC5732b interfaceC5732b2) {
        if (interfaceC5732b2 == null) {
            AbstractC6805a.m(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC5732b == null) {
            return true;
        }
        interfaceC5732b2.c();
        h();
        return false;
    }

    @Override // d6.InterfaceC5732b
    public void c() {
    }
}
