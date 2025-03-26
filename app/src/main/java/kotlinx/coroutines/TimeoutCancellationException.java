package kotlinx.coroutines;

import U6.G;
import U6.InterfaceC0745v0;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class TimeoutCancellationException extends CancellationException implements G {

    /* renamed from: o, reason: collision with root package name */
    public final transient InterfaceC0745v0 f38761o;

    public TimeoutCancellationException(String str, InterfaceC0745v0 interfaceC0745v0) {
        super(str);
        this.f38761o = interfaceC0745v0;
    }

    @Override // U6.G
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TimeoutCancellationException a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f38761o);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
