package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        byte[] bArr = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                bArr = SafeParcelReader.b(parcel, t7);
            } else if (l8 == 3) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, t7, ParcelFileDescriptor.CREATOR);
            } else if (l8 != 5) {
                SafeParcelReader.z(parcel, t7);
            } else {
                uri = (Uri) SafeParcelReader.e(parcel, t7, Uri.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new Asset(bArr, str, parcelFileDescriptor, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Asset[i8];
    }
}
