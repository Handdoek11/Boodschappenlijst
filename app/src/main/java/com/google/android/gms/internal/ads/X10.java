package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class X10 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f19943a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f19944b;

    /* renamed from: c, reason: collision with root package name */
    private final H2.a f19945c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19946d;

    X10(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context, H2.a aVar, String str) {
        this.f19943a = interfaceExecutorServiceC3522nk0;
        this.f19944b = context;
        this.f19945c = aVar;
        this.f19946d = str;
    }

    final /* synthetic */ Y10 a() {
        boolean g8 = h3.e.a(this.f19944b).g();
        C2.v.t();
        boolean f8 = G2.D0.f(this.f19944b);
        String str = this.f19945c.f2914o;
        C2.v.t();
        boolean g9 = G2.D0.g();
        C2.v.t();
        ApplicationInfo applicationInfo = this.f19944b.getApplicationInfo();
        int i8 = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.f19944b;
        return new Y10(g8, f8, str, g9, i8, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.f19946d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f19943a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.W10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19693o.a();
            }
        });
    }
}
