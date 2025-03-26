package Z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class S implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        IBinder iBinder = null;
        C1103b c1103b = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 2) {
                iBinder = SafeParcelReader.u(parcel, t7);
            } else if (l8 == 3) {
                c1103b = (C1103b) SafeParcelReader.e(parcel, t7, C1103b.CREATOR);
            } else if (l8 == 4) {
                z7 = SafeParcelReader.m(parcel, t7);
            } else if (l8 != 5) {
                SafeParcelReader.z(parcel, t7);
            } else {
                z8 = SafeParcelReader.m(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new Q(i8, iBinder, c1103b, z7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Q[i8];
    }
}
