package q6;

import X2.D;
import h6.AbstractC5844b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC6805a;

/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6639b implements p7.b {
    CANCELLED;

    public static boolean a(AtomicReference atomicReference) {
        p7.b bVar;
        p7.b bVar2 = (p7.b) atomicReference.get();
        EnumC6639b enumC6639b = CANCELLED;
        if (bVar2 == enumC6639b || (bVar = (p7.b) atomicReference.getAndSet(enumC6639b)) == enumC6639b) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.cancel();
        return true;
    }

    public static void c() {
        AbstractC6805a.m(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean f(AtomicReference atomicReference, p7.b bVar) {
        AbstractC5844b.e(bVar, "s is null");
        if (D.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        c();
        return false;
    }

    public static boolean g(long j8) {
        if (j8 > 0) {
            return true;
        }
        AbstractC6805a.m(new IllegalArgumentException("n > 0 required but it was " + j8));
        return false;
    }

    public static boolean i(p7.b bVar, p7.b bVar2) {
        if (bVar2 == null) {
            AbstractC6805a.m(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.cancel();
        c();
        return false;
    }

    @Override // p7.b
    public void cancel() {
    }

    @Override // p7.b
    public void h(long j8) {
    }
}
