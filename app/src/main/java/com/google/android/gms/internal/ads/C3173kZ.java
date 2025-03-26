package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.kZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3173kZ implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f23619a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f23620b;

    C3173kZ(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context) {
        this.f23619a = interfaceExecutorServiceC3522nk0;
        this.f23620b = context;
    }

    private final Intent b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) D2.A.c().a(AbstractC3184kf.Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.f23620b.registerReceiver(null, intentFilter) : this.f23620b.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean c(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    final /* synthetic */ C3282lZ a() {
        double intExtra;
        boolean z7;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Tb)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.f23620b.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            z7 = batteryManager != null ? batteryManager.isCharging() : c(b());
        } else {
            Intent b8 = b();
            boolean c8 = c(b8);
            intExtra = b8 != null ? b8.getIntExtra("level", -1) / b8.getIntExtra("scale", -1) : -1.0d;
            z7 = c8;
        }
        return new C3282lZ(intExtra, z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f23619a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.iZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22990o.a();
            }
        });
    }
}
