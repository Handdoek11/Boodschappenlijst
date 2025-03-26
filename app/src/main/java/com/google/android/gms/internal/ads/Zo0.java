package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Zo0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Ro0 f20550a = new Xo0(null);

    public static Wo0 a(Ip0 ip0) {
        Uk0 uk0;
        To0 to0 = new To0();
        to0.b(ip0.a());
        Iterator it = ip0.e().iterator();
        while (it.hasNext()) {
            for (Gp0 gp0 : (List) it.next()) {
                int f8 = gp0.f() - 2;
                if (f8 == 1) {
                    uk0 = Uk0.f19440b;
                } else if (f8 == 2) {
                    uk0 = Uk0.f19441c;
                } else {
                    if (f8 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    uk0 = Uk0.f19442d;
                }
                int a8 = gp0.a();
                String e8 = gp0.e();
                if (e8.startsWith("type.googleapis.com/google.crypto.")) {
                    e8 = e8.substring(34);
                }
                to0.a(uk0, a8, e8, gp0.b().name());
            }
        }
        if (ip0.c() != null) {
            to0.c(ip0.c().a());
        }
        try {
            return to0.d();
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException(e9);
        }
    }
}
