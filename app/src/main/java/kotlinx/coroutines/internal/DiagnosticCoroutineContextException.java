package kotlinx.coroutines.internal;

import A6.g;

/* loaded from: classes2.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    private final transient g f38763o;

    public DiagnosticCoroutineContextException(g gVar) {
        this.f38763o = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f38763o.toString();
    }
}
