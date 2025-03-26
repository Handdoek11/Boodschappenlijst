package y3;

import Z2.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        C1103b c1103b = null;
        int i8 = 0;
        Q q8 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 2) {
                c1103b = (C1103b) SafeParcelReader.e(parcel, t7, C1103b.CREATOR);
            } else if (l8 != 3) {
                SafeParcelReader.z(parcel, t7);
            } else {
                q8 = (Q) SafeParcelReader.e(parcel, t7, Q.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new l(i8, c1103b, q8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new l[i8];
    }
}
