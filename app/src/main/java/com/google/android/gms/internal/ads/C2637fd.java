package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import i3.BinderC5853b;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2637fd {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC4156tb f22079a;

    /* renamed from: b, reason: collision with root package name */
    boolean f22080b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f22081c;

    public C2637fd() {
        this.f22081c = H2.c.f2922b;
    }

    public C2637fd(final Context context) {
        ExecutorService executorService = H2.c.f2922b;
        this.f22081c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ad
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) D2.A.c().a(AbstractC3184kf.f23811W4)).booleanValue();
                C2637fd c2637fd = this.f20724o;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        c2637fd.f22079a = (InterfaceC4156tb) H2.s.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new H2.r() { // from class: com.google.android.gms.internal.ads.bd
                            @Override // H2.r
                            public final Object a(Object obj) {
                                return AbstractBinderC4047sb.t7((IBinder) obj);
                            }
                        });
                        c2637fd.f22079a.D6(BinderC5853b.p2(context2), "GMA_SDK");
                        c2637fd.f22080b = true;
                    } catch (RemoteException | zzr | NullPointerException unused) {
                        H2.p.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
