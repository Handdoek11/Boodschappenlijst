package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class n2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        i2 i2Var = null;
        String str3 = null;
        String str4 = null;
        Float f8 = null;
        q2 q2Var = null;
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
                    i2Var = (i2) SafeParcelReader.e(parcel, t7, i2.CREATOR);
                    break;
                case 4:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    f8 = SafeParcelReader.s(parcel, t7);
                    break;
                case 7:
                    q2Var = (q2) SafeParcelReader.e(parcel, t7, q2.CREATOR);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new m2(str, str2, i2Var, str3, str4, f8, q2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new m2[i8];
    }
}
