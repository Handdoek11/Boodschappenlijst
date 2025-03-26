package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Yp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1985Yp {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC1985Yp f20330a;

    public static synchronized AbstractC1985Yp d(Context context) {
        synchronized (AbstractC1985Yp.class) {
            try {
                AbstractC1985Yp abstractC1985Yp = f20330a;
                if (abstractC1985Yp != null) {
                    return abstractC1985Yp;
                }
                Context applicationContext = context.getApplicationContext();
                AbstractC3184kf.a(applicationContext);
                InterfaceC0611r0 j8 = C2.v.s().j();
                j8.X(applicationContext);
                C1705Qp c1705Qp = new C1705Qp(null);
                c1705Qp.b(applicationContext);
                c1705Qp.c(C2.v.c());
                c1705Qp.a(j8);
                c1705Qp.d(C2.v.r());
                AbstractC1985Yp e8 = c1705Qp.e();
                f20330a = e8;
                e8.a().a();
                C2337cq c8 = f20330a.c();
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23663E0)).booleanValue()) {
                    C2.v.t();
                    Map b02 = G2.D0.b0((String) D2.A.c().a(AbstractC3184kf.f23671F0));
                    Iterator it = b02.keySet().iterator();
                    while (it.hasNext()) {
                        c8.c((String) it.next());
                    }
                    c8.d(new C2120aq(c8, b02));
                }
                return f20330a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    abstract SharedPreferencesOnSharedPreferenceChangeListenerC1461Jp a();

    abstract C1600Np b();

    abstract C2337cq c();
}
