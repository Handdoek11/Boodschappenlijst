package io.ktor.utils.io.internal;

import J6.AbstractC0650j;
import io.ktor.utils.io.ClosedWriteChannelException;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f36884b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final b f36885c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f36886a;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b a() {
            return b.f36885c;
        }

        private a() {
        }
    }

    public b(Throwable th) {
        this.f36886a = th;
    }

    public final Throwable b() {
        return this.f36886a;
    }

    public final Throwable c() {
        Throwable th = this.f36886a;
        return th == null ? new ClosedWriteChannelException("The channel was closed") : th;
    }

    public String toString() {
        return "Closed[" + c() + ']';
    }
}
