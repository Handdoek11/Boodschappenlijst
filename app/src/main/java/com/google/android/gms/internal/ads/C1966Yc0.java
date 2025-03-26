package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.Yc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1966Yc0 extends C2.c {

    /* renamed from: F, reason: collision with root package name */
    private final int f20294F;

    public C1966Yc0(Context context, Looper looper, AbstractC0765d.a aVar, AbstractC0765d.b bVar, int i8) {
        super(context, looper, 116, aVar, bVar, null);
        this.f20294F = i8;
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.gass.START";
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public final int j() {
        return this.f20294F;
    }

    public final C2421dd0 j0() {
        return (C2421dd0) super.D();
    }

    @Override // Z2.AbstractC0765d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof C2421dd0 ? (C2421dd0) queryLocalInterface : new C2421dd0(iBinder);
    }
}
