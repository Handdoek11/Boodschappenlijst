package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1105d;
import f3.AbstractC5778b;
import w2.AbstractC6873E;

/* renamed from: com.google.android.gms.internal.ads.Jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1441Jc extends C2.c {
    C1441Jc(Context context, Looper looper, AbstractC0765d.a aVar, AbstractC0765d.b bVar) {
        super(AbstractC1389Ho.a(context), looper, 123, aVar, bVar, null);
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean j0() {
        return ((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue() && AbstractC5778b.b(k(), AbstractC6873E.f44250a);
    }

    public final C1545Mc k0() {
        return (C1545Mc) super.D();
    }

    @Override // Z2.AbstractC0765d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof C1545Mc ? (C1545Mc) queryLocalInterface : new C1545Mc(iBinder);
    }

    @Override // Z2.AbstractC0765d
    public final C1105d[] v() {
        return AbstractC6873E.f44251b;
    }
}
