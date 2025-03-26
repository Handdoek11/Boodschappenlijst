package Z2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Bundle bundle = null;
        C0767f c0767f = null;
        int i8 = 0;
        C1105d[] c1105dArr = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                bundle = SafeParcelReader.a(parcel, t7);
            } else if (l8 == 2) {
                c1105dArr = (C1105d[]) SafeParcelReader.i(parcel, t7, C1105d.CREATOR);
            } else if (l8 == 3) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 != 4) {
                SafeParcelReader.z(parcel, t7);
            } else {
                c0767f = (C0767f) SafeParcelReader.e(parcel, t7, C0767f.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new j0(bundle, c1105dArr, i8, c0767f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new j0[i8];
    }
}
