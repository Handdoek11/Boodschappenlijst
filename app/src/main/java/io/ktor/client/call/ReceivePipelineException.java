package io.ktor.client.call;

/* loaded from: classes2.dex */
public final class ReceivePipelineException extends IllegalStateException {

    /* renamed from: o, reason: collision with root package name */
    private final Throwable f36743o;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f36743o;
    }
}
