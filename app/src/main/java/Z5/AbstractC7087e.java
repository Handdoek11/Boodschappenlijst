package z5;

import A6.g;
import B5.s;
import B5.t;
import J6.r;
import U6.N;
import io.ktor.utils.io.f;
import io.ktor.utils.io.jvm.javaio.h;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;

/* renamed from: z5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7087e {

    /* renamed from: z5.e$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f44919o;

        /* renamed from: s, reason: collision with root package name */
        Object f44920s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f44921t;

        /* renamed from: u, reason: collision with root package name */
        int f44922u;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44921t = obj;
            this.f44922u |= Integer.MIN_VALUE;
            return AbstractC7087e.e(null, null, null, this);
        }
    }

    public static final f a(HttpURLConnection httpURLConnection, g gVar, E5.d dVar) {
        f a8;
        f a9;
        r.e(httpURLConnection, "<this>");
        r.e(gVar, "callContext");
        r.e(dVar, "request");
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            r0 = inputStream != null ? inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192) : null;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                r0 = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
            }
        }
        return (r0 == null || (a8 = h.a(r0, gVar, O5.a.a())) == null || (a9 = A5.a.a(N.a(gVar), a8, dVar)) == null) ? f.f36863a.a() : a9;
    }

    private static final boolean b(Throwable th) {
        if (!(th instanceof SocketTimeoutException)) {
            if (!(th instanceof ConnectException)) {
                return false;
            }
            String message = th.getMessage();
            if (!(message != null ? S6.h.G(message, "timed out", false, 2, null) : false)) {
                return false;
            }
        }
        return true;
    }

    private static final void c(HttpURLConnection httpURLConnection, s.a aVar) {
        Long d8 = aVar.d();
        if (d8 != null) {
            long longValue = d8.longValue();
            if (longValue != Long.MAX_VALUE) {
                if (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > longValue) {
                    httpURLConnection.setConnectTimeout(t.d(longValue));
                }
            }
        }
    }

    public static final void d(HttpURLConnection httpURLConnection, E5.d dVar) {
        r.e(httpURLConnection, "<this>");
        r.e(dVar, "requestData");
        s.a aVar = (s.a) dVar.c(s.f708d);
        if (aVar != null) {
            Long c8 = aVar.c();
            if (c8 != null) {
                httpURLConnection.setConnectTimeout(t.d(c8.longValue()));
            }
            Long e8 = aVar.e();
            if (e8 != null) {
                httpURLConnection.setReadTimeout(t.d(e8.longValue()));
            }
            c(httpURLConnection, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(java.net.HttpURLConnection r4, E5.d r5, I6.l r6, A6.d r7) {
        /*
            boolean r0 = r7 instanceof z5.AbstractC7087e.a
            if (r0 == 0) goto L13
            r0 = r7
            z5.e$a r0 = (z5.AbstractC7087e.a) r0
            int r1 = r0.f44922u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44922u = r1
            goto L18
        L13:
            z5.e$a r0 = new z5.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f44921t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f44922u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f44920s
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.f44919o
            E5.d r5 = (E5.d) r5
            x6.q.b(r7)
            goto L4f
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            x6.q.b(r7)
            java.lang.Object r4 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            r4 = move-exception
            r0.f44919o = r5
            r0.f44920s = r4
            r0.f44922u = r3
            java.lang.Object r6 = U6.Y0.a(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            boolean r6 = b(r4)
            if (r6 == 0) goto L59
            io.ktor.client.network.sockets.ConnectTimeoutException r4 = B5.t.a(r5, r4)
        L59:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.AbstractC7087e.e(java.net.HttpURLConnection, E5.d, I6.l, A6.d):java.lang.Object");
    }
}
