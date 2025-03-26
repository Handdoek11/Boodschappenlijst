package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2116ao extends C2.c {
    public C2116ao(Context context, Looper looper, AbstractC0765d.a aVar, AbstractC0765d.b bVar) {
        super(AbstractC1389Ho.a(context), looper, 8, aVar, bVar, null);
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.ads.service.START";
    }

    public final InterfaceC3202ko j0() {
        return (InterfaceC3202ko) super.D();
    }

    @Override // Z2.AbstractC0765d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof InterfaceC3202ko ? (InterfaceC3202ko) queryLocalInterface : new C2985io(iBinder);
    }
}
