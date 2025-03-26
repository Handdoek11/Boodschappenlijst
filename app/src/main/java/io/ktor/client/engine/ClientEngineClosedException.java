package io.ktor.client.engine;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class ClientEngineClosedException extends IllegalStateException {

    /* renamed from: o, reason: collision with root package name */
    private final Throwable f36744o;

    public ClientEngineClosedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f36744o;
    }

    public /* synthetic */ ClientEngineClosedException(Throwable th, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? null : th);
    }

    public ClientEngineClosedException(Throwable th) {
        super("Client already closed");
        this.f36744o = th;
    }
}
