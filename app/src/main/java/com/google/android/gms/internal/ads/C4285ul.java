package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import i3.BinderC5853b;
import java.util.concurrent.atomic.AtomicBoolean;
import v3.C6835a;

/* renamed from: com.google.android.gms.internal.ads.ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4285ul {

    /* renamed from: b, reason: collision with root package name */
    private static C4285ul f27095b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f27096a = new AtomicBoolean(false);

    C4285ul() {
    }

    public static C4285ul a() {
        if (f27095b == null) {
            f27095b = new C4285ul();
        }
        return f27095b;
    }

    public final Thread b(final Context context, final String str) {
        if (!this.f27096a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this) { // from class: com.google.android.gms.internal.ads.tl
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                AbstractC3184kf.a(context2);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23679G0)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) D2.A.c().a(AbstractC3184kf.f24026v0)).booleanValue());
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23647C0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((InterfaceC4521wu) H2.s.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new H2.r() { // from class: com.google.android.gms.internal.ads.sl
                        @Override // H2.r
                        public final Object a(Object obj) {
                            return AbstractBinderC4412vu.t7((IBinder) obj);
                        }
                    })).P4(BinderC5853b.p2(context2), new BinderC3958rl(C6835a.k(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | zzr | NullPointerException e8) {
                    H2.p.i("#007 Could not call remote method.", e8);
                }
            }
        });
        thread.start();
        return thread;
    }
}
