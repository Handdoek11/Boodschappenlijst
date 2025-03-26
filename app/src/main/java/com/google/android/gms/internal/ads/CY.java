package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class CY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14185a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f14186b;

    CY(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context) {
        this.f14186b = interfaceExecutorServiceC3522nk0;
        this.f14185a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Kc)).booleanValue()) {
            return AbstractC2326ck0.h(new DY(null, false));
        }
        final ContentResolver contentResolver = this.f14185a.getContentResolver();
        return contentResolver == null ? AbstractC2326ck0.h(new DY(null, false)) : this.f14186b.p0(new Callable() { // from class: com.google.android.gms.internal.ads.BY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new DY(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}
