package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class A20 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f13488a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13489b;

    public A20(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context) {
        this.f13488a = interfaceExecutorServiceC3522nk0;
        this.f13489b = context;
    }

    final /* synthetic */ C4648y20 a() {
        boolean z7;
        int i8;
        TelephonyManager telephonyManager = (TelephonyManager) this.f13489b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        C2.v.t();
        int i9 = -1;
        if (G2.D0.b(this.f13489b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f13489b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i8 = type;
                i9 = ordinal;
            } else {
                i8 = -1;
            }
            z7 = connectivityManager.isActiveNetworkMetered();
        } else {
            z7 = false;
            i8 = -2;
        }
        return new C4648y20(networkOperator, i8, C2.v.u().k(this.f13489b), phoneType, z7, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f13488a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.z20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f28263o.a();
            }
        });
    }
}
