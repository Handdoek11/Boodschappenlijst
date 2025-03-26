package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1868Vg extends AbstractC3612ob implements InterfaceC1938Xg {
    C1868Vg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final int a() {
        Parcel D02 = D0(5, w0());
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final Uri b() {
        Parcel D02 = D0(2, w0());
        Uri uri = (Uri) AbstractC3830qb.a(D02, Uri.CREATOR);
        D02.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final InterfaceC5852a c() {
        Parcel D02 = D0(1, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final int d() {
        Parcel D02 = D0(4, w0());
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938Xg
    public final double zzb() {
        Parcel D02 = D0(3, w0());
        double readDouble = D02.readDouble();
        D02.recycle();
        return readDouble;
    }
}
