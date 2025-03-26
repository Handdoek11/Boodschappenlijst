package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class T00 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19041a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f19042b;

    T00(Context context, Intent intent) {
        this.f19041a = context;
        this.f19042b = intent;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        AbstractC0608p0.k("HsdpMigrationSignal.produce");
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Hc)).booleanValue()) {
            return AbstractC2326ck0.h(new U00(null));
        }
        boolean z7 = false;
        try {
            if (this.f19042b.resolveActivity(this.f19041a.getPackageManager()) != null) {
                AbstractC0608p0.k("HSDP intent is supported");
                z7 = true;
            }
        } catch (Exception e8) {
            C2.v.s().x(e8, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return AbstractC2326ck0.h(new U00(Boolean.valueOf(z7)));
    }
}
