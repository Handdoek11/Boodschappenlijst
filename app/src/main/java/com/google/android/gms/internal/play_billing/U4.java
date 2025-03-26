package com.google.android.gms.internal.play_billing;

import com.android.billingclient.api.C1075x;

/* loaded from: classes2.dex */
public abstract class U4 {
    public static InterfaceFutureC5225z1 a(C1075x c1075x) {
        Q4 q42 = new Q4();
        T4 t42 = new T4(q42);
        q42.f29806b = t42;
        q42.f29805a = c1075x.getClass();
        try {
            q42.f29805a = c1075x.a(q42);
        } catch (Exception e8) {
            t42.b(e8);
        }
        return t42;
    }
}
