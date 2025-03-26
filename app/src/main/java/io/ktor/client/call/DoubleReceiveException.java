package io.ktor.client.call;

import J6.r;
import w5.C6892a;

/* loaded from: classes2.dex */
public final class DoubleReceiveException extends IllegalStateException {

    /* renamed from: o, reason: collision with root package name */
    private final String f36740o;

    public DoubleReceiveException(C6892a c6892a) {
        r.e(c6892a, "call");
        this.f36740o = "Response already received: " + c6892a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f36740o;
    }
}
