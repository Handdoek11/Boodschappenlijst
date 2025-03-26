package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import com.google.android.gms.internal.play_billing.AbstractC5208w;
import com.google.android.gms.internal.play_billing.J3;
import com.google.android.gms.internal.play_billing.L3;
import com.google.android.gms.internal.play_billing.O3;
import com.google.android.gms.internal.play_billing.Q3;
import com.google.android.gms.internal.play_billing.R3;
import com.google.android.gms.internal.play_billing.V3;

/* loaded from: classes.dex */
public abstract /* synthetic */ class F {
    static {
        int i8 = G.f12288a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + AbstractC5208w.b(exc.getMessage());
            int i8 = AbstractC5103e1.f29892a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static L3 b(int i8, int i9, C1057e c1057e) {
        try {
            J3 E7 = L3.E();
            R3 G7 = V3.G();
            G7.w(c1057e.b());
            G7.v(c1057e.a());
            G7.x(i8);
            E7.u(G7);
            E7.v(i9);
            return (L3) E7.p();
        } catch (Exception e8) {
            AbstractC5103e1.k("BillingLogger", "Unable to create logging payload", e8);
            return null;
        }
    }

    public static L3 c(int i8, int i9, C1057e c1057e, String str) {
        try {
            R3 G7 = V3.G();
            G7.w(c1057e.b());
            G7.v(c1057e.a());
            G7.x(i8);
            if (str != null) {
                G7.u(str);
            }
            J3 E7 = L3.E();
            E7.u(G7);
            E7.v(i9);
            return (L3) E7.p();
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static Q3 d(int i8) {
        try {
            O3 D7 = Q3.D();
            D7.v(i8);
            return (Q3) D7.p();
        } catch (Exception e8) {
            AbstractC5103e1.k("BillingLogger", "Unable to create logging payload", e8);
            return null;
        }
    }
}
