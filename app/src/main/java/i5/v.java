package I5;

import J6.AbstractC0650j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y6.AbstractC6971J;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: d0, reason: collision with root package name */
    private static final List f3426d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Map f3428e0;

    /* renamed from: a, reason: collision with root package name */
    private final int f3450a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3451b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f3423c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final v f3425d = new v(100, "Continue");

    /* renamed from: e, reason: collision with root package name */
    private static final v f3427e = new v(101, "Switching Protocols");

    /* renamed from: f, reason: collision with root package name */
    private static final v f3429f = new v(102, "Processing");

    /* renamed from: g, reason: collision with root package name */
    private static final v f3430g = new v(200, "OK");

    /* renamed from: h, reason: collision with root package name */
    private static final v f3431h = new v(201, "Created");

    /* renamed from: i, reason: collision with root package name */
    private static final v f3432i = new v(202, "Accepted");

    /* renamed from: j, reason: collision with root package name */
    private static final v f3433j = new v(203, "Non-Authoritative Information");

    /* renamed from: k, reason: collision with root package name */
    private static final v f3434k = new v(204, "No Content");

    /* renamed from: l, reason: collision with root package name */
    private static final v f3435l = new v(205, "Reset Content");

    /* renamed from: m, reason: collision with root package name */
    private static final v f3436m = new v(206, "Partial Content");

    /* renamed from: n, reason: collision with root package name */
    private static final v f3437n = new v(207, "Multi-Status");

    /* renamed from: o, reason: collision with root package name */
    private static final v f3438o = new v(300, "Multiple Choices");

    /* renamed from: p, reason: collision with root package name */
    private static final v f3439p = new v(301, "Moved Permanently");

    /* renamed from: q, reason: collision with root package name */
    private static final v f3440q = new v(302, "Found");

    /* renamed from: r, reason: collision with root package name */
    private static final v f3441r = new v(303, "See Other");

    /* renamed from: s, reason: collision with root package name */
    private static final v f3442s = new v(304, "Not Modified");

    /* renamed from: t, reason: collision with root package name */
    private static final v f3443t = new v(305, "Use Proxy");

    /* renamed from: u, reason: collision with root package name */
    private static final v f3444u = new v(306, "Switch Proxy");

    /* renamed from: v, reason: collision with root package name */
    private static final v f3445v = new v(307, "Temporary Redirect");

    /* renamed from: w, reason: collision with root package name */
    private static final v f3446w = new v(308, "Permanent Redirect");

    /* renamed from: x, reason: collision with root package name */
    private static final v f3447x = new v(400, "Bad Request");

    /* renamed from: y, reason: collision with root package name */
    private static final v f3448y = new v(401, "Unauthorized");

    /* renamed from: z, reason: collision with root package name */
    private static final v f3449z = new v(402, "Payment Required");

    /* renamed from: A, reason: collision with root package name */
    private static final v f3395A = new v(403, "Forbidden");

    /* renamed from: B, reason: collision with root package name */
    private static final v f3396B = new v(404, "Not Found");

    /* renamed from: C, reason: collision with root package name */
    private static final v f3397C = new v(405, "Method Not Allowed");

    /* renamed from: D, reason: collision with root package name */
    private static final v f3398D = new v(406, "Not Acceptable");

    /* renamed from: E, reason: collision with root package name */
    private static final v f3399E = new v(407, "Proxy Authentication Required");

    /* renamed from: F, reason: collision with root package name */
    private static final v f3400F = new v(408, "Request Timeout");

    /* renamed from: G, reason: collision with root package name */
    private static final v f3401G = new v(409, "Conflict");

    /* renamed from: H, reason: collision with root package name */
    private static final v f3402H = new v(410, "Gone");

    /* renamed from: I, reason: collision with root package name */
    private static final v f3403I = new v(411, "Length Required");

    /* renamed from: J, reason: collision with root package name */
    private static final v f3404J = new v(412, "Precondition Failed");

    /* renamed from: K, reason: collision with root package name */
    private static final v f3405K = new v(413, "Payload Too Large");

    /* renamed from: L, reason: collision with root package name */
    private static final v f3406L = new v(414, "Request-URI Too Long");

    /* renamed from: M, reason: collision with root package name */
    private static final v f3407M = new v(415, "Unsupported Media Type");

    /* renamed from: N, reason: collision with root package name */
    private static final v f3408N = new v(416, "Requested Range Not Satisfiable");

    /* renamed from: O, reason: collision with root package name */
    private static final v f3409O = new v(417, "Expectation Failed");

    /* renamed from: P, reason: collision with root package name */
    private static final v f3410P = new v(422, "Unprocessable Entity");

    /* renamed from: Q, reason: collision with root package name */
    private static final v f3411Q = new v(423, "Locked");

    /* renamed from: R, reason: collision with root package name */
    private static final v f3412R = new v(424, "Failed Dependency");

    /* renamed from: S, reason: collision with root package name */
    private static final v f3413S = new v(426, "Upgrade Required");

    /* renamed from: T, reason: collision with root package name */
    private static final v f3414T = new v(429, "Too Many Requests");

    /* renamed from: U, reason: collision with root package name */
    private static final v f3415U = new v(431, "Request Header Fields Too Large");

    /* renamed from: V, reason: collision with root package name */
    private static final v f3416V = new v(500, "Internal Server Error");

    /* renamed from: W, reason: collision with root package name */
    private static final v f3417W = new v(501, "Not Implemented");

    /* renamed from: X, reason: collision with root package name */
    private static final v f3418X = new v(502, "Bad Gateway");

    /* renamed from: Y, reason: collision with root package name */
    private static final v f3419Y = new v(503, "Service Unavailable");

    /* renamed from: Z, reason: collision with root package name */
    private static final v f3420Z = new v(504, "Gateway Timeout");

    /* renamed from: a0, reason: collision with root package name */
    private static final v f3421a0 = new v(505, "HTTP Version Not Supported");

    /* renamed from: b0, reason: collision with root package name */
    private static final v f3422b0 = new v(506, "Variant Also Negotiates");

    /* renamed from: c0, reason: collision with root package name */
    private static final v f3424c0 = new v(507, "Insufficient Storage");

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final v A() {
            return v.f3442s;
        }

        public final v B() {
            return v.f3430g;
        }

        public final v C() {
            return v.f3436m;
        }

        public final v D() {
            return v.f3405K;
        }

        public final v E() {
            return v.f3449z;
        }

        public final v F() {
            return v.f3446w;
        }

        public final v G() {
            return v.f3404J;
        }

        public final v H() {
            return v.f3429f;
        }

        public final v I() {
            return v.f3399E;
        }

        public final v J() {
            return v.f3415U;
        }

        public final v K() {
            return v.f3400F;
        }

        public final v L() {
            return v.f3406L;
        }

        public final v M() {
            return v.f3408N;
        }

        public final v N() {
            return v.f3435l;
        }

        public final v O() {
            return v.f3441r;
        }

        public final v P() {
            return v.f3419Y;
        }

        public final v Q() {
            return v.f3444u;
        }

        public final v R() {
            return v.f3427e;
        }

        public final v S() {
            return v.f3445v;
        }

        public final v T() {
            return v.f3414T;
        }

        public final v U() {
            return v.f3448y;
        }

        public final v V() {
            return v.f3410P;
        }

        public final v W() {
            return v.f3407M;
        }

        public final v X() {
            return v.f3413S;
        }

        public final v Y() {
            return v.f3443t;
        }

        public final v Z() {
            return v.f3422b0;
        }

        public final v a(int i8) {
            v vVar = (v) v.f3428e0.get(Integer.valueOf(i8));
            return vVar == null ? new v(i8, "Unknown Status Code") : vVar;
        }

        public final v a0() {
            return v.f3421a0;
        }

        public final v b() {
            return v.f3432i;
        }

        public final v c() {
            return v.f3418X;
        }

        public final v d() {
            return v.f3447x;
        }

        public final v e() {
            return v.f3401G;
        }

        public final v f() {
            return v.f3425d;
        }

        public final v g() {
            return v.f3431h;
        }

        public final v h() {
            return v.f3409O;
        }

        public final v i() {
            return v.f3412R;
        }

        public final v j() {
            return v.f3395A;
        }

        public final v k() {
            return v.f3440q;
        }

        public final v l() {
            return v.f3420Z;
        }

        public final v m() {
            return v.f3402H;
        }

        public final v n() {
            return v.f3424c0;
        }

        public final v o() {
            return v.f3416V;
        }

        public final v p() {
            return v.f3403I;
        }

        public final v q() {
            return v.f3411Q;
        }

        public final v r() {
            return v.f3397C;
        }

        public final v s() {
            return v.f3439p;
        }

        public final v t() {
            return v.f3437n;
        }

        public final v u() {
            return v.f3438o;
        }

        public final v v() {
            return v.f3434k;
        }

        public final v w() {
            return v.f3433j;
        }

        public final v x() {
            return v.f3398D;
        }

        public final v y() {
            return v.f3396B;
        }

        public final v z() {
            return v.f3417W;
        }

        private a() {
        }
    }

    static {
        List a8 = w.a();
        f3426d0 = a8;
        List list = a8;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P6.m.c(AbstractC6971J.b(AbstractC6987o.l(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((v) obj).f3450a), obj);
        }
        f3428e0 = linkedHashMap;
    }

    public v(int i8, String str) {
        J6.r.e(str, "description");
        this.f3450a = i8;
        this.f3451b = str;
    }

    public final int b0() {
        return this.f3450a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && ((v) obj).f3450a == this.f3450a;
    }

    public int hashCode() {
        return this.f3450a;
    }

    public String toString() {
        return this.f3450a + ' ' + this.f3451b;
    }
}
