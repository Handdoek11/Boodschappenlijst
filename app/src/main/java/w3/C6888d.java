package w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: w3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6888d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        com.google.android.gms.measurement.internal.D d8 = null;
        String str2 = null;
        long j8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 3) {
                d8 = (com.google.android.gms.measurement.internal.D) SafeParcelReader.e(parcel, t7, com.google.android.gms.measurement.internal.D.CREATOR);
            } else if (l8 == 4) {
                str2 = SafeParcelReader.f(parcel, t7);
            } else if (l8 != 5) {
                SafeParcelReader.z(parcel, t7);
            } else {
                j8 = SafeParcelReader.w(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new com.google.android.gms.measurement.internal.E(str, d8, str2, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new com.google.android.gms.measurement.internal.E[i8];
    }
}
