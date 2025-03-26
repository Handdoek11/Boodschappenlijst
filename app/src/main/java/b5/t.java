package B5;

import B5.s;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final q7.a f728a = S5.a.a("io.ktor.client.plugins.HttpTimeout");

    public static final ConnectTimeoutException a(E5.d dVar, Throwable th) {
        Object obj;
        J6.r.e(dVar, "request");
        StringBuilder sb = new StringBuilder();
        sb.append("Connect timeout has expired [url=");
        sb.append(dVar.h());
        sb.append(", connect_timeout=");
        s.a aVar = (s.a) dVar.c(s.f708d);
        if (aVar == null || (obj = aVar.c()) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append(" ms]");
        return new ConnectTimeoutException(sb.toString(), th);
    }

    public static final SocketTimeoutException b(E5.d dVar, Throwable th) {
        Object obj;
        J6.r.e(dVar, "request");
        StringBuilder sb = new StringBuilder();
        sb.append("Socket timeout has expired [url=");
        sb.append(dVar.h());
        sb.append(", socket_timeout=");
        s.a aVar = (s.a) dVar.c(s.f708d);
        if (aVar == null || (obj = aVar.e()) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append("] ms");
        return new SocketTimeoutException(sb.toString(), th);
    }

    public static final int d(long j8) {
        if (j8 == Long.MAX_VALUE) {
            return 0;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j8;
    }
}
