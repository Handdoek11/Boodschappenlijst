package io.ktor.client.network.sockets;

import J6.r;
import java.net.ConnectException;

/* loaded from: classes2.dex */
public final class ConnectTimeoutException extends ConnectException {

    /* renamed from: o, reason: collision with root package name */
    private final Throwable f36746o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectTimeoutException(String str, Throwable th) {
        super(str);
        r.e(str, "message");
        this.f36746o = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f36746o;
    }
}
