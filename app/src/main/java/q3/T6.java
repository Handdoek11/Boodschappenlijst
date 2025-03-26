package q3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class T6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        J6 j62 = null;
        String str = null;
        String str2 = null;
        K6[] k6Arr = null;
        H6[] h6Arr = null;
        String[] strArr = null;
        C6[] c6Arr = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    j62 = (J6) SafeParcelReader.e(parcel, t7, J6.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 4:
                    k6Arr = (K6[]) SafeParcelReader.i(parcel, t7, K6.CREATOR);
                    break;
                case 5:
                    h6Arr = (H6[]) SafeParcelReader.i(parcel, t7, H6.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.g(parcel, t7);
                    break;
                case 7:
                    c6Arr = (C6[]) SafeParcelReader.i(parcel, t7, C6.CREATOR);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new F6(j62, str, str2, k6Arr, h6Arr, strArr, c6Arr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new F6[i8];
    }
}
