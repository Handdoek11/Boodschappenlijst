package io.ktor.client.plugins;

import B5.s;
import E5.c;
import J6.r;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class HttpRequestTimeoutException extends IOException {
    public HttpRequestTimeoutException(String str, Long l8) {
        r.e(str, "url");
        StringBuilder sb = new StringBuilder();
        sb.append("Request timeout has expired [url=");
        sb.append(str);
        sb.append(", request_timeout=");
        sb.append(l8 == null ? "unknown" : l8);
        sb.append(" ms]");
        super(sb.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(c cVar) {
        r.e(cVar, "request");
        String c8 = cVar.i().c();
        s.a aVar = (s.a) cVar.f(s.f708d);
        this(c8, aVar != null ? aVar.d() : null);
    }
}
