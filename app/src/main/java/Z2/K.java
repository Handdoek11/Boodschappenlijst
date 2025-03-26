package Z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        long j8 = 0;
        long j9 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 2:
                    i10 = SafeParcelReader.v(parcel, t7);
                    break;
                case 3:
                    i11 = SafeParcelReader.v(parcel, t7);
                    break;
                case 4:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 5:
                    j9 = SafeParcelReader.w(parcel, t7);
                    break;
                case 6:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 7:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 8:
                    i12 = SafeParcelReader.v(parcel, t7);
                    break;
                case 9:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0776o(i9, i10, i11, j8, j9, str, str2, i12, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0776o[i8];
    }
}
