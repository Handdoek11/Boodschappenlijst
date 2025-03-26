package I5;

import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.List;
import y6.AbstractC6980h;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: V0, reason: collision with root package name */
    private static final String[] f3318V0;

    /* renamed from: W0, reason: collision with root package name */
    private static final List f3320W0;

    /* renamed from: a, reason: collision with root package name */
    public static final o f3324a = new o();

    /* renamed from: b, reason: collision with root package name */
    private static final String f3326b = "Accept";

    /* renamed from: c, reason: collision with root package name */
    private static final String f3328c = "Accept-Charset";

    /* renamed from: d, reason: collision with root package name */
    private static final String f3330d = "Accept-Encoding";

    /* renamed from: e, reason: collision with root package name */
    private static final String f3332e = "Accept-Language";

    /* renamed from: f, reason: collision with root package name */
    private static final String f3334f = "Accept-Ranges";

    /* renamed from: g, reason: collision with root package name */
    private static final String f3336g = "Age";

    /* renamed from: h, reason: collision with root package name */
    private static final String f3338h = "Allow";

    /* renamed from: i, reason: collision with root package name */
    private static final String f3340i = "ALPN";

    /* renamed from: j, reason: collision with root package name */
    private static final String f3342j = "Authentication-Info";

    /* renamed from: k, reason: collision with root package name */
    private static final String f3344k = "Authorization";

    /* renamed from: l, reason: collision with root package name */
    private static final String f3346l = "Cache-Control";

    /* renamed from: m, reason: collision with root package name */
    private static final String f3348m = "Connection";

    /* renamed from: n, reason: collision with root package name */
    private static final String f3350n = "Content-Disposition";

    /* renamed from: o, reason: collision with root package name */
    private static final String f3352o = "Content-Encoding";

    /* renamed from: p, reason: collision with root package name */
    private static final String f3354p = "Content-Language";

    /* renamed from: q, reason: collision with root package name */
    private static final String f3356q = "Content-Length";

    /* renamed from: r, reason: collision with root package name */
    private static final String f3358r = "Content-Location";

    /* renamed from: s, reason: collision with root package name */
    private static final String f3360s = "Content-Range";

    /* renamed from: t, reason: collision with root package name */
    private static final String f3362t = "Content-Type";

    /* renamed from: u, reason: collision with root package name */
    private static final String f3364u = "Cookie";

    /* renamed from: v, reason: collision with root package name */
    private static final String f3366v = "DASL";

    /* renamed from: w, reason: collision with root package name */
    private static final String f3368w = "Date";

    /* renamed from: x, reason: collision with root package name */
    private static final String f3370x = "DAV";

    /* renamed from: y, reason: collision with root package name */
    private static final String f3372y = "Depth";

    /* renamed from: z, reason: collision with root package name */
    private static final String f3374z = "Destination";

    /* renamed from: A, reason: collision with root package name */
    private static final String f3275A = "ETag";

    /* renamed from: B, reason: collision with root package name */
    private static final String f3277B = "Expect";

    /* renamed from: C, reason: collision with root package name */
    private static final String f3279C = "Expires";

    /* renamed from: D, reason: collision with root package name */
    private static final String f3281D = "From";

    /* renamed from: E, reason: collision with root package name */
    private static final String f3283E = "Forwarded";

    /* renamed from: F, reason: collision with root package name */
    private static final String f3285F = "Host";

    /* renamed from: G, reason: collision with root package name */
    private static final String f3287G = "HTTP2-Settings";

    /* renamed from: H, reason: collision with root package name */
    private static final String f3289H = "If";

    /* renamed from: I, reason: collision with root package name */
    private static final String f3291I = "If-Match";

    /* renamed from: J, reason: collision with root package name */
    private static final String f3293J = "If-Modified-Since";

    /* renamed from: K, reason: collision with root package name */
    private static final String f3295K = "If-None-Match";

    /* renamed from: L, reason: collision with root package name */
    private static final String f3297L = "If-Range";

    /* renamed from: M, reason: collision with root package name */
    private static final String f3299M = "If-Schedule-Tag-Match";

    /* renamed from: N, reason: collision with root package name */
    private static final String f3301N = "If-Unmodified-Since";

    /* renamed from: O, reason: collision with root package name */
    private static final String f3303O = "Last-Modified";

    /* renamed from: P, reason: collision with root package name */
    private static final String f3305P = "Location";

    /* renamed from: Q, reason: collision with root package name */
    private static final String f3307Q = "Lock-Token";

    /* renamed from: R, reason: collision with root package name */
    private static final String f3309R = "Link";

    /* renamed from: S, reason: collision with root package name */
    private static final String f3311S = "Max-Forwards";

    /* renamed from: T, reason: collision with root package name */
    private static final String f3313T = "MIME-Version";

    /* renamed from: U, reason: collision with root package name */
    private static final String f3315U = "Ordering-Type";

    /* renamed from: V, reason: collision with root package name */
    private static final String f3317V = "Origin";

    /* renamed from: W, reason: collision with root package name */
    private static final String f3319W = "Overwrite";

    /* renamed from: X, reason: collision with root package name */
    private static final String f3321X = "Position";

    /* renamed from: Y, reason: collision with root package name */
    private static final String f3322Y = "Pragma";

    /* renamed from: Z, reason: collision with root package name */
    private static final String f3323Z = "Prefer";

    /* renamed from: a0, reason: collision with root package name */
    private static final String f3325a0 = "Preference-Applied";

    /* renamed from: b0, reason: collision with root package name */
    private static final String f3327b0 = "Proxy-Authenticate";

    /* renamed from: c0, reason: collision with root package name */
    private static final String f3329c0 = "Proxy-Authentication-Info";

    /* renamed from: d0, reason: collision with root package name */
    private static final String f3331d0 = "Proxy-Authorization";

    /* renamed from: e0, reason: collision with root package name */
    private static final String f3333e0 = "Public-Key-Pins";

    /* renamed from: f0, reason: collision with root package name */
    private static final String f3335f0 = "Public-Key-Pins-Report-Only";

    /* renamed from: g0, reason: collision with root package name */
    private static final String f3337g0 = "Range";

    /* renamed from: h0, reason: collision with root package name */
    private static final String f3339h0 = "Referer";

    /* renamed from: i0, reason: collision with root package name */
    private static final String f3341i0 = "Retry-After";

    /* renamed from: j0, reason: collision with root package name */
    private static final String f3343j0 = "Schedule-Reply";

    /* renamed from: k0, reason: collision with root package name */
    private static final String f3345k0 = "Schedule-Tag";

    /* renamed from: l0, reason: collision with root package name */
    private static final String f3347l0 = "Sec-WebSocket-Accept";

    /* renamed from: m0, reason: collision with root package name */
    private static final String f3349m0 = "Sec-WebSocket-Extensions";

    /* renamed from: n0, reason: collision with root package name */
    private static final String f3351n0 = "Sec-WebSocket-Key";

    /* renamed from: o0, reason: collision with root package name */
    private static final String f3353o0 = "Sec-WebSocket-Protocol";

    /* renamed from: p0, reason: collision with root package name */
    private static final String f3355p0 = "Sec-WebSocket-Version";

    /* renamed from: q0, reason: collision with root package name */
    private static final String f3357q0 = "Server";

    /* renamed from: r0, reason: collision with root package name */
    private static final String f3359r0 = "Set-Cookie";

    /* renamed from: s0, reason: collision with root package name */
    private static final String f3361s0 = "SLUG";

    /* renamed from: t0, reason: collision with root package name */
    private static final String f3363t0 = "Strict-Transport-Security";

    /* renamed from: u0, reason: collision with root package name */
    private static final String f3365u0 = "TE";

    /* renamed from: v0, reason: collision with root package name */
    private static final String f3367v0 = "Timeout";

    /* renamed from: w0, reason: collision with root package name */
    private static final String f3369w0 = "Trailer";

    /* renamed from: x0, reason: collision with root package name */
    private static final String f3371x0 = "Transfer-Encoding";

    /* renamed from: y0, reason: collision with root package name */
    private static final String f3373y0 = "Upgrade";

    /* renamed from: z0, reason: collision with root package name */
    private static final String f3375z0 = "User-Agent";

    /* renamed from: A0, reason: collision with root package name */
    private static final String f3276A0 = "Vary";

    /* renamed from: B0, reason: collision with root package name */
    private static final String f3278B0 = "Via";

    /* renamed from: C0, reason: collision with root package name */
    private static final String f3280C0 = "Warning";

    /* renamed from: D0, reason: collision with root package name */
    private static final String f3282D0 = "WWW-Authenticate";

    /* renamed from: E0, reason: collision with root package name */
    private static final String f3284E0 = "Access-Control-Allow-Origin";

    /* renamed from: F0, reason: collision with root package name */
    private static final String f3286F0 = "Access-Control-Allow-Methods";

    /* renamed from: G0, reason: collision with root package name */
    private static final String f3288G0 = "Access-Control-Allow-Credentials";

    /* renamed from: H0, reason: collision with root package name */
    private static final String f3290H0 = "Access-Control-Allow-Headers";

    /* renamed from: I0, reason: collision with root package name */
    private static final String f3292I0 = "Access-Control-Request-Method";

    /* renamed from: J0, reason: collision with root package name */
    private static final String f3294J0 = "Access-Control-Request-Headers";

    /* renamed from: K0, reason: collision with root package name */
    private static final String f3296K0 = "Access-Control-Expose-Headers";

    /* renamed from: L0, reason: collision with root package name */
    private static final String f3298L0 = "Access-Control-Max-Age";

    /* renamed from: M0, reason: collision with root package name */
    private static final String f3300M0 = "X-Http-Method-Override";

    /* renamed from: N0, reason: collision with root package name */
    private static final String f3302N0 = "X-Forwarded-Host";

    /* renamed from: O0, reason: collision with root package name */
    private static final String f3304O0 = "X-Forwarded-Server";

    /* renamed from: P0, reason: collision with root package name */
    private static final String f3306P0 = "X-Forwarded-Proto";

    /* renamed from: Q0, reason: collision with root package name */
    private static final String f3308Q0 = "X-Forwarded-For";

    /* renamed from: R0, reason: collision with root package name */
    private static final String f3310R0 = "X-Forwarded-Port";

    /* renamed from: S0, reason: collision with root package name */
    private static final String f3312S0 = "X-Request-ID";

    /* renamed from: T0, reason: collision with root package name */
    private static final String f3314T0 = "X-Correlation-ID";

    /* renamed from: U0, reason: collision with root package name */
    private static final String f3316U0 = "X-Total-Count";

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        f3318V0 = strArr;
        f3320W0 = AbstractC6980h.c(strArr);
    }

    private o() {
    }

    public final void a(String str) {
        J6.r.e(str, "name");
        int i8 = 0;
        int i9 = 0;
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            int i10 = i9 + 1;
            if (J6.r.f(charAt, 32) <= 0 || p.b(charAt)) {
                throw new IllegalHeaderNameException(str, i9);
            }
            i8++;
            i9 = i10;
        }
    }

    public final void b(String str) {
        J6.r.e(str, "value");
        int i8 = 0;
        int i9 = 0;
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            int i10 = i9 + 1;
            if (J6.r.f(charAt, 32) < 0 && charAt != '\t') {
                throw new IllegalHeaderValueException(str, i9);
            }
            i8++;
            i9 = i10;
        }
    }

    public final String c() {
        return f3326b;
    }

    public final String d() {
        return f3328c;
    }

    public final String e() {
        return f3344k;
    }

    public final String f() {
        return f3352o;
    }

    public final String g() {
        return f3356q;
    }

    public final String h() {
        return f3362t;
    }

    public final String i() {
        return f3368w;
    }

    public final String j() {
        return f3279C;
    }

    public final String k() {
        return f3293J;
    }

    public final String l() {
        return f3301N;
    }

    public final String m() {
        return f3303O;
    }

    public final String n() {
        return f3305P;
    }

    public final String o() {
        return f3341i0;
    }

    public final String p() {
        return f3371x0;
    }

    public final List q() {
        return f3320W0;
    }

    public final String r() {
        return f3375z0;
    }
}
