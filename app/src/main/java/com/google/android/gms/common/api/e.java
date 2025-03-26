package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        C1103b c1103b = null;
        int i8 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 2) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, t7, PendingIntent.CREATOR);
            } else if (l8 != 4) {
                SafeParcelReader.z(parcel, t7);
            } else {
                c1103b = (C1103b) SafeParcelReader.e(parcel, t7, C1103b.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new Status(i8, str, pendingIntent, c1103b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Status[i8];
    }
}
