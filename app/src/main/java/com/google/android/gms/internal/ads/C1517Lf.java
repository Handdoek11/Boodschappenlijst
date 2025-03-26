package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1517Lf {

    /* renamed from: a, reason: collision with root package name */
    private androidx.browser.customtabs.f f16864a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.browser.customtabs.c f16865b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.browser.customtabs.e f16866c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1482Kf f16867d;

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i8 = 0; i8 < queryIntentActivities.size(); i8++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i8).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(AbstractC4312uy0.a(context));
                    }
                }
            }
        }
        return false;
    }

    public final androidx.browser.customtabs.f a() {
        androidx.browser.customtabs.c cVar = this.f16865b;
        if (cVar == null) {
            this.f16864a = null;
        } else if (this.f16864a == null) {
            this.f16864a = cVar.e(null);
        }
        return this.f16864a;
    }

    public final void b(Activity activity) {
        String a8;
        if (this.f16865b == null && (a8 = AbstractC4312uy0.a(activity)) != null) {
            C4421vy0 c4421vy0 = new C4421vy0(this);
            this.f16866c = c4421vy0;
            androidx.browser.customtabs.c.a(activity, a8, c4421vy0);
        }
    }

    public final void c(androidx.browser.customtabs.c cVar) {
        this.f16865b = cVar;
        cVar.g(0L);
        InterfaceC1482Kf interfaceC1482Kf = this.f16867d;
        if (interfaceC1482Kf != null) {
            interfaceC1482Kf.zza();
        }
    }

    public final void d() {
        this.f16865b = null;
        this.f16864a = null;
    }

    public final void e(InterfaceC1482Kf interfaceC1482Kf) {
        this.f16867d = interfaceC1482Kf;
    }

    public final void f(Activity activity) {
        androidx.browser.customtabs.e eVar = this.f16866c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f16865b = null;
        this.f16864a = null;
        this.f16866c = null;
    }
}
