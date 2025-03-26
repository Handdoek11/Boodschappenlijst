package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
