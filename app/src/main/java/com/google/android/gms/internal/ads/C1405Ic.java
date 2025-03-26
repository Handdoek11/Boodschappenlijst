package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1405Ic implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        long j8 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, t7, ParcelFileDescriptor.CREATOR);
            } else if (l8 == 3) {
                z7 = SafeParcelReader.m(parcel, t7);
            } else if (l8 == 4) {
                z8 = SafeParcelReader.m(parcel, t7);
            } else if (l8 == 5) {
                j8 = SafeParcelReader.w(parcel, t7);
            } else if (l8 != 6) {
                SafeParcelReader.z(parcel, t7);
            } else {
                z9 = SafeParcelReader.m(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C1369Hc(parcelFileDescriptor, z7, z8, j8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1369Hc[i8];
    }
}
