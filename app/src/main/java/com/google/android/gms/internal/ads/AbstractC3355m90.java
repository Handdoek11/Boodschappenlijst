package com.google.android.gms.internal.ads;

import M2.AbstractC0656c;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.m90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3355m90 {
    public static void a(com.google.common.util.concurrent.d dVar, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90) {
        g(dVar, runnableC3464n90, interfaceC2160b90, false);
    }

    public static void b(com.google.common.util.concurrent.d dVar, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90) {
        g(dVar, runnableC3464n90, interfaceC2160b90, true);
    }

    public static void c(com.google.common.util.concurrent.d dVar, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90) {
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            AbstractC2326ck0.r(Sj0.D(dVar), new C3246l90(runnableC3464n90, interfaceC2160b90), AbstractC1497Kq.f16650g);
        }
    }

    public static void d(com.google.common.util.concurrent.d dVar, InterfaceC2160b90 interfaceC2160b90) {
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            AbstractC2326ck0.r(Sj0.D(dVar), new C3028j90(interfaceC2160b90), AbstractC1497Kq.f16650g);
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) D2.A.c().a(AbstractC3184kf.I8), str);
    }

    public static int f(L60 l60) {
        int f8 = AbstractC0656c.f(l60) - 1;
        return (f8 == 0 || f8 == 1) ? 7 : 23;
    }

    private static void g(com.google.common.util.concurrent.d dVar, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90, boolean z7) {
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            AbstractC2326ck0.r(Sj0.D(dVar), new C3137k90(runnableC3464n90, interfaceC2160b90, z7), AbstractC1497Kq.f16650g);
        }
    }
}
