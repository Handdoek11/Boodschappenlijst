package io.ktor.client.network.sockets;

import J6.r;

/* loaded from: classes2.dex */
public final class SocketTimeoutException extends java.net.SocketTimeoutException {

    /* renamed from: o, reason: collision with root package name */
    private final Throwable f36747o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketTimeoutException(String str, Throwable th) {
        super(str);
        r.e(str, "message");
        this.f36747o = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f36747o;
    }
}
