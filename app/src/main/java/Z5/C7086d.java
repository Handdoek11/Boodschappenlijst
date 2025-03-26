package z5;

import I6.l;
import J6.r;
import J6.s;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import x6.C6916E;
import y5.f;

/* renamed from: z5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7086d extends f {

    /* renamed from: c, reason: collision with root package name */
    private int f44913c = 100000;

    /* renamed from: d, reason: collision with root package name */
    private int f44914d = 100000;

    /* renamed from: e, reason: collision with root package name */
    private l f44915e = b.f44918o;

    /* renamed from: f, reason: collision with root package name */
    private l f44916f = a.f44917o;

    /* renamed from: z5.d$a */
    static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f44917o = new a();

        a() {
            super(1);
        }

        public final void b(HttpURLConnection httpURLConnection) {
            r.e(httpURLConnection, "$this$null");
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((HttpURLConnection) obj);
            return C6916E.f44463a;
        }
    }

    /* renamed from: z5.d$b */
    static final class b extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final b f44918o = new b();

        b() {
            super(1);
        }

        public final void b(HttpsURLConnection httpsURLConnection) {
            r.e(httpsURLConnection, "it");
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((HttpsURLConnection) obj);
            return C6916E.f44463a;
        }
    }

    public final int c() {
        return this.f44913c;
    }

    public final l d() {
        return this.f44916f;
    }

    public final int e() {
        return this.f44914d;
    }

    public final l f() {
        return this.f44915e;
    }
}
