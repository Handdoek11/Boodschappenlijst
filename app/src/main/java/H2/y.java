package H2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 3) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 4) {
                i9 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 5) {
                z7 = SafeParcelReader.m(parcel, t7);
            } else if (l8 != 6) {
                SafeParcelReader.z(parcel, t7);
            } else {
                z8 = SafeParcelReader.m(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new a(str, i8, i9, z7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new a[i8];
    }
}
