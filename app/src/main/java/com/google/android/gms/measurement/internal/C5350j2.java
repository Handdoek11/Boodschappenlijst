package com.google.android.gms.measurement.internal;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import w3.InterfaceC6890f;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5350j2 extends AbstractC0765d {
    public C5350j2(Context context, Looper looper, AbstractC0765d.a aVar, AbstractC0765d.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public final int j() {
        return 12451000;
    }

    @Override // Z2.AbstractC0765d
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC6890f ? (InterfaceC6890f) queryLocalInterface : new C5315e2(iBinder);
    }
}
