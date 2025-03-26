package z5;

import A6.g;
import I6.l;
import I6.p;
import J6.r;
import J6.s;
import U6.C0706b0;
import U6.I;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import x6.AbstractC6929k;
import x6.C6916E;
import x6.InterfaceC6928j;
import y5.AbstractC6959b;
import y6.P;

/* renamed from: z5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7084b extends AbstractC6959b {

    /* renamed from: u, reason: collision with root package name */
    private final C7086d f44894u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC6928j f44895v;

    /* renamed from: w, reason: collision with root package name */
    private final Set f44896w;

    /* renamed from: z5.b$a */
    static final class a extends s implements I6.a {
        a() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I invoke() {
            return G5.c.a(C0706b0.f5434a, C7084b.this.H().b(), "ktor-android-dispatcher");
        }
    }

    /* renamed from: z5.b$b, reason: collision with other inner class name */
    static final class C0363b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f44898o;

        /* renamed from: s, reason: collision with root package name */
        Object f44899s;

        /* renamed from: t, reason: collision with root package name */
        Object f44900t;

        /* renamed from: u, reason: collision with root package name */
        Object f44901u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f44902v;

        /* renamed from: x, reason: collision with root package name */
        int f44904x;

        C0363b(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44902v = obj;
            this.f44904x |= Integer.MIN_VALUE;
            return C7084b.this.y0(null, this);
        }
    }

    /* renamed from: z5.b$c */
    static final class c extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ g f44905o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ E5.d f44906s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Q5.b f44907t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g gVar, E5.d dVar, Q5.b bVar) {
            super(1);
            this.f44905o = gVar;
            this.f44906s = dVar;
            this.f44907t = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final E5.g invoke(java.net.HttpURLConnection r11) {
            /*
                r10 = this;
                java.lang.String r0 = "current"
                J6.r.e(r11, r0)
                int r0 = r11.getResponseCode()
                java.lang.String r1 = r11.getResponseMessage()
                if (r1 == 0) goto L16
                I5.v r2 = new I5.v
                r2.<init>(r0, r1)
            L14:
                r4 = r2
                goto L1d
            L16:
                I5.v$a r1 = I5.v.f3423c
                I5.v r2 = r1.a(r0)
                goto L14
            L1d:
                A6.g r0 = r10.f44905o
                E5.d r1 = r10.f44906s
                io.ktor.utils.io.f r8 = z5.AbstractC7087e.a(r11, r0, r1)
                java.util.Map r11 = r11.getHeaderFields()
                java.lang.String r0 = "current.headerFields"
                J6.r.d(r11, r0)
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                int r1 = r11.size()
                int r1 = y6.AbstractC6971J.b(r1)
                r0.<init>(r1)
                java.util.Set r11 = r11.entrySet()
                java.util.Iterator r11 = r11.iterator()
            L43:
                boolean r1 = r11.hasNext()
                if (r1 == 0) goto L7a
                java.lang.Object r1 = r11.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L70
                java.lang.String r3 = "key"
                J6.r.d(r2, r3)
                java.util.Locale r3 = java.util.Locale.getDefault()
                java.lang.String r5 = "getDefault()"
                J6.r.d(r3, r5)
                java.lang.String r2 = r2.toLowerCase(r3)
                java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
                J6.r.d(r2, r3)
                if (r2 != 0) goto L72
            L70:
                java.lang.String r2 = ""
            L72:
                java.lang.Object r1 = r1.getValue()
                r0.put(r2, r1)
                goto L43
            L7a:
                java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
                r11.<init>()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L87:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lab
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = S6.h.t(r2)
                if (r2 != 0) goto L87
                java.lang.Object r2 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                r11.put(r2, r1)
                goto L87
            Lab:
                I5.u$a r0 = I5.u.f3386d
                I5.u r7 = r0.a()
                I5.m r6 = new I5.m
                r6.<init>(r11)
                E5.g r11 = new E5.g
                Q5.b r5 = r10.f44907t
                A6.g r9 = r10.f44905o
                r3 = r11
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.C7084b.c.invoke(java.net.HttpURLConnection):E5.g");
        }
    }

    /* renamed from: z5.b$d */
    static final class d extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ HttpURLConnection f44908o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HttpURLConnection httpURLConnection) {
            super(2);
            this.f44908o = httpURLConnection;
        }

        public final void b(String str, String str2) {
            r.e(str, "key");
            r.e(str2, "value");
            this.f44908o.addRequestProperty(str, str2);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (String) obj2);
            return C6916E.f44463a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7084b(C7086d c7086d) {
        super("ktor-android");
        r.e(c7086d, "config");
        this.f44894u = c7086d;
        this.f44895v = AbstractC6929k.a(new a());
        this.f44896w = P.a(B5.s.f708d);
    }

    private final HttpURLConnection f(String str) {
        URL url = new URL(str);
        Proxy a8 = H().a();
        URLConnection openConnection = a8 != null ? url.openConnection(a8) : null;
        if (openConnection == null) {
            openConnection = url.openConnection();
            r.d(openConnection, "url.openConnection()");
        }
        return (HttpURLConnection) openConnection;
    }

    @Override // y5.AbstractC6959b, y5.InterfaceC6958a
    public Set J() {
        return this.f44896w;
    }

    @Override // y5.InterfaceC6958a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C7086d H() {
        return this.f44894u;
    }

    @Override // y5.InterfaceC6958a
    public I r0() {
        return (I) this.f44895v.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1 A[PHI: r1
  0x01c1: PHI (r1v11 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:51:0x01be, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // y5.InterfaceC6958a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object y0(E5.d r26, A6.d r27) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.C7084b.y0(E5.d, A6.d):java.lang.Object");
    }
}
