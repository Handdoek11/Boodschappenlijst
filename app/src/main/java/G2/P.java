package G2;

import com.google.android.gms.internal.ads.C1811Tq;
import com.google.android.gms.internal.ads.V6;
import com.google.android.gms.internal.ads.zzaou;
import java.util.Map;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private static V6 f2599a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2600b = new Object();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public P(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r4 = r4.getApplicationContext()
        Ld:
            java.lang.Object r0 = G2.P.f2600b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.V6 r1 = G2.P.f2599a     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L3d
            com.google.android.gms.internal.ads.AbstractC3184kf.a(r4)     // Catch: java.lang.Throwable -> L34
            boolean r1 = f3.AbstractC5780d.c()     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L36
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.f24038w4     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.V6 r4 = G2.A.b(r4)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r4 = move-exception
            goto L3f
        L36:
            r1 = 0
            com.google.android.gms.internal.ads.V6 r4 = com.google.android.gms.internal.ads.AbstractC4548x7.a(r4, r1)     // Catch: java.lang.Throwable -> L34
        L3b:
            G2.P.f2599a = r4     // Catch: java.lang.Throwable -> L34
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.P.<init>(android.content.Context):void");
    }

    public final com.google.common.util.concurrent.d a(String str) {
        C1811Tq c1811Tq = new C1811Tq();
        f2599a.a(new N(str, null, c1811Tq));
        return c1811Tq;
    }

    public final com.google.common.util.concurrent.d b(int i8, String str, Map map, byte[] bArr) {
        L l8 = new L(null);
        J j8 = new J(this, str, l8);
        H2.m mVar = new H2.m(null);
        K k8 = new K(this, i8, str, l8, j8, bArr, map, mVar);
        if (H2.m.k()) {
            try {
                mVar.d(str, "GET", k8.q(), k8.C());
            } catch (zzaou e8) {
                H2.p.g(e8.getMessage());
            }
        }
        f2599a.a(k8);
        return l8;
    }
}
