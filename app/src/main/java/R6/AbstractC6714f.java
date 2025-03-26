package r6;

import X2.D;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: r6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6714f {

    /* renamed from: a, reason: collision with root package name */
    public static final Throwable f42619a = new a();

    public static boolean a(AtomicReference atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f42619a) {
                return false;
            }
        } while (!D.a(atomicReference, th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f42619a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static RuntimeException c(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }

    /* renamed from: r6.f$a */
    static final class a extends Throwable {
        a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }
}
