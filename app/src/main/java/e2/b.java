package E2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 2) {
                str2 = SafeParcelReader.f(parcel, t7);
            } else if (l8 != 3) {
                SafeParcelReader.z(parcel, t7);
            } else {
                str3 = SafeParcelReader.f(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new a(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new a[i8];
    }
}
