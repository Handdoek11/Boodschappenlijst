package q3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class X6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 2:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 4:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    str6 = SafeParcelReader.f(parcel, t7);
                    break;
                case 7:
                    str7 = SafeParcelReader.f(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new J6(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new J6[i8];
    }
}
