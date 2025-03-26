package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4281uj extends C2.c {
    C4281uj(Context context, Looper looper, AbstractC0765d.a aVar, AbstractC0765d.b bVar) {
        super(AbstractC1389Ho.a(context), looper, 166, aVar, bVar, null);
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final C1203Cj j0() {
        return (C1203Cj) super.D();
    }

    @Override // Z2.AbstractC0765d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof C1203Cj ? (C1203Cj) queryLocalInterface : new C1203Cj(iBinder);
    }
}
