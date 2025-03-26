package kotlinx.coroutines;

import J6.r;
import U6.G;
import U6.InterfaceC0745v0;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class JobCancellationException extends CancellationException implements G {

    /* renamed from: o, reason: collision with root package name */
    public final transient InterfaceC0745v0 f38760o;

    public JobCancellationException(String str, Throwable th, InterfaceC0745v0 interfaceC0745v0) {
        super(str);
        this.f38760o = interfaceC0745v0;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // U6.G
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JobCancellationException a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!r.a(jobCancellationException.getMessage(), getMessage()) || !r.a(jobCancellationException.f38760o, this.f38760o) || !r.a(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        r.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f38760o.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f38760o;
    }
}
