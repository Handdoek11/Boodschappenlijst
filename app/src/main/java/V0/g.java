package v0;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import x6.C6934p;

/* loaded from: classes.dex */
final class g extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: o, reason: collision with root package name */
    private final A6.d f44060o;

    public g(A6.d dVar) {
        super(false);
        this.f44060o = dVar;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            A6.d dVar = this.f44060o;
            C6934p.a aVar = C6934p.f44487s;
            dVar.resumeWith(C6934p.b(x6.q.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f44060o.resumeWith(C6934p.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
