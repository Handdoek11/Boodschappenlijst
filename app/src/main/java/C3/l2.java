package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class l2 implements Parcelable.Creator {
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
        int i8 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 2:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 3:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 7:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                case 8:
                    str6 = SafeParcelReader.f(parcel, t7);
                    break;
                case 9:
                    b8 = SafeParcelReader.o(parcel, t7);
                    break;
                case 10:
                    b9 = SafeParcelReader.o(parcel, t7);
                    break;
                case 11:
                    b10 = SafeParcelReader.o(parcel, t7);
                    break;
                case 12:
                    b11 = SafeParcelReader.o(parcel, t7);
                    break;
                case 13:
                    str7 = SafeParcelReader.f(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new k2(i8, str, str2, str3, str4, str5, str6, b8, b9, b10, b11, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new k2[i8];
    }
}
