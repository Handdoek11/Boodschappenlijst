package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class Q00 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f18338a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f18339b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f18340c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f18341d;

    public Q00(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, ViewGroup viewGroup, Context context, Set set) {
        this.f18338a = interfaceExecutorServiceC3522nk0;
        this.f18341d = set;
        this.f18339b = viewGroup;
        this.f18340c = context;
    }

    final /* synthetic */ R00 a() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23732M5)).booleanValue() && this.f18339b != null && this.f18341d.contains("banner")) {
            return new R00(Boolean.valueOf(this.f18339b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23740N5)).booleanValue() && this.f18341d.contains("native")) {
            Context context = this.f18340c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new R00(bool);
            }
        }
        return new R00(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f18338a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.P00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18101o.a();
            }
        });
    }
}
