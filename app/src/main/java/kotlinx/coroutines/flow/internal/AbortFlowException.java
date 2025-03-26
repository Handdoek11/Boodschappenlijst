package kotlinx.coroutines.flow.internal;

import X6.c;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: o, reason: collision with root package name */
    public final transient c f38762o;

    public AbortFlowException(c cVar) {
        super("Flow was aborted, no more elements needed");
        this.f38762o = cVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
