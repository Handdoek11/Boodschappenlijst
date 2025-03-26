package B5;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;
import io.ktor.client.plugins.HttpRequestTimeoutException;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final q7.a f682a = S5.a.a("io.ktor.client.plugins.HttpRequestRetry");

    /* renamed from: b, reason: collision with root package name */
    private static final N5.a f683b = new N5.a("MaxRetriesPerRequestAttributeKey");

    /* renamed from: c, reason: collision with root package name */
    private static final N5.a f684c = new N5.a("ShouldRetryPerRequestAttributeKey");

    /* renamed from: d, reason: collision with root package name */
    private static final N5.a f685d = new N5.a("ShouldRetryOnExceptionPerRequestAttributeKey");

    /* renamed from: e, reason: collision with root package name */
    private static final N5.a f686e = new N5.a("ModifyRequestPerRequestAttributeKey");

    /* renamed from: f, reason: collision with root package name */
    private static final N5.a f687f = new N5.a("RetryDelayPerRequestAttributeKey");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Throwable th) {
        Throwable a8 = G5.e.a(th);
        return (a8 instanceof HttpRequestTimeoutException) || (a8 instanceof ConnectTimeoutException) || (a8 instanceof SocketTimeoutException);
    }
}
