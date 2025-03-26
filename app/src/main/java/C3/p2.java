package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class p2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        ArrayList arrayList = null;
        int i8 = 0;
        i2 i2Var = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 2) {
                arrayList = SafeParcelReader.j(parcel, t7, m2.CREATOR);
            } else if (l8 != 3) {
                SafeParcelReader.z(parcel, t7);
            } else {
                i2Var = (i2) SafeParcelReader.e(parcel, t7, i2.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new o2(i8, arrayList, i2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new o2[i8];
    }
}
