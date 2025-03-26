package D2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class J1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        String str = null;
        X1 x12 = null;
        int i9 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 2) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 3) {
                x12 = (X1) SafeParcelReader.e(parcel, t7, X1.CREATOR);
            } else if (l8 != 4) {
                SafeParcelReader.z(parcel, t7);
            } else {
                i9 = SafeParcelReader.v(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new I1(str, i8, x12, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new I1[i8];
    }
}
