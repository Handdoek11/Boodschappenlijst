package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.uV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4258uV {

    /* renamed from: a, reason: collision with root package name */
    private final C2373d70 f27064a;

    /* renamed from: b, reason: collision with root package name */
    private final C4031sM f27065b;

    /* renamed from: c, reason: collision with root package name */
    private final HN f27066c;

    public C4258uV(C2373d70 c2373d70, C4031sM c4031sM, HN hn) {
        this.f27064a = c2373d70;
        this.f27065b = c4031sM;
        this.f27066c = hn;
    }

    public final void a(C4111t60 c4111t60, C3785q60 c3785q60, int i8, zzeda zzedaVar, long j8) {
        C3922rM c3922rM;
        GN a8 = this.f27066c.a();
        a8.d(c4111t60);
        a8.c(c3785q60);
        a8.b("action", "adapter_status");
        a8.b("adapter_l", String.valueOf(j8));
        a8.b("sc", Integer.toString(i8));
        if (zzedaVar != null) {
            a8.b("arec", Integer.toString(zzedaVar.b().f1162o));
            String a9 = this.f27064a.a(zzedaVar.getMessage());
            if (a9 != null) {
                a8.b("areec", a9);
            }
        }
        C4031sM c4031sM = this.f27065b;
        Iterator it = c3785q60.f25816t.iterator();
        while (true) {
            if (!it.hasNext()) {
                c3922rM = null;
                break;
            } else {
                c3922rM = c4031sM.a((String) it.next());
                if (c3922rM != null) {
                    break;
                }
            }
        }
        if (c3922rM != null) {
            a8.b("ancn", c3922rM.f26161a);
            C1667Pm c1667Pm = c3922rM.f26162b;
            if (c1667Pm != null) {
                a8.b("adapter_v", c1667Pm.toString());
            }
            C1667Pm c1667Pm2 = c3922rM.f26163c;
            if (c1667Pm2 != null) {
                a8.b("adapter_sv", c1667Pm2.toString());
            }
        }
        a8.g();
    }
}
