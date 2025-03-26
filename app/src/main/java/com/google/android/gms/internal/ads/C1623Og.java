package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1623Og extends AbstractC3612ob implements InterfaceC1693Qg {
    C1623Og(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1693Qg
    public final List e() {
        Parcel D02 = D0(3, w0());
        ArrayList b8 = AbstractC3830qb.b(D02);
        D02.recycle();
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1693Qg
    public final String g() {
        Parcel D02 = D0(2, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }
}
