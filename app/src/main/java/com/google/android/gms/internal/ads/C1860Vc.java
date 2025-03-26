package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.Vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1860Vc {

    /* renamed from: a, reason: collision with root package name */
    private C1441Jc f19631a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19632b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f19633c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f19634d = new Object();

    C1860Vc(Context context) {
        this.f19633c = context;
    }

    static /* bridge */ /* synthetic */ void e(C1860Vc c1860Vc) {
        synchronized (c1860Vc.f19634d) {
            try {
                C1441Jc c1441Jc = c1860Vc.f19631a;
                if (c1441Jc == null) {
                    return;
                }
                c1441Jc.g();
                c1860Vc.f19631a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final Future c(C1476Kc c1476Kc) {
        C1615Oc c1615Oc = new C1615Oc(this);
        C1790Tc c1790Tc = new C1790Tc(this, c1476Kc, c1615Oc);
        C1825Uc c1825Uc = new C1825Uc(this, c1615Oc);
        synchronized (this.f19634d) {
            C1441Jc c1441Jc = new C1441Jc(this.f19633c, C2.v.x().b(), c1790Tc, c1825Uc);
            this.f19631a = c1441Jc;
            c1441Jc.q();
        }
        return c1615Oc;
    }
}
