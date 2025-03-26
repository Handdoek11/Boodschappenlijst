package com.google.android.gms.ads.internal.util;

import G2.S;
import H2.p;
import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import s1.C6722b;
import s1.k;
import s1.l;
import s1.t;

/* loaded from: classes.dex */
public class WorkManagerUtil extends S {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void t7(Context context) {
        try {
            t.e(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // G2.T
    public final void zze(InterfaceC5852a interfaceC5852a) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        t7(context);
        try {
            t d8 = t.d(context);
            d8.a("offline_ping_sender_work");
            d8.c((l) ((l.a) ((l.a) new l.a(OfflinePingSender.class).e(new C6722b.a().b(k.CONNECTED).a())).a("offline_ping_sender_work")).b());
        } catch (IllegalStateException e8) {
            p.h("Failed to instantiate WorkManager.", e8);
        }
    }

    @Override // G2.T
    public final boolean zzf(InterfaceC5852a interfaceC5852a, String str, String str2) {
        return zzg(interfaceC5852a, new E2.a(str, str2, ""));
    }

    @Override // G2.T
    public final boolean zzg(InterfaceC5852a interfaceC5852a, E2.a aVar) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        t7(context);
        C6722b a8 = new C6722b.a().b(k.CONNECTED).a();
        try {
            t.d(context).c((l) ((l.a) ((l.a) ((l.a) new l.a(OfflineNotificationPoster.class).e(a8)).f(new b.a().e("uri", aVar.f2142o).e("gws_query_id", aVar.f2143s).e("image_url", aVar.f2144t).a())).a("offline_notification_work")).b());
            return true;
        } catch (IllegalStateException e8) {
            p.h("Failed to instantiate WorkManager.", e8);
            return false;
        }
    }
}
