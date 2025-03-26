package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;

/* renamed from: com.google.android.gms.internal.ads.cS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2297cS implements ZC, InterfaceC3360mC {

    /* renamed from: t, reason: collision with root package name */
    private static final Object f21189t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static int f21190u;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC0611r0 f21191o;

    /* renamed from: s, reason: collision with root package name */
    private final C3384mS f21192s;

    public C2297cS(C3384mS c3384mS, InterfaceC0611r0 interfaceC0611r0) {
        this.f21192s = c3384mS;
        this.f21191o = interfaceC0611r0;
    }

    private final void a(boolean z7) {
        int i8;
        int intValue;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23854b6)).booleanValue() && !this.f21191o.L()) {
            Object obj = f21189t;
            synchronized (obj) {
                i8 = f21190u;
                intValue = ((Integer) D2.A.c().a(AbstractC3184kf.f23863c6)).intValue();
            }
            if (i8 < intValue) {
                this.f21192s.e(z7);
                synchronized (obj) {
                    f21190u++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
    public final void r0(D2.W0 w02) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void s() {
        a(true);
    }
}
